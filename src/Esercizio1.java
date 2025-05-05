import java.util.Arrays;

public class Esercizio1 {
    public static void main(String[] args) {

      int x =    moltiplica(6,6);
        System.out.println(x);

        String x2 = concatena("Ciao",6);
        System.out.println(x2);

        String[] parole = {"Ciao", " sono", " uno", " studente", " Epicode",};
      String[] x3=    inserisciInArray(parole," Michele");
        System.out.println(Arrays.toString(x3));


    }






public static int moltiplica (int a, int b){
 return a * b;
}

public static String concatena (String a, int b){
        return a+b;
}
public static String[] inserisciInArray ( String[]parole,String a){
        return   new String[]{parole[0] + parole[1] + a + parole[2] + parole[3] + parole[4]};
}

}
