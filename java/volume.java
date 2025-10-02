import java.util.Scanner;

public class volume
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("This program finds out the volume of a cube, cuboid, cylinder, cone or sphere");
        System.out.println("Choose the solid");
        System.out.println("For cube, type '1'");
        System.out.println("For cuboid, type '2'");
        System.out.println("For cylinder, type '3'");
        System.out.println("For cone, type '4'");
        System.out.println("For sphere, type '5'");
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();

        if(choice==1)
        {

        System.out.print("Enter the side of the cube: ");
        double side = scanner.nextInt();
        System.out.println("Your side is " +side);
        
        double cubearea= side*side*side;
        System.out.println("The area of the square is " +cubearea);
        }
        
        else if(choice==2)
        {
        System.out.print("Enter the length of the cuboid: ");
        double len = scanner.nextInt();
        System.out.println("Your length is " +len);
        
        System.out.print("Enter the breadth of the cuboid: ");
        double bre = scanner.nextInt();
        System.out.println("Your breadth is " +bre);
        
        System.out.print("Enter the height of the cuboid: ");
        double hei = scanner.nextInt();
        System.out.println("Your breadth is " +hei);
        
        
        double cuboidarea= len*bre*hei;
        System.out.println("The area of the rectangle is " +cuboidarea);
        }
        
        else if(choice==3)
        {
        System.out.print("Enter the radius of the cylinder: ");
        double rad = scanner.nextInt();
        System.out.println("Your radius is " +rad);
        
        System.out.print("Enter the height of the cylinder: ");
        double hei = scanner.nextInt();
        System.out.println("Your height is " +hei);
        
        double cylinderarea= Math.PI*rad*rad*hei;
        System.out.println("The area of the cirle is " +cylinderarea);
        }
        else if(choice==4)
        {
        System.out.print("Enter the radius of the cone: ");
        double rad = scanner.nextInt();
        System.out.println("Your radius is " +rad);
        
        System.out.print("Enter the height of the cone: ");
        double hei = scanner.nextInt();
        System.out.println("Your height is " +hei);
        
        double conearea= Math.PI*rad*rad*hei/3;
        System.out.println("The area of the cirle is " +conearea);;
        }
        else if(choice==5)
        {
        System.out.print("Enter the radius of the sphere: ");
        double rad = scanner.nextInt();
        System.out.println("Your radius is " +rad);

        double spherearea= Math.PI*rad*rad*4/3;
        System.out.println("The area of the cirle is " +spherearea);
        }
        
        
        scanner.close();
    }
}
