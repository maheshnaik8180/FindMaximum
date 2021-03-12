package com.findmaximumgeneric;

import com.findmaximumgenric.FindMaximum;
import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest {

    FindMaximum findmaximum = new FindMaximum();
//tc 1.1

    @Test
    public void givenMaxIntegerAtFirstPosition_shouldReturnFirstPosition() {
        FindMaximum findMax = null;
        Comparable maxNumber = findMax.findMaxInteger(30, 10, 20);
        Assert.assertEquals(30, maxNumber);
        
    }



}