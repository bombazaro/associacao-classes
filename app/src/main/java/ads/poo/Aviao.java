package ads.poo;

import java.util.ArrayList;

public class Aviao {
    private int pasMax;
    private int triMax;
    private double pesoMax;
    private double combustivelmax;
    private ArrayList<Motor> motor = new ArrayList<>();

    public Aviao(int pasMax, int triMax, double pesoMax, double combustivelmax, int numMotores, int consumo, String tipo) {
        this.pasMax = pasMax;
        this.triMax = triMax;
        this.pesoMax = pesoMax;
        this.combustivelmax = combustivelmax;

        if (numMotores < 1 || numMotores > 8) {
            numMotores = 8;
        }

        for (int i = 0; i < numMotores; i++) {
            this.motor.add(new Motor(tipo, consumo));
        }
    }

    public boolean ligDes() {
        motor.forEach(Motor::ligDes);
        return motor.get(0).isEstado();
    }
}
