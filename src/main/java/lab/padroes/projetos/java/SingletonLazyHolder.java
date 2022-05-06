/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.padroes.projetos.java;

/**
 *   "Singleton Lazy Holder"
 * @author Renilde Ferreira
 */
public class SingletonLazyHolder {
    
    private static class InstanceHolder{
    public  static SingletonLazyHolder  instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }
    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
    
}
