public class Factorial {
    public static void main( String [] args ){
        System.out.println(String.format("factorial de 3 es %d", factorial (3,3)));
        System.out.println(String.format("factorial de 7 es %d", factorial (7,7)));
        System.out.println(String.format("factorial de 35 es %d", factorial (35,35)));

    }

    private static long factorial(long numero, long control){
        numero = numero*(control-1);
        control-=1;
        if (control ==1 )
            return numero;
        else
                return factorial(numero,control);

    }

}

