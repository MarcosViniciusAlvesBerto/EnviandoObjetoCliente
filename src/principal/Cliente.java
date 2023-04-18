package principal;

import java.io.Serializable;
import javax.swing.JOptionPane;

public class Cliente implements Serializable {
    
    private int codigo;
    private String nome;
    private String endereco;
    private double salario;
    private int idade;

    public Cliente() {
    }

    public Cliente(int codigo, String nome, String endereco, double salario, int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
        this.idade = idade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void leitura(){
        setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o Codigo")));
        setNome(JOptionPane.showInputDialog("Qual a sua Idade"));
        setEndereco(JOptionPane.showInputDialog("Qual o seu Endereço"));
        setSalario(Integer.parseInt(JOptionPane.showInputDialog("Qual O seu Salario")));
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual a sua Idade")));   
    }
    
    public void imprimir(){
    JOptionPane.showMessageDialog(null, "Codigo: " + getCodigo()
    + "Nome: " + getNome()
    + "Endereco: " +getEndereco()
    + "Salario: " + getSalario()
    + "Idade: " + getIdade());
    
    }
    
}

