/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acre;

/**
 *
 * @author aluno
 */
public class Acre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int prefixo = 10;
        int sufixo = 40;
        
        /* this int equals to diferença prefixo (P)*/
        int diferencaP, diferencaS;
        
        /* this int equals to diferença sufixo (S)*/
        
        /* that could also be like this:
        int diferencaP, diferencaS;
        optei por fazer diferente por causa do comentário
        */
        
        diferencaP = ++prefixo;
        
        System.out.println("diferenca " + diferencaP);
        System.out.println("prefixo " + prefixo);
        
        diferencaS = sufixo++;
        
        System.out.println("diferenca(2) " + diferencaS);
        System.out.println("sufixo " + sufixo);
    }
    
}
