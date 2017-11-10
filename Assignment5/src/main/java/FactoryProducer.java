
public class FactoryProducer {

    public static AbstractFactory getFactory(String factory){
        if ("SHAPE".equals(factory)){
            return new ShapeFactory();
        } else if ("ANIMAL".equals(factory)){
            return new AnimalFactory();
        }
        return null;
    }
}
