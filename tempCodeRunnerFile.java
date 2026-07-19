public class  incrementNumberDiamond {
    public static void main(String[] args) {

        int n = 5;

        // Upper Half
        for (int i = 1; i <= n; i++) {

            // Print number i+2, i times
            for (int j = 1; j <= i; j++) {
                System.out.print((i + 2) + " ");
            }

            System.out.println();
        }

        // Lower Half
        for (int i = n - 1; i >= 1; i--) {

            // Print number i+2, i times
            for (int j = 1; j <= i; j++) {
                System.out.print((i + 2) + " ");
            }

            System.out.println();
        }
    }
}