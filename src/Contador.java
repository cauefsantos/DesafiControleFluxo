import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o primeiro parametro:");
        int parametroUm = sc.nextInt();

        System.out.println("Digite o segundo parametro:");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm,parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.err.println("O parametro um deve ser MAIOR que o parametro dois.");
        }

        sc.close();

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        int contagem = parametroUm - parametroDois;

        if (contagem < 0) {
            throw new ParametrosInvalidosException();
        }

        for (int i = 0; i < contagem; i++) {
            System.out.printf("Imprimindo o numero %d.\n", (i+1));
        }

    }

}
