package ACT_13;

import java.util.ArrayList;

/**
 *
 * @author cristiancantero
 */
public class Vehiculo {

    private String marca;
    private String modelo;
    private int cilindrada;
    private ArrayList<String> complementos;
    private double precio;
    private int tipo;
    private String matricula;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int cilindrada, int tipo, double precio, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.tipo=tipo;
        this.precio = precio;
        this.matricula = matricula;
    }
    
    

    public Vehiculo(String marca, String modelo, String matricula) { 
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

   
    
    

   
    

    public Vehiculo(String marca, String modelo, int cilindrada, ArrayList<String> complementos, double precio, int tipo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.complementos = complementos;
        this.precio = precio;
        this.tipo = tipo;
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public ArrayList<String> getComplementos() {
        return complementos;
    }

    public void setComplementos(ArrayList<String> complementos) {
        this.complementos = complementos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public int hashCode() {
        if (this.matricula == null) {
            return 0;
        }
        return this.matricula.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        Vehiculo other = (Vehiculo) obj;
        if (this.matricula == null) {
            if (other.matricula != null) {
                return false;
            }
        } else if (!matricula.equals(other.matricula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String tipoTexto = (tipo ==1) ? "coche" : "moto";
        
        return "Vehiculo: " +
                "Marca: " + marca +
                " Modelo: " + modelo +
                " Cilindrada: " + cilindrada + "cc" +
                " Matricula: " + matricula+
                " Tipo "+ tipoTexto;
                
    }
    
    

}
