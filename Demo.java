import java.util.Scanner;
class Demo{
    public static void main(String[] args)
    {
     int x,y,z;
     Scanner scan = new Scanner(System.in);
     System.out.println(" take two numbers for addition");
     x = scan.nextInt();
     y = scan.nextInt();
     z=x+y;
     System.out.println(" Addition " +z);
}

}