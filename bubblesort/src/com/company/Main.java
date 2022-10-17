package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 9, 4, 1};
        sortieren(arr);


    }


    public static void sortieren(int[] arr) {

        String aus = "";

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j < arr.length - i-1; j++) {

                aus= "";
                for(int e = 0; e< arr.length; e++){
                    aus = aus + " "+arr[e]+" ";
                }
                System.out.println(aus+ i+j);


                if (arr[j] > arr[j + 1]) {


                    int s = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = s;
                }



            }

            }

    }
}


