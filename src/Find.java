import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a students' name: ");
        String input_name = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of " + input_name + " in the list is: " + i);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println(input_name + " can not be found in the list.");
        }
    }
}
