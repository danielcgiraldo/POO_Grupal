
package Animal;

public class Prueba {
    public static void main(String[] args) {
        Animal[] animales = new Animal[4];
        animales[0] = new Gatos();
        animales[1] = new Leones();
        animales[2] = new Lobos();
        animales[3] = new Perros();

        for (int i = 0; i < 4; i++) {
            System.out.println("====== " + ((animales[i].getClass().getName()).split("\\."))[1] + " ======");
            System.out.println("Nombre Científico: " + animales[i].getNombreCientifico());
            System.out.println("Sonido: " + animales[i].getSonido());
            System.out.println("Alimentos: " + animales[i].getAlimentos());
            System.out.println("Hábitat: " + animales[i].getHabitat());
        }
    }
}
