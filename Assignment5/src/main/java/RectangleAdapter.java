
public class RectangleAdapter implements AdapterShape {

    private AdapterRectangle rectangle;
    public RectangleAdapter (AdapterRectangle rectangle){
        this.rectangle = rectangle;
    }

    public void draw (int x1, int y1, int x2, int y2) {
        rectangle.draw(x1,y2,x2,y2);
    }
}
