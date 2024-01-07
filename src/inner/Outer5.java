package inner;

/* Учебный пример №9 */
/* Case Study #9 */
public class Outer5 {
    class Inner5 {
        private Outer5 myOuter;

        Inner5() {
            myOuter = Outer5.this;
        }
    }

    public static void main(String[] args) {
        Outer5 outer5 = new Outer5();
    }
}
