import java.util.Scanner;

public class Assignment {
    final private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String redColor = "\033[31;1m";
        String redReset = "\033[30;0m";

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if(name.strip().length() == 0 || name.strip().length() < 3){
            System.out.printf("%1$sInvalid name.%2s",redColor,redReset);
            return;
        }


        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        if(age < 10 || age > 18){
            System.out.printf("%1$sInvalid age.%2$s",redColor,redReset);
            return;
        }

        System.out.println("Enter your subject 1: ");
        String subject1 = scanner.nextLine();

        if(!subject1.strip().toUpperCase().startsWith("SE-") || subject1.strip().length() < 4){
            System.out.printf("%1$sInvalid subject code 1.%2$s");
            return;
        }

        System.out.println("Enter your marks1: ");
        double marks1 = scanner.nextDouble();
        scanner.nextLine();

        if(marks1 < 0 || marks1 > 100){
            System.out.printf("%1$sInvalid marks.%2$s",redColor,redReset);
            return;
        }
        System.out.println("Enter your subject 02: ");
        String subject2 = scanner.nextLine();

        if(!subject2.strip().toUpperCase().startsWith("SE-") || subject2.strip().length() < 4 || subject1.equals(subject2)){
            System.out.printf("%1$sInvalid subject code 2.%2$s",redColor,redReset);
            return;
        }
        System.out.println("Enter your marks2");
        double marks2 = scanner.nextDouble();
        scanner.nextLine();
        
        if (marks2 < 0 || marks2 > 100){
            System.out.println("Invalid marks.");
            return;
        }
        System.out.println("Enter your subject 03");
        String subject3 = scanner.nextLine();

        if (!subject3.strip().toUpperCase().startsWith("SE-") || subject3.strip().length() < 4 || subject3.equals(subject1) || subject3.equals(subject2)){
            System.out.println("invalid subject code 3.");
            return;
        }
        System.out.println("Enter your marks3");
        double marks3 = scanner.nextDouble();
        scanner.nextLine();

        if(marks3 < 0 || marks3 >100){
            System.out.println("Invalid marks.");
            return;
        }

        double total = (marks1 + marks2 + marks3);
        double avarage = total/3;

        String status1;
        String status2;
        String status3;
        if(marks1 >= 75){
            status1 = "Credit Pass";
        }else if(marks1 >=65){
            status1 = "Pass";
        }else{
            status1 = "Fail";
        }

        if(marks2 >=75){
            status2 = "Credit Pass";
        }else if(marks2 >= 65){
            status2 = "Pass";
        }else{
            status2 = "Fail";
        }

        if(marks3 >=75){
            status3 = "Credit Pass";
        }else if(marks3 >= 65){
            status3 = "Pass";
        }else{
            status3 = "Fail";
        }

        String blueColor = "\033[34;1m";
        String blueReset = "\033[40;0m";

        String blackColor = "\033[30;1m";
        String blackReset = "\033[40;0m";

        String old = "years old";

        System.out.println("------------------------------------------");
        System.out.printf("| Name: %2$s%1$s%3$-34s |\n",name.toUpperCase(),blueColor,blueReset);
        System.out.printf("| Age: %2$s%1$s%3$s%4$-31s |\n",age,blueColor,blueReset,old );
        System.out.printf("| Status: %-30s |\n",status1);
        System.out.printf("| Total: %-12.2f Avg: %-13.2f |\n",total,avarage);
        System.out.println("------------------------------------------");
        System.out.printf("| %1$sSUBJECT%2$s    | %1$sMARKS%2$s      | %1$sSTATUS%1$s       |\n",blackColor,blackReset);
        System.out.printf("| %-10s | %-10s | %-12s | \n",subject1,marks1,status1);
        System.out.printf("| %-10s | %-10s | %-12s | \n",subject2,marks2,status2);
        System.out.printf("| %-10s | %-10s | %-12s | \n",subject3,marks3,status3);
        System.out.println("------------------------------------------");
    }    
}
