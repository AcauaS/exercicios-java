/*import java.util.Scanner;

public class DesempenhoFuncionario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

     
        System.out.println("Digite a pontuação do funcionário (0-100):");
        double pontuacao = scanner.nextDouble();
        
      
        String categoria = avaliarDesempenho(pontuacao);
        
     
        System.out.println("A categoria de desempenho do funcionário é " + categoria);
        
      
        scanner.close();
    }

    public static String avaliarDesempenho(double pontuacao) {
        if (pontuacao >= 0 && pontuacao <= 49) {
            return "insatisfatório";
        } else if (pontuacao >= 50 && pontuacao <= 69) {
            return "regular";
        } else if (pontuacao >= 70 && pontuacao <= 89) {
            return "bom";
        } else if (pontuacao >= 90 && pontuacao <= 100) {
            return "ótimo";
        } else {
            return "pontuação inválida";
        }
    }
    zimport java.util.Scanner;

    public class AprovacaoEmprestimo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Solicitar informações do empréstimo
            System.out.print("Digite o valor do empréstimo: ");
            double valorEmprestimo = scanner.nextDouble();
    
            System.out.print("Digite o número de parcelas: ");
            int numeroParcelas = scanner.nextInt();
    
            System.out.print("Digite o salário do solicitante: ");
            double salario = scanner.nextDouble();
    
            // Fechar o Scanner
            scanner.close();
    
            // Calcular o valor de cada parcela
            double valorParcela = valorEmprestimo / numeroParcelas;
    
            // Verificar se o valor da parcela representa no máximo 30% do salário
            if (valorParcela <= 0.30 * salario) {
                System.out.println("Empréstimo aprovado.");
            } else {
                System.out.println("Empréstimo não aprovado.");
            }
        }
    }
    */

    //atividade 2
    import java.util.Scanner;

public class AprovacaoEmprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar informações do empréstimo
        System.out.print("Digite o valor do empréstimo: ");
        double valorEmprestimo = scanner.nextDouble();

        System.out.print("Digite o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();

        System.out.print("Digite o salário do solicitante: ");
        double salario = scanner.nextDouble();

        // Fechar o Scanner
        scanner.close();

        // Calcular o valor de cada parcela
        double valorParcela = valorEmprestimo / numeroParcelas;

        // Verificar se o valor da parcela representa no máximo 30% do salário
        if (valorParcela <= 0.30 * salario) {
            System.out.println("Empréstimo aprovado.");
        } else {
            System.out.println("Empréstimo não aprovado.");
        }
    }
}
