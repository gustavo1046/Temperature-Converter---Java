
package Temperature;

import java.util.Scanner;

public class home {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius para obte-la nos demais tipos de temperatura: ");
        double temp = scan.nextDouble();
        
        Temperatura number = new Temperatura(temp);
        System.out.println("A temperatura em Celsius: " + number.getNumber());
        System.out.println("A temperatura em Kelvin: " + number.kelvin(temp));
        System.out.println("A temperatura em Fahrenheit: " + number.fahrenheit(temp));
        System.out.println("A temperatura em Reaumur: " + number.reaumur(temp));
        System.out.println("A temperatura em Rankine: " + number.rankine(temp));
        scan.close();
    } 
}