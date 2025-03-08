import java.util.*;

interface i1 {

    abstract void display_volume();
}
class cone implements i1 {
    double rad, height;
    cone(double r, double h) {
        rad = r;
        height = h;
    }
    @Override
    public void display_volume() {
       
        double volume = (1.0 / 3) * Math.PI * Math.pow(rad, 2) * height;
        
        
        System.out.println("The volume of the cone is: " + volume);
    }
}
class cylinder implements i1{
   double height;
   double rad;

   cylinder(double r , double h){
    height = h; 
    rad = r;
   }
   @Override
   public void display_volume(){
           double vol = Math.PI*rad*2*height;
           System.err.println("volume of cylinder is : " + vol);
   }
}


class hemi implements i1 {
    double rad, height;
    hemi(double r) {
        rad = r;
        
    }
    @Override
    public void display_volume() {
       
        double volume = (2.0 / 3) * Math.PI * Math.pow(rad, 3);
        
        
        System.out.println("The volume of the cone is: " + volume);
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the radius of the cone: ");
        double radius = sc.nextDouble();
        
        System.out.println("Enter the height of the cone: ");
        double height = sc.nextDouble();
        
       
        cone c = new cone(radius, height);
        c.display_volume();

        System.out.println("Enter the radius of the hemisphere: ");
        radius = sc.nextDouble();
        hemi h = new hemi(radius);
        h.display_volume();

        System.out.println("Enter the radius of the cylinder: ");
        radius = sc.nextDouble();
        
        System.out.println("Enter the height of the cylinder:  ");
        height = sc.nextDouble();

        cylinder cy = new cylinder(radius, height);
        cy.display_volume();
       
        
    }
}
