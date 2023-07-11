/*Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter three numbers:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        int sum=num1+num2+num3;

        double avg=(double)sum/(double)3;
        System.out.println("Average of three number :"+avg);

        sc.close();


    }
}
