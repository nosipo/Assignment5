
public class LineAdapter implements AdapterShape {

    private AdapterLine line;
    public LineAdapter (AdapterLine line){
        this.line = line;
    }

    public void draw (int x1, int y1, int x2, int y2) {
        line.draw(x1,y2,x2,y2);
    }
}
