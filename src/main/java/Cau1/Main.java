package Cau1;

public class Main {
    public static void main(String[] args) {
//        bán kinh dương
        Circle c1 = new Circle(8);
        System.out.println("Dien Tich:" + c1.getArea());
        System.out.println("Chu vi: " + c1.getCircumference());
//        ban kinh am
        Circle c2 = new Circle(-2);
        System.out.println("Dien tich: " + c2.getArea());
    }
}
