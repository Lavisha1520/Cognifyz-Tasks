'''
Description: Build a program that generates a
random password for the user. Prompt the user to
enter the desired length of the password and
specify whether it should include numbers,
lowercase letters, uppercase letters, and special
characters. Generate the password accordingly
and display it to the user.'''
import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {
    
    public static void main(String[] args) {
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String digits  = "0123456789";
        String specialcharacters = "!@#$%^&*(){}[]:;<>?|";
        String upperlower = uppercase+lowercase;
        String all = uppercase+lowercase+digits+specialcharacters;
        String upperlowerdigit = uppercase+lowercase+digits;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of password you want to generate:");
        int length = scanner.nextInt();
        char[] password = new char[length];
        System.out.println("Specify the random paassword you want to generate:");
        System.out.println("Press 1 if you want to generate uppercase password");
        System.out.println("Press 2 if you want to generate lowercase password");
        System.out.println("Press 3 if you want to generate digits password");
        System.out.println("Press 4 if you want to generate specialcharacters password");
        System.out.println("Press 5 if you want to generate uppercase and lowercase password");
        System.out.println("Press 6 if you want to generate combination of all password");
        System.out.println("Press 7 if you want to generate combination of uppercase,lowercase, digits password");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        switch(choice)
        {
            case 1:
            for(int i=0;i<length;i++)
            {
                password[i]=uppercase.charAt(random.nextInt(uppercase.length()));
              
            }
            System.out.println("The generated password is: " + new String(password));
            break;
            case 2:
            for(int i=0;i<length;i++)
            {
                password[i]=lowercase.charAt(random.nextInt(lowercase.length()));
              
            }
            System.out.println("The generated password is: " + new String(password));
            break;
            case 3:
            for(int i=0;i<length;i++)
            {
                password[i]=digits.charAt(random.nextInt(digits.length()));
              
            }
            System.out.println("The generated password is: " + new String(password));
            break;
            case 4:
            for(int i=0;i<length;i++)
            {
                password[i]=specialcharacters.charAt(random.nextInt(specialcharacters.length()));
              
            }
            System.out.println("The generated password is: " + new String(password));
            break;
            case 5:
            for(int i=0;i<length;i++)
            {
                password[i]=upperlower.charAt(random.nextInt(upperlower.length()));
              
            }
            System.out.println("The generated password is: " + new String(password));
            break;
            case 6:
            {
                for(int i=0;i<length;i++)
            {
                password[i]=all.charAt(random.nextInt(all.length()));
              
            }
            System.out.println("The generated password is: " + new String(password));
            break;
            }
            case 7:
            {
                for(int i=0;i<length;i++)
            {
                password[i]=upperlowerdigit.charAt(random.nextInt(upperlowerdigit.length()));
              
            }
            System.out.println("The generated password is: " + new String(password));
            break;
            }
            
            default:
            System.out.println("Your choice is invaild!!");



        }

        

        
    }
}
