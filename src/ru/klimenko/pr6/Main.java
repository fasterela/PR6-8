package ru.klimenko.pr6;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Book bk1 = new Book(" First book");
        Book bk2 = new Book(" Second book");
        Book bk3 = new Book(" Third book");

        Printable[] printables = {bk1, bk2, bk3};
        for(Printable printable:printables){
            printable.print();
        }

    }
}
