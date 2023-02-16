package ru.stqa.pft.sandbox;


public class ClassMain {

    public static void main(String[] args) {

        Point point = new Point(2, 8);
        Point point2 = new Point(5, 10);
        double distance = Point.distance(point, point2);
        System.out.println(distance);
    }
}
