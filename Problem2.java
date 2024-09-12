public class Problem2
{
  public static void main(String[] args)
  {
    // problem 2
    int number = 123;
    int digit1 = (number % 10); //print 3
    number = number/10; //make number 12

    int digit2 = (number % 10); //print 2
    number = number / 10; //make number 1

    int digit3 = (number % 10); //print 1
    number = number/10; //print number 0

    System.out.println(digit3);
    System.out.println(digit2);
    System.out.print(digit1); // 1 2 3
  }
}

