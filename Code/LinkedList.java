public class LinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

        public static Node head;
        public static Node tail;
        public static int sizeOfLL;



        public void addFirst(int data){
            sizeOfLL++;
            //Step 1 - Creating a new node
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
                return;
            }

            //Step 2 - Assinging head value to next of newnode
            newNode.next = head;

            //Step 3 - Assinging new node as head
            head = newNode;

        }


        public void addLast(int data){
            sizeOfLL++;
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public void printLL(){
            Node temp = head;

            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        public void addInMiddle(int idx,int data){
            if (idx == 0) {
                addFirst(data);
                return;
            }
            sizeOfLL++;
            //Creating a new node to insert
            Node newNode = new Node(data);

            //Creating one temp node to traverse
            Node temp = head;
            
            //Defining i to iterate
            int i = 0;

            while (i < idx-1) {
                temp = temp.next;
                i++;    
            }

            newNode.next = temp.next;
            temp.next = newNode;
        }


        public int removeFirst(){
            //Case 1 - if empty ll
            if (sizeOfLL == 0) {
                System.out.println("Empty");
                return Integer.MIN_VALUE;
            }
            //Case 2 - if only 1 node
            else if (sizeOfLL == 1) {
                int val = head.data;
                head = tail = null;
                sizeOfLL = 0;
                return val;
            }
            
            sizeOfLL--;
            //Case 3 - more than 1 nodes
            int val = head.data;
            head = head.next;//for removing this is the only statement necessary
            return val;//this will simply going to store the node data which we are going to remove
        }

        public int iterativeSearch(int key){
            Node temp = head;
            int i = 0;
            while(temp != null){
                if(temp.data == key){
                    return i;
                }
                temp = temp.next;
                i++;
            }
            return -1;
        }


    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addInMiddle(2, 3);
        System.out.println("Key is at index : " + ll.iterativeSearch(4));

        ll.printLL();
        // System.out.println("Size is : " + sizeOfLL);
        // System.out.println();


        // System.out.println(ll.removeFirst() + " is Removed");
        // ll.printLL();
        // System.out.println("Size is : " + sizeOfLL);
    }
}
