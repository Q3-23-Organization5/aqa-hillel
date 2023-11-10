package task2;

public interface Printable {
    public void print();

    String NAME = "Default name";
    String TITLE = "Default name";
    default String getName(){
        return NAME;
    }
    default String getTitle(){
        return TITLE;
    }
}