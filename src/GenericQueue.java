import java.util.LinkedList;

public class GenericQueue<E> {
    private LinkedList<E> element;

    public GenericQueue() {
        element=  new LinkedList<>();
    }

    public void enqueue(E e){
        element.add(e);
    }
    public E dequeue(){
        return element.removeFirst();
    }
    public int getSize(){
        return element.size();
    }
    public boolean isEmpty(){
        return element.size() == 0;
    }
    public E get(int i){
        return element.get(i);
    }
}
