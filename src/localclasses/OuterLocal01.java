package localclasses;

/* Учебный пример №13 */
/* Case Study #13 */
public class OuterLocal01 {
    OuterLocal01() {
        // начало блока конструктора

        /*объявление локального класса в конструкторе OuterLocal*/
        class LocalInnerClass {
            LocalInnerClass() {
            }
        }
        /* создаем экземпляр в том же блоке*/
        LocalInnerClass localObj = new LocalInnerClass();
        // окончание блока конструктора
    }
}
