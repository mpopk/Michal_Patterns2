package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.MedianAdapter;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;


import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){

        // Given
        Set<Book> bookOfTypeA = new HashSet<>();
        bookOfTypeA.add(new Book("John Mad", "Forever", 1985, "John"));
        bookOfTypeA.add(new Book("Michael Kalak", "Ever", 1963, "Michael"));
        bookOfTypeA.add(new Book("Tomas Edison", "Never", 1974, "Tomas"));

        // When
        int median = new MedianAdapter().publicationYearMedian(bookOfTypeA);
        // Then
        assertEquals(1974, median);

    }
}
