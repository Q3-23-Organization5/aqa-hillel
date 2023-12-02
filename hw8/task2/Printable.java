package task2;

public interface Printable {
    String NAME = "Default name";
    String TITLE = "Default name";
    public void print();
    default String getName(){
        return NAME;
    }
    default String getTitle(){
        return TITLE;
    }
}