public class Student {

        private int id;
        private String name;
        private int grade;
        private int age;

        public Student(int id, String name, int grade, int age) {
            this.id = id;
            this.name = name;
            this.grade = grade;
            this.age = age;
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public int getGrade() {
            return this.grade;
        }

        public int getAge() {
            return this.age;
        }

        public String toString() {
            return "Student{id=" + this.id + ", name='" + this.name + "', grade=" + this.grade + ", age=" + this.age + "}";
        }


}
