import java.util.Scanner;

public class monogram
{

  public static void main(String [] args)
	  {
    
    Scanner mono = new Scanner(System.in);
    
    String first, middle, last;
    //hello there
    System.out.println("This is a program to generate a monogram.");
    System.out.println("What is your first name? ");
    first = mono.next();
    System.out.println("What is your middle name? ");
    middle = mono.next();
    System.out.println("What is your last name? ");
    last = mono.next();
    
    String initials = first.substring(0,1).toUpperCase() + last.substring(0,1).toUpperCase() + middle.substring(0,1).toUpperCase();
    
    System.out.println("Your monogram is: " + initials);
    }
}
