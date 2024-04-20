package projeto;
import java.util.List;

public class Main {

    public static void exibirTabuleiro(int linha, int coluna, jogador jogador) {
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (j == jogador.getPosX() && i == jogador.getPosY()) {
                    System.out.print("[J]");
                } else {
                    System.out.print("[.]");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        jogador jogador = new jogador(3, 2, "*");

        exibirTabuleiro(5, 5, jogador);
        
    }
}

