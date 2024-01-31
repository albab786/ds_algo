package com.practise.stack;


import java.util.Arrays;

public class InsertAtPos{

private static int[] insertElement(int[] array, int element, int index) {
    // create new array where we can insert element in old array
    int[] newArray = new int[array.length + 1];
    int i;
    for (i = 0; i < index; i++) {
        newArray[i] = array[i];
        System.out.println("array[i] ...... " + array[i]);
    }
    System.out.println("Iterate new array till index value... " + Arrays.toString(newArray));
    newArray[index] = element;
    System.out.println("Insert new element in specified position... " + Arrays.toString(newArray));
    System.out.println("newArray length : " + newArray.length);
    System.out.println("Index ....... "+ " "+ (index+1)); // 31
    for (i = index + 1; i < newArray.length; i++) {
        newArray[i] = array[i - 1];
        System.out.println("array[i-1] : " + array[i-1]);
    }
    return newArray;
}

public static void main(String[] args) {
    // initial Array
    int[] array = {2, 4, 5, 6, 7};
    System.out.println("Initial array : " + Arrays.toString(array));
    System.out.println("Index of position 2 element : " + array[2]);
    // Insertion at specific index
    int elementToInsert = 10;
    int indexToInsert = 3;
    array = insertElement(array, elementToInsert, indexToInsert);
    System.out.println("Array after insertion : " + Arrays.toString(array));
}


}

