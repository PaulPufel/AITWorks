package homework18.library.model;

/* Задача 2.
Создайте класс Book с полями:
название - title;
автор - author;
год издания - year;
уникальный номер - ISBN;
количество страниц - pageQuantity.

В классе Book реализуйте конструктор, геттеры и сеттеры на все поля и метод display, который выводит информацию о книге.
Создайте класс Dictionary, который расширяет класс Book c полями: тип - type; кол-во слов - wordQuantity.
В классе BookAppl в методе main создайте массив типа Book и в нем 4 книги и 3 словаря.
Выведите информацию о них в консоль.

Реализуйте методы, которые выдают:
общее количество страниц во всех книгах;
среднее значение количества слов в словарях;
средний возраст всех изданий. */

public class Book18 {
    private String title;
    private String author;
    private int year;
    private int isbn;
    private int pageQuantity;

    public Book18(String title, String author, int year, int isbn, int pageQuantity) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
        this.pageQuantity = pageQuantity;
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

    public int getPageQuantity() {
        return pageQuantity;
    }

    public void setPageQuantity(int pageQuantity) {
        this.pageQuantity = pageQuantity;
    }

    @Override
    public String toString() {
        return "Book18{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", isbn=" + isbn +
                ", quantity=" + pageQuantity +
                '}';
    }

    public void display() {
        System.out.println("The title: " + title + ", The author: " + author + ", Year of publishing: " + year
                + ", ISBN: " + isbn + ", page of quantity" + pageQuantity);
    }

}



