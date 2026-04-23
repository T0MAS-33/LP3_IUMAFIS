/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.iumafis.lang3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; 

/**
 *
 * @author USUARIO
 */
public class EjemploTest {
    
    @Test
    void nombreDelMetodo_escanario_resultadoEsperado(){
        GestorEstudiantes gestor = new GestorEstudiantes();
        Estudiante e = new Estudiante ("ana",1001,5,4.2,true);
         gestor.agregar(e);
         assertEquals(1, gestor.getTotalEstudiantes());
    }
   
    
}
