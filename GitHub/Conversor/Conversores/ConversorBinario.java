package Conversores;


public class ConversorBinario{
    private int decimal;
    String binario;
   
    
   
    private static String ConverterBinario(int decimal) {
       int temp = decimal;
       String binario = "";
       while (temp > 0) {
          int resto = temp % 2;
          binario = resto + binario;
          temp /= 2;
       }
       return binario;    
    }

    public ConversorBinario(int decimal) {
       this.decimal = decimal;
       this.binario = ConverterBinario(decimal);
    }
   
    public String getBinario() {
       return binario;
    }
 }
 