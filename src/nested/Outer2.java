package nested;
/* Учебный пример №5 */
/* Case Study #5 */

/*
Статические вложенные классы

Попытка доступа к не статической переменной
внешнего класса Outer2 через обращение из вложенного статического класса Nested2
*/
public class Outer2 {
    public int pubOutVar; // переменная не статическая и мы не имеем к ней доступа
    // из внутреннего статического класса
    private int prOutVar;
    public Outer2(){}// конструктор внешнего класса

    static class Nested2{
        public static int pub_innVar; // тут все в порядке
        public Nested2() {} // конструктор вложенного класса

        int getOuterPublicVariable()
        {
            return Outer2.this.pubOutVar; // ошибка
            return Outer2.pubOutVar; // ошибка
        }

        int getOuterPrivateVariable()
        {
            return Outer2.this.prOutVar; // ошибка
            return Outer2.prOutVar; // ошибка
        }

    }
}
