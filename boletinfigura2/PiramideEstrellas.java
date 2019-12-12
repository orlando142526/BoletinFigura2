
package boletinfigura2;
import javax.swing.JOptionPane;

public class PiramideEstrellas {
    private int lineas;
    
    public void pideLineas (){
        lineas=Integer.parseInt(JOptionPane.showInputDialog("Cuantas lineas quieres dibujar?"));
    }
    
    public void dibujaPiramide(){
        pideLineas();
        int k=0;
        for(int i=1; i <= lineas; i++, k=0) {
            for(int espacio=1; espacio <= lineas-i; espacio++) {
                System.out.print("  ");
            }
            while(k != 2 * i - 1) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }
    }
}