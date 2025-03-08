import java.util.*;
abstract class Shape {
    abstract int rectangle(int l, int b);
    abstract float circle(int r);
    abstract int square(int s);
}

class Area extends Shape {

    int rectangle(int l, int b) {
        return l * b;
    }


    float circle(int r) {
        return (float) (Math.PI * r * r);  
    }


    int square(int s) {
        return s * s;
    }

    public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          int l = sc.nextInt();
          int b = sc.nextInt();
          int sql = sc.nextInt();
          int r = sc.nextInt();
        Shape shape = new Area();     
        System.out.println("Area of circle with radius 5: " + shape.circle(r));  
        System.out.println("Area of square with radius 5: " + shape.square(sql));  
        System.out.println("Area of rectangle " + shape.rectangle(l,b));  
    }
}
