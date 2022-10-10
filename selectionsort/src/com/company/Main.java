package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {55, 24, -7, 25, -64, 69, 23, 88, 1234, 4536, 231, 55, 324, 774, 1, -69};
        int x = 1;
        int y = 0;
        String aus = " ";
        lol(1, 0, arr);
    }

    public static void fertig(int[] arr) {
        System.out.println("Fertig:");
    }

    public static void lol(int x, int y, int[] arr) {

        String aus = "";
        int st;

        if (arr.length-x<=y) {
            fertig(arr);
        }

        else if (arr[arr.length-x]<arr[y]) {

            st = arr[arr.length-x];
            for (int i = arr.length-x; i>y; i--) {
                arr[i]=arr[i-1];
            }
            arr[y]=st;

            for(int i = 0; i< arr.length; i++){
                aus = aus + " "+arr[i]+" ";
            }

            System.out.println(aus);
            y=0;
            lol(x, y, arr);
        }
        else {
            if (y+1>=arr.length-x) {
                y=0;
                x=x+1;
                lol(x, y, arr);
            }
            else {
                y++;
                lol(x, y, arr);
            }
        }
    }

    }





