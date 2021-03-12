package com.findmaximumgeneric;

import com.findmaximumgenric.FindMaximum;
import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;

public class FindMaximumTest {

    FindMaximum findmaximum = new FindMaximum();
    private FindMaximum FindMax;
//tc 1.1

    @Test
    public void givenMaxIntegerAtFirstPosition_shouldReturnFirstPosition() {
        FindMaximum findMax = null;
        Comparable maxNumber = findMax.findMaxInteger(30, 10, 20);
        Assert.assertEquals(30, maxNumber);
        
    }

    @Test
    public void givenMaxIntegerAtSecondPosition_shouldReturnFirstPosition() {
        FindMaximum findMax = null;
        Comparable maxNumber = findMax.findMaxInteger(10,30,20);
    Assert.assertEquals(30, maxNumber);
    }

    @Test
    public void givenMaxIntegerAtThirdPosition_shouldReturnThirdPosition() {
        FindMaximum findMax = null;
        Comparable maxNumber = findMax.findMaxInteger(10,30,20);
        Assert.assertEquals(30, maxNumber);



    }
}