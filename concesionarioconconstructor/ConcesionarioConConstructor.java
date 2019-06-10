/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionarioconconstructor;

/**
 *
 * @author Admin
 */
public class ConcesionarioConConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String marca=EntradaSalida.obtenerMarca();
        String modelo=EntradaSalida.obtenerModelo();
        int potencia=EntradaSalida.obtenerPotencia();
        int n_plazas=EntradaSalida.obtenerPlazas();
        Coche c=new Coche(marca, modelo, potencia, n_plazas);
        System.out.println(c);
    }
    
}
