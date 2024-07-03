package homework_42.book_library.model;

/* Задание 1. Доделать GarageHashSetImpl так, чтобы проходили все тесты.
Задание 2. Провести рефакторинг одного из ваших проектов:
Book-Library
Document-Archive
ToDoList
... на ArrayList или HashSet. Обоснуйте свой выбор через оценку вычислительной сложности. */

import java.util.Objects;

public class Book implements Comparable<Book> {

    // fields of class
    private String title;
    private String author;
    private String yearOfPublishing;
    private int isbn;

    // constructor
    public Book(String title, String author, String yearOfPublishing, int isbn) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
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

    public String getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(String yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", isbn=" + isbn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return yearOfPublishing == book.yearOfPublishing && isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    // этот метод сравнивает текущий объект и Book o
    @Override
    public int compareTo(Book o) {
        int res = this.getIsbn() - o.getIsbn(); // сравнение объектов по полю isbn
        return res;
    }

}


