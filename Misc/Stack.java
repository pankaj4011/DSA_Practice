

public class Stack {
    static class StackCustom{
        int top;
        int size;
        int [] arr;
        public StackCustom(int size){
            top = -1;
            this.size =size;
            arr =new int[size];
        }
        
    
        void push(int a){
            if(top>size)
                System.err.println("Stack Overflow");
            else {
                top++; 
                arr[top] = a;
            }
        }

        int pop(){
            if(top<0){
                return Integer.MIN_VALUE;
            }
            else
                return arr[top--];
        }
        boolean isEmpty(){
            return top==-1?true:false;
        }
    }


    public static void main(String[] args) {
        StackCustom st = new StackCustom(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());


    }
    
}
