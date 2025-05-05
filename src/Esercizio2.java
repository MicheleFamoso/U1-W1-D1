import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci la prima parola: ");
        String a = scanner.next();
        System.out.println("Inserisci la seconda parola: ");
        String b = scanner.next();
        System.out.println("Inserisci la terza parola: ");
        String c = scanner.next();
        scrittura(a,b,c);
    }

    public static void scrittura(String a, String b , String c){
        System.out.println(a+b+c);
        System.out.println(c+b+a);
    }
}
