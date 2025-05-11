package chap04;

public class IntQueue {

    private int max;    // queue size
    private int front;  // first element cursor
    private int rear;   // last element cursor
    private int num;    // number of elements
    private int[] que;  // queue array

    // Exception: Queue is empty
    public class EmptyIntQueueExeption extends RuntimeException {
        public EmptyIntQueueExeption() { }
    }

    // Exception: Queue is full
    public class overflowIntQueueException extends RuntimeException {
        public overflowIntQueueException() { }
    }

    public IntQueue(int capacity) { 
        num = front = rear = 0;
        max = capacity;
        try {
            que = new int[max];     // create queue
        } 
        catch (OutOfMemoryError e) {// queue creation failed
            max = 0;
        }
    }

    public int enque(int x) throws overflowIntQueueException {
        if (num >= max)
            throw new overflowIntQueueException(); // queue is full
        
        que[rear++] = x;
        num++;

        if (rear == max)
            rear = 0; // wrap around
        return x;
    }

    public int deque() throws EmptyIntQueueExeption {
        if (num <= 0)
            throw new EmptyIntQueueExeption(); // queue is empty

        int x = que[front++];
        num--;

        if (front == max)
            front = 0;
        return x;
    }

    public int peek() throws EmptyIntQueueExeption {
        if (num <= 0)
            throw new EmptyIntQueueExeption(); // queue is empty
        return que[front];
    }

    public int indexOf(int x) {
        for (int i=0; i<num; i++) {
            int idx = (i + front) % max;
            if (que[idx] == x)  // search for x
                return idx;
        }
        return -1;  // not found
    }

    public void clear() {
        num = front = rear = 0;
    }

    public int capacity() {
        return max;
    }
    
    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= max;
    }

    public void dump() {
        if (num <= 0)
            System.out.println("Queue is empty");
        else {
            for (int i=0; i<num; i++) {
                System.out.print(que[(i + front) % max] + " ");
            }
            System.out.println();
        }
    }

}
