import java.awt.print.Book;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

    }
    Book hallyday = new Book("Hallyday", "O Hallyday", "12345");
    Book.Volume newHallyday = hallyday.new Volume("Hallyday", "O Hallyday", "12345");
    System.out.println(newHallyday.getTitle());
}
