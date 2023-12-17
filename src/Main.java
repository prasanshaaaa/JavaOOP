import models.Students;
public class Main {
    public static void main(String[] args) {

                int[] marks1 = {85, 90, 78, 92, 88};
                int[] marks2 = {75, 80, 65, 90, 82};
                int[] marks3 = {92, 88, 95, 78, 85};

                Students student1 = new Students("Prasansha", 21, marks1);
                Students student2 = new Students("Sadhana", 22, marks2);
                Students student3 = new Students("Aarashi", 20, marks3);

                Students.displayResults(student1);
                Students.displayResults(student2);
                Students.displayResults(student3);
            }
        }



