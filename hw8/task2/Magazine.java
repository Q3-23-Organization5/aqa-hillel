package task2;
public class Magazine implements Printable {
    private String name;
    public Magazine(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void print() {
        System.out.println("Magazine title is: " + name);
    }
    // Створити статичний метод printMagazines(Printable[] printable) у класі Magazine, який виводить на консоль назви лише журналів
    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                System.out.println((item).getName());
            }
        }
    }
}