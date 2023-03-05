public class Main {
    public static void main(String[] args) {
//        Book book = new Book("Tittle", "Author", 1985);
//        book.up();
//        book.up();
//        book.up();
//        System.out.println(book.getRating()); /*this is first part of home work */
//        System.out.println(book.getText());
//        book.append("Any text");
//        System.out.println(book.getText());
        Author author = new Author("Bruce", "Eckel");
        Book book = author.newBook("Philosophy of Java");
        System.out.println(book.yearOfWrite);
        book.up();
        System.out.println(book.rating);
        book.up();
        book.up();
        System.out.println(book.rating);
    }
}
