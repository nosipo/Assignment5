
public class AnimalFactory extends AbstractFactory {

    public AbShape getAbShape(String shape){
        return null;
    }

    public AbAnimal getAbAnimal(String animal){
        if ("DOG".equals(animal)){
            return new AbDog();
        } else if ("CAT".equals(animal)) {
            return new AbCat();
        }
        return null;
    }
}
