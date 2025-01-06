import java.util.Scanner;

public class IT24103864Lab10Q1 {
     public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.println();
      System.out.print("Enter the mark ( 0-100): ");
      int mark = input.nextInt();

      assert (mark >= 0 && mark <= 100) : "Invalid Mark";

      System.out.println();
      System.out.println("mark is Validated");

      char grade;
      if (mark >= 75 && mark<=100) {
         grade= 'A';
      } else if (mark >= 60 && mark <=74) {
         grade= 'B';
      } else if (mark >= 50 && mark<= 59) {
         grade= 'C';
      } else if (mark >= 40 && mark<=49) {
         grade= 'D';
      } else {
         grade= 'F';
      }
      System.out.println("The Grade for the Entered Mark is: " + grade);

      assert ((grade == 'A' && mark >= 75 && mark <=100) ||
               (grade==  'B' && mark >= 60 && mark <74) ||
               (grade == 'C' && mark >=50 && mark <59) ||
               (grade== 'D' && mark >= 40 && mark <49) ||
               (grade == 'F' && mark < 39)) : "Incorrect Grade Assigned!";
    }
}