package homework_47.librarypaul.model;

public enum Menu {

    ADD_BOOK(1, "Add book"),
    FIND_BOOK_BY_AUTHOR(2, "Find book by author"),
    LIST_BOOKS(3, "List all books"),
    RENT_BOOK(4, "Rent a book"),
    GET_BACK_BOOK(5, "Get back book"),
    LOAD(6, "Start day"),
    EXIT(7, "End day");

    //fields
    int item;
    String action;

    // constructor
    Menu(int item, String action) {
        this.item = item;
        this.action = action;
    }

    // метод, void - ничего не возвращает, он печатает
    public static void printMenu(){
       Menu[] menu = Menu.values(); // put enum items in to array
        for (int i = 0; i < menu.length; i++) {
            System.out.print((menu[i].item) + " - " + menu[i].action + " | ");
        }

        System.out.println(); // new line
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}