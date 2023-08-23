package com.epam.mjc.stage0;
public class ArrayTasks {
    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    public int[] generateNumbers(int length) {
        int[] result = new int[length];
        for (int i = 0; i < length; i++)
            result[i] = i + 1;
        return result;
    }

    public int totalSum(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++)
            result += arr[i];
        return result;
    }

    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++)
            if (number == arr[i]) return i;
        return -1;
    }


    public String[] reverseArray(String[] arr) {
        String[] result = new String[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            result[arr.length - i -1] = arr[i];
        }
        return result;
    }

    public int[] getOnlyPositiveNumbers(int[] arr) {
        int length = 0;
        for(int i : arr)
            if(i>0) length++;
        int[] result = new int[length];
        int positiveIndex = 0;
        for(int i = 0;i<length;i++)
        {
            while (positiveIndex < arr.length)
            {
                if(arr[positiveIndex] > 0)
                {
                    result[i] = arr[positiveIndex];
                    positiveIndex++;
                    break;
                }
                positiveIndex++;
            }
        }
        return result;
    }

    public int[][] sortRaggedArray(int[][] arr) {
        for(int i  = 0; i < arr.length;i++)
            arr[i] = sortValuesInArray(arr[i]);
        return sortArraysByLength(arr);
    }
    private int[] sortValuesInArray(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    private int[][] sortArraysByLength(int[][]arr)
    {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j].length > arr[j+1].length){
                    int[] temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
