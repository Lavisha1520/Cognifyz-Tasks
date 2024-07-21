import java.util.Scanner;

public class Palindrome {
    public static void main(String[]args)
    {
    String word;
    String reverse;
    int length;
    System.out.println("Enter the word or phrases you want to check whether it is palindrome or not:");
    Scanner scanner = new Scanner(System.in);
    word=scanner.nextLine();
     length=word.length();
      reverse="";
     for(int i=length-1;i>=0;i--)
     {
        reverse=reverse+word.charAt(i);
     }
     
     
    if(word.equals(reverse))
    {
        System.out.println("Given string is palindrome");
    }
    else
    {
        System.out.println("Given string is not a palindrome");
    } 
    
  }
}

