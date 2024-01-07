package localclasses;
/* Учебный пример №19 */
/* Case Study #19 */
public class AnyClass01 {
    public static void main(String[] args) {
        new AnyClass01(){

            void anyNewMethod(){ // добавили новый метод нашему анонимному классу
                System.out.println("Hello from anonimous");
            }
        };
    }
}
