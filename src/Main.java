public class Main {
    public static void main(String[] args)
    {
        //Definimos un array con 10 posiciones
        int array1[]=new int [10];
        array1[0]=3;

        //El array no esta creado, con null indicamos que no apunta a nada.
        int array2[]=null;

        //copiamos la referencia, array1 y array2 apuntan al mismo array
        array2=array1;

        //Creamos una nueva referencia, array apunta a un array diferente no al que hemos creado al principio
        array1=new int[20];

        //array2 es el unico que apunta al primer array creado, podemos acceder a su contendo
        System.out.println("El primer valor del array2 es "+array2[0]);

        //Ahora, array1 tiene otro valor que el asignado despues de crearlo
        System.out.println("El primer valor del array1 es "+array1[0]);
    }
}