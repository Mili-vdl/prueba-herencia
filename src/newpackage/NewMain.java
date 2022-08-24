/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import entidad.Animal;
import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;

/**
 *
 * @author milip
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion del objeto Perro
        Animal perro1 = new Perro("Stitch", "Carnivoro", 15, "Doberman");
        perro1.alimentacion();

        //declaracion de otro objeto Perro
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.alimentacion();

        //declaracion del objeto Gato
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato1.alimentacion();
        
        //declaracion del objeto Caballo
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.alimentacion();
    }

}
