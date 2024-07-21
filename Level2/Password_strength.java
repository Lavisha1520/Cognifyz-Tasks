import java.util.Scanner;

public class Password_strength {
    public static void main(String[] args) {
    

    String password;
    System.out.println("Enter the Password:");
    Scanner scanner = new Scanner(System.in);
    password= scanner.nextLine();
char[] charArray = new char[password.length()]; 
for(int i = 0; i < password.length(); i++) {
    charArray[i] = password.charAt(i); 
   }boolean containsUppercase = password.matches(".*[A-Z].*");
   boolean containsLowercase = password.matches(".*[a-z].*");
   boolean containsDigit = password.matches(".*\\d.*");
   boolean containsSpecialChar = password.matches(".*[!@#\\$%\\^&*\\(\\)\\{\\}\\[\\]:;<>\\?\\|].*");
   boolean containsAll = containsUppercase && containsLowercase && containsDigit && containsSpecialChar;
   if(containsAll && password.length()>=8)
   {
       System.out.println("Strength of password is strong");
   }
   else if(!containsAll && (containsUppercase || containsLowercase || containsDigit || containsSpecialChar) && password.length()>=8)
   {
       System.out.println("Strength of password is moderate");
   }
   else if(!containsAll)
   {
       System.out.println("Strength of password is weak"); 
   }
   else 
   {
       System.out.println("Invalid Password");
   }
}
}
