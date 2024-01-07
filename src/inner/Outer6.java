package inner;
/* Учебный пример №10 */
/* Case Study #10 */

class AnyClass {
} // класс от которого наследуем Inner6

public class Outer6 {// внешний класс

    class Inner6 extends AnyClass { // внутренний класс явно унаследован от "прилегающего"
        // тут мы унаследовали внутренний класс от  AnyClass{}
        // и можем расширить функциональность класса AnyClass{}
        // и класса Outer6

    }
}
