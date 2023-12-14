public class circularQueue {
    public int [] data;
    private static final int Default_Size=10;

    protected int end=0;
    protected int front = 0;
    protected int size = 0;

    public circularQueue(){
        this(Default_Size);
    }
    public circularQueue(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return size==data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        end = end%data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }

        int removed=data[front++];
        front = front %data.length;
        return removed;
    }
     public int front() throws Exception {
         if(isEmpty()){
             throw new Exception("Queue is Empty");
         }
         return data[front];
     }
     public void display() throws Exception{
         if(isEmpty()){
             throw new Exception("Queue is Empty");
         }
         int i = front;
         do{
             System.out.print(data[i]+" -->");
             i++;
             i=i%data.length;
         } while(i!= end);
         System.out.println("END");
     }

    public static void main(String[] args) throws Exception {
        circularQueue queue = new circularQueue();
        queue.insert(3);
        queue.insert(6);
        queue.insert(9);
        queue.insert(1);
        queue.insert(15);

        queue.display();

        System.out.println(queue.remove());
        queue.insert(139);
        queue.display();

    }
}
