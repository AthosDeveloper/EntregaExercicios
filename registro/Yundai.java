package registro;

public class Yundai extends Carro {
    @Override
    public void setVelocidade(int velocidade) {
        super.setVelocidade(velocidade);
    }

    @Override
    public void partidaMotor() {
     setVelocidade(5);
     if (this.getVelocidade() == 5){
         System.out.println("Ligando motor... A velocidade atual é: " + this.getVelocidade());
     }
        }


    @Override
    public void acelerar() {
int acelera = this.getVelocidade() + 15;
setVelocidade(acelera);
        System.out.println("acelerando... A velocidade atual é de: " + this.getVelocidade());
    }

    @Override
    public void frear() {
int diminui = this.getVelocidade() - 2;
setVelocidade(diminui);
        System.out.println("freando... A velocidade atual é de: " + this.getVelocidade());
    }
}
