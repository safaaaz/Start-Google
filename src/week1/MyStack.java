package week1;

public class MyStack {
    int[] array;
    public static void main(String[] args) {
        MyStack stack=new MyStack();
        stack.add(4);
        stack.add(5);

        System.out.println(stack.peek());
        System.out.println(stack.poll());

    }

    public MyStack() {
        this.array = new int[0];
    }
    public int push(int item){
        if(add(item))
            return item;
        return 0;
    }
    public boolean add(int item){
        int size=array.length;
        int [] tempArray = new int[size+1];
        int i;
        for(i = 0; i < size; i++)
            tempArray[i] = array[i];
        tempArray[i]=item;
        array=tempArray;
        return true;
    }
    public int poll(){
        int size=array.length;
        int [] tempArray = new int[size-1];
        int i;
        int item = array[size-1];
        for(i = 0; i < size-1; i++)
            tempArray[i] = array[i];
        array=tempArray;
        return item;
    }
    public int peek(){
        return array[array.length-1];
    }
}
