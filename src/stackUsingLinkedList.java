public class stackUsingLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        static class Stack {
            public static Node head;

            public static boolean isEmpty(){
                return head == null;
            }
            public static void push(int data) {
                Node newNode = new Node(data);
                if(isEmpty()){
                    head = newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;
            }
            public static int pop() {
                if(isEmpty()){
                    return -1;
                }
                int top = head.data;
                head = head.next;
                return top;
            }
            public static int peek(){
                if(isEmpty()){
                    return -1;
                }
                return head.data;
            }
        }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(42);  // Replace 42 with the actual data you want to push onto the stack
        stack.push(43);  // Replace 42 with the actual data you want to push onto the stack
        stack.push(45);  // Replace 42 with the actual data you want to push onto the stack
        stack.push(48);
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}