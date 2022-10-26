/**
 * MergeSort
 */
public class MergeSort {

    public void MergeSort(int [] A,int p, int r){
        if (p < r){
            int q = (p+r)/2;
            MergeSort(A,p,q);
            MergeSort(A,q+1,r);
            Merge(A,p,q,r);
        }
    }
    public void Merge(int [] A,int p,int q,int r){
        int i;
        i = p;
        int j = q+1;

        while (i<=q && j<=r){
            if (A[i] < A[j]){
                i++;
            }else{
                int temp = A[j];
                for (int m = j; m > i; m--){
                    A[m] = A[m-1];
                }
                A[i] = temp;
                i++;
                j++;
                q++;
            }
        }
    }
    public static void main(String[] args) {
        int [] A = {1,3,5,7,9,2,4,6,8,10};
        MergeSort mergeSort = new MergeSort();
        mergeSort.MergeSort(A,0,A.length-1);
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}