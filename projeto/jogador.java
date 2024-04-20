package projeto;

public class jogador {
    private static Object jogador;
    public int posX;
    public int posY;
    public String desenho;

    public jogador(int posX, int posY, String desenho) {
        this.posX = posX;
        this.posY = posY;
        this.desenho = desenho;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String getDesenho() {
        return desenho;
    }

    public void setDesenho(String desenho) {
        this.desenho = desenho;
    }

}
