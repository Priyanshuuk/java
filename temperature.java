import java.util.Scanner;
abstract class Temperature {
    double temp;
    void setTempData(double data) {
        temp = data;
    }
    void changeTemp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new temperature: ");
        double newData = sc.nextDouble();
        temp = newData;
    }
    abstract void convertTemp();
}
class Fahrenheit extends Temperature {
    double cTemp;
    
    @Override
    void convertTemp() {
        cTemp = (temp - 32) * 5 / 9; 
        System.out.println(temp + "°F is equal to " + cTemp + "°C.");
    }
}
class Celsius extends Temperature {
    double fTemp;

 
    @Override
    void convertTemp() {
        fTemp = (temp * 9 / 5) + 32; 
        System.out.println(temp + "°C is equal to " + fTemp + "°F.");
    }
}
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" (1 for Fahrenheit, 2 for Celsius): ");
        int choice = sc.nextInt();
        Temperature temperature;
        if (choice == 1) {
            temperature = new Fahrenheit();
        } else {
            temperature = new Celsius();
        }  
        System.out.println("Enter the temperature: ");
        double inputTemp = sc.nextDouble();
        temperature.setTempData(inputTemp);
        temperature.convertTemp();




        temperature = new Celsius();
        System.out.println("Enter the temperature: ");
         inputTemp = sc.nextDouble();
        temperature.setTempData(inputTemp);
        temperature.convertTemp();

    }
}
