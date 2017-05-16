/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixsolver;

/**
 *
 * @author Admin
 */
public class Matrixsolver {
    
    // edit these arrays to change the values in the matrix. Each array corresponds to a row
    // if you for some reason are inclined to actually code a UI for this, be my guest...

    static double[] r1 = {17,25,10,15.69};
    static double[] r2 = {17,33,0,10.81};
    static double[] r3 = {15,8,19,17.39};
    
    public static void main(String[] args) {
        matrix mat1 = new matrix(r1,r2,r3);
        mat1.printMatrix();
        
        mat1.solve();
        
        System.out.println();
        
        mat1.printMatrix();
    }
    
}
