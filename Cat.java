public class Cat extends FarmAnimalBase {
    public Cat(String name){
        super(name);
    }
    @Override
    public String talk(){
        return "Moo! Moo!";
    }
}
