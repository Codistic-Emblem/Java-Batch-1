/*Write a Java program to print the area and perimeter of a circle. */
class Question1{
    private double areaCircle(double radius){
        return Math.PI*radius*radius;
    }

    private double perimeter(double radius){
        return 2 * Math.PI*radius;
    }
    public static void main(String[] args) {
        Question1 circle=new Question1();
        System.out.println("Area of Circle: "+ circle.areaCircle(7.5));
        System.out.println("Peremeter of Circle: "+circle.perimeter(7.5));
    }
}