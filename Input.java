import java.util.Scanner;
class Input {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = keyboard.nextLine();
    System.out.println("Hello " + name);
  }
}