package org.lrwham.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class NthLargestTest {
    @Test
    void testIsPrime() {
        assertEquals(9,NthLargestElement.secondLargestElement(new long[]{3, 7, 9, 100}));
    }
}
