package Conversores;

public class Executador {
    public static void main(String[]args){
    ConversorBinario conversor = new ConversorBinario(255);
    String binario = conversor.getBinario();
    System.out.println(binario); 

    ConversorHexa converter = new ConversorHexa(255);
    String hexa = converter.getHexa();
    System.out.println(hexa);

    ConversorOctal convert = new ConversorOctal(255);
    String octal = convert.getOctal();
    System.out.println(octal);

    }
}
