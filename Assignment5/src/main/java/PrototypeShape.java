
public abstract class PrototypeShape implements Cloneable{

    public abstract void draw();

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
