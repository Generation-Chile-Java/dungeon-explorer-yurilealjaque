package Juego;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class QuestionBank { //este es un metodo estatico por lo tanto no hay que crear un objeto
    public static List<Question> getEnemyQuestions() {
        List<Question> preguntas = new ArrayList<>();
        preguntas.add(new Question("¿Qué palabra clave se utiliza para definir una clase en Java?", new String[]{"define", "class", "structure"}, "B"));
        preguntas.add(new Question("¿Cuál es el tipo de dato para números decimales en Java?", new String[]{"int", "double", "char"}, "B"));
        preguntas.add(new Question("¿Qué método se usa para imprimir en consola en Java?", new String[]{"System.out.print", "System.out.println", "Console.WriteLine"}, "B"));
        preguntas.add(new Question("¿Cuál es el operador de igualdad en Java?", new String[]{"=", "==", "equals"}, "B"));
        preguntas.add(new Question("¿Cómo se inicia la ejecución de un programa en Java?", new String[]{"init()", "main()", "start()"}, "B"));
        preguntas.add(new Question("¿Qué tipo de estructura es un ArrayList en Java?", new String[]{"Clase", "Interfaz", "Colección"}, "C"));
        preguntas.add(new Question("¿Qué palabra clave se usa para heredar una clase en Java?", new String[]{"extends", "inherits", "super"}, "A"));
        preguntas.add(new Question("¿Cuál de estos es un tipo primitivo en Java?", new String[]{"String", "int", "Integer"}, "B"));
        preguntas.add(new Question("¿Qué significa JVM?", new String[]{"Java Variable Method", "Java Virtual Machine", "Java Visual Module"}, "B"));
        preguntas.add(new Question("¿Qué sentencia se usa para tomar decisiones en Java?", new String[]{"switch", "if", "for"}, "B"));
        Collections.shuffle(preguntas);// este metodo mezcla aleatoriamente las preguntas(solo la de los enemigos)
        return preguntas;
    }
}
