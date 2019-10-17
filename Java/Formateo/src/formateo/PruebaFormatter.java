/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formateo;

/**
 *
 * @author dual108
 */
import java.util.Formatter;
import javax.swing.JOptionPane;

public class PruebaFormatter {
    
    public static void main(String[] args) {
        
        Formatter formatter = new Formatter();
        formatter.format( "%d = %#o = %#X", 10, 10, 10);
        
        JOptionPane.showMessageDialog( null, formatter.toString() );
    }
}
