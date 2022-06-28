package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        StringBuilder myString = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if (i%2 == 0) {
                myString.append(i);
            }
        }
        return myString.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder myString = new StringBuilder();
        for (int i = start; i < stop; i++) {
            if (i%2 != 0) {
                myString.append(i);
            }
        }
        return myString.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder squares = new StringBuilder();
        for (int i = start; i<stop; i += step){
            squares.append(i*i);
        }
        return squares.toString();
    }

    public static String getRange(int stop) {
        String myString = "";
        for (int i = 0; i < stop; i++) {
            myString += Integer.toString(i);
        }
        return myString;
    }

    public static String getRange(int start, int stop) {
        String myString = "";
        for (int i = start; i < stop; i++) {
            myString += Integer.toString(i);
        }
        return myString;
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder myString = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            myString.append(i);
        }
        return myString.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder expo = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            expo.append((int) Math.pow(i, exponent));
        }
        return expo.toString();
    }
}
