package org.example;

import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MayList mayList = new MayList();
        System.out.println(Arrays.toString(mayList.arr));
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            Random random = new Random();
            array[i] = random.nextInt(1, 99);


        }
        int[] array2 = Arrays.copyOf(array, 100);


        System.out.println(Arrays.toString(array));
        long start = System.currentTimeMillis();
        sortBubble(array);

        System.out.println(System.currentTimeMillis() - start);
        System.out.println(Arrays.toString(array));
        long start2 = System.currentTimeMillis();
        sortSelection(array2);
        System.out.println(System.currentTimeMillis() - start2);
        System.out.println(Arrays.toString(array2));
        System.out.println(contains(array, 41));


    }

    public static int[] sortBubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] sortSelection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElementIndex]) {
                    //minElementIndex = j;


                    int temp = arr[j];
                    arr[j] = arr[minElementIndex];
                    arr[minElementIndex] = temp;
                }

            }
        }
            return arr;

    }
    public static int contains(int[] arr, int element) {
        int min = 0;
        int max = arr.length - 1;
        int index=0;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (element == arr[mid]) {
                index= mid;
            }

            if (element < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return index;
    }

}