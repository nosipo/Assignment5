
public class AbstractFactoryDemo {

    public static void main(String[] args){
        ShapeFactory shapeFactory = (ShapeFactory) FactoryProducer.getFactory("SHAPE");
        AbShape shape = shapeFactory.getAbShape("CIRCLE");
        shape.draw();

        AnimalFactory animalFactory = (AnimalFactory) FactoryProducer.getFactory("ANIMAL");
        AbAnimal animal = animalFactory.getAbAnimal("DOG");
        animal.makeNoise();
    }
}
