package ACT_13;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author cristiancantero
 */
public class VentanaPral {

    public static void main(String[] args) {

        JFrame ventana = new JFrame();//crear ventana
        //configurar ventana
        ventana.setSize(500, 400);//tamaño de la ventana 
        ventana.setTitle("Concesionario");//titulo de la ventana 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//se cierra el programa haciendo click en la x
        ventana.setLocationRelativeTo(null);//centrada
        ventana.setLayout(null);//yo decido donde va a ir todo

        //crear los componentes
        JButton boton = new JButton("púlsame");
        boton.addActionListener(e -> {
            System.out.println("click");
            boton.setText("Has pulsado!!");
        });
       
        boton.setBounds(50, 50, 100, 30);  // posicionar componente
        ventana.add(boton);
        

        ventana.setVisible(true); //mostrar la ventana esto siempre es lo último

    }
}
