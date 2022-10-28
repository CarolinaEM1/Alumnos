/*
Pedir 5 calificaciones de alumnos y decir si al final hay algún reprobado.
 */
package ejercicio21;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int calificaciones;
        boolean suspenso= false;
        
        JOptionPane.showMessageDialog(null,"Inserta 5 calificaciones del 1 al 10");
        
        for (int i=1; i<=5; i++){
            calificaciones=Integer.parseInt(JOptionPane.showInputDialog("Inserta la calificación N°"+i));
            
            if (calificaciones<=5){
                suspenso= true;
            }
        }
        if (suspenso==true){
                JOptionPane.showMessageDialog(null,"Si existen alumnos reprobados");
            }
            else {
                JOptionPane.showMessageDialog(null,"No existen alumnos reprobado");
            }
    }
    
}
