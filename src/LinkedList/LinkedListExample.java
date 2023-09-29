package LinkedList;

// Linked list is another type of data Structure where we work with Nodes
// Node is composed of : a value and reference to the next node
//  + of Linked list : Dynamic Size when you dont know in advance or the size can be changed after
                     // No contiguous Memory requirement needed : use fragmented memory # arrays
                    // Easy insertion /Deletion : there is no need to shift only change the address of the next node
//  - of LinkedList : Memory is wasted because we store not only values but also Pointers (extra memeory)
                    // Access sequentially : we cannot access directly to a node we have to traverse from the first node to the desired node  # array we can access directly throw the Index
                    // Reverse Traversing is difficult : Traverse the linked list from the last node to the first one .. # arrays we can easily start from the last case in the array by decrememting --



public class LinkedListExample {



    class Node {
        private int value;
        private Node next;

        Node(int v) {
            this.value = v;
            this.next = null;
        }
    }

         private Node Head ;



        public LinkedListExample(){
            this.Head=null; // in the first time the head is Pointing to null
        }

      public void Append(int v){
            // Creation de noeud qui sera insere
          Node newNode= new Node(1);
          // if the LinkedList was emptyy
          if(Head==null){
              Head = newNode;
          }else{
              // on doit parcourir la liste entiere pour arriver au dernier noeud et inserer le nv element
              // on va creer un noeud temporaire qui pointe sur Head
              Node current = Head;
              while(current.next!=null) // tant qu'on a pas arrive au dernier noeud
              {
                  current=current.next;
              }

              // on est arrive au dernier noeud on doit inserer le nv noeud
              current.next=newNode;
          }}

          // methode d'ffichage de notre liste chaine
          public void Display(){
              Node current = Head;
              while(current!=null){
                  System.out.println(current.value+"\t");
                  current=current.next;
              }
          }

    public static void main(String[] args) {
        LinkedListExample linkedList = new LinkedListExample();
        linkedList.Append(1);
        linkedList.Append(2);
        linkedList.Append(3);
        linkedList.Append(4);
        linkedList.Append(5);
        linkedList.Display();
    }












}

