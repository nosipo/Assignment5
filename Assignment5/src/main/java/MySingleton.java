
public class MySingleton {

    private static MySingleton mySingleton;
    private int counter = 0;

    private MySingleton(){
    }

    public static MySingleton getInstance() {
        if (mySingleton == null) {
            mySingleton = new MySingleton();
        }
            return mySingleton;
    }

    public void sayWhat(){
        counter++;
        System.out.println("Hello I am " + counter);
    }
}
