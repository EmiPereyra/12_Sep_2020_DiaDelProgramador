/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diadelprogramador12sep;

/**
 *
 * @author Emi Pereyra
 */
public class ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definir variables (e inicializar si es necesario)
        int year = 2020;
        int enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre;
        String diaDelProgramador;
        enero = marzo = mayo = julio = agosto = octubre = diciembre = 31;
        abril = junio = septiembre = noviembre = 30;
        //Proceso
        if((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0)){
            febrero = 29;
                        
        }else{
            febrero = 28;
        }
        
        if (enero+febrero+marzo+abril+mayo+junio+julio+agosto+septiembre+octubre+noviembre+diciembre == 365){
            diaDelProgramador = "13 de septiembre";
        }else{
            diaDelProgramador = "12 de septiembre";
        }
        //Salida
        System.out.println("Este año el día del programador e informático cae " + diaDelProgramador + "\n¡FELIZ DÍA PROFE! :D");        
    }
    
}
