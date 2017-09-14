/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecladodañado;

import java.io.*;

/**
 *
 * @author Carmen_Lucia3
 */
public class computadorDañado {
    
    public class Computador {

    public static void main(String[] args) throws Exception {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        String s = lector.readLine();
        for (int i = 0; s != null && s.trim().length() != 0 && s.length() != 0 && i < 100; i++) {
            if (s.length() <= 100000) {
                proceso(s);
            }else{}
            s = lector.readLine();
        }    
    }
        
         static void proceso(String s){
            Cola cola = new Cola();
            Pila pila = new Pila();
            String[] re = s.split("\\$|#");
            char [] a = s.toCharArray();
            int pos = 0;
            if(re[0].equals("")) {
                pos++;
                System.out.println("si");
            }
            try {
                for (int i = 0; i < a.length; i++) {
                    System.out.println("entre");
                    if (i == 0 && a[i] != '#' && a[i] != '$') {
                        cola.insertar(re[pos]);
                        System.out.println(re[pos]);
                        if (pos < re.length) {
                            pos++;
                        }
                    } else if (a[i] == '$') {
                        cola.insertar(re[pos]);
                        System.out.println(re[pos] + "n");
                        if (pos < re.length) {
                            pos++;
                        }
                    } else if (a[i] == '#') {
                        pila.apilar(re[pos]);
                        System.out.println(re[pos] + "n");
                        if (pos < re.length) {
                            pos++;
                        }
                    } 
                }
            } catch (Exception e) {
            }
            pila.listar();
            cola.imprimir();
            System.out.println("");
        }
}         
}
