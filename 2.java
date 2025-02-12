import java.util.Scanner;

class Interest {
    public static void main(String args[]) {
        System.out.println("Do you want to go for monthly or yearly interest?");
        System.out.println("Press 1 for monthly and 2 for yearly:");
          Scanner sc = new Scanner(System.in);
          int choice = sc.nextInt();
        switch(choice) {
            case 1:
            System.out.println("You selected monthly interest.");
            double money = sc.nextDouble();
            double intrest  = sc.nextDouble();
            
            int time = sc.nextInt() ;  
            double a = money*Math.pow((1+intrest/100),time);      
            System.out.println(a );
                
                break;

            case 2:
            System.out.println("You selected Yearly interest.");
            double money2 = sc.nextDouble();
            double intrest2  = sc.nextDouble();
            
            int time2 = sc.nextInt() ;  
            double a2 = (money2*time2+money2*time2*(time2+1)/2*intrest2/100*1/12);     
            System.out.println(a2);
            break;
                
            default:
                System.out.println("Invalid choice. Please select 1 for monthly or 2 for yearly.");
        }

        sc.close(); 
    }
}

