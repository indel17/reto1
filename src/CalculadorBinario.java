import java.util.Scanner;

public class CalculadorBinario {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la IP");
        String ip = sc.next();
        String binaryres;
        System.out.println("Introduce la máscara (CIDR de momento)");
        int masc = sc.nextInt();



            String[] octavos = ip.split("\\.");

            for (String st : octavos) { //bipity bopity tu ip es ahora binarioty
                int octavo = Integer.parseInt(st);
                binaryres = Integer.toBinaryString(octavo);
                for (; binaryres.length() != 8; ) {
                    binaryres = "0" + binaryres;
                }
                System.out.print(binaryres + ".");
            }
            System.out.print("\b");


    }

}
