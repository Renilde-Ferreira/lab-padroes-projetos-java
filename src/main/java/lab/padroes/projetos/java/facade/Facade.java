/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.padroes.projetos.java.facade;

import lab.padroes.projetos.java.subsistema1.Crm.CrmService;
import lab.padroes.projetos.java.subsistema2.Cep.CepApi;

/**
 *
 * @author Renilde Ferreira
 */
public class Facade {
    public void migrarClente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }

  
}
