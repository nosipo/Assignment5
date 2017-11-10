
public class ShapeFactory extends AbstractFactory {

    public AbShape getAbShape(String shape){
        if ("RECTANGLE".equals(shape)){
            return new AbRectangle();
        } else if ("CIRCLE".equals(shape)) {
            return new AbCircle();
        }
        return null;
    }

    public AbAnimal getAbAnimal(String animal){
        return null;
    }
}
