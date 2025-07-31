package Juego;

import java.util.Scanner;

class TreasureRoom implements Room {
    public void enter(Player player) {
        System.out.println("Sala del Tesoro. Contesta esta pregunta para obtener un arma:");
        System.out.println("¿Qué instrucción en Java se utiliza para repetir un bloque de código mientras una condición sea verdadera?");
        System.out.println("A. for\nB. while\nC. do-while");

        Scanner sc = new Scanner(System.in);
        String respuesta = sc.nextLine().trim().toUpperCase(); //metodos para el texto en scanner, queta espacios en blancos y convierte en mayusculas

        switch (respuesta) { //metodo para actualizar inventario y el poder de la arma
            case "B":
                player.addItem("Espada Legendaria", 3);
                break;
            case "C":
                player.addItem("Espada Firme", 2);
                break;
            case "A":
                player.addItem("Espada Ligera", 1);
                break;
            default:
                System.out.println("Respuesta no válida. No obtuviste el arma.");
                break;
        }
    }
}