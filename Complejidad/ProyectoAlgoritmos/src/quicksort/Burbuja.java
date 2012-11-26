

package quicksort;


public class Burbuja {

    Burbuja(){

    }

     void Burbuja(int x[], int n){
     int temp;

            for(int i=0;i<n-1;i++){
                for(int j=i;j<n-1;j++){
                    if(x[i]>x[j+1]){
                        temp=x[i];
                        x[i]=x[j+1];
                        x[j+1]=temp;
                     }
                }
            }
    }
}
