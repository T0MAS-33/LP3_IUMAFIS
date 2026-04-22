/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.iumafis.lang3;

import java.util.ArrayList;
/**
 *
 * @author USUARIO
 */
public class Docente {
    private String nombre;
    private int cedula;
    ArrayList<Estudiante> grupo;
    
    
    
    
    public Docente(String nombre, int cedula){
        this.nombre = nombre;
        this.cedula = cedula;
        this.grupo = new ArrayList<>();
        
    }
    
    public void asignarEstudiante(Estudiante e){
        grupo.add(e);
    }
    
    public void listarGrupo(){
        if (grupo.isEmpty()) {
            System.out.println("No hay estudiantes asignados");
        } else {
            for (Estudiante e : grupo) {
                System.out.println(e); 
            }
        }
    }
    
    public Estudiante mejorEstudiante(){
        if(grupo.isEmpty()){
            return null;
        }
        
        Estudiante mejor = null;
        for(Estudiante e : grupo){
            if(mejor == null || e.getPromedio() > mejor.getPromedio()){
                mejor = e;
            }
        }
        return mejor;
    }
}