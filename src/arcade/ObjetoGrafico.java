package arcade;

public class ObjetoGrafico {
    private  int posX;
    private  int posY;
    private  char direccion;


    public ObjetoGrafico(int posX, int posY, char direccion){
        this.direccion = direccion;
        this.posX = posX;
        this.posY = posY;

    }

    public void irA (int x, int y, char direccion){
       this.posX = x;
        this.posY = y;
        this.direccion = direccion;
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

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "ObjetoGrafico{" +
                "posX=" + posX +
                ", posY=" + posY +
                ", direccion=" + direccion +
                '}';
    }
}
