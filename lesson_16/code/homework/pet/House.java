package homework.pet;

public class House {

    private int id;
    private String typ;
    private double age;
    private String nickname;

    public House(int id, String typ, double age, String nickname) {
        this.id = id;
        this.typ = typ;
        this.age = age;
        this.nickname = nickname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void voice() {
    }


    public void display() {
        System.out.println("ID: " + id + ", typ: " + typ + ", age: "
                + age + ", nickname: " + nickname);
    }

    public void isSleep() {
        System.out.println(typ + " " + nickname + " sleeps all day. ");
    }

    public void isEating() {
        System.out.println(typ + " " + nickname + " always wants to eat.");
    }

    public void makeSound() {
        System.out.println(typ + " " + nickname + " makes sounds in sleep.");
    }

    public void isPlay() {
        System.out.println(typ + " " + nickname + " loves to play with children.");
    }

    public void isWalk() {
        System.out.println(typ + " " + nickname + " likes to walk at night.");
    }

}



