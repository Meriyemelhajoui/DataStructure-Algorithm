package LinearSearch;

public class LinearSearchExemple {

    public static int linearsearch(int [] arr , int key){
        // iteration over the array//
        for(int i=0;i<arr.length;i++){
            if(key==arr[i])
                return i;
        } return -1; // if it doesnt exist
    }



    // this function returns the key iteration over an array /
    public static int linearsearchiteration(int [] arr2 , int key){
        int count=0;
        for(int i=0;i<arr2.length;i++){
            if(key==arr2[i])
                count++;
        }
        return count;
    }






    // Linear search is a search when we return the index or 'Found' of an element if it exists in the array
    public static void main(String[] args) {

        int [] array={1,2,3,4,5,8};
        int key=8;
        System.out.println("the index of the element :"+ LinearSearchExemple.linearsearch(array,key));
        System.out.println();
        int [] array2={1,1,1,1};
        int key2=1;
        System.out.println("the number of iteraion over the array with the key : "+ key2 +" is  :" + LinearSearchExemple.linearsearchiteration(array2,key2));



    }
}
