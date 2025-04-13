package chap04;

import java.util.Arrays;

public class IntAryQueue {
    private int max;    //queue size
    private int num;    //number of elements
    private int[] que;  //que array

    // Exception: Queue is empty
    public class EmptyQueueException extends RuntimeException {
        public EmptyQueueException() { }
    }

    // Exception: Queue is full
    public class overflowQueueException extends RuntimeException {
        public overflowQueueException() { }
    }

    public IntAryQueue() { }

    public IntAryQueue(int capacity) {
        num = 0;
        max = capacity;
        try {
            que = new int[max];
        } 
        catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int enque(int x) throws overflowQueueException{
        if (num >= max) {
            throw new overflowQueueException();
        }
        return que[num++] = x;
    }

    public int deque() throws EmptyQueueException {
        if (num <= 0) {
            throw new EmptyQueueException();
        }
        int dequeued = que[0];
        que = Arrays.copyOfRange(que, 1, max);
        num--;
        return dequeued;
    }

    public int peek() throws EmptyQueueException {
        if (num <= 0) {
            throw new EmptyQueueException();
        }
        return que[max];
    }

    public int indexOf(int x) {
        for (int i = num - 1; i >= 0; i--) {    // Search from top
            if (que[i] == x) {
                return i;
            }
        }
        return -1;                              // x not found
    }
    
    public void clear() {
        num = 0;
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
        if (num <= 0) {
            System.out.println("Stack is empty.");
        } 
        else {
            for (int i = 0; i < num; i++) {
                System.out.print(que[i] + " ");
            }
            System.out.println();
        }
    }
    
}
