class Employee{
    String firstName, lastName;
    double monthlySalary;
    
    Employee(){
        firstName = lastName = null;
        monthlySalary = 0;
    }
    
    Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }
    
    void setFirstName(String firstName){
        this.firstName = firstName;
    }
    void setLastName(String lastName){
        this.lastName = lastName;
    }
    void setMontlySarlary(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }
    String getFirstName(){
        return firstName;
    }
    String getLastName(){
        return lastName;
    }
    double getMontlySalary(){
        return monthlySalary;
    }
    void setMonthSalary(double raise){
        monthlySalary += raise/(double)100.00 * monthlySalary;
    }
};