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
public class TecladoDañado {

    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        Fixer fixer;
        String line = buffer.readLine();
        for (int i = 0; i < 100 && line != null && line.length() != 0 && line.trim().length() != 0; i++) {
            if (line.length() <= 100000) {
                fixer = new Fixer(line);
                line = fixer.fixed().toString();
                System.out.println(line);
            } else {
            }
            line = buffer.readLine();
        }
    }
;

};
class Fixer {

    private char line[];
    //private String  temporal,
    //fixed;
    private StringBuilder temporall,
            fixedd;

    public Fixer() {
        //this.temporal="";
        //this.fixed="";
        this.fixedd = new StringBuilder();
        this.temporall = new StringBuilder();
    }

    ;
    public Fixer(String line) {
        this();
        this.line = new char[line.length()];
        this.line = line.toCharArray();
        fixing();
    }

    ;
    public void fixing() {
        for (int i = 0; i < this.line.length;) {
            if (i == 0 && this.line[i] != '$' && this.line[i] != '#') {
                //this.fixed+=this.line[i];
                this.fixedd.append(this.line[i]);
                i++;
            } else if (this.line[i] == '#') {
                i++;
                if (i < this.line.length) {
                    while (this.line[i] != '#' && this.line[i] != '$' && this.line[i] != 0) {
                        //this.temporal+=this.line[i];
                        this.temporall.append(this.line[i]);
                        i++;
                        if (i >= this.line.length) {
                            break;
                        }
                    }
                }
                //this.temporal+=this.fixed;
                this.temporall.append(this.fixedd);
                //this.fixed=this.temporal;
                this.fixedd = this.temporall;
                //this.temporal="";
                this.temporall = new StringBuilder();
            } else if (this.line[i] == '$') {
                i++;
                if (i < this.line.length) {
                    while (this.line[i] != '#' && this.line[i] != '$' && this.line[i] != 0) {
                        //this.temporal+=this.line[i];
                        this.temporall.append(this.line[i]);
                        i++;
                        if (i >= this.line.length) {
                            break;
                        }
                    }
                }
                //this.fixed+=this.temporal;
                this.fixedd.append(this.temporall);
                //this.temporal="";
                this.temporall = new StringBuilder();
            } else {
                //this.fixed+=this.line[i];
                this.fixedd.append(this.line[i]);
                i++;
            }
        }
    }

    public StringBuilder fixed() {
        return this.fixedd;
    }
}
