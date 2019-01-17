class Student {
    int id; 
    String name;
    String gender;
    
    Student(int id, String name) {
        this(name);
        this.id = id;
    }
    
    Student(String name) {
        this.name = name;
    }
    
    String updateProfile(String name) {
        this.name = name;
        return this.name;
    }
}
