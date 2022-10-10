package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 6, 5};
        sortieren(arr);


    }


    public static void sortieren(int[] arr) {

        String aus = "";

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {


                if (arr[j] > arr[j + 1]) {


                    int s = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = s;
                }


            }

            }
        for(int e = 0; e< arr.length; e++){
            aus = aus + " "+arr[e]+" ";
        }
        System.out.println(aus);
    }
}


