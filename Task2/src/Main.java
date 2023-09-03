public class Main {
    public static void main(String[] args) {
        Author author = new Author("Kozlov Evgeniy Yurevich", "KozEvg@gmail.com", true);
        Book book = new Book("New Dawn", author, 100, 3);
        System.out.println(book);
    }
}
