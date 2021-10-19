
package br.com.projeto.model;

/**
 *
 * @author Ed Wander
 */
public class Fornecedores extends Clientes{
    
    //Atributos
    private String cnpj;
    
    //Getters e Seters

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public String toString(){
        return this.getNome();
    }
    
}
