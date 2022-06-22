package ru.sber.oop1;

public class BookAndAuthor {
    public static void main(String[] args) {
        Author author = new Author("Chuck", "male", "ig@mail.ru");
        System.out.println(author.toString());
        System.out.println(author.getEmail());
        Book myFavBook = new Book("Tree", author, 1999);
        System.out.println(myFavBook.toString());
        System.out.println(myFavBook.getAuthor());

    }
}
