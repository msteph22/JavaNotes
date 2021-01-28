import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = keyboard.nextLine();
    System.out.println("Hello " + name);
  }
}