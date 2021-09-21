package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String filteredLeft = left.replaceAll(" .+", "");
        String filteredRight = right.replaceAll(" .+", "");
        String[] leftStingNum = filteredLeft.split("\\.");
        String[] rightStingNum = filteredRight.split("\\.");
        int leftLength = leftStingNum.length;
        int rightLength = rightStingNum.length;
        int size = Math.min(leftLength, rightLength);
        for (int index = 0; index < size; index++) {
            int numLeft = Integer.parseInt(leftStingNum[index]);
            int numRight = Integer.parseInt(rightStingNum[index]);
            int result = Integer.compare(numLeft, numRight);
            if (result != 0) {
                return result;
            }
        }
        return Integer.compare(leftLength, rightLength);
    }
}
