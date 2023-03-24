package ejerciciolista.pq1;

import ejerciciolista.pq2.Lista;
import ejerciciolista.pq2.Nodo;

public class Principal{
    public static void main(String[] args) {
        System.out.println("Probando");

        Lista lista = new Lista();
        Nodo nodo = new Nodo("Chelsea");
        lista.adicionarNodoInicio(nodo);
        Nodo nodo1 = new Nodo("liverpool");
        lista.adicionarNodoInicio(nodo1);
        //Nodo nodo2 = new Nodo(informacion:"liverpool");
        //lista.adicionarNodos(nodo2);
        lista.imprimir();
    }
}
