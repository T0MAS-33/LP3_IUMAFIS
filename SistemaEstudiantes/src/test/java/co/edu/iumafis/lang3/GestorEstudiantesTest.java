/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package co.edu.iumafis.lang3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USUARIO
 */
class GestorEstudiantesTest {

    private GestorEstudiantes gestor;
    private Estudiante est1;

    @BeforeAll

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    void setUp() {

        gestor = new GestorEstudiantes();
        est1 = new Estudiante("Laura Gomez", 20241001, 5, 4.2, true);

    }

    @Test
    @DisplayName("Agregar un estudiante incrementa el total en 1 ")
    void agregar_unEstudiante_totalAumentaaEnUno() {
        gestor.agregar(est1);
        assertEquals(1, gestor.getTotalEstudiantes());

    }

    @Test
    @DisplayName("Lista vacia retornar total 0")
    void listaVacia_total_esZero() {

        //arrange
        int total = gestor.getTotalEstudiantes();
        
        //act
        
        //assert     
        assertEquals(0, total);

        // assertTrue(estudiante.isActivo(), "El estudiante recién creado con activo=true debería reportar isActivo()=true");
        // assertNotNull(resultado, () -> "buscarPorCodigo(" + codigo + ") no debe retornar null para un código existente");
    }
    
    @Test
    void debeValidarTotalLista(){
        assertEquals(4, gestor.getTotalEstudiantes(), "El gestor debería tener 4 estudiantes después de agregar 4");
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
