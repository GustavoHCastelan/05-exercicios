package exercicio03;

import java.util.Scanner;

public class Main {
    static BilheteUnico[] bilhete = new BilheteUnico[10];
    static Scanner sc = new Scanner(System.in);
    static int index = 0;

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("*********************************************");
            System.out.println("1. Cadastrar bilhete");
            System.out.println("2. Carregar bilhete");
            System.out.println("3. Passar na catraca");
            System.out.println("4. Finalizar");
            System.out.println();
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao){
                    case 1 -> cadastrar();
                    case 2 -> carregar();
                    case 3 -> passarNaCatraca();
                    case 4 -> System.out.println("Obrigado por usar nosso sistema! Até breve!");
                    default -> System.out.println("Opção inválida!");
            }

        }while(opcao != 4);

    }


    private static void cadastrar() {
        String nome;
        long cpf;
        String tipoTarifa;

        if (index < bilhete.length) {
            System.out.print("Nome de Usuário --> ");
            nome = sc.next();
            System.out.print("CPF --> ");
            cpf = sc.nextLong();
            System.out.print("Tipo de Tarifa (estudante | professor | comum) --> ");
            tipoTarifa = sc.next();
            System.out.println();
            //Usuario usuario = new Usuario(nome, cpf, tipoTarifa);
            bilhete[index] = new BilheteUnico(new Usuario(nome, cpf, tipoTarifa));
            index++;
        }else {
            System.out.println("Erro ao gerar o bilhete! Procure um posto de atendimento.");
            System.out.println();
        }
    }

    public static BilheteUnico pesquisar() {
        long cpf;
        System.out.println("Qual o CPF para pesquisa?");
        System.out.print("-> ");
        cpf = sc.nextLong();

        for (int i = 0; i < index; i++) {
            if (bilhete[i].usuario.cpf == cpf){
                return bilhete[i];
            }
        }
        System.out.println("CPF não encontrado!");
        System.out.println();
        return null;
    }

    public static void carregar() {
        double valor;
        BilheteUnico bilheteEncontrado = pesquisar();

        if (bilheteEncontrado != null){
            System.out.println("Qual o valor da recarga?");
            System.out.print("-> ");
            valor=sc.nextDouble();

            bilheteEncontrado.carregar(valor);
        }
    }

    private static void passarNaCatraca() {
        BilheteUnico bilheteUnico = pesquisar();
        if (bilheteUnico != null) {
            if (!bilheteUnico.passarNaCatraca()){
                System.out.println("Saldo insuficinete");
            }
        }
        System.out.println("Saldo atual R$ "+ bilheteUnico.saldo);
        System.out.println();
    }
}
