'''
Description: create a program that
calculates and displays the average grade of
a student. Prompt the user to enter the
number of grades to be entered, and then
input each grade. Calculate the average and
display it to the user.'''
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        int total_marks=0;
        int obtained_marks=0;
        float average;
        float percentage;
        System.out.println("Enter the number of subject");
        Scanner scanner = new Scanner(System.in);
        int subject = scanner.nextInt();
        for(int i=1;i<=subject;i++)
        {
            System.out.println("Enter marks of subject" + i);
            int mark = scanner.nextInt();
            total_marks+=mark;
            System.out.println("Enter obtained marks of subject" + i);
            int obtain = scanner.nextInt();
            obtained_marks+=obtain;
        }
        System.out.println("Total marks"+ total_marks);
        System.out.println("Obtained marks" +obtained_marks);
        
        average=total_marks/subject;
        System.out.println("Average marks:" + average);
        percentage = (float)(obtained_marks*100)/total_marks
        ;
        System.out.println("Percentage obtained" + percentage);
        if(percentage>=90)
        {
            System.out.println("Grade A");
        }
        else if(percentage>=80 && percentage<90)
        {
            System.out.println("Grade B");
        }
        else if(percentage>=70 && percentage<80)
        {
            System.out.println("Grade C");
        }
        else if(percentage>=60 && percentage<70)
        {
            System.out.println("Grade D");
        }
        else if(percentage>=50 && percentage<60)
        {
            System.out.println("Grade E");
        }
        else 
        {
            System.out.println("Grade F");
        }


    }
}
