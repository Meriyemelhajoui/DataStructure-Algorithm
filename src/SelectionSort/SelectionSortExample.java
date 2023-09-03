package SelectionSort;

public class SelectionSortExample {

    // 8 7 5 2 10 -> 2 5 7 8 10
    // this type of sort consist of storing the min and comparing it with the other elements and then insert it (Swap)

    public static  void SelectionSort(int [] array){
        int minIndex=0;
        int temp;
        for(int i=0; i<array.length-1;i++){
            minIndex=i;
            // another Loop that will compare the other elements with the i

            for(int j=i;j<array.length;j++){
                if(array[j]<array[minIndex])
                    minIndex=j; // minIndex s update
            }
            // insertion de l element Min en utilisant une case temporaire
             temp=array[minIndex];
            array[minIndex]=array[i];
            array[i]=temp;
        }
    }


    public static void Display(int [] arr){
        for(int i=0 ; i<arr.length;i++){
            System.out.print(arr[i] +"\t");
        }
    }

    public static void main(String[] args) {
        int [] array1= {8,7,5,2,10};
        System.out.println("Le tableau avant le tri : ");
        SelectionSortExample.Display(array1);
        System.out.println();
        System.out.println("Le tableau apres le tri ");
        SelectionSortExample.SelectionSort(array1);
        SelectionSortExample.Display(array1);


    }
}
