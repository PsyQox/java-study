public class Matrices {
    //Un array multidimencional es un array de arrays. El mas comun es el bidimencional (filas y columnas)
    public static void main(String[] args) {
        //crear matriz 2D
        //Forma 1 solo tamaño
        // int[][] numeros = new int[3][4];

        //Forma 2: Con valores
        int[][] matriz2 = {
            {1,2,3}, //fila 0
            {4,5,6}, //fila 1
            {7,8,9} //fila 2
        };
        //acceder y modificar
        System.out.println(matriz2[1][1]);

        matriz2[1][1] = 100;

        System.out.println(matriz2[1][1]);

        //tamaños
        System.out.println(matriz2.length); // 2 filas
        System.out.println(matriz2[0].length); // columnas de la fila 0 
    }

}
