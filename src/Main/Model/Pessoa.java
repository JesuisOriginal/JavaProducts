package Main.Model;

import java.util.Calendar;

public class Pessoa {

    public Calendar dataNiver;
    private String nome;
    private String email;
    private String endereco;
    private String telefone;


    @Override
    public String toString(){
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email +'\'' +
                ", telefone" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", dataAniversario=" + dataNiver +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null|| getClass() != o.getClass()) return false;

        Pessoa pessoa = (Pessoa) o;

        if (!nome.equals(pessoa.nome)) return false;
        if (!email.equals(pessoa.email)) return false;
        if (telefone != null ? !telefone.equals(pessoa.telefone) : pessoa.telefone != null) return false;
        if (endereco != null ? !endereco.equals(pessoa.endereco) : pessoa.endereco != null) return false;
        return getDataNiver().equals(pessoa.dataNiver);
    }

    @Override
    public int hashCode(){
        int result = getNome().hashCode();
        result = 31 * result + getEmail().hashCode();
        result = 31 * result + getTelefone().hashCode();
        result = 31 * result + getEndereco().hashCode();
        result = 31 * result + getDataNiver().hashCode();
        return result;
    }

    private Calendar getDataNiver() {
        return dataNiver;
    }

    void setDataNiver(Calendar dataNiver) {
        this.dataNiver = dataNiver;
    }




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    private String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


}
