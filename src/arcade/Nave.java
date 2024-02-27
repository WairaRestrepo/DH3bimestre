package arcade;

public class Nave extends ObjetoGrafico {
    private double velocidad;
    private int vida;

    public Nave(int posX, int posY, char direccion, double velocidad, int vida) {
        super(posX, posY, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }

public void girar (char direccion ){
        if (direccion != super.getDireccion()){
            super.setDireccion(direccion);
        }
}

    @Override
    public void irA(int x, int y, char direccion) {
        if(direccion != super.getDireccion()){
            super.irA(x, y, direccion);
        }
        super.irA(x, y, direccion);
    }

    public void  restarVida(int valor){
        if(vida>= valor)vida -=valor;
        else  vida=0;
    }

    @Override
    public String toString() {
        return "Nave{" +
                "velocidad=" + velocidad +
                ", vida=" + vida +
                '}';
    }
}





