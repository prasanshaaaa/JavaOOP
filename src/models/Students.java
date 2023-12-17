package models;
    import java.util.Arrays;
    public class Students {
        public String studentName;
        public int studentAge;
        public int[] studentMarks;
        public char studentGrade;

        public Students(String name, int age, int[] marks) {
            this.studentName = name;
            this.studentAge = age;
            this.studentMarks = marks;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String name) {
            this.studentName = name;
        }

        public int getStudentAge() {
            return studentAge;
        }

        public void setStudentAge(int age) {
            this.studentAge = age;
        }

        public int[] getStudentMarks() {
            return studentMarks;
        }

        public void setStudentMarks(int[] marks) {
            this.studentMarks = marks;
        }

        public char getStudentGrade() {
            return studentGrade;
        }

        public void setStudentGrade(char grade) {
            this.studentGrade = grade;
        }

        public static void displayResults(Students student) {
            char grade = calculateGrade(student.getStudentMarks());

            System.out.println("----- Report Card for " + student.getStudentName() + " -----");
            System.out.println("Name: " + student.getStudentName());
            System.out.println("Age: " + student.getStudentAge());
            System.out.println("Grade: " + grade);
            System.out.println("Percentage: " + percentage(student.getStudentMarks()) + "%");
            System.out.println("Result: " + result(grade));
            System.out.println("------------------------------------");
        }

        private static char calculateGrade(int[] marks) {
            int totalMarks = Arrays.stream(marks).sum();
            int percentage = totalMarks / marks.length;

            if (percentage >= 90) return 'A';
            else if (percentage >= 80) return 'B';
            else if (percentage >= 70) return 'C';
            else if (percentage >= 60) return 'D';
            else return 'F';
        }

        private static double percentage(int[] marks) {
            int totalMarks = Arrays.stream(marks).sum();
            return (double) totalMarks / marks.length;
        }

        private static String result(char grade) {
            if (grade == 'F') {
                return "Fail";
            }
            else{
                return "Pass";
            }

        }


}
