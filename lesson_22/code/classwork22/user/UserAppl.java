package classwork22.user;

// import classwork22.user.User;

import classwork22.user.User;

class UserAppl {
    public static void main(String[] args) {

        User user = new User("peter@gmail.com", "12345"); // создаём пользователя
        System.out.println(user.getEmail()); // печатаем

     /*   // public static void main(String[] args) {
        User user1 = new User("example@mail.com", "qwerty12");
        System.out.println(user1); */
    }
}
