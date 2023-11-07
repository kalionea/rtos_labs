import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class BookShelf {

    private final Book[] Books;
    private int index = 0;

    public Book[] getBooks() {
        return Books;
    }

    public BookShelf(int size) {
        Books = new Book[size];
    }


    public void addBook(Book item) {
        if (index < Books.length) {
            Books[index++] = item;
        } else {
            System.out.println("Shelf is full!");
        }
    }

    public Book getOldestBook() {
        int age = 3000;
        int temp = -1;
        int i = 0;
        while (i < Books.length) {
            if (Books[i].getYear() <= age) {
                temp = i;
                age=Books[i].getYear();
            }
            i = i + 1;
        }
        return Books[temp] ;
    }



    public Book getNewestBook () {
        int age = 0;
        int temp = -1;
        int i = 0;
        while (i < Books.length) {
            if (Books[i].getYear() >= age) {
                temp = i;
                age=Books[i].getYear();
            }
            i = i + 1;
        }
        return Books[temp] ;
    }

    public void getSortedShelf () {
        // Arrays.sort(Books, Comparator.comparingInt(Book::getYear));
        int i = 0;
        int j=2;
        Book booktemp=Books[0];
        while (i < (Books.length-1)) {
            if (Books[i].getYear()>=Books[i+1].getYear()) {
                booktemp=Books[i+1];
                Books[i+1]=Books[i];
                Books[i]=booktemp;
            }
            i = i + 1;
        }
        while (j > 0) {
            if (Books[j].getYear()<=Books[j-1].getYear()) {
                booktemp=Books[j-1];
                Books[j-1]=Books[j];
                Books[j]=booktemp;
            }
            j = j - 1;
        }

    }
}
