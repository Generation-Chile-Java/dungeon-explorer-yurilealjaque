package Juego;

import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la Mazmorra.");
        System.out.print("Ingresa tu nombre: ");
        String name = scanner.nextLine();

        System.out.print("Elige tu clase (Caballero/Mago): ");
        String role = scanner.nextLine();
        while (!role.equalsIgnoreCase("Caballero") && !role.equalsIgnoreCase("Mago")) {
            System.out.print("Clase inválida. Elige entre Caballero o Mago: ");
            role = scanner.nextLine();
        }

        Player player = new Player(name, role);

        Room[] dungeon = new Room[] {
                new TutorialRoom(),           // Sala 1
                new TreasureRoom(),           // Sala 2 (pregunta fija)
                new EnemyRoom("Goblin", 3),   // Sala 3
                new EnemyRoom("Orco", 6),     // Sala 4
                new EnemyRoom("Troll", 9),    // Sala 5
                new EnemyRoom("Dragón", 12)   // Sala 6
        };

        for (int i = 0; i < dungeon.length; i++) {
            if (!player.isAlive()) {
                System.out.println("Has muerto. Fin del juego.");
                return;
            }
            System.out.println("\n--- Entrando en la sala " + (i + 1) + " ---");
            dungeon[i].enter(player);
            player.showStatus();
            System.out.println("Presiona Enter para continuar...");
            scanner.nextLine();
        }

        if (player.isAlive()) {
            System.out.println("¡Felicidades! Has explorado toda la mazmorra y sobrevivido.");
        }
    }
}
