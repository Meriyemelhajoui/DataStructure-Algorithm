package PriorityQueue;


// a Priority Queue is a queue that follows some order (Ascending order / Descending Order ) not the FIFO
//Priority queue stored objects that are comparable to arrange them in correct Priorities
// which means every element will have a priority
//Ascending order -> Elements that have a high priority will be served first
// if two elements have the same Priority , they will be served According to their order
// Time Complexity : 
    // Enqueue O(n) -> the worst case we need to loop over the elements to shift them and make room for the new element 
    // Dequeue O(n) -> the worst case we need to search through all elements to find the highest 

public class PriorityQueueExample {
    // in this example we will work with the Descending Order which means from the Greater Number to the Lower one
    // The numbers will be inserted in a descending order from the Front and removed from the Front also 9 8 7 6 0

    private int [] array;
    private int maxSize;
    private int Front;

    PriorityQueueExample(int n ){
        this.maxSize=n;
        this.array= new int[maxSize];
        this.Front=-1;
    }



    // Function to check if the Queue is Empty or not
    public Boolean isEmpty(){
        return (Front==-1);
    }

    // Function to check if the Queue is full or not
    public Boolean isFull(){
        return (Front==maxSize-1);
    }

    // function that insert an element based on his priority
    public void Enqueue(int value) {
        if (isFull()) {
            System.out.println("The queue is Full, You can't add an element!");
        } else {
            int i;
            if (isEmpty()) {
                Front = 0;
                array[Front] = value;
            } else {
                // Find the appropriate position for the new element based on its priority
                for (i = Front; i >= 0; i--) {
                    if (value > array[i]) { // Shift to the right
                        array[i + 1] = array[i];
                    } else {
                        break;
                    }
                }
                array[i + 1] = value;
                Front++;
            }
        }
    }



    public int Dequeue() {
        if (isEmpty()) {
            System.out.println("La file de priorité est vide. Rien à retirer !");
            return -1; // Retournez une valeur sentinelle pour indiquer une file vide
        } else {
            int removedValue = array[0];
            System.out.println("La valeur de Front est : "+ Front);
            // Décalage des éléments restants vers le haut pour remplir l'emplacement retiré
            for (int i = 0; i <Front; i++) {
                array[i] = array[i + 1];
            }
            Front--; // Réduisez la position du front
            return removedValue;
        }
    }




    // function that show the Queue

    public void Afficher() {
        if (isEmpty()) {
            System.out.println("La file de priorité est vide. Rien à afficher !");
        } else {
            for (int i = 0; i <= Front; i++) {
                System.out.print(array[i] + "\t");
            }
            System.out.println(); // Ajoutez un saut de ligne après l'affichage de la file.
        }
    }


    public static void main(String[] args) {

        PriorityQueueExample array = new PriorityQueueExample(5);
        array.Enqueue(9);
        array.Enqueue(4);
        array.Enqueue(5);
        array.Enqueue(3);
        array.Afficher();
        System.out.println(array.Dequeue());
        array.Afficher();
        array.Dequeue();
        array.Afficher();





    }
}

