package ru.sber.oop1;

public class Book {
    private String Title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {
        Title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + Title + '\'' +
                ", author=" + author +
                ", year=" + year +
                '}';
    }
}
