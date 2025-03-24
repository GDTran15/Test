package StudentManagement.a;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class StudentList {
    static List<Student> stuList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {

            System.out.println("Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. View Students by Age");
            System.out.println("4. Remove");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = in.nextInt();

            in.nextLine(); // Consume
            switch (choice) {
                case 1:
                    try {

                        System.out.print("Name: ");
                        String name = in.nextLine();
                        System.out.print("ID: ");
                        int id = in.nextInt();
                        System.out.println("Age: ");
                        int age = in.nextInt();
                        if (age < 5) {
                            throw new IllegalArgumentException("NONONONON must be older than 5");
                        }
                        stuList.add(new Student(name, id, age));
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter number");
                        in.nextLine();
                    } catch (IllegalArgumentException e) {
                        System.out.println("An error occured: " + e.getMessage());
                    }
                    break;

                case 2:
                    stuList.forEach(s -> System.out.println(s));
                    break;
                case 3:
                    stuList.stream()
                            .sorted(Comparator.comparing(Student::getAge))
                            .forEach(System.out::println);
                    break;
                case 4:
                    try {
                        System.out.println("Enter student id: u want to remove:");
                        int id = in.nextInt();
                        boolean removed = stuList.removeIf(s -> s.getId() == id);
                        if (removed) {
                            System.out.println("Removed success");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("NO");
                    }

                case 5:
                    break;

            }

        } while (true);
    }
}
