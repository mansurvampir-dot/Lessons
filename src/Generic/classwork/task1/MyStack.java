package Generic.classwork.task1;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack<T>{
    private static final int DEFAULT_CAPACITY = 10;

    private Object[] elements;
    private int size;

    public MyStack(){
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    private void resize(){
        if(size ==elements.length-1){
            int newCap = elements.length*2;
            elements = Arrays.copyOf(elements, newCap);
        }



    }
    public void push(T item){
        resize();
        elements[size++]=item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T item = (T) elements[--size];
        elements[size] = null;
        return item;
    }
    public boolean isEmpty(){
        return size ==0;
    }
    public int size(){
        return size;
    }
    public T peek(){
        if(isEmpty()){
            throw  new EmptyStackException();
        }
        return (T) elements[size-1];
    }

}
