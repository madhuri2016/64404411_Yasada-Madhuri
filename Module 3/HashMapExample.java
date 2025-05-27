import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int id;
        String name;

        System.out.println("Enter student ID and name (type -1 for ID to stop):");

        while (true) {
            System.out.print("Enter student ID: ");
            id = scanner.nextInt();
            scanner.nextLine(); 

            if (id == -1) {
                break;
            }

            System.out.print("Enter student name: ");
            name = scanner.nextLine();

            studentMap.put(id, name);
        }

        System.out.print("Enter an ID to search: ");
        int searchId = scanner.nextInt();

        if (studentMap.containsKey(searchId)) {
            System.out.println("Student name: " + studentMap.get(searchId));
        } else {
            System.out.println("Student ID not found.");
        }

        scanner.close();
    }
}
