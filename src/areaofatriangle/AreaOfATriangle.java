/*
 * Caleb Hinderle
 * 07/09/2018
 * The purpose of this program is to find the area of a triangle
 */

package areaofatriangle;
import javax.swing.*;

/**
 *
 * @author cahin7692
 */
public class AreaOfATriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //
        double area, a, b, c, s;
        
        //Get all of the lengths of the triangle
        a = Double.parseDouble(JOptionPane.showInputDialog("Enter a of triangle"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Enter b of triangle"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Enter c of triangle"));
        s = (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        //test
        System.out.println(a);
        System.out.println(b); 
        System.out.println(c);
        
        //Output
        JOptionPane.showMessageDialog(null, "The are of  triangle with a= "+a+" b= "+b+" c= "+ c +" is "+area);
    }
    
}
