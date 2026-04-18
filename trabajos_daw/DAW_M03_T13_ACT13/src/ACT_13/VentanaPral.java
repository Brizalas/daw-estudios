package ACT_13;

import java.awt.Font;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author cristiancantero
 */
public class VentanaPral {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Vehiculo> vehiculos = new HashMap();
        JFrame ventana = new JFrame();//crear ventana
        //configurar ventana
        ventana.setSize(500, 400);//tamaño de la ventana 
        ventana.setTitle("Concesionario");//titulo de la ventana 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//se cierra el programa haciendo click en la x
        ventana.setLocationRelativeTo(null);//centrada
//        ventana.setLayout(null);//yo decido donde va a ir todo  ==> gridLayout lo pisa
        ventana.setLayout(new GridLayout(4,1));

        //crear los componentes
        JButton boton = new JButton("Ingresar Vehículo");
        JButton botonMostrar = new JButton("Mostrar vehículos");
        JButton botonEliminar = new JButton("Eliminar vehículo");
        JButton botonBuscar = new JButton("Buscar vehículo");
        
        
        // boton
        boton.addActionListener(e -> {
            // 1. pedir datos
            String marca = JOptionPane.showInputDialog("Introduce la marca: ");
            String modelo = JOptionPane.showInputDialog("Introduce el modelo");
            
            if (marca == null || modelo == null || marca.isEmpty() || modelo.isEmpty()) {//ante4s de usar el método comprueba que no es null
                JOptionPane.showMessageDialog(null, "Error: campos vacios");
                return;
            }
                int cilindrada;
                String cilindradaStr = JOptionPane.showInputDialog("Intorduce la cilindrada");
                do{
                try{
                cilindrada = Integer.parseInt(cilindradaStr);
                }catch(NumberFormatException f){
                    JOptionPane.showMessageDialog(null, "Introduce números");
                    
                } 
               
                
                double precio;
                String precioStr = JOptionPane.showInputDialog("Introduce el precio");
                try{
                    precio = Double.parseDouble(precioStr);
                }catch(NumberFormatException k){
                    JOptionPane.showMessageDialog(ventana, "introduce un valor correcto");
                    return;
                } 
                 }while(true);
                
                    
                
               
            //2. generar matrícula
            String matricula = "B-" + vehiculos.size();
            //3. crear un objeto con esos datos
            Vehiculo v = new Vehiculo(marca,modelo,cilindrada,precio,matricula);
            //4. guardar
            vehiculos.put(matricula, v);

            System.out.println(matricula);

            System.out.println("Hay ingresados " + vehiculos.size() + " Vehiculos");

        });   
        
        // Botón mostrar--------------------
        
        botonMostrar.addActionListener(e->{
            String resultado = "";
            for(Vehiculo v: vehiculos.values()){
                resultado += v + "\n";
            }
            JOptionPane.showMessageDialog(ventana,resultado);
        });  
        
        // Botón Eliminar
        
        botonEliminar.addActionListener(e->{
            String matriculaEliminar = JOptionPane.showInputDialog("Introduce la matricula a eliminar.");
            if (matriculaEliminar == null || matriculaEliminar.isEmpty()){
                JOptionPane.showMessageDialog(ventana, "Campo vacío");
                return;
            }
            if(vehiculos.containsKey(matriculaEliminar)){
                vehiculos.remove(matriculaEliminar);
                JOptionPane.showMessageDialog(ventana, "vehiculo eliminado");
            }else{
                JOptionPane.showMessageDialog(ventana, "No existe esa matricula");
            }
            
        });
        
        //Botón buscar vehiculo
        
        botonBuscar.addActionListener(e->{
            String matriculaBuscar = JOptionPane.showInputDialog("Introduce la matricula a buscar.");
            if(matriculaBuscar == null || matriculaBuscar.isEmpty()){
                JOptionPane.showMessageDialog(ventana, " Este campo está vacio");
                return;
            }
            if(vehiculos.containsKey(matriculaBuscar)){
                 JOptionPane.showMessageDialog(ventana, vehiculos.get(matriculaBuscar));
            }else{
                JOptionPane.showMessageDialog(ventana, "No existe esa matrícula");
            }
            
        });
            
               
        //Estilo botones    
          boton.setBounds(0,0,500,50);  // posicionar componente
          boton.setFont(new Font("Arial", Font.BOLD,16));
          botonMostrar.setBounds(0,0,500,50);
          botonMostrar.setFont(new Font("Arial", Font.BOLD,16));
          botonBuscar.setBounds(0,0,500,50);
          botonBuscar.setFont(new Font("Arial", Font.BOLD,16));
          botonEliminar.setBounds(0,0,500,50);
          botonEliminar.setFont(new Font("Arial", Font.BOLD,16));
         
          
          //Añadir componentes a la ventana
        ventana.add(boton);
        ventana.add(botonMostrar);
        ventana.add(botonBuscar);
        ventana.add(botonEliminar);
        //mostrar la ventana esto siempre es lo último
        ventana.setVisible(true); 

    }
} 

           

        
