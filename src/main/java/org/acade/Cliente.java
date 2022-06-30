package org.acade;

public class Cliente {

    private Integer idade;

    public Cliente(Integer idade) {
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "TesteAtalhos{" +
                "idade=" + idade +
                '}';
    }
}
