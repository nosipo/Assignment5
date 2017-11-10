
public class PrototypeDemo {

    public static void main(String[] args){
        PrototypeShape shape = PrototypeShapeFactory.getPrototypeShape("CIRCLE");
        /*PrototypeShape anotherShape = shape.super.clone();*/
        shape.draw();
        /*anotherShape.draw();*/
    }
}
