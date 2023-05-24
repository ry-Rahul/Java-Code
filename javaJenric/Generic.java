// package javaPrograms.javaJenric;

@SuppressWarnings ("unchecked")
class data<T> {
    private T val;

    public void setVal(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }
}

class MyArray<T> {
    T A[] = (T[]) new Object[5];
    int length = 0;

    public void append(T val) {
        A[length++] = val;
    }
    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }
    }
}
public class Generic {
    public static void main(String[] args) {
        data<Integer> d = new data<>();
        d.setVal(10);
        System.out.println(d.getVal());

        MyArray<Integer> m = new MyArray<>();
        m.append(10);
        m.append(20);
        m.append(30);
        m.append(40);

        m.display();
    }
}
