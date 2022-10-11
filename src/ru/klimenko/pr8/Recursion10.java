package ru.klimenko.pr8;

public class Recursion10 {
    public static int recursion(int n, int a){
        return (n==0) ? a : recursion(n/10, a*10 + n%10);

    }

    public static void main(String[] args) {
        System.out.println(recursion(123,0));
    }
}
