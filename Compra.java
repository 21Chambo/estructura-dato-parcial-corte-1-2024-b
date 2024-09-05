import javax.swing.*;
import java.util.Scanner;

public class Compra{   
    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        Double nombredelcliente;
        Double nombredelproducto;           
        String mensaje = "Error, entrada de datos";
        String ValorBruto;
        String ValorDescuento;
        String ValorNeto;
        String ValorUnitario; 
        String Cantidad; 

        System.out.print("Digite el nombredelcliente: ");
        nombredelcliente = scanner.next();

        System.out.print("Digite el nombredelproducto: ");
        nombredelproducto = scanner.nextDouble();
       
        if (ValorBruto>=0 && ValorBruto<=5){
            System.out.print("Digite el valor del producto: ");
            ValorBruto = String.nex.String();

            if (ValorDescuento>=0 && ValorDescuento<=5){
                System.out.print("Digite el valor del descuento del producto");
                ValorDescuento = String.nex();
        
    
    }