class StudentTest {
    public static void main(String... args) {
        int[] studentIds= new int[] {1001, 1002, 1003};
        Student student1 = new Student(studentIds[0], "joan", new char[] {'A', 'B'});
        student1.gender = "male";
        
        Student student2 = new Student(studentIds[1], "raj", new char[] {'C', 'B'});
        student1.gender = "male";
        
        Student student3 = new Student(studentIds[2], "anitha", new char[] {'B', 'B'});
        student1.gender = "female";
        
        
        System.out.println("Name of student1: " + student1.name);
        System.out.println("Grades of student1: " + student1.grades[0]);
        System.out.println("Name of student2: " + student2.name);
        System.out.println("Grades of student2: " + student2.grades[0]);
        System.out.println("Name of student3: " + student3.name);
        System.out.println("Grades of student3: " + student3.grades[0]);

        student1.updateProfile("john");
        System.out.println("Updated name of student1: " + student1.name);

    }
}
