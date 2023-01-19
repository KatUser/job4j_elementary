package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int left = money - price;

        for (int s = 0; s < coins.length; s++) {
            while (left >= coins[s]) {
                left -= coins[s];
                rsl[size] = coins[s];
                size++;
            }

        }

        return Arrays.copyOf(rsl, size);
    }
}