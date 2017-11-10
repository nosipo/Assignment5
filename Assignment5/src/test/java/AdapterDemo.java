
public class AdapterDemo {

    public static void main(String[] args){
        AdapterShape shape = new RectangleAdapter(new AdapterRectangle());
        shape.draw(10,20,10,20);
    }
}
