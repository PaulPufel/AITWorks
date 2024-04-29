package homework.book;

// Создайте класс Dictionary, который расширяет класс Book.
// Предложите для него набор полей и переопределите метод display.
// В классе BookAppl в методе main создайте несколько словарей и выведите информацию о них в консоль.
public class Dictionary extends Book {
    private String language;
    private int number;

    public Dictionary(String title, String author, int year, int isbn, String language, int number) {
        super(title, author, year, isbn);
        this.language = language;
        this.number = number;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void voice() {
        System.out.println("Language: " + language);
        System.out.println("Number of words: " + number);
    }
}