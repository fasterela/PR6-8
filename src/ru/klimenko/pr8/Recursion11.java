package ru.klimenko.pr8;

import java.util.Scanner;

public class Recursion11 {
    public static int recursion(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 1){
            int i = in.nextInt();
            if (i ==1){
                return recursion() + n + i;
            } else {
                int j = in.nextInt();
                if (j == 1){
                    return recursion() + n + i + j;
                }else{
                     return n + i + j;
                }
            }
        }else{
            int i = in.nextInt();
            if (i == 1){
                return recursion() + n + i;
            }else{
                return n + i;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(recursion());

    }
}
