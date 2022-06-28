package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {

        StringBuilder products = new StringBuilder();
        for (int i = 1; i<=tableSize; i++) {
            for (int j = 1; j<=tableSize; j++) {
                products.append(String.format("%3d |", i*j));
            }
            products.append("\n");
        }
        return products.toString();
    }
}
