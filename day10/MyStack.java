package day10;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer> Main;
    Queue<Integer> Assist;
    public MyStack() {
        Main = new LinkedList<>();
        Assist = new LinkedList<>();
    }

    public void push(int x) {
        Assist.offer(x);
        while(!Main.isEmpty()){
            Assist.offer(Main.poll());
        }
        Queue<Integer> queueTemp;
        queueTemp = Main;
        Main = Assist;
        Assist = queueTemp;
    }

    public int pop() {
        return Main.poll();
    }

    public int top() {
        return Main.peek();
    }

    public boolean empty() {
        return Main.isEmpty();
    }
}
