import java.util.Scanner;

public class area
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("This program finds out the area of a square, rectangle, circle, parallelogram, rhombus or trapezium.");
        System.out.println("Choose the shape");
        System.out.println("For square, type '1'");
        System.out.println("For rectangle, type '2'");
        System.out.println("For circle, type '3'");
        System.out.println("For parallelogram, type '4'");
        System.out.println("For rhombus, type '5'");
        System.out.println("For trapezium, type '6'");
        System.out.println("For triangle, type '6'");
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();

        if(choice==1)
        {

        System.out.print("Enter the side of the square: ");
        double side = scanner.nextInt();
        System.out.println("Your side is " +side);
        
        double squarearea= side*side;
        System.out.println("The area of the square is " +squarearea);
        }
        
        else if(choice==2)
        {
        System.out.print("Enter the length of the rectangle: ");
        double len = scanner.nextInt();
        System.out.println("Your length is " +len);
        
        System.out.print("Enter the breadth of the rectangle: ");
        double bre = scanner.nextInt();
        System.out.println("Your breadth is " +bre);
        
        double rectanglearea= len*bre;
        System.out.println("The area of the rectangle is " +rectanglearea);
        }
        
        else if(choice==3)
        {
        System.out.print("Enter the radius of the circle: ");
        double rad = scanner.nextInt();
        System.out.println("Your radius is " +rad);
        
        double circlearea= Math.PI*rad*rad;
        System.out.println("The area of the cirle is " +circlearea);
        }
        else if(choice==4)
        {
        System.out.print("Enter the length of the parallelogram: ");
        double bas = scanner.nextInt();
        System.out.println("Your length is " +bas);
        
        System.out.print("Enter the height of the parallelogram: ");
        double hei = scanner.nextInt();
        System.out.println("Your height is " +hei);
        
        double parallelogramarea= bas*hei;
        System.out.println("The area of the parallelogram is " +parallelogramarea);
        }
        else if(choice==5)
        {
        System.out.print("Enter the length of a diagonal of the rhombus: ");
        double d1 = scanner.nextInt();
        System.out.println("The first diagonal is " +d1);
        
        System.out.print("Enter the length of another diagonal of the rhombus: ");
        double d2 = scanner.nextInt();
        System.out.println("The second diagonal is " +d2);
        
        double rhombusarea= 0.5*d1*d2;
        System.out.println("The area of the rhombus is " +rhombusarea);
        }
        else if(choice==6)
        {
        System.out.print("Enter the height of the trapezium: ");
        double hei = scanner.nextInt();
        System.out.println("The height is " +hei);
        
        System.out.print("Enter the length of the parallel sides of the trapezium: ");
        double s1 = scanner.nextInt();
        double s2 = scanner.nextInt();
        System.out.println("The lengths are " +s1+" and "+s2);
        
        double trapeziumarea= 0.5*hei*(s1+s2);
        System.out.println("The area of the trapezium is " +trapeziumarea);
        }
        else if(choice==7)
        {
        System.out.print("Enter the length of the base of the triangle: ");
        double bas = scanner.nextInt();
        System.out.println("Your base is " +bas);
        
        System.out.print("Enter the height of the triangle: ");
        double hei = scanner.nextInt();
        System.out.println("Your height is " +hei);
        
        double trianglearea= 1/2*hei*bas;
        System.out.println("The area of the triangle is " +trianglearea);
        
        scanner.close();
    }
}
}
