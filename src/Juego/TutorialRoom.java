package Juego;

class TutorialRoom implements Room {
    public void enter(Player player) {
        System.out.println("Bienvenido al tutorial. Aprende los comandos básicos y mecánicas.");
        System.out.println("- En la sala 2 puedes encontrar tesoros (Espadas) y en las proximas enemigos.");
        System.out.println("- Para avanzar, deberás responder preguntas de Java básico.");
        System.out.println("- Si contestas de forma incorrecta una respuesta,perderas 1 corazon. Si aciertas y vences a tus enemigos pasaras a otro nivel");
        System.out.println("- La sala 2 es muy importante ya que en ella se encuentran 3 preguntas correctas, sin embargo de las 3 preguntas hay solo una que es mas correcta que la otra, si logras contestar tendras un arma legendaria que quita 3 corazones a tus enemigos.");
    }
}
