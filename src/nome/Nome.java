
package nome;

 import java.util.Scanner;

public class Nome {

    
    public static void main(String[] args) {
        
        Scanner aux = new Scanner(System.in);
            String meuNome;
            double minhaAltura;
       System.out.println("Entre com seu nome");
       
         meuNome = aux.nextLine();
         System.out.println("Entre com sua altura");
       
        minhaAltura = aux.nextDouble();
      
      System.out.println(meuNome+" tem " +minhaAltura+"  m");
    }
    
}
