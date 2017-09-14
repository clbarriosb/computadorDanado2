/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecladodañado;

/**
 *
 * @author Carmen_Lucia3
 */
public class nodo {

    private String valor;
    private nodo siguiente;

    public void Nodo() {
        this.valor = "";
        this.siguiente = null;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }
}

class Pila {

    private nodo inicio;

    public void Pila() {
        inicio = null;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public void apilar(String valor) {
        nodo nuevo = new nodo();
        nuevo.setValor(valor);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    public void retirar() {
        if (!esVacia()) {
            inicio = inicio.getSiguiente();
        }
    }

    public void eliminar() {
        inicio = null;
    }

    public void listar() {
        nodo aux = inicio;
        while (aux != null) {
            System.out.print(aux.getValor());
            aux = aux.getSiguiente();
        }
    }
}

class Cola {

    class Nodo {

        String info;
        Nodo sig;
    }

    private Nodo raiz, fondo;

    Cola() {
        raiz = null;
        fondo = null;
    }

    boolean vacia() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    void insertar(String info) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = info;
        nuevo.sig = null;
        if (vacia()) {
            raiz = nuevo;
            fondo = nuevo;
        } else {
            fondo.sig = nuevo;
            fondo = nuevo;
        }
    }

    String extraer() {
        if (!vacia()) {
            String informacion = raiz.info;
            if (raiz == fondo) {
                raiz = null;
                fondo = null;
            } else {
                raiz = raiz.sig;
            }
            return informacion;
        } else {
            return "";
        }
    }

    public void imprimir() {
        Nodo reco = raiz;
        while (reco != null) {
            System.out.print(reco.info);
            reco = reco.sig;
        }
    }
}
