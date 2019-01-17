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
    
    boolean updateProfile(String name) {
        this.name = name;
        return true;
    }
}
