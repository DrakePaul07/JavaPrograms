import java.util.Scanner;
public class Program1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name,surname;
        int age;
        System.out.println("enter your Name");
        name = scan.next();
        System.out.println("enter your surmane");
        surname = scan.next();
        System.out,println("enter age");
        age = scan.nextInt();
        
        if(age<13)
        {
        System.out.println("Child");
        }

        if(age>=13&&age<=18)
        {
            System.out.println("Teenager");
        }

        if(age>18)
        {
            System.out.println("Adult");
        }
        
    }

}