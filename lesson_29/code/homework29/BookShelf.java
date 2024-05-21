package homework29;

import java.util.ArrayList;
import java.util.List;

class BookShelf {
    private List<Book> books = new ArrayList<>();

    // добавить метод toString в класс BookShelf
    @Override
    public String toString() {
        return "BookShelf{" +
                "books=" + books +
                '}';
    }

    static class Book {
        String title;
        String author;
        int year;

        Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", year=" + year +
                    '}';
        }
    }

    void addBook(String title, String author, int year) {
        this.books.add(new Book(title, author, year));
    }

    Book removeBook(int index) {
        return this.books.remove(index);
    }

    class Iterator {
        private int cursor = 0;
        // написать метод nextBook в классе Iterator
        public Book nextBook() {
            // надо взять книжку с полки по индексу
            Book book = BookShelf.this.books.get(this.cursor);
            // перемещаем руку библиотекаря на следующую книгу
            cursor++;
            // проверяем не вышла ли рука библиотекаря за пределы полки
            if (this.cursor == BookShelf.this.books.size()) {
                this.cursor = 0;
            }
            return book;
        }
    }
}