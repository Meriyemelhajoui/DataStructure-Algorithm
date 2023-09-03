package BinarySearch;

public class BinarySearchExemple {

    // O(log n)

    public static int BinarySearch(int [] arr , int key){
        int lower=0;
        int upper=arr.length-1; // the index of the last element
        int index=0;

        while(true){
            index=(lower+upper)/2;
            if(key==arr[index]) // Milieu
            {
                return index;
            } else if (lower>upper) {
                return -1; // to stop the program if the element doesnt exist in the array

            } else if(key>arr[index]) // Mileu>
             {
                lower=index+1;

            }else if(key<arr[index]){
               upper=index-1;
            }



    }}

    // the binary search : when we search for an element in a sorted array , by comparing the Half of the array with the element that we want to get then we determine if this element is on the Big half (Moite+) or in the other element(Moite-)
    public static void main(String[] args) {
        int [] array1={1,2,3,4,5,6,7,8,9,10};// Sorted Array
        int key=0;
        System.out.println("The index of this element in the array is : "+BinarySearch(array1,key));


    }
}
// Binary search VS Linear search
//Linear search O(n) used for unordered and unsorted data , when the numbers of data is small

//Binary search O(log n) used when we have an ordered and sorted data it s faster than the linear search

