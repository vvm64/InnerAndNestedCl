package localclasses;

/* Учебный пример №18 */
/* Case Study #18 */
public class LocalClassAndVars {
    private int prIntVar = 1;
    private static int prStIntVar = 2;
    private final int prFinVar = 3;

    LocalClassAndVars() {

    }

    void anyMethodOfOuter() {

        class LocalClass {
            void anyMethodLocal() {
                prIntVar = 10;
                prStIntVar = 20;
                // prFinVar  = 30; финальная нельзя менять,
                // но мы можем прочитать
                int localVar = prFinVar;
            }
        }

        LocalClass localOb = new LocalClass();
        localOb.anyMethodLocal();
    }

    public static void main(String[] args) {

        LocalClassAndVars   outerObj = new LocalClassAndVars();
        System.out.println("prIntVar = "+ outerObj.prIntVar + " prStIntVar = "+ LocalClassAndVars.prStIntVar
                + " prFinVar = "+ outerObj.prFinVar);

        outerObj.anyMethodOfOuter();

        System.out.println("prIntVar = "+ outerObj.prIntVar + " prStIntVar = "+ LocalClassAndVars.prStIntVar
                +" prFinVar = "+ outerObj.prFinVar);

    }
}
