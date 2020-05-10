public class StackReverse {
    /*int top;
    int max_siz;
    int[] stack;
    public ReversStack(int size){
        this.max_siz=size;
        this.top = -1;
        this.stack = new int[size];
    }
    public void Push(int data){
        if(max_siz<top){
            stack[++top] = data;
        }else {
            System.out.println("stack overflow can not push el");
        }

    }*/
    public void Rev(){
            Stack stack = new Stack(3);
            Stack stack1 = new Stack(3);
            int el=100;
            for(int v = 0; v<stack.stack.length;v++){
                ++el;
                stack.push(el);
            }
            System.out.println("element before rev");
            stack.show();

            for(int l =0; l<stack1.stack.length;l++){
                //for(int m = 0; m<stack1.stack.length;m++){
                    stack1.push(el--);
                //}
            }
            System.out.println("after reve");
            //stack1.pop();
            stack1.show();

            //System.out.println("element after pop");
            //for(int b =0;b<stack.stack.length;b++){
                //System.out.println("el are " +stack.stack[b]);
            //}
            //System.out.println("element after pop");
            //stack.show();

            //Stack stack2 = new Stack(3);
            //for(int m =3;m<0;m--){

            //}

            //for(int s = 0; s<=stack.length;s++){

            //}

            //if pop one by one
        // the inset new el one by one


        //change the index of the stack
        //stack[0] = 1;
          //stack[1] = 2;
          //stack[2] = 3;

          //stack[0] = 3;
          //stack[1] = 2;
          //stack[2] = 1;
    }

}

/*
{
1, 0
2, 1
3  2
}


 */
