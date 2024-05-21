package homework29;

public class BookShelfApp {
    public static void main(String[] args) {
        // Создаём книжную полку в методе main
        BookShelf bookShelf = new BookShelf();
        // заполняем книжную полку в методе main
        bookShelf.addBook("Война и мир", "Лев Толстой", 1838);
        bookShelf.addBook("Мастер и Маргарита", "Булгаков", 1956);
        bookShelf.addBook("Ревизор", "М. Гоголь", 1874);
        bookShelf.addBook("Евгений Онегин", "А.С. Пушкин", 1882);

        System.out.println(bookShelf);
        System.out.println("-----------------------------------------------------------");

        // Создать объект внутреннего класса Iterator и вызвать на нем несколько раз метод nextBook
        BookShelf.Iterator iterator = bookShelf.new Iterator();

        System.out.println(iterator.nextBook());
        System.out.println(iterator.nextBook());
        System.out.println(iterator.nextBook());
        System.out.println(iterator.nextBook());
        System.out.println(iterator.nextBook());
        System.out.println(iterator.nextBook());
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < 4; i++) {
            System.out.println(iterator.nextBook());
        }
    }
}

