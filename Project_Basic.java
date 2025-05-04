import java.util.Scanner;

public class Project_Basic{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
       while (true) {
       System.out.println("Enter Your Choice:\n1. Addition \n2. Substraction \n3. Multiplication \n4. Divitation \n5. Root Square \n6. Exponentiation \n7. Celsius to Fahrenheit \n8. Fahrenheit to Celsius \n9. Exit");
       int choice = sc.nextInt();
       sc.nextLine();

       switch (choice) {
        case 1:
            addition();
            System.out.println("_____________________________________________________");
            break;
        case 2:
            substraction();
            System.out.println("_____________________________________________________");
            break;
        case 3:
            multiplition();
            System.out.println("_____________________________________________________");
            break;
        case 4:
            divide();
            System.out.println("_____________________________________________________");
            break;
        case 5:
            root();
            System.out.println("_____________________________________________________");
            break;
        case 6:
            power();
            System.out.println("_____________________________________________________");
            break;
        case 7:
            Fahrenheit();
            System.out.println("_____________________________________________________");
            break;
        case 8:
            Celsius();
            System.out.println("_____________________________________________________");
            break;
        case 9:
            System.out.println("Exiting...");
            return;
        default:
            System.out.println("Check Your input");
            break;
       }
    }
    }
   
    public static void addition(){
        System.out.print("First Value: ");
        double num1 = sc.nextDouble();
        System.out.print("Second Value: ");
        double num2 = sc.nextDouble();

        System.out.println(num1 + num2);
    }

    public static void substraction(){
        System.out.print("First Value: ");
        double num1 = sc.nextDouble();
        System.out.print("Second Value: ");
        double num2 = sc.nextDouble();

        System.out.println(num1 - num2);
    }

    public static void multiplition(){
        System.out.print("First Value: ");
        double num1 = sc.nextDouble();
        System.out.print("Second Value: ");
        double num2 = sc.nextDouble();

        System.out.println(num1 * num2);
    }
    
    public static void divide(){
        System.out.print("First Value: ");
        double num1 = sc.nextDouble();
        System.out.print("Second Value: ");
        double num2 = sc.nextDouble();

        System.out.println(num1/num2);
    }
    
    public static void root(){
        System.out.print("Enter Value: ");
        Double num1 = sc.nextDouble();

        System.out.println(Math.sqrt(num1));
    }

    public static void power(){
        System.out.print("Base Value: ");
        double num1 = sc.nextDouble();
        System.out.print("Power Value: ");
        double num2 = sc.nextDouble();

        System.out.println(Math.pow(num1, num2));
    }

    public static void Fahrenheit(){
        System.out.print("Enter Your Celsius value: ");
        double celsius = sc.nextDouble();

        double Fahre = (celsius*9/5)+32;
        System.out.println("Fahrenheit: "+Fahre);

    }

    public static void Celsius(){
        System.out.print("Enter Your Fahrenheit value: ");
        double Fahre = sc.nextDouble();

        double celsius = (Fahre-32)*5/9;
        System.out.println("Celsius: "+celsius);
    }
}