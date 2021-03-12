package com.findmaximumgenric;

public class FindMaximum {

    //default constructor
    public FindMaximum(){

    }
    //method to find maximum number
    public static int findMaxInteger(int no1, int no2, int no3){
        int maxInt =0;
                if (no1 > no2 && no1 > no2 ) {
                    return no1;
                }
                else if (no2 > no1 && no2 > no3) {
                    return no2;
                }else{
                    return no3;
                }
    }
}
