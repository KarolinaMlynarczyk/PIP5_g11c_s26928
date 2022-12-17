import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        int n = scanner.nextInt();
        wynik(n);
    }
    public static void wynik(int n){
        int wynik=0;
        if (n>=0) {
            while (wynik<=n){
                System.out.print(wynik+" ");
                wynik++;
            }
        }
        else {
            while (wynik>=n){
                System.out.print(wynik+" ");
                wynik--;
            }
        }

    }
}
