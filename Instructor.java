class Instructor extends Person{
    double salary;
    Instructor(String name, String yearOfBirth, double salary){
        super(name, yearOfBirth);
        this.salary = salary;
    }
    @Override
    public String toString(){
        
        return super.toString() + "\nInstructor Salary: $" + this.salary;

    }
}