import java.util.Scanner;

public class DesempenhoFuncionario {

    public static void main(String[] args) {
        // Cria um scanner para leitura do input
        Scanner scanner = new Scanner(System.in);

     
        System.out.println("Digite a pontuação do funcionário (0-100):");
        double pontuacao = scanner.nextDouble();
        
      
        String categoria = avaliarDesempenho(pontuacao);
        
        // Exibe a categoria de desempenho
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
}