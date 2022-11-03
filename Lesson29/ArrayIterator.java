package Lesson29;

class ArrayIterator<T> {
    private T[] arr;
    private int index;

    ArrayIterator(T[] mas){
        arr = mas;
        index = -1;
    }

    public  boolean hasNext(){
        return index < arr.length;
    }
    public  T next() throws IndexOutOfBoundsException{
        if(!hasNext()){
            throw new IndexOutOfBoundsException("Index out of array bounds");
        }
        return arr[index++];
    }
}
