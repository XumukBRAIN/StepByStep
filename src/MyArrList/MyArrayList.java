package MyArrList;


import java.util.Arrays;

/**
 * @author Ivan Kudryashov
 * @version 1.0
 * */
public class MyArrayList <T>{

    /**
     * a list containing data of a specific type
     */
    private T[] list;

    /**
     * list size
     */
    private int size;

    /**
     * list capacity
     */
    private int capacity = 8;

    /**
     * current object index
     */
    private int currentIndex = 0;

    /**
     * constructor to create a sheet with a specific capacity
     * @param capacity list
     */
    public MyArrayList(int capacity){
        if(capacity < 1){
            throw new IllegalArgumentException("capacitance must be equal to 1 or more");
        }else {
            list = (T[]) new Object[capacity];
        }
    }

    /**
     * default constructor
     */
    public MyArrayList(){
        list = (T[]) new Object[capacity];
    }

    /**
     * method to increase list capacity
     */
    private void makeArrayGreatAgain() {
        int newCapacity = capacity * 3 / 2 + 1;
        Integer[] newExpandedArray = new Integer[newCapacity];

        System.arraycopy(list, 0, newExpandedArray, 0, capacity);
        list = (T[]) newExpandedArray;
        capacity = newCapacity;
    }

    /**
     * method for adding a new object to MyArrayList
     * @param object you want to add
     * */
    public void add(T object){
        //Проверка на переполнение capacity
        if(currentIndex >= list.length){
            makeArrayGreatAgain();
        }
        list[currentIndex++] = object;
        size++;
    }

    /**
     * method to get list size
     * @return list size
     */
    public int size(){
        return size;
    }

    /**
     * method for deleting an object by its index
     * @param index of the object you want to delete
     */
    public void delete(int index){
        for(int i = index; i < size; i++){
            list[i] = list[i+1];
        }
    }

    /**
     * a method for removing a list element, in the parameters of which the object itself is passed
     * @param object you want to delete
     */
    public void deleteByObject(T object){
        int position = index(object);
        if(position < 0){
            return;
        }
        delete(position);
    }

    /**
     * method to get object index
     * @param object whose index you want to know
     * @return object index
     */
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

    /**
     * a method to get the index of the object you want to get
     * @param index of the object you want to get
     * @return object
     */
    public T getObject(int index){
        return list[index];
    }

    /**
     * object change method
     * @param index of the object you want to change
     * @param object you want to change
     */
    public void setObject(int index, T object){
        list[index] = object;
    }

    /**
     * method to check the list for the presence of objects
     * @return true if there are no objects and vice versa
     */
    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(list, size));
    }

}
