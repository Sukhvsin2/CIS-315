public class Cow extends FarmAnimalBase {
    public Cow(String name){
        super(name);
    }
    @Override
    public String talk(){
        return "Meow! Meow!";
    }
}
