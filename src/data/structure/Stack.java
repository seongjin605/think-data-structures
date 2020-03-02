package data.structure;


import java.util.EmptyStackException;

public class Stack<T> {
    public static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode<T> top;

    public void push(T item) {
        StackNode<T> t = new StackNode<>(item);
        // top의 이전 다음노드가 top으로 변경
        t.next = top;
        // 현재 입력한 노드가 top이된다.
        top = t;
    }

    public T pop() {
        if (top == null) throw new EmptyStackException();
        // 다음노드가 탑이된다.
        T item = top.data;
        top = top.next;
        return item;
    }

    public T peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack.pop()); // 7
        System.out.println(stack.peek()); // 6
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }
}
