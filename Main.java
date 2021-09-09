import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.println("Enter a number to count down or up from: ");
    int num;
    
    num = s.nextInt();
    if(num >= 0)
    {
      while(num >= 0)
      {
        System.out.println("num is: " + num);
        num -= 1;
      }
    }

    else if(num <= 0)
    {
      while(num <= 0)
      {
        System.out.println("num is: " + num);
        num += 1;
      }
    }
    System.out.println("Blast off!");
  }
}