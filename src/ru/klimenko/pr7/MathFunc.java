package ru.klimenko.pr7;

public class MathFunc implements MathCalculable{
    public double Circumfer(double radius) {
        return 2*pi*radius;
    }
    public int Power(int x, int y) {
        int p, i;
        p = 1;
        for (i=1; i<=y; i++)
            p=p*x;
        return p;
    }
    public double AbsComplex(double real, double imag) {
        double abs;
        abs = Math.sqrt(real*real+imag*imag);
        return abs;
    }
}
