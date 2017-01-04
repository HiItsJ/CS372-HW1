import java.util.Scanner;

public class OddOrEven{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    System.out.printf("Enter a number: ");
    int input = kb.nextInt();
    if (input%2==0){
      System.out.printf(input+" is even.\n");
    }
    else {
      System.out.printf(input+" is odd.\n");
    }
  }
}
