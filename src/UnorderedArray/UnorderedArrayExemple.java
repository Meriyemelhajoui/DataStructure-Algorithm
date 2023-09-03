package UnorderedArray;

public class UnorderedArrayExemple {
    // delete O(n)
    // insert O(1)
    // find O(n)

    private int[] array;
    private int elements;

    // contructor
    public UnorderedArrayExemple(int n) {
        array = new int[n];
        elements = 0;
    }


    public int find(int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i])
                return i;
        }
        return -1;
    }


    public boolean delete(int value) {
        if (elements == 0) {
            return false;
        } else {
            int indexofelement = find(value);

            // deplacer les elements vers la gauche
            for (int i = indexofelement+1; i < elements; i++) {
                array[i - 1] = array[i];

            }

            elements--; // reduire la taille de tableau
            return true;
        }
    }


    public boolean insert(int value) {
        if (elements == array.length)
            return false;
        else {
            array[elements++] = value;
            return true;
        }
    }

    // function that insert an element by index then Shift the elements(to the right) of the array //
    public Boolean InsertByIndex(int index, int value) {
        if (index <= -1 || index > array.length) {
            return false;
        } else {
            elements++; // Augmenter la taille de tb
            // Shift and insert
            for (int i = elements-1; i >= index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
            return true;
        }
    }

    // function that Display the elements of the array //
    public void display() {
        System.out.print("Array : ");
        for (int i = 0; i < elements; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }


    // function that delelte an element by his index and then shift the other elements
    public boolean dDeleteByIndex( int ind )
    {
        if( ind >= array.length || ind < 0 )
            return false ;
        else
        {
            for (int i = ind ; i < elements-1 ; i++) {
                array[i] = array[i+1] ;
            }
            array[elements-1] = 0 ;
            elements-- ;
            return true ;
        }
    }












    public static void main(String[] args) {

        UnorderedArrayExemple ua = new UnorderedArrayExemple(7);
        ua.insert(3);
        ua.insert(5);
        ua.insert(8);
        ua.insert(4);
        ua.insert(11);
        ua.insert(33);
        ua.insert(1);
        ua.display();
    ua.delete(5);
      ua.display();

        ua.InsertByIndex(2, 100);
        ua.display();

        ua.dDeleteByIndex(1);
        ua.display();

//        ua.delete(1);
//        ua.delete(33);




    }
}
