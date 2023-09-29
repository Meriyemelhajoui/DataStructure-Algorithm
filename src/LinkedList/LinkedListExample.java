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



        // O(n)
      public void Append(int v){
            // Creation de noeud qui sera insere
          Node newNode= new Node(v);
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

    //O(n)
          // methode d'ffichage de notre liste chaine
          public void Display(){
              Node current = Head;
              while(current!=null){
                  System.out.println(current.value+"\t");
                  current=current.next;
              }
          }


          // Search for a value in a node if it exists
    //O(n)

        public Node FindValue(int i){
            // placer un noeud temporaire sur le Head
            Node current = Head;
            while(current.value!=i){
                // tant qu'on a pas trouver la valeur recherche
                // si on a arrive a la fin de liste chaine sans trouve la valeur recherche
                if(current.next==null)

                    return null;



                current=current.next;
            }

            // retourner le noeud ayant la valeur recherche
            System.out.println("La valeur "+ i +" que tu cherches se trouve dans la liste ");
            return current;
        }

        // function to delete un noeud with the givin value o(N)
    public Node DeleteByValue(int i ){
            // if the linked list was empty
        if(Head==null){
            return null;
        }
            // if the givven value was in the first node
        if(Head.value==i){
            return Head;
        }
        // the given value isn t on the head , we should loop over the linked list
        // creation of two nodes : current and the previous , so the current will be pointing to the node where the givven value exists else null , and the previous will point to the next element after deleting the node with the givven value
        Node current=Head;
        Node previous=null;
        while(current!=null && current.value!=i){
            // if we reach out the end of the list and no node with the value was found we return
            if(current==null)
                return null;


            previous=current;
            current=current.next;

        }

        // delete the node with the given value
        previous.next=current.next;
        return current;
    }



    // fonction pour inserer apres un noeud specifique O(n)
    public Boolean InsertAfter(int key , int v) {
        // Creation of the new node that will be created with the given value
        Node node = new Node(v);
        // if the LinkedList is empty
        if (Head == null) {
            Head = node;
            return true;
        }
        Node current = Head;
        while (current != null ) {
            if(current.value==key){
                // insert the new node after the node with the givven key
                node.next=current.next;
                current.next=node;
                return true; //node inserted Successfully
            }
            current=current.next; // to the next node to see if he has the key that we want
        }
        // we reach it out the list the key doesn t exist
        return false;
        }
    ///





    public static void main(String[] args) {
        LinkedListExample linkedList = new LinkedListExample();
        linkedList.Append(1);
        linkedList.Append(2);
        linkedList.Append(3);
        linkedList.Append(4);
        linkedList.Append(5);
        linkedList.Display();
        System.out.println("////// Search /////");
        Node n=linkedList.FindValue(10);
        if(n==null){
            //cad que aucun noeud existe avec la valeur recherche
            System.out.println("Not found");

        }else{
            System.out.println(n.value);
        }

        System.out.println("/////// deletion////");
        Node nn = linkedList.DeleteByValue(4);
        if(nn==null){
            System.out.println("This value that You want to delete doesn't exist in the Linked List");
        }else{
            System.out.println("It has been deleted ");
        }

        linkedList.Display();
        System.out.println("//////// Insert after ");

        Boolean response=linkedList.InsertAfter(3,10);
        if(response==true){
            System.out.println("The insertion after the given key was done ");
        }else
            System.out.println("The insertion after the given key wasn't done ");

        linkedList.Display();


    }















}

