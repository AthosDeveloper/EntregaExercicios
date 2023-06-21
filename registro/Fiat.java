package registro;

public class Fiat extends Carro {
    public void setVelocidade(int velocidade) {
        super.setVelocidade(velocidade);
    }

    @Override
    public void partidaMotor() {
        setVelocidade(3);
        if (this.getVelocidade() == 3) {
            System.out.println("Iniciando o motor... Minha velocidade está em: " + this.getVelocidade() + " e a velocidade é igual a 3 km/h.");
        }
    }

    @Override
    public void frear() {
        int diminui = this.getVelocidade() - 6;
        setVelocidade(diminui);
        System.out.println("freando... a velocidade atual é de: " + this.getVelocidade());

    }

    @Override
    public void acelerar() {
        int acelera = this.getVelocidade() + 12;
        setVelocidade(acelera);
        System.out.println("acelerando... A velocidade está em: " + this.getVelocidade());
    }
}
