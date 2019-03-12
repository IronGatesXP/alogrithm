package chapter_2;

/**
 * @author XP
 * @date 2018/8/14 17:36
 */
public class Code_1_3_14<T> {
    private int front;
    private int rear;
    private int count;
    private int maxSize;
    private T[] queue;

    public Code_1_3_14(){
        this.count = 0;
        this.front = 0;
        this.rear = 0;
        maxSize = 10;
        // 泛型不能够直接创建数组
        queue = (T[]) new Object[maxSize];
    }

    public Code_1_3_14(int maxSize){
        this.count = 0;
        this.front = 0;
        this.rear = 0;
        this.maxSize = maxSize;
        queue = (T[]) new Object[maxSize];
    }

    public  boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == maxSize;
    }

    private void resize(int length){
        int oldMaxSize = maxSize;
        maxSize = length;
        T[] temp = (T[]) new Object[maxSize];
        int j = 0;
        for(int i=front;i<(front+count);i++){
            temp[j++] = queue[i%oldMaxSize];
        }
        queue = temp;
        front = 0;
        rear = count;
    }

    public void enqueue(T item){
        if(isFull()){
            resize(maxSize*2);
        }
        queue[rear] = item;
        rear = (rear + 1) % maxSize;
        count++;
    }

    public T dequeue(){
        if(count == maxSize/4 && maxSize > 5){
            resize(maxSize/2);
        }
        T t;
        if(!isEmpty()) {
            t = queue[front];
            front = (front + 1) % maxSize;
            count--;
        }else{
            System.out.println("队列已空");
            t = null;
        }
        return t;
    }

    public T getFront(){
        T t;
        if(!isEmpty()){
            t = queue[front];
        }else{
            System.out.println("队列已空");
            t = null;
        }
        return t;
    }

    public String toString(){
        String s ="";
        for(int i=front;i<front+count;i++){
            s += queue[i%maxSize];
        }
        s += " maxSize is :" + maxSize;
        return s;
    }
}
