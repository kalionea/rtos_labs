package Lab_7;

public class Book implements Lab_7.Printable {

    private String title;

    public Book(String title) {
        this.title = title;
    }
    public static void printBooks(Lab_7.Printable[] printables) {
        for (Lab_7.Printable printable : printables) {
            if (printable instanceof Book) {
                printable.print();
            }
        }
    }
    @Override
    public void print() {
        System.out.println("Printing: " + title);
    }
}
