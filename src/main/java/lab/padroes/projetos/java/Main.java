/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.padroes.projetos.java;

import lab.padroes.projetos.java.facade.Facade;
import lab.padroes.projetos.java.strategy.Comportamento;
import lab.padroes.projetos.java.strategy.ComportamentoAgressivo;
import lab.padroes.projetos.java.strategy.ComportamentoNormal;
import lab.padroes.projetos.java.strategy.Robo;


/**
 *
 * @author Renilde Ferreira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Testes relacionados  ao desing Pattern Singleton
      SingletonLazy lazy = SingletonLazy.getInstancia();
      System.out.println(lazy);
      lazy = SingletonLazy.getInstancia();
      System.out.println(lazy);
      
      SingletonEager eager = SingletonEager.getInstancia();
      System.out.println(eager);
      eager = SingletonEager.getInstancia();
      System.out.println(eager);
      
      SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
      System.out.println(lazyHolder);
      lazyHolder = SingletonLazyHolder.getInstancia();
      System.out.println(lazyHolder);
      
     //Strategy
     
     Comportamento defensivo = new ComportamentoDefensivo();
     Comportamento normal= new ComportamentoNormal();
     Comportamento agressivo = new ComportamentoAgressivo();
     
     Robo robo = new Robo();
     robo.setComportamento(normal);
     robo.mover();
     robo.mover();
       robo.setComportamento(defensivo);
     robo.mover();
       robo.setComportamento(agressivo);
     robo.mover();
   
     
     //facade
     
     Facade facade = new Facade();
     facade.migrarClente("Tuany", "6850240");
     
     
      
     
    }
    
}
