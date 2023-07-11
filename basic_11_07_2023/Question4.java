/*
Write a Java program to print an American flag on the screen.
*/

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size: ");
        int no;
        no=sc.nextInt();

        for(int i=1;i<=no;i++)
        {
            if(i%2!=0){
                System.out.println("* * * * * *");
            }else{
                System.out.println("* * * * *");
            }
        }


    }
}
