import java.util.Scanner;

public class CircleArea{
  public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    System.out.printf("Enter a radius: ");
    int radius = kb.nextInt();
    final float PI = (float)3.14;
    System.out.printf("A circle with the radius "+radius+" would have the area "+PI*radius*radius+"\n");
  }
}
