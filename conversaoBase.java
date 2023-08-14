
public class conversaoBase {

    public static void main (String [] args) {

     
    
        String entrada = "0x80865";

        if ((entrada.substring(0,2)).equals("0x")){ 

            entrada = entrada.substring(2);
            int hexaInt = Integer.parseInt(entrada,16);
            System.out.println ("Valor Hexadecimal de Entrada: 0x" + entrada);
            System.out.println("Valor Decimal: " +hexaInt );
           
         }else{
            
            int decimalInt  = Integer.parseInt(entrada, 10);
            String hexa = Integer.toHexString(decimalInt);
            System.out.println ("Valor Decimal de Entrada: " + entrada);
            System.out.println ("Valor Hexadecimal: 0x" + hexa);
        }   
        
    }

    @Override
    public String toString() {
        return "ConversaoBase []";
    }

}