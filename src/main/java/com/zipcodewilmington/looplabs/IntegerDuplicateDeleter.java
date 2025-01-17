package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if (i == array.length){
                if(count >= maxNumberOfDuplications){
                    maxNumberOfDuplications = count;
                }
            }
        }
        return new Integer[0];
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if (i == array.length){
                if(count >= exactNumberOfDuplications){
                    exactNumberOfDuplications = count;
                }
            }
        }
        return new Integer[0];
    }
}
