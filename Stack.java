

/*
{
ind   position val
0 0,  10
1 0,  2
2 0,  30
3 0,  20
4 0
 } - 10
 */
public class Stack {
    private int top;
    private int max_size;
    public  int[] stack;

    public Stack(int size) {
        this.max_size = size;
        this.stack = new int[size];
        this.top  = -1;
    }
    public void push(int data){
        if(top>max_size){
            System.out.println("stack is overflow");
            return;
        }else{
            stack[++top] = data;

        }

    }
    public void pop(){
        if(top<0){
            System.out.println("stack is underflow ");
        }

        int _data = stack[top--];
        stack[top+1] =0;
        System.out.println(_data+ " has been removed");
    }
    public void show(){
        for(int b=0;b<stack.length; b++){
            System.out.println(stack[b]);
        }
    }
    public void peek(){
        System.out.println("peek element is :" +stack[top]);
    }
    public boolean IsEmpty(){
        if (stack[top] == 0 || stack[top] == -1){
            return true;
        }else{
            return  false;
        }
    }
    public boolean IsFull(){
        if(top>=max_size){
            return true;
        }else {
            return  false;
        }
    }

}


