package com.findmaximumgenric;

public class FindMaximum {

    //default constructor
    public FindMaximum(){

    }
    //method to find maximum number
    public static int findMaxInteger(int no1, int no2, int no3) {
        int maxInt = 0;
        if (no1 > no2 && no1 > no2) {

                return maxInt = no1;
            } else if (no2 > no1 && no2 > no3) {

                return maxInt = no2;
            } else {
                return maxInt = no3;
            }
        }


//method to find maximum float number
public static double findMaxFloat(double fNo1, double fNo2, double fNo3) {

    double maxFloat= 0;
    if (fNo1 > fNo2 && fNo1 > fNo3) {
        return maxFloat = fNo1;
    } else if (fNo2 > fNo1 && fNo2 > fNo3) {
        return maxFloat = fNo2;
    } else {
        return maxFloat = fNo3;
    }
}

    // Method to find Maximum String
    public String findMaxString(String str1, String str2, String str3) {
        String maxString =  str1;
        if( str2.compareTo(maxString) > 0) {
            maxString = str2;
        }
        if( str3.compareTo(maxString) > 0) {
            maxString = str3;
        }
        return maxString;
    }



}




