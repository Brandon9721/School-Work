// class example on stack data structure where data is stored or removed by
// LIFO or Last In First Out


class Stack {
    Node top;
    int size;
    
    public Stack() {
        top = null;
        size = 0;
    }
    
    public void push(int data) {
        Node n = new Node();
        n.setData(data);
        n.setLink(top);
        top = n;
        size++;
    }
    
    public void pop() {
        if(isEmpty())
            System.out.println("Stack is empty.");
        else {
            top = top.getLink();
            size--;
        }
    }
    
    public boolean isEmpty() {
        if (size == 0)
            return true;
        else
            return false;
    }

    public void print() {
        if (isEmpty())
            System.out.print("Stack is empty");
        else {
            Node temp = top;
            while(temp != null) {
                System.out.print(temp.getData() + " ");
                temp = temp.getLink();
            }
        }
        System.out.println();
        
    }
}

class testStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1); s.push(2); s.push(3);
        s.print();
        s.pop(); s.print();
        s.pop(); s.pop(); s.print();
        s.pop();
    }
}
