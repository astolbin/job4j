package ru.job4j.array;

import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];

        int indexLeft = 0;
        int indexRight = 0;

        while ((indexLeft + indexRight) < rsl.length) {
            if (
                indexLeft < left.length
                && (indexRight == right.length || left[indexLeft] <= right[indexRight])
            ) {
                rsl[indexLeft + indexRight] = left[indexLeft];
                indexLeft++;
            } else {
                rsl[indexLeft + indexRight] = right[indexRight];
                indexRight++;
            }
        }

        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
