public class LnkdLst {
    private Node head;
    private Node tail;
    private int size;

    LnkdLst(int size){
        this.size=size;
    }
    public void insetAtFirst(int val){
        Node node = new Node(val);
        node.next = head;//put head to next value
        head=node;//put node to be the new head
        if(node==tail){
            tail=head;
        }
        size+=1;
    }
    public void insetAtLast(int val){
        if(tail==null){
            insetAtFirst(val);
            return;
        }
        Node node = new Node(val);
        node.next = tail;//put node to new next inserted value
        tail=node;//put tail to new last node
        size++;
    }
    public void inset(int value,int index){
        if(index==0){
            insetAtFirst(value);
            size++;
            return;
        }

        if(index==size){
            insetAtLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;//finding the temp place where we have to insert new element
        }
        Node node = new Node(value,temp.next);//adding new node value  &
        temp.next =node; // now node will be the next value of current added node
        size++;
    }

    public void deleteAtFirst(){
        head=head.next;
        if(head==null){
            tail = null;
        }
        size--;
    }
    public Node getIndex(int index){
        Node tempnode = head;
        for (int i = 1; i < index ; i++) {
            tempnode = tempnode.next;
        }
        return tempnode;
    }
    public void deleteAtlast(){
         Node secondlast = getIndex(size-2);
         int val = tail.value;
         tail = secondlast;
         tail.next=null;

         size--;

    }
    public void display(){
        Node temp = head;//put value of head to temp because head will not approach to null
        while(temp!=null){
            System.out.print(temp.value +" ->");
            temp=temp.next;
        }
        System.out.print("END");
    }

    public void duplicates(){
        Node node = head;
        while(node.next!=null){
            if(node.value==node.next.value){
                node.next = node.next.next;
            }
            else{
                node=node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
    public boolean hasCycle(Node head) {//to detect cycle in linkedlist
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast== slow){
                return true;
            }
        }
        return false;
    }
    public int  lengthCycle(Node head) {//to detect length cycle in linkedlist
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast== slow){
                int l=0;
                do{
                    slow= slow.next;
                    l++;
                }while (fast!=slow);
                return l;
            }
        }
        return 0;
    }
    public Node startCycle(Node head){
        int length=0;
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast== slow){
                length = lengthCycle(slow);
                break;
            }
        }
        if (length==0){
            return null;
        }
        // now move s length times
        Node s = head;
        Node f = head;
        while(length>0){
            s= s.next;
            length--;
        }

        while (f!=s){
            s=s.next;
            f= f.next;
        }
        return s;
    }
    private class Node{
        private int value;
        private  Node next;

        public Node(int value){
            this.value =value;
        }
        public Node(int value,Node next){
            this.value =value;
            this.next=next;
        }


    }
}
