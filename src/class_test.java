import java.util.Scanner;
import java.util.Random;

public class class_test {
    public static void main(String[] args) {
        System.out.println("Login");
        String required_username, required_password, username, password;
        required_username = "Aarya";
        required_password = "9803525288";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username:");
        username = sc.next();
        System.out.println("Enter your password:");
        password = sc.next();

        if (username.equals(required_username) && password.equals(required_password)){
            System.out.println("Choose one of the the following to operate");

            System.out.println("SN"+" "+"Operation");
            System.out.println("1"+" "+"Greatest between 3 numbers");
            System.out.println("2"+" "+"Calculator");
            System.out.println("3"+" "+"Result with 3 grades");
            System.out.println("4"+" "+"Guessing game");

            System.out.println("Enter the assigned number of operation you want to perform");
            int operation = sc.nextInt();

            switch (operation){
                case 1:
                    System.out.println("Enter fist number:");
                    int num_1 = sc.nextInt();

                    System.out.println("Enter second number:");
                    int num_2 = sc.nextInt();

                    System.out.println("Enter third number:");
                    int num_3 = sc.nextInt();

                    if(num_1>=num_2 & num_1>=num_3){
                        System.out.println("first number is the greatest");
                    } else if (num_2>=num_1 & num_2>=num_3) {
                        System.out.println("second number is the greatest");
                    } else if (num_3>=num_1 & num_3>=num_2) {
                        System.out.println("third number is the greatest");
                    } else{
                        System.out.println("invalid");
                    }

                    break;

                case 2:
                    System.out.println("select the mathematical operation you want to perform");
                    System.out.println("SN"+" "+"Mathematical Operation");
                    System.out.println("1"+" "+"Addition");
                    System.out.println("2"+" "+"Subtraction");
                    System.out.println("3"+" "+"Multiplication");
                    System.out.println("4"+" "+"Division");


                    double first_no, second_no, result = 0;
                    String math_operation;

                    System.out.println("Enter the first number:");
                    first_no = sc.nextDouble();
                    System.out.println("Enter a mathematical operation:");
                    math_operation = sc.next();
                    System.out.println("Enter the second number:");
                    second_no = sc.nextDouble();

                    if (math_operation.equals("+")) {
                        result = first_no + second_no;

                    } else if (math_operation.equals("-")) {
                        result = first_no - second_no;

                    } else if (math_operation.equals("*")) {
                        result = first_no * second_no;

                    } else if (math_operation.equals("/")) {
                        result = first_no / second_no;

                    } else {
                        System.out.println("Invalid mathematical operation.");
                    }
                    System.out.println("The required answer is "+ result);

                    break;

                case 3:
                    System.out.println("enter marks of Sanskrit");
                    double Marks_of_Sanskrit = sc.nextDouble();
                    System.out.println("enter marks of Newari");
                    double Marks_of_Newari = sc.nextDouble();
                    System.out.println("enter marks of Mandarin");
                    double Marks_of_Mandarin = sc.nextDouble();

                    double Obtained_marks = (Marks_of_Mandarin+Marks_of_Newari+Marks_of_Sanskrit)/3 ;
                    double Total_marks =  300;

                    double Obtained_Percentage = (Obtained_marks/Total_marks) * 100;

                    if(Obtained_Percentage >= 90 & Obtained_Percentage<=100){
                        System.out.println("Obtained grade is A+");
                    }
                    else if (Obtained_Percentage>=80 & Obtained_Percentage<90) {
                        System.out.println("Obtained grade is A");
                    }
                    else if (Obtained_Percentage>=70 & Obtained_Percentage<80) {
                        System.out.println("Obtained grade is B+");
                    }
                    else if (Obtained_Percentage>=60 & Obtained_Percentage<70) {
                        System.out.println("Obtained grade is B");
                    }
                    else if (Obtained_Percentage>=50 & Obtained_Percentage<60) {
                        System.out.println("Obtained grade is C+");
                    }
                    else if (Obtained_Percentage>=40 & Obtained_Percentage<50) {
                        System.out.println("Obtained grade is C");
                    }
                    else {
                        System.out.println("Obtained grade is Stinking");
                    }

                    break;

                case 4:
                    Random xyz=new Random();
                    int guess_number=xyz.nextInt(101);

                    System.out.println("Guess a random number from 0-100:");
                    int entered_number = sc.nextInt();

                    if(entered_number == guess_number){
                        System.out.println("You have won the game");
                    }
                    else{
                        System.out.println("loser");
                    }
                    break;

                default:
                    System.out.println("Invalid operation");
            }
        }else {
            System.out.println("Invalid Login");
        }
    }

}
