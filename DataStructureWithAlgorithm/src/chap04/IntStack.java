package chap04;

public class IntStack {
    private int max;    // Stack size
    private int ptr;    // Stack pointer
    private int[] stk;  // Stack array

    // Exception: Stack is empty
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {
        }
    }

    // Exception: Stack is full
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {
        }
    }

    // Base Constructor
    public IntStack() {
    }

    // Constructor
    public IntStack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max];         // Create stack array
        } catch (OutOfMemoryError e) {  // Stack allocation failed
            max = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException {
        if (ptr >= max) {               // Stack is full
            throw new OverflowIntStackException();
        }
        return stk[ptr++] = x;         // Push x
    }

    public int pop() throws EmptyIntStackException {
        if (ptr <= 0) {                // Stack is empty
            throw new EmptyIntStackException();
        }
        return stk[--ptr];
    }
    
    public int peek() throws EmptyIntStackException {
        if (ptr <= 0) {                // Stack is empty
            throw new EmptyIntStackException();
        }
        return stk[ptr - 1];
    }
    
    public int indexOf(int x) {
        for (int i = ptr - 1; i >= 0; i--) {    // Search from top
            if (stk[i] == x) {
                return i;                       
            }
        }
        return -1;                              // x not found
    }

    public void clear() {
        ptr = 0;
    }
    
    public int capacity() {
        return max;
    }

    public int size() {
        return ptr;
    }
    
    public boolean isEmpty() {
        return ptr <= 0;
    }
    
    public boolean isFull() {
        return ptr >= max;
    }

    public void dump() {
        if (ptr <= 0) {
            System.out.println("Stack is empty.");
        } else {
            for (int i = 0; i < ptr; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }

}
