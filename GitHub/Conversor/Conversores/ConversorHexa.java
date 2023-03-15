package Conversores;

public class ConversorHexa {
    private int decimal;
    String hexa;
   
    
   
    private static String ConverterHexadecimal(int decimal) {
      int temp = decimal;
      String hexa = "";
      while (temp > 0) {
         int resto = temp % 16;
         if (resto < 10) {
             hexa = resto + hexa;
         } else {
             hexa = (char)('A' + resto - 10) + hexa;
         }
         temp /= 16;
      }
      return hexa; 
    }

    public ConversorHexa(int decimal) {
       this.decimal = decimal;
       this.hexa = ConverterHexadecimal(decimal);
    }
   
    public String getHexa() {
       return hexa;
    }
}
