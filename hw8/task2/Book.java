package task2;

public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }
    public Book() {
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println("Book title is: " + title);
    }
    public static void printBooks(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Book) {
                System.out.println((item).getTitle());
            }
        }
    }
}