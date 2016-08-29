

package javaapplication21;
import java.util.Scanner;
public class JavaApplication21 {


    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("Input a string");
        String input = sc.nextLine();
        
        for(int x=0; x<input.length(); x++)
        {
            switch(input.charAt(x))
            {
                case'+':
                System.out.println("Identifier: +, Symbols Name: PLUS");
                break;

                case'-':
                System.out.println("Identifier: -, Symbols Name: MINUS");
                break;

                case'*':
                System.out.println("Identifier: *, Symbols Name: TIMES");
                break;

                case'/':
                System.out.println("Identifier: /, Symbols Name: DIVIDE");
                break;

                case'(':
                System.out.println("Identifier: (, Symbols Name: LPAREN");
                break;

                case')':
                System.out.println("Identifier: ), Symbols Name: RPAREN");
                break;

                case'=':
                System.out.println("Identifier: =, Symbols Name: ASSIGN");
                break;

                case';':
                System.out.println("Identifier: ;, Symbols Name: SEMI");
                break;
                
                default:
              
                System.out.print("Identifier: "+input.charAt(x) );
                System.out.println(", Symbols Name: NUM");
            }
        }
        
    }
    
}

