package com.kodilla.kodillapatterns2.adapter.bookclasifier;



import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.Set;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    private static BookSignature toSignature(Book bookA) {
        return new BookSignature(bookA.getSignature());
    }

    private static com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book adaptBookAtoB(Book bookA){
        return new com.kodilla.kodillapatterns2.adapter.bookclasifier.libraryb.Book( bookA.getAuthor(), bookA.getTitle(), bookA.getPublicationYear());
    }

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        return medianPublicationYear(
                bookSet.stream()
                .collect(Collectors.toMap(MedianAdapter::toSignature,MedianAdapter::adaptBookAtoB))
        );
    }


}
