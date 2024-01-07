package anonymous;
/* Учебный пример №21 */
/* Case Study #21 */
public class Outer01 {
    Outer01() {
    }

    void method() {
        System.out.println("method экземпляра класса Outer");
    }
    public static void main(String[] args) {
        Outer01 outter = new Outer01() {// в этом месте создается анонимный класс
            {// статический блок инициализации анонимного класса
                super.method(); // вызов метода класса Outer

                method(); // здесь мы можем вызвать method() анонимного класса
                // здесь мы можем вызвать метод nmethod() анонимного класса
                nmethod();
            }

            @Override
            void method() { // переопределение метода в анонимном классе
                System.out.println("method экземпляра анонимного класса ");
            }

            void nmethod() {
                //новый метод который мы добавили
                System.out.println("nmethod экземпляра анонимного класса ");
            }
        }; // здесь заканчивается анонимный класс

        // далее мы можем обратиться только к методу outter.method();
        outter.method();
        // из этого места мы не можем обратиться к методу nmethod()
        //  потому как в Outer этого метода нет и у нас не ссылки на анонимный класс
        //  можете раскоментировать строку ниже чтобы проверить
        // outter.nmethod();
    }
}
