class LL_insert{
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    //Print the linked list
    public void print() {
        Node n = head;
        while(n!=null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println("");
    }

    public void add_in_front(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public void add_in_after(Node prev_node, int data){
        if(prev_node == null){
            System.out.print("The prev node cannot be null.");
            return;
        }
        
        Node new_node = new Node(data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    public static void main(String[] args) {
        LL_insert LL = new LL_insert();
        LL.add_in_front(1);
        LL.add_in_front(2);
        LL.add_in_after(LL.head.next, 3);
        LL.add_in_after(LL.head.next.next, 4);

        LL.print();
    }
}