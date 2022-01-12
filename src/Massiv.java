import java.util.Random;

public class Massiv {

        public static void main (String[] args){

           /* int [] array = new int [10];
            for (int i =0; i<array.length; i++){
                array [i] = new Random().nextInt(20);
                System.out.print(array[i]+" ");
            }
            System.out.println();

          /* for (int i = 0; i<array.length; i++) {
               for (int j = array.length - 1; j > i; j--) {
                   if (array[j - 1] > array[j]) {
                       int x = array[j - 1];
                       array[j - 1] = array[j];
                       array[j] = x;

                   }
               }
               System.out.print(array[i]+" ");
           }
            System.out.println();
            for (int i = array.length-1; i>=0; i--){
                for ( int j =0; j<i; j++ ){
                    if ( array[j] > array[j+1] ) {
                        int x=array[j];
                        array[j]=array[j+1];
                        array[j+1]=x;

                    }
                }
                System.out.print(array[i]+" ");*/

            // сортировка пузырьком
               /* for (int i = 0; i<array.length-1; i++) {
                    for (int j = i+1; j < array.length; j++) {
                        if (array[i] > array[j]) {
                            int x = array[i];
                            array[i] = array[j];
                            array[j] = x;
                        }
                    }
                                    }
            for (int i = 0; i<array.length; i++) {
            System.out.print(array[i]+" ");}
            */
            // найти разницу сумм диагоналей матрицы 5х5

            int [][] array2 = new int [5][5];
            for (int a =0; a<array2.length; a++){
                for (int b = 0; b<array2[a].length; b++){
                    array2[a][b]= new Random().nextInt(20);
                    System.out.print(array2[a][b]+" ");
                }
                System.out.println();
            }
            int sum=0;
            int sum2=0;
            for (int a =0; a<array2.length; a++) {
                for (int b = 0; b < array2[a].length; b++) {
                    if (a == b) {
                        sum = sum + array2[a][b];
                    }
                    if (b == (array2.length - 1 - a)) {
                        sum2 = sum2 + array2[a][b];
                    }
                }
            }
            System.out.println( sum);
            System.out.println(sum2);
            System.out.println(sum-sum2);

}}
