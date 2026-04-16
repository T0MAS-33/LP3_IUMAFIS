package co.edu.iumafis.lang3;

public class Estudiante {

      private double promedio;
   
    // ── Atributos (campos) ─────────────────────────────────────────
    // private: solo accesibles dentro de esta clase (encapsulamiento)
    private String nombre;
    private int codigo;
    private int semestre;
  
    private boolean activo;
 
    // ── Constructor ────────────────────────────────────────────────
    // Método especial: mismo nombre que la clase, sin tipo de retorno
    // Se llama con "new Estudiante(...)" y establece el estado inicial
    public Estudiante(String nombre, int codigo, int semestre,
            double promedio, boolean activo) {
        this.nombre = nombre;    // "this" distingue atributo de parámetro
        this.codigo = codigo;
        this.semestre = semestre;
        this.promedio = promedio;
        this.activo = activo;
    }

    // ── Getters — métodos que devuelven el valor de un atributo ────
    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getSemestre() {
        return semestre;
    }

  

    public boolean isActivo() {
        return activo;
    }

    // ── Setter — modificar el promedio después de creación ─────────
    public void setPromedio(double promedio) {
        if (promedio >= 0.0 && promedio <= 5.0) // validación en el setter
        {
            this.promedio = promedio;
        } 
    }

      public static String getEstado(double nota) {
        if      (nota >= 4.5) return "Sobresaliente";
        else if (nota >= 4.0) return "Bueno";
        else if (nota >= 3.0) return "Aprobado";
        else                  return "Reprobado";
    }
      public double getPromedio() {
        return promedio;
    } 
      @Override
    public String toString() {
        return String.format("[%d] %-15s | S%d | %.1f | %s",
                codigo, nombre, semestre, promedio,
                activo ? "Activo" : "Inactivo");
    }
    }

    // ── toString — representación textual del objeto ───────────────
    // Se llama automáticamente cuando usas el objeto en un println
   
  

