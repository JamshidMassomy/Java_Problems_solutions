public class StackMax {
    public  void MaxElemenet(){
        Stack stack = new Stack(10);
        int max = stack.stack[0];
        for(int x=0;x<stack.stack.length;x++){
            stack.push(x);
        }
        for(int z =0; z<stack.stack.length;z++){
            if(stack.stack[z]>max){
                max= stack.stack[z];
            }
        }
        System.out.println("max el is :"+max);
        //{1,2,3,4,5};


    }
}
