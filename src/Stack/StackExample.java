package Stack;

public class StackExample {
    // Stack is another Type of Linear Data Structure like arrays (1D) and Linked List / Queue/ Vector ..
    // Stack follows LIFO (Last In First Out) ->In :  1 2 3 4 5 -> Out : 5 4 3 2 1
    // If u want to add an element on the Top you use the Push() function
    // If u want to remove  an element FROM the Top you use the Pop() function
    // They are other functions : isEmpty() to see if the stack is empty or Not / count() to count the number of element of a stack
    // Peek() to see the top element in a stack without removing the element or modifying the Stack
    // a Stack can be implementing using array or LinkedList but preferably using LinkedList because array have a Fixed size so u can have a Stack OverFlow
    // example of Using Stack : Historique d un navigateur / page suivante/precedante
    // push / pop O (n) 
    // Stack using Array
    private int index;
    private int [] arrayStack;
    private int maxSize;
    StackExample(int n ){
        this.maxSize=n;
        this.arrayStack= new int[maxSize]; // Definir la taille de tableau
        index=-1;
    }

    // fonction d ajout d un element en TOP
   public void push(int v){
        if(index>=maxSize){
            System.out.println("Stack is Full , You can't push ! ");

        }else{
            arrayStack[++index]=v; // la taille de array est incremente de 1 -> then insertion de la valeur
        }

   }

   // fonction de Suppression de l element de Top
    public int  Pop(){
        if(index>-1){
            // Tu peux Supprimer l element
            return arrayStack[index--]; // retourner le dernier element apres suppression de TOP
        }else{
            System.out.println("Stack is Empty , Nothing to pop !");
            return -1;
        }

    }

    // fonction qui retourne le top sans modifier Stack
    public int Peek(){
        if(index>-1){
            return arrayStack[index];
        }else{
            System.out.println("Stack is Empty , Nothing to peek ! ");
            return -1;
        }

    }

    //fonction d'affichage//
    public void AfficherStack(){
        for(int i=0;i<=index;i++){
            System.out.print(arrayStack[i]);
        }
    }


    //function that verify if the Stack is Empty
    public Boolean isEmpty(){
       return index==-1;
    }





    public static void main(String[] args) {
    StackExample stack= new StackExample(5);
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    stack.push(5);
        System.out.println(" L element qui se trouve dans le sommet est : "+ stack.Peek());
        System.out.println();
        stack.Pop();
        System.out.println(stack.Peek());
       //stack.AfficherStack();
        stack.AfficherStack();
<<<<<<< HEAD
        System.out.println();
        System.out.println("///////////////////////////////////////////");
        // Training : Create a funtion that reverse a String : ISMAEL -> LEAMSI
=======

   // Training : Create a funtion that reverse a String : ISMAEL -> LEAMSI
>>>>>>> 916078f69f83cbe3d2525b88b1a8cc00ecbbcc3d

        String word="ISMAEL";
        StackExample stack2= new StackExample(word.length());



        for(int i=0;i< word.length(); i++){
            // Push the characters into the Stack
            stack2.push( (int) word.charAt(i)); // cast char to int (Code ASCI)
        }

        System.out.println("La chaine de caractere avant reversion : "+word);
        // Printing the string reversed
        System.out.print("La chaine de caractere apres reversion : ");
        while(!stack2.isEmpty()){
            System.out.print((char)stack2.Pop());
        }
<<<<<<< HEAD
=======
    }      
>>>>>>> 916078f69f83cbe3d2525b88b1a8cc00ecbbcc3d
    }

}
