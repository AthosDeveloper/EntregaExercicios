package registro;

public class TestarCarro {
    public static void main(String[] args) {

        Renault r = new Renault();

   r.partidaMotor();
r.acelerar();
r.frear();
r.acelerar();
   Fiat f = new Fiat();
   f.partidaMotor();
   f.acelerar();
  f.frear();
Yundai y = new Yundai();
y.partidaMotor();
y.acelerar();
y.frear();
    }
}
