'''
Description: Create a program that converts
temperatures between Celsius and
Fahrenheit. Prompt the user to enter a
temperature value and the unit of
measurement, and then perform the
conversion. Display the converted
temperature.'''
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[]args) 
    {
        double fahrenheit,celsius;
        String unit;
        System.out.println("Enter the unit of temperature(fahrenheit,celsius)");
        Scanner scanner =new Scanner(System.in); 
unit=scanner.nextLine();

if (unit.equalsIgnoreCase("fahrenheit") )
{
    System.out.println("Enter the temperature in Fahrenheit ");
    fahrenheit=scanner.nextDouble( );
    celsius=(fahrenheit-32)*5/9;
    System.out.println("The temperature in Celsius is"+celsius);
    
}
else if(unit.equalsIgnoreCase("celsius"))
{
   System.out.println("Enter the temperature in Celsius");
   celsius=scanner.nextDouble();
   fahrenheit=(celsius*9/5)+32;
   System.out.println("The temperature in Fahrenheit is "+fahrenheit);
}
else
{
    System.out.println("Enter the valid unit of temperature");

}

    }
}
