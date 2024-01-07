package nested;
/* Учебный пример №6 */
/* Case Study #6 */

/* Учебный пример №6
Статические вложенные классы

Демонстрация доступа к «приватной» статической переменной
внешнего класса из внутреннего статического класса */

public class Outer3 {
    private static int prStOuterVar;

    public Outer3() {
    }

    static class Nested3 // Nested
    {
        int getStaticOuterVar() {
            return Outer3.prStOuterVar; // ok
        }

        void setStaticOuterVariable(int var) {
            Outer3.prStOuterVar = var; // ok
        }

    }

    public static void main(String[] args) {
        Outer3.Nested3 nestedObj = new Outer3.Nested3(); // экземпляр класса внутренний

        Outer3.prStOuterVar = 19;

        System.out.println("nestedObj.getStaticOuterVar() = " + nestedObj.getStaticOuterVar())
        ;//статическая переменная внешнего класса из экземпляра внутреннего

// устанавливаем через экземпляр внутреннего класса
        nestedObj.setStaticOuterVariable(77);
        System.out.println("Outer3.prStOuterVar = " + Outer3.prStOuterVar);
    }
}