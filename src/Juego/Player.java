package Juego;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
//Esta es la clase es el molde para crear cada personaje
class Player {
    private String name; //nombre
    private String role;  // tipo de avatar
    private int hearts;    // vida
    private List<String> inventory; //armas(espadas)
    private int weaponPower;
//Son private porque solo la propia clase Player puede acceder a ellas directamente
    public Player(String name, String role) {  // Esto inicializa las variables: se empieza con 3 corazones, un inventario vacío y un poder del arma
        this.name = name;
        this.role = role;
        this.hearts = 3;
        this.inventory = new ArrayList<>();
        this.weaponPower = 1; // daño inicial 1
    }

    public void receiveDamage(int damage) {
        hearts -= damage;  //metodo para cuando se recibe daño, resta corazones y asegura que no bajen de 0
        if (hearts < 0) hearts = 0;
        System.out.println(name + " pierde " + damage + " corazón(es). Corazones restantes: " + hearts);
    }



    public void addItem(String item, int power) {
        inventory.add(item);
        weaponPower = power;
        System.out.println(name + " ha recogido: " + item + " (Poder de arma: " + power + ")");
    }

    public boolean isAlive() {
        return hearts > 0;
    }

    public int getWeaponPower() {
        return weaponPower;
    }

    public void showStatus() {
        System.out.println("Jugador: " + name + " (" + role + ") | Corazones: " + hearts + " | Inventario: " + inventory);
    }
}
