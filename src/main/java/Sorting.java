import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Sorting {

    public Sorting() {
        }

        public static void sort(Student[] students, Comparator<Student> comparator) {
            Arrays.sort(students, comparator);
        }

        public static void main(String[] args) {
            Student[] students = new Student[]{new Student(1, "Aryan", 90, 22), new Student(2, "Suraj", 92, 23), new Student(3, "Aayush", 89, 21), new Student(4, "Anmol", 80, 20)};
            Scanner sc = new Scanner(System.in);
            System.out.print("please Enter your Desired input(age/id/grade/name) : ");
            String UserInput = sc.next();
            switch (UserInput.toLowerCase()){
                case  "id" :
                    sort(students, Comparator.comparingInt(Student::getId));
                    System.out.println("Sort by ID: " + Arrays.toString(students));
                        break;

                case "age" :
                    sort(students, Comparator.comparingInt(Student::getAge));
                    System.out.println("Sort by Age: " + Arrays.toString(students));
                    break;

                case "name":
                    sort(students, Comparator.comparing(Student::getName));
                    System.out.println("Sort by Name: " + Arrays.toString(students));
                    break;

                case "grade" :
                    sort(students, Comparator.comparingInt(Student::getGrade));
                    System.out.println("Sort by Grade: " + Arrays.toString(students));
                    break;
                default :
                    System.out.println("Wrong Input!");
            }


        }


}
