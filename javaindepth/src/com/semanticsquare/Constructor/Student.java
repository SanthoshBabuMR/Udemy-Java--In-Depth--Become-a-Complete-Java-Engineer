class Student {
    int id; 
    String name;
    String gender;
    char[] grades;
    
    Student(int id, String name, char[] grades) {
        this(name);
        this.id = id;
        this.grades = grades;
    }
    
    Student(String name) {
        this.name = name;
    }
    
    String updateProfile(String name) {
        this.name = name;
        return this.name;
    }
}
