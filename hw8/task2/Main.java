package task2;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("title-book1");
        Book book2 = new Book("title-book2");

        Magazine magazine1 = new Magazine("title-magazine1");
        Magazine magazine2 = new Magazine("title-magazine2");

        Printable[] bookArray = {book1, book2, magazine1, magazine2};
        for (Printable books : bookArray) {
            books.print();
        }
        System.out.println("\nPrinting magazines:");
        Magazine.printMagazines(bookArray);

        System.out.println("\nPrinting books:");
        Book.printBooks(bookArray);
    }
}