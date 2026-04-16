/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package co.edu.iumafis.lang3;

import java.util.ArrayList;

public class Main {

    //public static void main(String[] args) {
        /* String nombre = "Tomas Diaz";
        int codigo = 1035225662;
        //int semestre = 5;
        double promedio = 4.2;
        boolean activo = true;

        IO.println("Nombre: " + nombre);
        IO.println("codigo: " + codigo);
        //IO.println("semestre: " + semestre);
        IO.println("promedio: " + promedio);
        IO.println("Activo: " + activo);

        System.out.printf("Promedio formateado: %.2f%n", promedio);

        double nota = 4.8;
        String estado;

        if (nota >= 4.5) {
            estado = "sobresaliente";
        } else if (nota >= 4.0) {
            estado = "bueno";
        } else if (nota >= 3.0) {
            estado = "Aprobado";
        } else {
            estado = "reprobado";
        }
        IO.println("nota: " + nota + "/" + estado);

        int semestre = 5;
        String ciclo = switch (semestre) {
            case 1, 2 ->
                "Ciclo básico";
            case 3, 4 ->
                "Ciclo intermedio";
            case 5, 6 ->
                "Ciclo profesional";
            case 7, 8 ->
                "Ciclo de profundización";
            case 9, 10 ->
                "Ciclo de grado";
            default ->
                "Semestre no válido";
        };
        IO.println("Semestre " + semestre + ": " + ciclo);


        switch (semestre) {
            case 1:
            case 2:
                System.out.println("Ciclo básico");
                break;            
            case 5:
                System.out.println("Ciclo profesional");
                break;
            default:            
                IO.println("Otro semestre");
        }
        
       
        String nombre = "tome";
        double promedio = 4.0;
        boolean activo = true;
        int semestre = 5;
        int materias = 4;
        int maxMat = 6;

        if (activo && promedio >= 3.0 && materias <= maxMat) {
            IO.println(nombre + ":inscripcion AUTORIZADA");
            System.out.printf("Promedio: %.1f%n | Semestre: %d | Materias: %d%n ", promedio, semestre, materias);
        } else if (!activo) {
            IO.println(nombre + ":RECHAZADA --Promedio inactivo");

        } else if (promedio < 3.0) {
            IO.println(nombre + ":RECHAZADA --Promedio inactivo" + promedio);
        } else {
            IO.println(nombre + ": RECHAZADA — excede máximo de materias");
        }
         

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("TOME");
        nombres.add("alejo");
        nombres.add("chanty");
        nombres.add("alex");
        System.out.println("Total estudiantes: " + nombres.size());
        System.out.println("Primero: " + nombres.get(0));
        System.out.println("Último : " + nombres.get(nombres.size() - 1));

        IO.println("--  Lista de estudiantes  --");
        for (String nombre : nombres) {
            IO.println("." + nombre);
        }
        IO.println("--  Con numeracion  --");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.printf("  %d. %s%n", i + 1, nombres.get(i));
        }

        boolean existe = nombres.contains("alex");
        int pos = nombres.indexOf("alex");
        IO.println("¿Existe? " + existe + "en pocision " + pos);

        nombres.set(1, "alex");

        nombres.remove("TOME");
        nombres.remove(0);
        IO.println("Después de eliminar: " + nombres);
        IO.println("Tamaño" + nombres.size());
        if (!nombres.isEmpty()) {
            IO.println("La lista tiene " + nombres.size() + " elementos");
        }
        nombres.clear();     // elimina TODOS los elementos
         
  
        ArrayList<String> estudiantes = new ArrayList<>();
        ArrayList<Double> promedios = new ArrayList<>();
// Double (con D mayúscula) es el "wrapper" de double para usar en colecciones

        estudiantes.add("Laura");
        promedios.add(4.2);
        estudiantes.add("Andrés");
        promedios.add(2.8);
        estudiantes.add("Camila");
        promedios.add(3.5);
        estudiantes.add("Diego");
        promedios.add(1.9);
        estudiantes.add("Sofía");
        promedios.add(4.7);

        System.out.println("=== REPORTE DE NOTAS ===");
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < estudiantes.size(); i++) {
            String nombre = estudiantes.get(i);
            double promedio = promedios.get(i);

            String estado = (promedio >= 3.0) ? "✓ APROBADO" : "✗ REPROBADO";
            // ↑ operador ternario: condición ? valor_si_true : valor_si_false

            System.out.printf("  %-10s  %.1f  %s%n", nombre, promedio, estado);

            if (promedio >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

     
        System.out.printf("%nAprobados: %d | Reprobados: %d%n", aprobados, reprobados);
        
         
        

        // ── Método 1: sin retorno (void) ──────────────────────────────
        public static void imprimirSeparador(String titulo) {
            System.out.println("\n═══ " + titulo + " ═══");
        }

        // ── Método 2: retorna String ──────────────────────────────────
        public static String clasificarNota(double nota) {
            if (nota >= 4.5) {
                return "Sobresaliente";
            } else if (nota >= 4.0) {
                return "Bueno";
            } else if (nota >= 3.0) {
                return "Aprobado";
            } else {
                return "Reprobado";
            }
        }

        // ── Método 3: retorna double — calcula promedio de lista ──────
        public static double calcularPromedio(ArrayList<Double> notas) {
            if (notas.isEmpty()) {
                return 0.0;
            }
            double suma = 0.0;
            for (double n : notas) {
                suma += n;
            }
            return suma / notas.size();
        }

        // ── Método 4: retorna boolean ─────────────────────────────────
        public static boolean puedeInscribir(double promedio, boolean activo) {
            return activo && promedio >= 3.0;
            // return devuelve el valor y termina el método
        }

        // ── main: llama a los métodos ─────────────────────────────────
        public static void main(String[] args) {
            imprimirSeparador("REPORTE");

            double nota = 3.9;
            System.out.println("Nota: " + nota + " → " + clasificarNota(nota));

            ArrayList<Double> mis_notas = new ArrayList<>();
            mis_notas.add(3.5);
            mis_notas.add(4.0);
            mis_notas.add(4.2);
            System.out.printf("Promedio: %.2f%n", calcularPromedio(mis_notas));

            System.out.println("¿Puede inscribir? " + puedeInscribir(3.9, true));
        
    //package co.edu.iumafis.lang3;

//import java.util.ArrayList;

//public class Main {

    public static void main(String[] args) {

        GestorEstudiantes gestor = new GestorEstudiantes();


        gestor.agregar(new Estudiante("Laura Gómez",   20241001, 5, 4.2, true));
        gestor.agregar(new Estudiante("Andrés Ríos",   20241002, 3, 2.8, true));
        gestor.agregar(new Estudiante("Camila Torres", 20241003, 5, 3.9, true));
        gestor.agregar(new Estudiante("Diego Muñoz",   20241004, 4, 1.7, false));
        gestor.agregar(new Estudiante("Sofía Herrera", 20241005, 6, 4.8, true));

       
        System.out.println("\n=== TODOS LOS ESTUDIANTES ===");
        gestor.listar();

       
        System.out.println("\n=== BUSCAR ===");
        Estudiante encontrado = gestor.buscarPorCodigo(20241003);
        if (encontrado != null)
            System.out.println("Encontrado: " + encontrado);
        else
            System.out.println("No encontrado");

        
        System.out.println("\n=== APROBADOS Y ACTIVOS ===");
        ArrayList<Estudiante> aprobados = gestor.obtenerAprobados();
        for (Estudiante e : aprobados) System.out.println("  ✓ " + e);

   
        System.out.printf("%n=== ESTADÍSTICAS ===%n");
        System.out.printf("Promedio general del grupo: %.2f%n", gestor.promedioGeneral());
        System.out.println("Aprobados: " + aprobados.size() + "/" + 5);
    */
    
    }

    

    


