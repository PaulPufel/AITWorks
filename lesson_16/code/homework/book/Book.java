package homework.book;

/*Задача 2.
Создайте класс Book с полями:
название - title
автор - author
год издания - year
уникальный номер - ISBN
В классе Book реализуйте конструктор, геттеры и сеттеры на все поля и метод display,
который выводит информацию о книге.

Создайте класс Dictionary, который расширяет класс Book.
Предложите для него набор полей и переопределите метод display.
В классе BookAppl в методе main создайте несколько словарей
и выведите информацию о них в консоль */

public class Book {
    private String title;
    private String author;
    private int year;
    private int isbn;

    public Book(String title, String author, int year, int isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", isbn=" + isbn +
                '}';
    }

    public void displayBook() {
        System.out.println("The title: " + title + ", The author: " + author + ", Year of publishing: " + year
                + ", ISBN: " + isbn);
    }
}
