import java.util.Scanner;

/*
Write a Java program to swap two variables.
*/
public class Question5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1,num2;
        num1=sc.nextInt();
        num2=sc.nextInt();

        System.out.println("Before Swapping");
        System.out.println("num1:"+num1+"    "+"num2:"+num2);

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("After Swapping");
        System.out.println("num1:"+num1+"    "+"num2:"+num2);

    }
}
