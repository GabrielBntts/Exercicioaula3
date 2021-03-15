
package exercicioaulaa3;

/**
 *
 * @author Gabriel
 */
public class Cliente {
    
    private String nome;
    private int idade;
    private double renda;

    
    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public int getidade () {
        return idade;
    }

    public void setidade (int idade) {
        this.idade = idade;
    }

    public double getRenda () {
        return renda;
    }

    public void setRenda (double renda) {
        this.renda = renda;
    }

    public String classificarIdade () {
        
        String resposta;
        if(this.idade >= 18) {
            resposta = nome+" é maior de idade";
        }else {
            resposta = nome+ " é menor de idade";
        }
        return resposta;
    }


    public String classificarRenda() {
        String salario;
        if(this.renda >15000) {
            salario = nome+" é rico";
        }else {
            salario = nome+" não é rico";
        }
        return salario;

    }
}
