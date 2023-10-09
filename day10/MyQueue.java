package day10;

import java.util.Stack;

class MyQueue {
    Stack<Integer> in;
    Stack<Integer> out;
    public MyQueue() {
         in = new Stack();
         out = new Stack();
    }

    public void push(int x) {
        in.push(x);
    }
    //如果out为空，则把in的元素全都放入out中
    private void dumpstackIn(){
      if(!out.isEmpty())return;
      while(!in.isEmpty()){
          out.push(in.pop());
      }
    }

    public int pop() {
        dumpstackIn();
        return out.pop();
    }

    public int peek() {
        dumpstackIn();
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
    }
}
