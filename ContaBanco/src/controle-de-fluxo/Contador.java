
public class Contador {

    public static void main(String[] args) {
        try {
            // Leitura dos parâmetros
            int numeroInicial = Integer.parseInt(args[0]);
            int numeroFinal = Integer.parseInt(args[1]);

            // Validação dos parâmetros
            if (numeroInicial > numeroFinal) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            // Contagem e impressão
            for (int numero = numeroInicial; numero <= numeroFinal; numero++) {
                System.out.println("Imprimindo o número " + numero);
            }

        } catch (NumberFormatException e) {
            System.err.println("Erro ao converter parâmetros para inteiros. Verifique se os valores informados são números válidos.");
        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        }
    }
}

public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensage) {
        super(mensage);
    }
}
