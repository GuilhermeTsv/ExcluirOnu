import java.util.Scanner;
import java.util.ArrayList;

public class ExcluirOnu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> comandos = new ArrayList<>();

        System.out.println("N° do Slot: ");
        int slot = scan.nextInt();

        System.out.println("N° da porta: ");
        int porta = scan.nextInt();

        String pon = "1/1/" + slot + "/" + porta;

        while(true){
            System.out.println("Número da onu: ");
            int numeroOnu = scan.nextInt();

            if(numeroOnu == -1){
                break;
            }

            String fullPon = pon + "/" + numeroOnu;
            String comando = "configure equipment ont interface " + fullPon + " admin-state down\n" +
                    "configure equipment ont no interface " + fullPon + "\n";

            comandos.add(comando);
        }

        for (String comando : comandos) {
            System.out.println(comando);
        }

        scan.close();
    }
}