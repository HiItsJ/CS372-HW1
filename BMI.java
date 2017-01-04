import java.util.Scanner;

public class BMI{
  public static void main(String[] args){
    System.out.printf("Enter your weight in pounds: ");
    Scanner kb = new Scanner(System.in);
    float weight = kb.nextFloat();
    System.out.printf("Enter your height in inches: ");
    float height = kb.nextFloat();
    float BMI = (weight*703)/(height*height);
    System.out.printf("\nYour Body Mass Index: %f\n\nBMI VALUES\nUnderweight: less than 18.5\nNormal: between 18.5 and 24.9\nOverweight: between 25 and 29.9\nObese: 30 or greater", BMI);
  }
}
