package Conversores;

public class ConversorOctal {
    private int decimal;
    String octal;
   
    private static String ConverterOctal(int decimal) {
       int temp = decimal;
       String octal = "";
       while (temp > 0) {
          int resto = temp % 8;
          octal = resto + octal;
          temp /= 8;
       }
       return octal;    
    }

    public ConversorOctal(int decimal) {
       this.decimal = decimal;
       this.octal = ConverterOctal(decimal);
    }
   
    public String getOctal() {
       return octal;
    }
}