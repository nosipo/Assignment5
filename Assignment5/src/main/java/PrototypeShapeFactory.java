
public class PrototypeShapeFactory {

    public static PrototypeShape getPrototypeShape(String shape){
        if ("RECTANGLE".equals(shape)){
            return new PrototypeRectangle();
        } else if ("CIRCLE".equals(shape)) {
            return new PrototypeCircle();
        }
        return null;
    }
}
