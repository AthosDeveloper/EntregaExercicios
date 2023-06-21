package trabalhadores;

import java.time.LocalDate;

public class TestarFuncionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
   Funcionario f1 = new Funcionario();
  f1.setSalario(701.0);
        System.out.println(f1.getSalario());
        f1.setDataEmissao(LocalDate.of(2022, 3, 10));

        System.out.println(f1.getDataEmissao());
  f1.setDataEmissao(LocalDate.of(2023, 10, 11));
    }
}
