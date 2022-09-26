package ru.klimenko.pr7;

public class Main {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        MathCalculable mc2 = new MathFunc();
        MathCalculable mc3 = new MathFunc();
        int d;
        double x, pi;
        d = mc1.Power(5, 8);
        x = mc2.AbsComplex(10, 9);
        pi = mc3.pi;
        System.out.println("Возведение в степень: " + d + " Модуль комплексного числа: " + x + " Число Пи: " + pi);

    }
}
