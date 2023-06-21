package registro;

public abstract class Carro {
    private String marca;
    private int ano;
    private double valor;
    private String cor;
    private int portas;
private int velocidade;

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public abstract void partidaMotor();
    public abstract void frear();
    public abstract void acelerar();
}


