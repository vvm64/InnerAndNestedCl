package inner;
/* Учебный пример №8 */
/* Case Study #8 */
public class Outer {
    class InnerClass {

    }

    Outer() {
    }

    public static void main(String[] args) {
        Outer outerObject = new Outer();
        Outer.InnerClass innerObject = outerObject.new InnerClass(); // создание экземпляра внутреннего класса
    }
}
