package com.example;

    import java.util.EmptyStackException;

    
    public interface stackCalculadora<T> {

        /**
         * Agrega un elemento al tope de la pila.
         * @param element El elemento a agregar.
         */
        void push(T element);

        /**
         * @return El elemento en el tope de la pila, removiéndolo de la misma.
         * @throws EmptyStackException Si la pila está vacía.
         */
        T pop() throws EmptyStackException;

        /**
         * Retorna el elemento en el tope de la pila, sin removerlo.
         * @return El elemento en el tope de la pila.
         * @throws EmptyStackException Si la pila esta vacia
         */
        T peek() throws EmptyStackException;

        /**
         * Revica si la pila está vacía.
         * @return true si la pila está vacía, false de lo contrario.
         */
        boolean isEmpty();

        /**
         * Returns el numero de la pila
         * @return el numero de la cantidad de objetos dentro de la pila
         */
        int size();
    }