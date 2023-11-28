package task1;

public class Model extends MobilePhone implements Mobile{


    @Override
    public void call() {
        System.out.println("Mobile phone is calling according to the abstract class ");
    }
    @Override
    public void isPortable() {
        System.out.println("Mobile device is portable according to the Interface");
    }
}
