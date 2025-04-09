import java.util.Scanner;

class InvalidException extends Exception {
    public InvalidException(String message) {
        super(message);
    }
}

public class employee {
public int empId;
 public String name;
public int deptId;

employee(int empId,String name,int deptId){

this.empId = empId;
this.name = name;
this.deptId = deptId;

}


void dis(){

            System.out.println("\nEmployee Details:");
            System.out.println("ID: " + empId);
            System.out.println("Name: " + name);
            System.out.println("Department: " + deptId);
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter Employee ID (2001-5001): ");
            int empId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Employee Name (First letter capital): ");
            String empName = scanner.nextLine();
            
            System.out.print("Enter Department ID (1-5): ");
            int deptId = scanner.nextInt();
             scanner.nextLine();
            
            validateEmployee(empId, empName, deptId);
            employee e = new employee(empId , empName,deptId);
            e.dis();
             
            
        }  catch (InvalidException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
    private static void validateEmployee(int id, String name, int deptId) throws InvalidException {
        if (id < 2001 || id > 5001) {
            throw new InvalidException("Employee ID must be between 2001 and 5001");
        }
        
        if (name == null || name.isEmpty()) {
            throw new InvalidException("Name cannot be empty");
        }
        
        if (!Character.isUpperCase(name.charAt(0))) {
            throw new InvalidException("First letter of name must be capital");
        }
        
        if (deptId < 1 || deptId > 5) {
            throw new InvalidException("Department ID must be between 1 and 5");
        }
    }
}
