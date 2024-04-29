package homework.book.model;

/* Задача 2.
Создать класс Book в пакете book.model.
В этом классе определить поля: private long isbn; private String title;
private String author; private int yearOfPublishing;
Создать конструкторы для иницализации всех полей,
и конструктор для инициализации полей при отсутствии автора.
Остальные конструкторы на Ваше усмотрение.
Создать геттеры и сеттеры, исходя из логики и необходимости.
Создать метод public void display() для печати в консоль информации о книге.

Создать класс BookAppl в пакете ait.book с методом main.
В методе main создать несколько экземпляров Book
и вывести для каждого из них результат работы метода display.
 */
public class Book {

    private int isbn;
    private String title;
    private String author;
    private int publishing;

    public Book(int isbn, String title, String author, int publishing) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publishing = publishing;
    }

    public Book(int isbn, String title, int publishing) {
        this.isbn = isbn;
        this.title = title;
        this.publishing = publishing;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
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

    public int getPublishing() {
        return publishing;
    }

    public void setPublishing(int publishing) {
        this.publishing = publishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", Publishing=" + publishing +
                '}';
    }

    public void displayBook() {
        System.out.println("ISBN: " + isbn + ", The title: " + title + ", The author: " + author + ", Year of publishing: " + publishing);
    }
    public void displayBook1() {
        System.out.println("ISBN: " + isbn + ", The title: " + title + ", Year of publishing: " + publishing);
    }
}




