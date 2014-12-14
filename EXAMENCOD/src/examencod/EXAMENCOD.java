// ramas

package examencod;

public class EXAMENCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int iN = 11;
            	if (metodoMio(iN))
System.out.println("Es numero primo");
else
 System.out.println("NO es numero primo");           	 
          	 
for (int x=2;x<1000;x++) {
if (metodoMio(x))
System.out.print(x + " ");                         	 
}         	 
	}
public static boolean metodoMio(int variable){
return  HOLAAA(variable);
  } 	 

    private static boolean HOLAAA(int variable) {
        final int NUMERO = 2;
        int j = NUMERO;
        boolean aux=true;
        while ((aux) && (j!=variable)){
            if (variable % j == 0)
                aux = false;
            j++;
        }
        return aux;
    }
    
}

/* Esto es una locura
 *
 */