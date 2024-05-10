import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (final ParametroException e) {
            System.err.println(e.getMessage());
        }
    }

    static void contar(int numeroInicial, int numeroFinal) throws ParametroException {
        if (numeroInicial > numeroFinal) {
            throw new ParametroException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = numeroFinal - numeroInicial;
        for (int numero = contagem; numero <= numeroFinal ; numero++) {
            System.out.println("Imprimindo o número " + numero);
        }

        // for (int numero = numeroInicial; numero <= numeroFinal; numero++) {
        //     System.out.println("Imprimindo o número " + numero);
        // }
    }
}