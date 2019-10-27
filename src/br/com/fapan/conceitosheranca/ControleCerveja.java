package br.com.fapan.conceitosheranca;

/**
 *
 * @author  ademar
 */
public class ControleCerveja {    
    public static void main(String[] args) {        
        System.out.println("CONTROLE DE CONSUMO DE CERVEJA");
        
        Cerveja cerva = new Cerveja();        
        cerva.valor=45;        
        System.out.println("VALOR DA CERVEJA " + cerva.valor);
        
        cerva.beber();
    }    
}
