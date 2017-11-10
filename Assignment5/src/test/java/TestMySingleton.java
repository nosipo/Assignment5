
public class TestMySingleton {

    public static void main(String[] args){
        MySingleton firstInstance = MySingleton.getInstance();
        firstInstance.sayWhat();
        MySingleton secondInstance = MySingleton.getInstance();
        secondInstance.sayWhat();
        MySingleton thirdInstance = MySingleton.getInstance();
        thirdInstance.sayWhat();
    }
}
