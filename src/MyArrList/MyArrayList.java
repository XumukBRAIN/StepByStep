package MyArrList;

import org.junit.Test;

import java.util.Arrays;

public class MyArrayList <T>{
    private T[] list;
    private int size;
    private int capacity = 8;
    private int currentIndex = 0;

    public MyArrayList(int capacity){
        if(capacity < 1){
            throw new IllegalArgumentException("capacitance must be equal to 1 or more");
        }else {
            list = (T[]) new Object[capacity];
        }
    }

    public MyArrayList(){
        list = (T[]) new Object[capacity];
    }

    private void makeArrayGreatAgain() {
        int newCapacity = capacity * 3 / 2 + 1;
        Integer[] newExpandedArray = new Integer[newCapacity];

        System.arraycopy(list, 0, newExpandedArray, 0, capacity);
        list = (T[]) newExpandedArray;
        capacity = newCapacity;
    }

    public void add(T object){
        //Проверка на переполнение capacity
        if(currentIndex >= list.length){
            makeArrayGreatAgain();
        }
        list[currentIndex++] = object;
        size++;
    }

    public int size(){
        return size;
    }

    public void delete(int index){
        for(int i = index; i < size; i++){
            list[i] = list[i+1];
        }
    }

    public void deleteByObject(T object){
        int position = index(object);
        if(position < 0){
            return;
        }
        delete(position);
    }


    private int index(T object){
        if(object == null)
            return -1;
        for(int i = 0; i < size; i++){
            if(object.equals(list[i])){
                return i;
            }
        }
        return -1;
    }

    public T getObject(int index){
        return list[index];
    }

    public void setObject(int index, T object){
        list[index] = object;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(list, size));
    }

}
