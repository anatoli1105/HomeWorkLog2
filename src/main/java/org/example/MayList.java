package org.example;

public class MayList implements IntegerList{
    Integer[]arr=new Integer[8];
    @Override
    public Integer add(int item) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==null) {
                arr[i] = item;
                break;
            }
        }
        return item;
    }

    @Override
    public Integer add(int index, Integer item) {
        if(index>=arr.length){
            throw new NotFoundIndex();
        }else {
            arr[index] = item;
        }

        return item;
    }

    @Override
    public Integer set(int index, Integer item) {
        if(index>=arr.length){
            throw new NotFoundIndex();
        }else {
            arr[index] = item;
        }
        return item;
    }

    @Override
    public Integer remove(Integer item) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(item)){
                arr[i]=null;
                break;
            }else{
                throw  new NotFoundElementOfList();
            }


        }
        return item;
    }

    @Override
    public Integer remove(int index) {
        Integer item=arr[index];

        if(arr[index]!=null){

            arr[index]=null;

        }else{
            throw  new NotFoundElementOfList();
        }



        return item;
    }

    @Override
    public boolean contains(Integer item) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==null){
                i++;
            }
            else if(arr[i].equals(item)){
                return true;
            }

        }
        return false;
    }

    @Override
    public int indexOf(Integer item) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==null){
                i++;
            }
            else if(arr[i].equals(item)){
                return i;
            }

        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer item) {
        for (int i = arr.length-1; i>=0; i--) {
            if(arr[i]==null){
                i--;
            }
            else if(arr[i].equals(item)){
                return i;
            }

        }
        return -1;
    }

    @Override
    public Integer get(int index) {
        if(index>arr.length){
            throw new NotFoundIndex();
        }
        return arr[index];
    }

    @Override
    public boolean equals(IntegerList otherList) {
        return false;
    }

    @Override
    public int size() {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                count++;
            }

        }
        return count;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                return false;
            }

        }

        return true;
    }

    @Override
    public void clear() {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                arr[i]=null;
            }

        }
    }

    @Override
    public Integer[] toArray() {
        return new Integer[]{4,7,9,3};
    }

}