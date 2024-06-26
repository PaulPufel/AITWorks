package homework_39.sportleo;

public enum MenuLeo {

    ADD(1, "Add participants"), EXIT(3, "Exit"), LIST(2, "Print protocol");
    int item;
    String action;

    MenuLeo(int item, String action) {
        this.item = item;
        this.action = action;
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

