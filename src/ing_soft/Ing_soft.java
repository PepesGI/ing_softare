/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ing_soft;

/**
 *
 * @author bob_p
 */
public class Ing_soft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Usuario obj = new Usuario();
        boolean acces;
        acces = obj.verificar_user("Alberto","9999");
        if(acces){
            System.out.println("Ambos datos son correctamente ");
         
        } else {
            System.out.println("DAtos no validos ni correctos");   
        }
        }

       
    }
    

