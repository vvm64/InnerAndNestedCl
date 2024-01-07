package innernested;
/* Учебный пример №4 */
/* Case Study #4 */
public class A {
    private static int iPrivVar;
    class B {
        void setPrivateOfA(int var) {
            A.iPrivVar = var;
        }
    }
}
