/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projecttugas;

/**
 *
 * @author Acer
 */
public class ProjectTugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        --loop while--
        int a = 1;
        while (a <= 5) {
            int b = 1;
            while (b <= 5) {
              System.out.print(a==1 || b==1 ? "0" : "*"); 
              b++;
            }
              System.out.println();
              a++;
        }
    }
    
}
