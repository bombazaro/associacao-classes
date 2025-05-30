package ads.poo;

public class Motor {
    private String tipo;
    private double consumo;
    private boolean estado;

    public Motor(String tipo, double consumo) {
        this.tipo = tipo;
        this.consumo = consumo;
        this.estado = false;
    }

    public boolean isEstado() {
        return estado;
    }

    public boolean ligDes() {
        estado = !estado;
        return estado;
    }
}
