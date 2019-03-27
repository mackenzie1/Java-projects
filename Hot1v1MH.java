//Mackenzie Harwood 2/21/2019
//Hands on test
import java.util.Scanner; 
import java.text.DecimalFormat;

public class Hot1v1MH
{
   public static void main(String[] args)
   {
    // Create a Scanner
       Scanner input = new Scanner(System.in);
     // Receive the driving 3 digit number
        System.out.print( "Enter a single 3 digit integer number: ");
      //Make the input an integer  
         int threeDigitNumber = input.nextInt();
      //Create variable for each digit 
         int digitOne = threeDigitNumber / 100 ;
         
         int digitTwo = threeDigitNumber / 10 % 10;
         
         int digitThree =  threeDigitNumber % 10;
         
         int sumOfNumbers = digitOne + digitTwo + digitThree ;
         
       
         
         double averageOfNumbers = (digitOne + digitTwo + digitThree) / 3.0 ;
         
         // Round the output to two decimal places
                  DecimalFormat fmt = new DecimalFormat ("0.##"); 

   System.out.println("Digit one is " + digitOne);
   System.out.println("Digit two is " + digitTwo);
   System.out.println("Digit three is " + digitThree);
   System.out.println("The sum of the digits is " + sumOfNumbers);
   System.out.println("The average of the digits is " + fmt.format(averageOfNumbers));

   }
   
}