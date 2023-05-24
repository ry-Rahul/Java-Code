class stackOverflowException extends Exception {
    public String toString() {
        return "Stack overflow";
    }
}

class stackUnderflowException extends Exception {
    public String toString() {
        return "Stack Underflow";
    }
}

class stack{
    private int top = -1;
    private int capacity;
    private int arr[];

    stack() {
        top = -1;
        this.capacity = 0;

    }
    stack(int capacity) {
        this.capacity = capacity;
        arr= new int[capacity];
    }

    public void push(int data) throws stackOverflowException{
        if (top == capacity - 1) {
            throw new stackOverflowException();
        }
        top++;
        arr[top] = data;
    }

    public int pop()throws stackUnderflowException {
        if (top == -1) {
            throw new stackUnderflowException();
        }
        return arr[top--];
    }
    
    public int peek() {
        return arr[top];
    }
}
public class stackException {
    public static void main(String[] args) {
        stack st = new stack(5);
        try{
            st.push(45);
            st.push(78);
            st.push(55);
            st.push(45);
            st.push(78);
            st.push(55);

        }
        catch (stackOverflowException s) {
            
            System.out.println(s);
        }

        // System.out.println(st.peek());
        // st.pop();
        // System.out.println(st.peek());

    }
}
