/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.padroes.projetos.java.subsistema2.Cep;

/**
 *
 * @author Renilde Ferreira
 */
public class CepApi {
    private static CepApi instancia = new CepApi();
    
    private CepApi(){
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }
    public String recuperarCidade(String cep){
        return "Imperatriz";
    }
     public String recuperarEstado(String cep){
        return "MA";
    }
}
