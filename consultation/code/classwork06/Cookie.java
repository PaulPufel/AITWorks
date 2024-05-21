package classwork06;

import java.util.concurrent.Callable;

public class Cookie {
    public static void main(String[] args) {
        Cookie cookie1 = new Cookie();
        Cookie cookie2 = new Cookie();
        Cookie cookie3 = new Cookie();
        Cookie cookie4 = new Cookie();


        Cookie[] cookies = new Cookie[4]; // создание пустой коробки для печенья
        cookies[0] = cookie1; // кладём печенье в первую ячейку (она под индексом 0)
        cookies[1] = cookie2; // кладём печенье во вторую ячейку (она под индексом 1)
        cookies[3] = cookie4; // кладём печенье в последнюю (третью) ячейку (она под индексом 3)

        // обычный for
        for (int i = 0; i < cookies.length; i = i + 1) {
            System.out.println(cookies[i]);
        }
        // итеративный for
        for (Cookie cookie : cookies){
            System.out.println(cookie);
        }

        /* for(начальное значение параметра int i = 0; логическое выражение (i < n); шаг приращения i++)
        оператор 1;
        оператор 2;
         */
    }
}
