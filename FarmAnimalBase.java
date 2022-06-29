public class FarmAnimalBase implements FarmAnimal{
    private final String name;
    public FarmAnimalBase(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String talk() {
        // TODO Auto-generated method stub
        return null;
    }
}
