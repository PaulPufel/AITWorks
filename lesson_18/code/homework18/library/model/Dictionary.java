package homework18.library.model;

import homework18.library.model.Book18;

// Создайте класс Dictionary,
// который расширяет класс Book c полями:
// тип - type;
// кол-во слов - wordQuantity.

public class Dictionary extends Book18 {
    private String type;
    private int wordQuantity;

    public Dictionary(String title, String author, int year, int isbn, int pageQuantity, String type, int wordQuantity) {
        super(title, author, year, isbn, pageQuantity);
        this.type = type;
        this.wordQuantity = wordQuantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWordQuantity() {
        return wordQuantity;
    }

    public void setWordQuantity(int wordQuantity) {
        this.wordQuantity = wordQuantity;
    }

}