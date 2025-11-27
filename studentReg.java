import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class studentReg {
    public static void main(String[] args) {

        //----------------------Student Registration System (Admin mode)----------------------\\

        Scanner scanner = new Scanner(System.in);

        // 1. Create arrays and arrayLists for student data

        // Student names
        String[] studentName = {
                "Alice", "Bob", "Charlie", "Diana", "Ethan",
                "Fiona", "George", "Hannah", "Ian", "Julia",
                "Kevin", "Laura", "Mike", "Nina", "Oliver",
                "Paula", "Quentin", "Rachel", "Steve", "Tina"
        };
        ArrayList<String> studentNames = new ArrayList<>(List.of(studentName));

        // Student ages
        Integer[] studentAge = {
                18, 19, 20, 18, 21,
                19, 22, 20, 21, 18,
                19, 20, 21, 22, 18,
                19, 20, 21, 22, 18
        };
        ArrayList<Integer> studentAges = new ArrayList<>(Arrays.asList(studentAge));

        // Student usernames
        String[] studentUsername = {
                "alice123", "bob456", "charlie789", "diana321", "ethan654",
                "fiona987", "george111", "hannah222", "ian333", "julia444",
                "kevin555", "laura666", "mike777", "nina888", "oliver999",
                "paula101", "quentin202", "rachel303", "steve404", "tina505"
        };
        ArrayList<String> studentUsernames = new ArrayList<>(List.of(studentUsername));

        // 2. Create admin credentials
        String adminUsername = "Mr.Admin";
        String adminPassword = "admin123!";
        String enteredUsername;
        String enteredPassword;

        // 3. Prompt user for login
        do {
            System.out.println();
            System.out.print("Enter admin username: ");
            enteredUsername = scanner.nextLine().trim();
            System.out.print("Enter admin password: ");
            enteredPassword = scanner.nextLine().trim();

            if (!enteredUsername.equals(adminUsername) || !enteredPassword.equals(adminPassword)) {
                System.out.print("Invalid credentials please try again");
            }
            System.out.println();
        } while (!enteredUsername.equals(adminUsername) || !enteredPassword.equals(adminPassword));

        System.out.println("Login successful! Welcome " + enteredUsername);
        System.out.println();

        // 4 .Show main menu:

        int menuOption;

        do {
            System.out.println();
            System.out.println("-----------Student Registration System-----------");
            System.out.println();
            System.out.println("1. Add student\n2. View students\n3. Exit");

            menuOption = scanner.nextInt();
            scanner.nextLine();

            // 5. Add Student option
            switch (menuOption) {

                case 1 -> {

                    //Name input
                    String newStudentName;
                    while (true) {
                        System.out.println();
                        System.out.print("Enter student name: ");
                        newStudentName = scanner.nextLine().trim().toLowerCase();

                        if (newStudentName.isEmpty() || !newStudentName.matches("[a-zA-Z]+")) {
                            System.out.println("Invalid student name please try again using only letters (A-Z): ");
                        } else {
                            break;
                        }
                    }

                    newStudentName = newStudentName.substring(0, 1).toUpperCase() + newStudentName.substring(1).toLowerCase();
                    studentNames.add(newStudentName);

                    //Age input
                    int newStudentAge;

                    while (true) {
                        System.out.print("Enter student age (18-25): ");

                        if (!scanner.hasNextInt()) {
                            System.out.println("Invalid age please enter a number");
                            scanner.nextLine();
                            continue;
                        }

                        newStudentAge = scanner.nextInt();
                        scanner.nextLine();

                        if (newStudentAge < 18 || newStudentAge > 25) {
                            System.out.println("Age must be between 18 and 25");
                        } else {
                            break;
                        }
                    }

                    studentAges.add(newStudentAge);

                    //Username input
                    String newStudentUsername;

                    while (true) {
                        System.out.print("Enter student username (letters + 3 digits): ");
                        newStudentUsername = scanner.nextLine().trim().toLowerCase();

                        if (newStudentUsername.matches("[a-zA-Z]+\\d{3}")) {
                            break;
                        }
                        System.out.println("Invalid username | Format must be letters followed by 3 digits");
                            }
                         System.out.println();
                         System.out.println("Student added successfully!");
                         studentUsernames.add(newStudentUsername);

                        }

                // 6. View Students option
                case 2 -> {
                    System.out.println();
                    for (int i = 0; i < studentNames.size(); i++) {
                        System.out.println(studentNames.get(i) + " | " +
                                studentAges.get(i) + " | " +
                                studentUsernames.get(i));
                    }
                }

                // 7. Exit option
                case 3 -> {
                    System.out.println("Exiting...");
                    return;
                }
            }

        } while (menuOption != 3);

        scanner.close();
    }
}
