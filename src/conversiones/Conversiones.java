
package conversiones;

public class Conversiones {

    public static void main(String[] args) {
        
        double num = 1.67;
        
        //casteo a entero
        int numInt = (int) num;
        
        //casteo a long
        long numLong = (long) num;
        
        System.out.println("double: " + num);
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);
        
        // Pasamos de String a entero y doble para multplicar
        String cantidad = "15";
        String precio = "150.27";
        
        int cantEntero = Integer.parseInt(cantidad);
        double precioDouble = Double.parseDouble(precio);
        
        System.out.println("El valor total de la compra es: " + (cantEntero * precioDouble));
        
        
        // Pasamos de entero y doble a String
        int edad = 30;
        double estatura = 1.67;
        
        String edadString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);
        
        System.out.println("Edad: " + edadString + " Estatura: " + estaturaString);
        
    }
    
}
