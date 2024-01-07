package anonymous;

/* Учебный пример №24 */
/* Case Study #24 */
public class Outer04 {
    Outer04() {
    }

    public static void main(String[] args) {
        Runnable outerPlusMethod;

        outerPlusMethod = () -> {
            System.out.println("Hello from anonymous");
        };

        outerPlusMethod.run(); // вызов добавленного нами метода локального анонимного класса
    }
}
