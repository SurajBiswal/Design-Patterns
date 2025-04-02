package Factory_Pattern_Color;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a shape");

        Shape shape = Shape_factory.create(sc.nextLine());
        System.out.println(shape.draw());
    }
}
