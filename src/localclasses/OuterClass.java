package localclasses;
/* Учебный пример №17 */
/* Case Study #17 */
public class OuterClass {
    private int iTemp;
    OuterClass(){
        // объявим внутри конструктора класс

    /* здесь мы не можем использовать private, public
    применительно к локальному классу*/
        final  class LocalInnerClass01{
            /* сам локальный класс может содержать
               как private, так и public */
            private static final int INT_FIN = 10;
            LocalInnerClass01(){
                iTemp = Return_INT_FIN();
            }
            int Return_INT_FIN(){
                return INT_FIN;
            }

        }

        class LocalInnerClass02{
            // public static int i=11; ошибка не может быть не константой внутри
            // локального вложенного класса
        }

        /* создаем локальные объекты  локальных классов в том же конструкторе*/
        LocalInnerClass01 localInnerClass1 = new LocalInnerClass01();
        LocalInnerClass02 localInnerClass2 = new LocalInnerClass02();


    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        System.out.println(outerClass.iTemp ); // = 10
        //OuterClass.LocalInnerClass1 innerObject = outerClass.new LocalInnerClass1(); ошибка - это не
        // внутренний класс, а локальный. И мы не имеем к нему доступа.
    }
}
