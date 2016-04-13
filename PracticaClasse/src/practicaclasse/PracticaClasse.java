/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaclasse;

/**
 *
 * @author Elio
 */
public class PracticaClasse {

    public String msg(String msg){
        return msg;
    }
    public int num (int num){
        if(num!=0){
            return num;
        }
        return 0;
    }
    
    public void cercantFallo(){
        System.out.println("hkjhkjhkjh");
    }
    
    public static void main(String[] args) {
        System.out.println("Hola Toni, com anams");
        PracticaClasse msg = new PracticaClasse();

        System.out.println(msg.msg("I va malament"));
        System.out.println(msg.msg("Idò que duri!!!"));
        System.out.println(msg.num(3));

    }
    
}
