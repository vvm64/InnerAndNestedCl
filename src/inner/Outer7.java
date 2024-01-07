package inner;

/* Учебный пример №11 */
/* Case Study #11 */
class AnyClass2 {
    void anyClass2Method() {
    }
}

public class Outer7 {
    private int iOuterVar;

    private class Inner7 extends AnyClass2 {
        private Outer7 out7;

        public Inner7() {
            out7 = Outer7.this; // ссылка на окружающий класс
        }

        private int anyMethodOfInner7() {

            super.anyClass2Method();// можем вызвать метод нашего супер класса AnyClass2
            return out7.iOuterVar; // можем обратиться к переменным
            // и методам Outer7
        }
    }
}