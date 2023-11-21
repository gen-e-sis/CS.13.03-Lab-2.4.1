import java.util.LinkedList;

public class CISStack {

    // Linked list property.
    public LinkedList<Integer> linkedList;

    // Size property.
    private int size;

    // Constructor.
    public CISStack()
    {
        linkedList = new LinkedList<>();
        size = 0;
    }

    // Push. This method pushes a value onto the top of the stack.
    public void push(int element)
    {
        linkedList.add(element);
        size ++;
    }

    // Pop. This method pops a value from the top of the stack.
    public int pop()
    {
        int temp = 0;
        if (size > 0)
        {
            temp = linkedList.getLast();
            linkedList.remove(linkedList.getLast());
            size --;
        }
        return temp;
    }

    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty()
    {
        if (size == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // size. Returns the size of the queue.
    public int size()
    {
        return size;
    }

    // toString. Returns a description of the queue in, for example, the following format:
    // CISStack{stack=[7, 11], size=2}


    @Override
    public String toString() {
        return "CISStack{" +
                "stack=" + linkedList +
                ", size=" + size +
                '}';
    }
}
