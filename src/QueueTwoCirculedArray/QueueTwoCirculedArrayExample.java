package QueueTwoCirculedArray;


// we can have an array using the Queue data Structure : 1 2 3 4 5
// we remove the 1 , 2, 3 so there is on the array 4 5 if you want to insert a new element You can t Because the Tail is equal to the MaxSize-1 (the last case in the array) even if the 3 first cases are free we can t insert new elements
// that s why we can modify our previous code so we can have a Circular Array

public class QueueTwoCirculedArrayExample {
    private int [] CircularArray;
    private int maxSize;
    private int Front ;
    private int Tail;

    QueueTwoCirculedArrayExample(int n ){
        this.maxSize=n;
        this.CircularArray= new int [maxSize];
        this.Tail=-1;
        this.Front=-1;
    }

    // fonction qui verifie si Queue est vide ou nn
    public Boolean isEmpty(){
      return (Tail==-1&& Front==-1);
    }



    // function qui insere un element dans Queue
    public void Enqueue (int v){
       if(isEmpty()){
           Tail=Front=0;
           CircularArray[Tail]=v;
       } else if ( (Tail+1)%maxSize==Front)  // The queue is Full which means the tail and front have the same Index
       {
           System.out.println("The Queue is Full you can't insert anymore ! ");
       }else{
           // we will not incremente the tail by one because we want a circular array
           Tail=(Tail+1)%maxSize;
           CircularArray[Tail]=v;
       }
    }


    // function that remove the element from the Front of the queue

    public void  Dequeue(){
        if(isEmpty()){
            System.out.println("The queue is Empty ! nothing to Dequeue");

        } else if (Tail==Front) // Left only one element in the queue so after removing it the queue should will be empty again
        {
            System.out.println("The Element that will be removed from the Queue : "+ CircularArray[Front]);
            Tail=Front=-1;

        }else{
            // we will not incremente the Front by 1 because we want

            System.out.println("The Element that will be removed from the Queue  :"+CircularArray[Front]);
            Front=(Front+1)%maxSize;


        }
    }

    // function that Shows the element of the array . There is two cases when the Front is smaller that the Tail and the Tail is smaller than the Front
    public void Afficher(){
        if(isEmpty()){
            System.out.println("The Queue is Empty ! Nothing to Show ");
            return;
        }
        if(Front<=Tail){
            for(int i=Front;i<=Tail;i++){
                System.out.println(CircularArray[i]);
            }
        }else{
            for(int i=Front;i<maxSize;i++){
                System.out.println(CircularArray[i]);
            }

            for(int i=0;i<=Tail;i++){
                System.out.println(CircularArray[i]);
            }
        }
    }





    public static void main(String[] args) {
        QueueTwoCirculedArrayExample CirculedArray= new QueueTwoCirculedArrayExample(5);
        CirculedArray.Enqueue(1);
        CirculedArray.Enqueue(2);
        CirculedArray.Enqueue(3);
        CirculedArray.Enqueue(4);
        CirculedArray.Enqueue(5);
        CirculedArray.Afficher();
        CirculedArray.Dequeue();
        CirculedArray.Dequeue();
        CirculedArray.Dequeue();


        CirculedArray.Afficher();
        System.out.println("Now we will insert to the Cicular array queue , it will be 4 5 6 7 8  ");
        CirculedArray.Enqueue(6);
        CirculedArray.Enqueue(7);
        CirculedArray.Enqueue(8);
        CirculedArray.Afficher();

    }









}
