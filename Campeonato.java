// Trabalho avaliativo — Um algoritmo, diferentes linguagens: listas, arrays e repetições
    // Turma: ADS1AN-ESA1-90834648
    // Curso: Análise e desenvolvimento de sistemas
    // Professor: Alexandre de Oliveira 
    // Aluno: Guilherme Michelsen Silva de Oliveira 
    // Data: 01/11/2026


public class Campeonato {

    static void gerarTabelas(String[] times, int quantidade) {
        // RF-01: exibir os times com índices
        System.out.println("Times:");
        for (int i = 0; i < quantidade; i++) {
            System.out.println(i + " - " + times[i]);
        }

        // RF-02, RF-03, RF-04: ida e volta
        System.out.println("\nIda e volta:");
        int totalIdaVolta = 0;
        for (int i = 0; i < quantidade; i++) {
            for (int j = 0; j < quantidade; j++) {
                if (i != j) {
                    System.out.println(times[i] + " x " + times[j]);
                    totalIdaVolta++;
                }
            }
        }
        System.out.println("Total ida e volta: " + totalIdaVolta);

        // RF-05, RF-06: turno único (j começa em i + 1)
        System.out.println("\nTurno único:");
        int totalTurnoUnico = 0;
        for (int i = 0; i < quantidade; i++) {
            for (int j = i + 1; j < quantidade; j++) {
                System.out.println(times[i] + " x " + times[j]);
                totalTurnoUnico++;
            }
        }
        System.out.println("Total turno único: " + totalTurnoUnico);
    }

    public static void main(String[] args) {
        String[] times = {"Atlético-MG", "Cruzeiro", "América-MG", "Villa Nova"};
        int quantidade = 4;
        gerarTabelas(times, quantidade);

        // Seção 4: novo array com 5 posições e cópia por repetição
        String[] novoArray = new String[5];
        for (int i = 0; i < quantidade; i++) {
            novoArray[i] = times[i];
        }
        novoArray[4] = "Tombense";
        times = novoArray;
        quantidade = 5;

        System.out.println("\n===== Com Tombense =====\n");
        gerarTabelas(times, quantidade);
    }
}
