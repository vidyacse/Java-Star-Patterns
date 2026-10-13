
public class House_pattern {
    public static void main(String[] args) {
        int n = 4;

    
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {
            System.out.print(" ");

            for (int j = 1; j <= 5; j++) {
                if (j == 1 || j == 5 || i == 4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
