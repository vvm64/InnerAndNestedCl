package anonymous;

/* Учебный пример №23 */
/* Case Study #23 */
public class Outer03 {
    public static void main(String[] args) {
        Runnable anonym = () -> {
        };

        String str = anonym.getClass().toString();
        System.out.println(str);
    }
     /*  раскомментировать если не поддерживается лямбда
            public static void main(String[] args)
            {
              Runnable anonym = new Runnable() {
               public void run() {
                                }
                };
     */

}
