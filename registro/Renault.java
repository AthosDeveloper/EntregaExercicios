package registro;

public class Renault extends Carro {
    @Override
    public void setVelocidade(int velocidade) {
        super.setVelocidade(velocidade);

    }

    @Override
    public void partidaMotor() {
     if (this.getVelocidade() == 0) {


         System.out.println("Iniciando o motor... Minha velocidade está em: " + this.getVelocidade() + " e a velocidade é igual a zero km/h.");
     } else  {
         System.out.println("o carro já está ligado.");
     }
    }


    @Override
    public void frear() {
        int diminuirVelocidade = this.getVelocidade() - 5;
setVelocidade(diminuirVelocidade);
        if (diminuirVelocidade > 0) {
            System.out.println("Freando... minha velocidade está em: " + this.getVelocidade());
        } else{
            System.out.println("o carro já está parado.");
        }
    }

    @Override
    public void acelerar(){
        int aumentarVelocidade = this.getVelocidade() + 10;
        setVelocidade(aumentarVelocidade);
        System.out.println("acelerando.... A velocidade está em: " + this.getVelocidade());

    }

}
