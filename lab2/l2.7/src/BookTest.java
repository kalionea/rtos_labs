public class BookTest {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf(3);

        shelf.addBook(new Book("Pushkin", "Goldfish", 1825));
        shelf.addBook(new Book("Lermontov", "Borodino", 1819));
        shelf.addBook(new Book("Gogol", "Dead souls", 1849));

        System.out.println(shelf.getOldestBook());
        System.out.println(shelf.getNewestBook());
        System.out.println("---------------");

        for (Book item : shelf.getBooks()) {
            if (item != null) {
                System.out.println(item.toString());
            }
        }
        System.out.println("---------------");
        shelf.getSortedShelf();
        for (Book item : shelf.getBooks()) {
            if (item != null) {
                System.out.println(item.toString());
            }
        }
    }
}