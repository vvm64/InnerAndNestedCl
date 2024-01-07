package localclasses;

/* Учебный пример №12 */
/* Case Study #12 */
public class OuterStaticInit {
    static {
        class LocalInit {
            LocalInit() {
                System.out.println("From static iniz");
            }
        }
        LocalInit localInit = new LocalInit();
        System.exit(0);
    }

    public static void main(String[] args) {
        System.out.println("From main");
    }
}
