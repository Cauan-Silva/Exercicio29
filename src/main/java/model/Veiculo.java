package model;

public class Veiculo {
    private double quilometrosPercorridos;
    private double litrosConsumidos;

    public Veiculo(double quilometrosPercorridos, double litrosConsumidos) {
        this.quilometrosPercorridos = quilometrosPercorridos;
        this.litrosConsumidos = litrosConsumidos;
    }

    public double getQuilometrosPercorridos() {
        return quilometrosPercorridos;
    }

    public void setQuilometrosPercorridos(double quilometrosPercorridos) {
        this.quilometrosPercorridos = quilometrosPercorridos;
    }

    public double getLitrosConsumidos() {
        return litrosConsumidos;
    }

    public void setLitrosConsumidos(double litrosConsumidos) {
        this.litrosConsumidos = litrosConsumidos;
    }

    public double calcularConsumo() {
        if (litrosConsumidos == 0) {
            return 0;
        }
        return quilometrosPercorridos / litrosConsumidos;
    }
}