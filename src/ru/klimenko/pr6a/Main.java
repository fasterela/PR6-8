package ru.klimenko.pr6a;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1,2,2,4);
        System.out.println(point);
        point.moveUp();
        point.moveRight();
        System.out.println(point);

        MovableCircle circle = new MovableCircle(1,2,3,4,5);
        System.out.println(circle);
        circle.moveUp();
        circle.moveRight();
        System.out.println(circle);

        MovableRectangle rectangle = new MovableRectangle(1,2,3,4,5,6);
        System.out.println(rectangle);
        rectangle.moveDown();
        rectangle.moveLeft();
        System.out.println(rectangle);

    }
}
