package InsertionSort;

public class InsertionSortExample {

    // sorting every element starting from index 1 to his left until no left is there (-1)
    // 8 7 5 3 2 -> 2 3 5 7 8

    // Min : O(1)
    // Max O(n)
    public static void InsertionSort(int [] array){
        int j;
        int x;
        for(int i=1;i<array.length;i++){
            j=i-1;
            x=array[i];

            while(j>-1 && array[j]>x){
                array[j+1]=array[j];
                j--;
            }
            // we arrived to the index -1 there is no left or the left value isn t bigger than the right
            array[j+1]=x;
        }
    }



    public static void DisplayElements(int [] array ){
        for(int i=0 ; i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
    }
    public static void main(String[] args) {

        int []  array1= {8,7,5,3,2};

        System.out.println("le tableau avant insertion : ");
        InsertionSortExample.DisplayElements(array1);
        System.out.println();
        System.out.println("le tableau apres insertion : ");
        InsertionSortExample.InsertionSort(array1);
        InsertionSortExample.DisplayElements(array1);
    }

}
