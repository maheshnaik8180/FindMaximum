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
//test2.1


    @Test
    public void givenMaxFloatAtFirstPosition_shouldReturnFirstPosition() {
        FindMaximum findmax = null;
        double maxFloat = findmax.findMaxFloat(30.5,20.5,10.5);
        Assert.assertEquals(30.5,maxFloat, 0.0);

    }

    @Test
    public void givenMaxFloatAtSecondPosition_shouldReturnFirstPosition() {

        FindMaximum findMax = null;
        double maxFloat = findMax.findMaxFloat(10.5,30.5,20.5);
        Assert.assertEquals(30.5, maxFloat, 0.0);

    }

    @Test
    public void givenMaxFloatAtThirdPosition_shouldReturnFirstPosition() {
        FindMaximum findMax = null;
        double maxFloat = findMax.findMaxFloat(10.5, 20.5, 30.5);
        Assert.assertEquals(30.5, maxFloat, 0.0);

    }
}
