import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {
      //System.out.println("Hello world!");

      Scanner scanner = new Scanner(System.in);

      System.out.println("What is your name");
      String name = scanner.nextLine();
      System.out.println("Wagwan " + name + "!");
  }
}
