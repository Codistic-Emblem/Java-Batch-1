/*
Write a Java program to print the area and perimeter of a rectangle.
 */
public class Question3 {
    private  double areaRectangle(double length , double width){
        return length*width;
    }

    private double perimeterRectangle(double length,double width){
        return 2 *(length+width);
    }
    public static void main(String[] args) {
        Question3 rectangle=new Question3();
        System.out.println("Perimeter of Rectangle :"+ rectangle.perimeterRectangle(8.5,5.6));
        System.out.println("Area of Rectangle :"+ rectangle.areaRectangle(8.5,5.6));
    }
}
