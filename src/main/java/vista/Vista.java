package vista;
import javax.swing.*;
import java.awt.event.*;
import modelo.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Vista {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JTextArea textArea2;
    private JPanel Ventana;

    public Vista() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String programa = leerFicheroPrograma("programas/countDown.java");
                MaquinaReverser maquina = new MaquinaReverser(programa);
                if(maquina.gestionar()){
                    textArea2.setText("El programa está en un bucle infinito");
                }else{
                    textArea2.setText("El programa ha terminado correctamente");
                }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String programa = leerFicheroPrograma("programas/countUp.java");
                MaquinaReverser maquina = new MaquinaReverser(programa);
                if(maquina.gestionar()){
                    textArea2.setText("El programa está en un bucle infinito");
                }else{
                    textArea2.setText("El programa ha terminado correctamente");
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String programa = leerFicheroPrograma("programas/MaquinaReverser");
                MaquinaReverser maquina = new MaquinaReverser(programa);
                if(maquina.gestionar()){
                    textArea2.setText("El programa está en un bucle infinito");
                }else{
                    textArea2.setText("El programa ha terminado correctamente");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Vista");
        frame.setContentPane(new Vista().Ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static String leerFicheroPrograma(String ruta){
        StringBuilder programa = new StringBuilder();
        try {
            File archivo = new File(ruta);
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                programa.append(linea).append("\n");
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return programa.toString();
    }
}