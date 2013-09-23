/**
 * Created with IntelliJ IDEA.
 * User: sowmyahariharan
 * Date: 9/23/13
 * Time: 12:21 AM
 * To change this template use File | Settings | File Templates.
 */
public class InsertionSort {

    public static void insertionSort(int[] a){
        for(int i=0; i<a.length; ++i){
            int elementToBeSorted = a[i];
            int insertAt = i;
            while(insertAt>0 && a[insertAt-1]>elementToBeSorted){
                a[insertAt] = a[insertAt-1];
                --insertAt;
            }
            a[insertAt] = elementToBeSorted;
        }
        for(int i=0; i<a.length; ++i){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[]  args){
       int[] array = {1,2,13,3,14,5,16,7,18,9,10,20,23,21};
       insertionSort(array);
    }
}
