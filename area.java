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
        Area a = new Area();
        System.out.println("Area of circle with radius 5: " + a.circle(5));
    }
}

