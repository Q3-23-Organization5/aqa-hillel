import java.io.PrintStream;

public class CheckUser {
    public CheckUser() {
    }

    public static void main(String[] args) {
        User User1 = new User();
        User1.setName("TestUser1");
        User1.setAge(20);
        User1.setEmail("testemail");
        User1.getIsActive();
        User1.setPassword("TestPassword1");
        PrintStream var10000 = System.out;
        String var10001 = User1.getName();
        var10000.println("Name: " + var10001 + " Age: " + User1.getAge() + " email: " + User1.getEmail() + " Status " + User1.getIsActive());
        User1.makePurchase(20.0);
        User1.makePurchase(30.0);
        User1.printTotalAmountOfSpentMoney();
        User User2 = new User("TestUser2", "TestPassword2");
        User2.setName("TestUser2");
        User2.setPassword("TestPassword2");
        var10000 = System.out;
        var10001 = User2.getName();
        var10000.println("Name: " + var10001 + " Age: " + User2.getAge() + " email: " + User2.getEmail() + " Status " + User2.getIsActive());
        User2.makePurchase(10.0);
        User2.makePurchase(150.0);
        User2.printTotalAmountOfSpentMoney();
        new User();
    }
}
