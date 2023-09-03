package OrderedArray;



// insert O(n)
// find O(log n )
// delete O(n)
// display O(n)
public class OrderedArrayExemple {
    int Elements;
    int [] array;

    OrderedArrayExemple(int n ){
        array= new int[n];
        Elements=0;
    }




    // Find :Binary Search because the array is already Sorted
    public int Find(int value){
      int lower=0;
      int upper=Elements-1;

      while (true){
          int mid=(lower+upper)/2;
          if(value==array[mid]){
              return mid;
          } else if (lower>upper) {
            return -1;
          }else{
              if(array[mid]>value){
                  // upper Should be in the mid
                  upper=mid-1;
              }
              else {
                  lower=mid+1;
              }
          }
      }
    }






    // Method to Display the elements that are inside the array
    public void Display(){
        for(int i=0;i<Elements;i++){
            System.out.print(array[i] + "\t");
        }

    }






// Methode pour inserer un element
public boolean insert( int value )
{
    if( Elements == array.length )
        return false ;
    else
    {
        int i ;
        for ( i = 0; i < Elements ; i++) {
            if( array[i] > value )
            {
                break ;
            }
        }
        Elements++ ;
        for (int j = Elements-1 ; j > i ; j--) {
            array[j] = array[j-1] ;
        }
        array[i] = value ;
        return true ;
    }
}




    public Boolean Delete(int value){
        int i;
        for(i=0;i<Elements;i++){
            if(array[i]==value)
                break;

        }
        // si la valeur que tu veux supprimer n existe pas dans le tableau
        if(i==Elements){
            return false;
        }
        // sinn s il existe
        // switch vers la gauche
        for(int j =i ;j<Elements-1;j++){
            array[j]=array[j+1];
        }

        // Set the last element to 0 (optional)
        array[Elements - 1] = 0;

        Elements--; // Supprimer la case
        return true;
    }

// exercice //

    // method getAverage() to get the average of all numbers of array
        public float getAverage(){
        float moyenne=0;
        int somme=0;
            for (int i=0;i<Elements;i++){
                somme+=array[i];
            }

            moyenne=(float)somme/Elements; // cast somme and Elements to Float
            return moyenne;
        }

        // method to get the most frequent number in array
    public int getFrequentNumber(){
        int freq=0;
        int index=-1;
        for(int i =0; i<Elements;i++){
                int sum=0;
                int v = array[i];

               for(int j =0 ;j<Elements;j++){
                   if(array[j]==v)
                       sum++;
               }
               if(sum>freq){
                   freq=sum;
                   index=i;
               }



        }
        return array[index]; // l element le plus frequent dans le tb
    }




    public static void main(String[] args) {
        OrderedArrayExemple oe = new OrderedArrayExemple(5);
        oe.insert(1);
        oe.insert(2);
        oe.insert(3);
        oe.insert(4);
        oe.insert(5);
        oe.Display();
        oe.Delete(3);
        System.out.println();
        oe.Display();
        System.out.println();
        int index = oe.Find(5);
        System.out.println(index); // 3
        System.out.println();
        System.out.println("La moyenne des elements de ce tableau : "+ oe.getAverage());

    }





}
