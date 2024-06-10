package homework_35.books;

// Сделать пример класса c интерфейсом Comparable по двум полям.
// Например: книги одного автора, но с разными годами издания.

import java.util.Objects;

public class Book implements Comparable<Book> {

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
        return yearOfPublishing == book.yearOfPublishing && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, yearOfPublishing);
    }

    // этот метод сравнивает текущий объект и Book o
    @Override
    public int compareTo(Book o) {
        int res = this.yearOfPublishing - o.yearOfPublishing; // сравнение объектов по полю yearOfPublishing
        return res;
    }
}
