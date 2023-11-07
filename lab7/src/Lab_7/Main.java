package Lab_7;

public class Main {
    public static void main(String[] args) {
        Magazine[] magazines = {
                new Magazine("Magazine: National Geographic"),
                new Magazine("Magazine: Totoshka"),
                new Magazine("Magazine: New York Times")
        };

        Book[] books = {
                new Book("Book: 1984"),
                new Book("Book: Forrest Gump"),
                new Book("Book: One Flew over the Cuckoo's Nest")
        };

        Magazine.printMagazines(magazines);
        Book.printBooks(books);
    }
}
