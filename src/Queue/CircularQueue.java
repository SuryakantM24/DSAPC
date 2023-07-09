package Queue;

public class CircularQueue {

    private int[] data;
    private int front;
    private int rear;
    private int size=0;

    public CircularQueue(int k){
        data=new int[k];
        front=-1;
        rear=-1;

    }

    public void enqueue(int val) throws queuefullException {


        if(size==0){
            front=0;
        }
        if(size==data.length){
            throw new queuefullException() ;
        }

        rear=(rear+1)% data.length;

        data[rear]=val;
        size++;

    }

    public int dequeue(){
        if(size==0){
            return -1;
        }

        front=(front+1)%front;

        int temp=data[front];
        size--;
        if(size==0){
            front=-1;
            rear=-1;
        }
        return temp;
    }

    public int size(){


        return size;

    }

    public boolean isEmpty(){

        return size==0;

    }

    public int Front(){

        if(size==0){
            return -1;

        }
        return  data[front];
    }
}
