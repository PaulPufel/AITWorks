package homework.pets.model;
public class PetLeo {
    private int id;
    private String kindName;
    private int age;
    private String nickName;

    public PetLeo(int id, String kindName, int age, String nickName) {
        this.id = id;
        this.kindName = kindName;
        this.age = age;
        this.nickName = nickName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "PetLeo{" +
                "id=" + id +
                ", kindName='" + kindName + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public void sleep() {
        System.out.println(kindName + " sleeps as usual and can sleep all day. ");
    }

    public void isEating() {
        System.out.println(kindName + " with his beak, trying to crack a nut so that he can feast on it later ");
    }

    public void makeSound() {
        System.out.println(kindName + " makes scary noises in his aquarium... ");
    }

    public void isPlay() {
        System.out.println(kindName + " happily wagging his tail, playing with his soft toy ");
    }

    public void isWalk() {
        System.out.println(kindName + " went for a walk on the windowsill, found a small hole there, climbed in, " +
                "and did not want to get out ");
    }

}