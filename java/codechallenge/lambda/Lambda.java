package lambda;

import java.net.SocketOption;

public class Lambda {

    public static void main (String a []){

        //Nombre de la interfaz   identificador_delObjeto   argumentos   flecha_lambda   cuerpo de la función
        Pares par = (int numero) -> {
            return numero%2==0;
        };
        //Para llamar a ese método se llamará objeto.NombreDeLaFuncionEnLaInterfaz
        System.out.println(par.esPar(44));



        Primos primo = (float numero) -> {
            if (numero == 2 || numero == 3)
                    return true;
            return numero%2!=0 && numero%3!=0;
        };
        System.out.println(primo.esPrimo(98));


        Palindromos palindromo = (String txt) -> {
            return txt.equals( new StringBuilder(txt).reverse().toString());
        };
        System.out.println(palindromo.esPalindromo("reconocer"));
    }
}
