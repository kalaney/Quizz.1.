/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizz;
import javax.swing.JOptionPane;
/**
 *
 * @author Kalaney
 */
public class Quizz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    String empleados;
    int cantidadEmpleados;
    double deducciones=0;
    
    //Para tenere la cantidad de trabajadores
    empleados =JOptionPane.showInputDialog("Cuantos empleados trabajan en la empresa: ");
    cantidadEmpleados=Integer.parseInt(empleados);
    
    //para sacar la cantidad de trabajadores 
    for (int i=0;i<cantidadEmpleados;i++){
        String reqSalario;
        double cantSalario;
        reqSalario=JOptionPane.showInputDialog("Ingrese su salario: ");
        cantSalario=Integer.parseInt(reqSalario);
        //Deducciones salariales
        deducciones=cantSalario*0.1433;
       
        }
    
        System.out.println(deducciones);
    }
    
    }

