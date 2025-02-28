package carr;

import java.util.Scanner;

public class Carr {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    Carro fuscao = new Carro();
        System.out.println("qual modelo del caritio");
        fuscao.setModelo(ler.nextLine());
        System.out.println("qual o comsumo em KM/litro");
        fuscao.setConsumo(ler.nextDouble());
        System.out.println("qual o numero de km percorrido");
        fuscao.setKm(ler.nextDouble());
        fuscao.calcGas();
    }
    
}
