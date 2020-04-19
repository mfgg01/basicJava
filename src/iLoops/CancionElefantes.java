package iLoops;

public class CancionElefantes {
    public static void main(String[] args) {
        int numElefantes = 1;
        int totalElefantes = 100;
        while (numElefantes <= totalElefantes) {
            if (numElefantes > 1) {
                System.out.println("\n" + numElefantes + " elefantes se columpiaban sobre la tela de una araña,");
                System.out.println("como veían que resistia, fueron a llamar a otro elefante...");
            } else {
        System.out.println("\n" + numElefantes + " elefante se columpiaba sobre la tela de una araña,");
        System.out.println("como veía que resistia, fueron a llamar a otro elefante...");
            }
        numElefantes++;
        }
    }
}
