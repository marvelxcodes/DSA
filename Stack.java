class Node {
    int val;
    Node next = null;

    Node(int val) {
        this.val = val;
    }
}

class StackDS {
    Node top;
    int size;
    int length;

    StackDS(int size) {
        this.size = size;
    }

    public void push(int val) throws Exception {
        if (size != length) {
            Node newNode = new Node(val);
            newNode.next = top;
            this.length++;
            this.top = newNode;
            return;
        }
        throw new Exception("Stack Overflow");
    }

    public int pop() throws Exception {
        if (this.length == 0) throw new Exception("Stack Underflow");
        int val = this.top.val;
        this.length--;
        this.top = this.top.next;
        return val;
    }
}

/**
 * 
 */
public class Stack {
    public static void main(String[] args) {
        StackDS stack = new StackDS(5);

        try {
            stack.push(5);
            stack.push(4);
            System.out.println(stack.pop());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
