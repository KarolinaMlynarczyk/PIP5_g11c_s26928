public class Main {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Przykład 2:");
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Przykład 3:");
        int k = 0;
        for (int i = 0; i < n; i++) {
            if ((n - 1) % 2 != 0) {
                for (int j = 0; j < k; j++) {
                    System.out.print(" ");
                }
                for (int j = n - i; j > 0; j--) {
                    System.out.print("*");
                }
                System.out.println();
                k++;
            }
        }
    }
}

//ln przechodzi do nowej lini, więc w pętli dla wiersza zostawiamy tylko print,
// w pętli do kolumn zostawiamy przechodzenie do nowej lini