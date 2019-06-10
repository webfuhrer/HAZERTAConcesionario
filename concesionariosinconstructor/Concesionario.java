/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

/**
 *
 * @author Admin
 */
public class Concesionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String marca=EntradaSalida.obtenerMarca();
        String modelo=EntradaSalida.obtenerModelo();
        int potencia=EntradaSalida.obtenerPotencia();
        int numero_plazas=EntradaSalida.obtenerPlazas();
        Coche c=new Coche();
        c.setNumero_plazas(numero_plazas);
        c.setMarca(marca);
        c.setModelo(modelo);
        c.setPotencia(potencia);
        c.setNumero_ruedas(4);
        System.out.println("COCHE: "+c);
    }
    
}
