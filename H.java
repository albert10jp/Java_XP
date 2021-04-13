import java.util.concurrent.TimeUnit;

public class H {
    public static void main(String[] args) {
        int i = 0;
        while (i < 9) {
            System.out.println("\033[1;1H\033[2J\033[?25l");
            if (i % 2 == 0) {
                System.out.println("    * * * *           * * * * ");
                System.out.println("  * * * * * *       * * * * * * ");
                System.out.println("* * * * * * * *   * * * * * * * * ");
                System.out.println("* * * * * * * * * * * * * * * * * ");
                System.out.println("  * * * * * * * * * * * * * * * ");
                System.out.println("    * * * * * * * * * * * * * ");
                System.out.println("      * * * * * * * * * * * ");
                System.out.println("        * * * * * * * * * ");
                System.out.println("          * * * * * * * ");
                System.out.println("            * * * * * ");
                System.out.println("              * * * ");
                System.out.println("                * ");
            } else {
                System.out.println("     * *             * *");
                System.out.println("   * * * *         * * * *");
                System.out.println(" * * * * * *     * * * * * *");
                System.out.println("  * * * * * * * * * * * * *");
                System.out.println("    * * * * * * * * * * *");
                System.out.println("      * * * * * * * * *");
                System.out.println("        * * * * * * *");
                System.out.println("          * * * * *");
                System.out.println("            * * *");
                System.out.println("              *");
            }
            try {
                // delay 5 seconds
                // TimeUnit.SECONDS.sleep(1);
                // delay 0.3 second
                TimeUnit.MICROSECONDS.sleep(300000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            i++;
        }
    }
}
