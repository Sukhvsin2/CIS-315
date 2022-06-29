public class Dog extends FarmAnimalBase{
    public Dog(String name){
        super(name);
    }
    @Override
    public String talk(){
        return "Arf! Arf!";
    }
}
