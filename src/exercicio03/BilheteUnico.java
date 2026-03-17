package exercicio03;

import java.util.Random;

public class BilheteUnico {
    int numero;
    double saldo;
    final static double tarifaBase = 5.4;
    Usuario usuario;

    public BilheteUnico (Usuario usuario) {
        Random random = new Random();
        this.numero = random.nextInt(1000, 9999);
        this.usuario = usuario;
    }

}
