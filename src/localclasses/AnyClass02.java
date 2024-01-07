package localclasses;
/* Учебный пример №20 */
/* Case Study #20 */
public class AnyClass02 {
    public static void main(String[] args) {
        new AnyClass02(){
            {
                this.anyNewMethod();
            }
            void anyNewMethod(){
                System.out.println("Hello from anonimous");
            }
        };
    }
}
