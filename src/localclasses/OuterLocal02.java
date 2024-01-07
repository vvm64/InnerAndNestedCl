package localclasses;

/* Учебный пример №14 */
/* Case Study #14 */
public class OuterLocal02 {
    OuterLocal02() {

        /*объявление локального класса в конструкторе OuterLocal*/
        class LocalInnerClass {
            LocalInnerClass() {
            }
        }
        /* создаем экземпляр в том же блоке*/
        LocalInnerClass localObj = new LocalInnerClass();
    }


    public static void main(String[] args) {
        //  LocalInnerClass localObj = new LocalInnerClass(); не можем создать объект локального класса
        // вне области видимости содержащего его блока
    }
}
