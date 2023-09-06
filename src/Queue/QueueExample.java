package Queue;
// Queue is another data type structure (Linear) follows the FIFO : First In First Out
// Front / Tail

public class QueueExample {


    private int array[];
    private int maxSize;
    private int Front ;
    private int Tail;

    QueueExample(int n){
        this.maxSize=n;
        this.array= new int[maxSize];
        this.Front=-1;
        this.Tail=-1;
    }


    // add an element to the Queue
    public void Enqueue(int value){
        // if the Queue is Full
        if(isFull()){
            System.out.println("The queue is Full , You can t add an element !");
        }else if(isEmpty()){
            Front=Tail=0;
            array[Tail]=value;// Always We insert element from the Tail and we remove it from the Front
        }else// the Queue is not empty and is not full there is elements
        {
            array[++Tail]=value;
        }
    }






    // Check if the Queue is Empty or not
    public Boolean isEmpty(){
        return (Front==-1 && Tail==-1);
    }


    // Check if the Queue is Full or Not
    public Boolean isFull(){
        return (Tail>=maxSize-1);
    }

    // Pop an element (from the head always in the queue fifo)
    public int Dequeue(){
        if(isEmpty()){
            System.out.println("The queue is Empty ! Nothing to remove ");
            return -1;
        } else if (Front==Tail) // There is only one element on the queue so both front and tail index to the same case
        {
            System.out.println("The first element on the queue that will be removed is : "+ array[Front]);
            Front=Tail=-1; // The queue will be Empty after removing the unique element
            return -1;
        }else{
            System.out.println("The first element on the queue that will be removed is : "+ array[Front]);
            return array[Front++];
        }
    }

    // fonction d affichage
    public void AfficherQueue(){
        for(int i = Front; i<=Tail;i++){
            System.out.print(array[i]+"\t");
        }
    }












    public static void main(String[] args) {
        QueueExample arrayQueue= new QueueExample(5);
        System.out.println(arrayQueue.isEmpty());
        arrayQueue.Enqueue(1);
        arrayQueue.Enqueue(2);
        arrayQueue.Enqueue(3);
        arrayQueue.Enqueue(4);
        arrayQueue.Enqueue(5);
        arrayQueue.AfficherQueue();
        System.out.println();
        System.out.println(arrayQueue.isFull());
        arrayQueue.Dequeue();
        arrayQueue.AfficherQueue();




    }
}