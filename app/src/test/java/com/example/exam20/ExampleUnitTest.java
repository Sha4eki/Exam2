package com.example.exam20;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */


public class ExampleUnitTest {
    int countParis(int[] array) {
        int[] index;
        int colvo = 0;
        index = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            index[i] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == 0 && index[i] == 1 && index[j] == 1) {
                    colvo++;
                    index[i] = 0;
                    index[j] = 0;

                }
            }
        }
        return colvo;
    }

    @Test
    public void addition_isCorrect() {
        assertEquals(1, countParis(new int[]{1, -1}));
    }
}