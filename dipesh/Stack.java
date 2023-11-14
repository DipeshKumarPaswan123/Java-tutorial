package dipesh;

public class Stack {
    private String[] stackArray;
    private int top;

    public Stack(int size) {
        stackArray = new String[size];
        top = -1;
    }

    public void push(String s) {
        if (top < stackArray.length - 1) {
            top++;
            stackArray[top] = s;
        } else {
            System.out.println("Stack is full. Cannot push " + s);
        }
    }

    public String pop() {
        if (top >= 0) {
            String popped = stackArray[top];
            top--;
            return popped;
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack [");
        for (int i = 0; i <= top; i++) {
            sb.append(stackArray[i]);
            if (i < top) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        Stack st = new Stack(3);
        st.push("A");
        st.push("B");
        st.push("C");
        st.push("D");
        System.out.println(st);

        String poppedValue = st.pop();
        System.out.println("Popped: " + poppedValue);
        System.out.println(st);
    }
}
