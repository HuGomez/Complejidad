

package quicksort;


public class Insertion {
    Insertion(){
}
    void Insertion(int vector[]){
            int i, temp, j;
            for (i=1; i < vector.length; i++) {
                temp = vector[i];
                j = i-1;
                while (j >= 0 && vector[j] > temp) {
                    vector[j + 1] = vector[j];
                    j--;
                }
                vector[j+1] = temp;
            }
    }
}
