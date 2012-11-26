package quicksort;
public class Main {
    public static void main(String[] args) {
                int max=15500000;
                int[]arr=new int[max];
                int i=0;
                for(i=0; i<max; i++){
                     arr[i]=(int)Math.round((Math.random()*1000000));
                     //System.out.println(arr[i]);
                    }
                long tiempoInicio = System.currentTimeMillis();

                //Quicksort t=new Quicksort();
                //t.sort(arr);
                
              /*  Burbuja b=new Burbuja();
                b.Burbuja(arr,max);*/

               /*Insertion in=new Insertion();
               in.Insertion(arr);*/

               Counting co=new Counting();
                co.Counting(arr, 0, max);

               /* Heap h=new Heap();
                h.Heap(arr, max);*/
                
                long totalTiempo = System.currentTimeMillis() - tiempoInicio;
                System.out.println("El tiempo total de la ejecución es :" + totalTiempo + " miliseg");

                /*for(i=0; i<max; i++){
                       System.out.println(arr[i]);
                   }*/
    }

}
