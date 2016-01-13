/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escudos;

/**
 *
 * @author Hector Arnau Aparicio
 */
public class Escudos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aux;
       /* for (int i=0;i<20;i++){
            System.out.println(i+":"+calculaEscudos(i));
            aux=(int) Math.sqrt(i);
            System.out.println(aux);
            System.out.println(Math.sqrt(i));
        }*/
        //for (int i=1;i<20;i++){
            System.out.println(obtieneEscudos(35));
        //}
        // TODO code application logic here
    }
    
    private static int obtieneEscudos(int soldados){
        int escudos=0;
        if (soldados==0) return 0;
        if (soldados==1) return 5;
        if (soldados==2) return 10;
      //  System.out.println(Math.sqrt(soldados));
        //System.out.println(soldados-(int)Math.sqrt(soldados));
        escudos+=calculaEscudos((int) Math.sqrt(soldados))+obtieneEscudos(soldados-(int) (Math.sqrt(soldados)));
        
        return escudos;
    }
    
    private static int calculaEscudos (int lado){
        
        
        return lado*lado+perimetro(lado);
    }
    
    private static int perimetro (int lado){
        return lado*4;
    }
}
