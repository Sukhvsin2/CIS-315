class Student extends Person{
    private String major;
    Student(String name, String yearOfBirth, String major){
        super(name, yearOfBirth);
        this.major = major;
    }
    public String toString(){
        return super.toString() + "\nStudent Major: " + this.major;

    }
}