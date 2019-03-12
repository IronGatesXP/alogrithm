package chapter_2;

/**
 * @author XP
 * @date 2018/8/14 22:28
 */
public class Code1_3_29_CircleQueue <Item> {
    private Node<Item> first;
    private Node<Item> last;
    private int N;

    public Code1_3_29_CircleQueue(){

    }

    public boolean isEmpty(){
        return N == 0;
    }

    public void enqueue(Item item){
        Node<Item> temp = new Node<>();
        temp.setValue(item);
        temp.setNext(first);
        if(isEmpty()){
            first = temp;
        }
        last.setNext(temp);
        last = temp;
        N++;
    }

    public Node<Item> dequeue(){
    return null;
    }
}
