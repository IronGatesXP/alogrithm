package chapter_2;

/**
 * @author XP
 * @date 2018/8/14 22:16
 */
public class Node<T> {
    private T value;
    private Node<T> next;
    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public void setNext(Node<T> node){
        this.next = node;
    }

    public Node<T> getNext(){
        return next;
    }
}
