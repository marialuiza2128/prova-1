import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[8];

        // Receber as 8 notas do aluno
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º bimestre: ");
            notas[i] = scanner.nextDouble();
        }

        // Calcular médias bimestrais (são as próprias notas, mas para seguir o padrão, podemos mostrar)
        // Calcular médias semestrais
        double media1Semestre = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
        double media2Semestre = (notas[4] + notas[5] + notas[6] + notas[7]) / 4;

        // Média final (média das médias semestrais)
        double mediaFinal = (media1Semestre + media2Semestre) / 2;

        // Apresentar os resultados
        System.out.println("\nResultado:");
        System.out.println("1º Bimestre: " + notas[0]);
        System.out.println("2º Bimestre: " + notas[1]);
        System.out.println("3º Bimestre: " + notas[2]);
        System.out.println("4º Bimestre: " + notas[3]);
        System.out.println("1º Semestre: " + media1Semestre);
        System.out.println("-----------------------");
        System.out.println("5º Bimestre: " + notas[4]);
        System.out.println("6º Bimestre: " + notas[5]);
        System.out.println("7º Bimestre: " + notas[6]);
        System.out.println("8º Bimestre: " + notas[7]);
        System.out.println("2º Semestre: " + media2Semestre);
        System.out.println("-----------------------");
        System.out.println("Média Final: " + mediaFinal);

        scanner.close();
    }
}
