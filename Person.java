class Person{
    private String name;
    private String yearOfBirth;
    public Person(String name, String yearOfBirth){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }
    public String toString(){
        return "Person Name: " + this.name + "\nPerson Birth Year: " + this.yearOfBirth;
    }
}