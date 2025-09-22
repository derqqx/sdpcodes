package abstractfactory;

public class PetrolEngine implements Engine {
    @Override
    public String getType() {
        return "Petrol Engine";
    }
}