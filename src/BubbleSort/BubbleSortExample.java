package BubbleSort;

public class BubbleSortExample {
    // 8 5 7 3 2 : 5 elements to be sorted using Bubble sort 2 3 5 7 8
    // Min O(n) : if the array was already sorted
    // Max O(n carre)

    public static void BubbleSort(int [] array){
        int flag;
        int temp;
        for(int i=0; i<array.length-1;i++){
            flag=0;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0) break;
        }
    }


    public static void DisplayArray(int [] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ "\t ");
        }
    }


    public static void main(String[] args) {
      int [] arra1={8,5,7,3,2};
        System.out.print("le tableau avant le tri : ");
        BubbleSortExample.DisplayArray(arra1);
        System.out.println();
        System.out.print("Le tableau apres le tri : ");
      BubbleSortExample.BubbleSort(arra1);
      BubbleSortExample.DisplayArray(arra1);




    }

}
