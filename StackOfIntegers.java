class StackOfIntegers{
    int arr[];
    int size;
    
    StackOfIntegers(){
        size = 16;
        arr = new int[size];
        this.size = 0;
    }
    StackOfIntegers(int size){
        this.size = size;
        arr = new int[size];
        this.size = 0;
    }
    boolean empty(){
        if(this.size != 0) return false;
        return true;
    }
    int peek(){
        return arr[size];
    }
    int pop(){
        int temp = arr[size-1];
        size--;
        return temp;
    }
    void print(){
        for(int i=0;i<size;i++){
            System.out.println(arr[i] + " ");
        }
    }
    void push(int val){
        if(getSize() > size){
            arr[size] = val;
            size ++;
        }
    }
    int getSize(){
        return arr.length;
    }
}