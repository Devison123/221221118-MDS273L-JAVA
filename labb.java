import java.util.Scanner;

public class labb {
  public static void main(String[] args) {
    String[] names = new String[1024];
    int count = 0;
    Scanner scan = new Scanner(System.in);
    int choice;
    do {
      System.out.println("Enter your choice:");
      System.out.println("1. Enter a name");
      System.out.println("2. Search for a name");
      System.out.println("3. Remove a name");
      System.out.println("4. Show all names");
      System.out.println("0. Exit");
      choice = scan.nextInt();
      switch (choice) {
        case 1:
          System.out.println("Enter a name:");
          String name = scan.next();
          if (count == 1024) {
            System.out.println("Array is full, cannot enter more names.");
            break;
          }
          for (int i = 0; i < count; i++) {
            if (names[i].equals(name)) {
              System.out.println("Name already exists, enter a different name.");
              break;
            }
          }
          names[count++] = name;
          System.out.println("Name entered successfully.");
          break;

        case 2:
          System.out.println("Enter a name to search:");
          name = scan.next();
          for (int i = 0; i < count; i++) {
            if (names[i].equals(name)) {
              System.out.println("Name found at index: " + i);
              break;
            }
          }
          System.out.println("Name not found.");
          break;

        case 3:
          System.out.println("Enter a name to remove:");
          name = scan.next();
          int index = -1;
          for (int i = 0; i < count; i++) {
            if (names[i].equals(name)) {
              index = i;
              break;
            }
          }
          if (index == -1) {
            System.out.println("Name not found.");
            break;
          }
          for (int i = index; i < count - 1; i++) {
            names[i] = names[i + 1];
          }
          count--;
          System.out.println("Name removed successfully.");
          break;

        case 4:
          System.out.println("List of all names:");
          for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + names[i]);
          }
          break;

        case 0:
          System.out.println("Exiting the program...");
          break;

        default:
          System.out.println("Invalid choice, try again.");
      }
    } while (choice != 0);
    scan.close();
  }
}

