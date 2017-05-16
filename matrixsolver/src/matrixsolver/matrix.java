/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixsolver;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class matrix {
    public double[] [] myMatrix;
    
    public matrix(double [] first, double[] second, double[] third) {
        
        myMatrix = new double[3][1];
        myMatrix[0] = first;
        myMatrix[1] = second;
        myMatrix[2] = third;       
        
    }
    
    public void rowAdd(double scalar, int initial, int target){
        
        //double[] toAdd = scalarMult(scalar, myMatrix[initial]);
        
        //for (int i = 0; i < toAdd.length; i++) {
            //myMatrix[target][i] += toAdd[i];
        //}
        
        for (int i = 0; i < myMatrix[initial].length; i++) {
            myMatrix[target][i] += scalar * myMatrix[initial][i];
        }
        
        System.out.println("xRw+(" + scalar + ", ANS, "+ (initial + 1) +", " + (target + 1) + ")");
        
    }
    
//    public void rowMult(double scalar, int target) {
//        myMatrix[target] = scalarMult(scalar, myMatrix[target]);
//    }
//    
//    private double[] scalarMult(double scalar, double[] array) {
//                
//        for(int i = 0; i < array.length; i++) {
//            array[i] *= scalar;           
//        }
//        
//        return Arrays.copyOf(array, array.length);
//    }
    
    public void printMatrix() {
        for (double[] row : myMatrix) {
            String rowString = new String();
            for (double value : row) {
                rowString = rowString + value + "\t";
            }
            System.out.println(rowString);
        }
        
    }
    
    public void eliminate(int initial, int target, int position) {
        double elimScalar = -1.0 * myMatrix[target][position]/ myMatrix[initial][position];
               
        rowAdd(elimScalar, initial, target);        
    }
    
    public void simplify(int target, int position) {
        double divisor = myMatrix[target][position];
        for (int i = 0; i < myMatrix[target].length; i++) {
            myMatrix[target][i] /= divisor;
        }
        System.out.println("xRw(" + (1.0 / divisor) + ", ANS, " + (target + 1) + ")");
        
    }
    
    public void solve () {
        
        eliminate(0,1,0);
        eliminate(0,2,0);
        eliminate(1,2,1);
        eliminate(2,1,2);
        eliminate(2,0,2);
        eliminate(1,0,1);
        
        simplify(0,0);
        simplify(1,1);
        simplify(2,2);
        
        
    }
    
}
