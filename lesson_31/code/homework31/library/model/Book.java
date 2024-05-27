package homework31.library.model;

import java.util.Objects;

/* Задача 1.
   Повторить самостоятельно реализацию класса Book, интерфейса Library и тесты для Book (класс) - Library (interface).
   Задача 2.
   Во всех класcах должен быть некий id (штрих-код, isbn и т.д.)
   По методам - должны быть CRUD-операции: С - create R - read, find U - update (не обязательно) D - delete, remove
   Book - Library, найти несколько книг по автору
   Главное - не функциональность, а последовательность от классов через интерфейс к тестированию и имплементации. */

public class Book {

    // fields of class
    private String title;
    private String author;
    private int yearOfPublishing;
    private int isbn;

    // constructor
    public Book(String title, String author, int yearOfPublishing, int isbn) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
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

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Book");
        sb.append(", title: ").append(title);
        sb.append(", author: ").append(author);
        sb.append(", year of publishing: ").append(yearOfPublishing);
        sb.append("isbn = ").append(isbn);
        return sb.toString();
    }
}


