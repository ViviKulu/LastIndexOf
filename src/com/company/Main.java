package com.company;

public class Main {

    // Write a method named lastIndexOf that accepts an
    // array of integers and an integer value as its
    // parameters and returns the last index at which
    // the value occurs in the array. The method should
    // return -1 if the value is not found. For example,
    // in the list containing {74, 85, 102, 99, 101, 85, 56},
    // the last index of the value 85 is 5.

    public static void main(String[] args) {
        // write your code here
        int[] a = {74, 56, 102, 99, 101, 85, 56};
        int x = 101;
        lastIndex(a, x);
        System.out.println(lastIndex(a,x));
    }

    public static int lastIndex(int[] a, int x) {
        for(int i = a.length - 1; i >= 0; i--){
            if(a[i] == x){
                return i;
            }
        }
        return -1;
    }
}
