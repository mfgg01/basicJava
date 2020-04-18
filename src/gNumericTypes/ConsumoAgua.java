package gNumericTypes;

import libs.Input;

public class ConsumoAgua {

    public static void main(String args[])

    {
        System.out.print("¿Cuántos minutos tardas en ducharte: ");
        int m = Input.get_int();
        System.out.print("Gastas " + (m*12) + " botellas de agua en tu ducha diaria." + "\n");
    }
}
