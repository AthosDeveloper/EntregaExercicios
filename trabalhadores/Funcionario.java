package trabalhadores;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private LocalDate dataEmissao;
    private double salario;
public static int identificador = 0;
public Funcionario() {
    identificador++;
    System.out.println("identificador é igual a: " + identificador);
}

    public static int getIdentificador() {
        return identificador;
    }

    public static void setIdentificador(int identificador) {
        Funcionario.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
    if (dataEmissao.isAfter(LocalDate.now())){
        throw  new IllegalStateException("Tempo inválido, Só aceitamos a data de hoje, uma data posterior não é permitido.");
    }
        this.dataEmissao = dataEmissao;
    }

    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
    if (salario < 700.0) {
        throw new IllegalStateException("não é permitido um salário inferior a R$ 700 Reais.");
    }
    this.salario = salario;
    }
    }


