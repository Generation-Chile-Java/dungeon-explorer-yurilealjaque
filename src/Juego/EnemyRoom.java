package Juego;

import java.util.List;
import java.util.Scanner;

class EnemyRoom implements Room {  //implements es por la interface
    private String enemyName;
    private int enemyHearts;

    public EnemyRoom(String name, int hearts) {
        this.enemyName = name;
        this.enemyHearts = hearts;
    }

    public void enter(Player player) {
        System.out.println("¡Un enemigo aparece! Es un " + enemyName + ". Tiene " + enemyHearts + " corazones.");
        List<Question> preguntas = QuestionBank.getEnemyQuestions();
        int i = 0;

        while (enemyHearts > 0 && player.isAlive()) {
            if (i >= preguntas.size()) {
                preguntas = QuestionBank.getEnemyQuestions();
                i = 0;
            }
            System.out.println("Pregunta para atacar al enemigo:");
            boolean correcta = preguntas.get(i).ask();
            i++;
            if (correcta) {
                enemyHearts -= player.getWeaponPower();
                System.out.println("¡Ataque exitoso! Daño causado: " + player.getWeaponPower() + ". Corazones restantes del enemigo: " + enemyHearts);
            } else {
                player.receiveDamage(1);
                System.out.println("Respuesta incorrecta. El enemigo contraataca.");
            }
        }

        if (enemyHearts <= 0) {
            System.out.println("Has vencido al enemigo " + enemyName + "!");
        } else {
            System.out.println("El enemigo te ha derrotado...");
        }
    }
}
