package homework_week1;

import java.util.Scanner;

public class InputNumber {
     public static void main (String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value of the first number :");
         int a = sc.nextInt();
         System.out.println("Enter the value of the second number :");
         int b= sc.nextInt();
         int result = a*b;
         System.out.println(a + " X " + b + " = " + result);

        }
}