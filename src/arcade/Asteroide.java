package arcade;

public class Asteroide extends ObjetoGrafico{
    private int lesion;


    public Asteroide(int posX, int posY, char direccion, int lesion) {
        super(posX, posY, direccion);
        this.lesion =lesion;

    }

    @Override
    public String toString() {
        return "Asteroide{" +
                "lesion=" + lesion +
                '}';
    }
}
