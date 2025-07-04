public class LibraryBook {
    String title;
    String author;
    int bookID;

    LibraryBook(String title, String author, int bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    void displayBookInfo() {
        System.out.println("Book ID : " + bookID);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("The Alchemist", "Paulo Coelho", 101);
        LibraryBook book2 = new LibraryBook("A Tale of Two Cities", "Charles Dickens", 102);

        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}
