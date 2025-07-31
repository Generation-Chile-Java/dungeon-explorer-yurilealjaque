package Juego;

import java.util.Scanner;

class Question {
    String pregunta;
    String[] opciones;
    String respuestaCorrecta;
// Almacena un arreglo de las posibles respuestas a,b,c, y la letra de la respuesta correcta.
    public Question(String pregunta, String[] opciones, String respuestaCorrecta) { //El constructor para crear una nueva pregunta, pasándole la pregunta, las opciones y la respuesta.
        this.pregunta = pregunta;
        this.opciones = opciones;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public boolean ask() { //Devuelve verdadero si es correctay falsa si contesta mal.
        System.out.println(pregunta);
        for (int i = 0; i < opciones.length; i++) {
            System.out.println((char)('A' + i) + ". " + opciones[i]);
        }
        Scanner sc = new Scanner(System.in);
        String r = sc.nextLine().trim().toUpperCase();
        return r.equals(respuestaCorrecta);
    }
}
