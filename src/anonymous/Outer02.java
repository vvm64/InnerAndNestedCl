package anonymous;
/* Учебный пример №22 */
/* Case Study #22 */
public class Outer02 {
    Outer02() {
    }

    void method() {
        System.out.println("method экземпляра класса Outer02");
    }

    public static void main(String[] args) {
        Outer02 outter = new Outer02() {// в этом месте создается анонимный класс
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
