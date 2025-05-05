import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {


    double rettangolo = perimetroRettangolo();
        System.out.println(rettangolo);

        int controllo = pariDispari();
        System.out.println(controllo);
        double rettangolo2 = perimetroTriangolo();
        System.out.println(rettangolo2);


    }





    public static double perimetroRettangolo (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("base:");
        double base = scanner.nextDouble();
        System.out.println("altezza:");
        double altezza = scanner.nextDouble();

        return 2 * (base+altezza);


    }

    public static int pariDispari (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi il numero:");
        int numero = scanner.nextInt();
        if (numero % 2 == 0){
            return 0;
        } else {
            return 1;
        }



        }

        public static double perimetroTriangolo (){
            Scanner scanner = new Scanner(System.in);
            System.out.println("lato a:");
            double a = scanner.nextDouble();
            System.out.println("lato b:");
            double b = scanner.nextDouble();
            System.out.println("lato c:");
            double c = scanner.nextDouble();



            double s = (a+b+c) / 2 ;
         return Math.sqrt(s * (s-a)*(s-b)*(s-c));



    }


}
