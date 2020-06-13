/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hotel;
import javax.swing.JFrame;
/**
 *
 * @author belgo
 */


public class Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reader r = new Reader("Гостиница");
        r.setVisible(true);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setSize(420, 800);
        r.setResizable(false);
        r.setLocationRelativeTo(null);
    }
}
