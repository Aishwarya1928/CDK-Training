import java.util.Arrays;

class Stack { 
    static int counter = 10; 
    int top; 
    int a[] = new int[counter]; 
  
    @Override
	public String toString() {
		return "Stack [a=" + Arrays.toString(a) + "]";
	}
    
	 
    Stack() 
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        if (top >= (counter - 1)) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else { 
            a[++top] = x; 
            System.out.println(x + " pushed to stack"); 
            return true; 
        } 
    } 
    int peek() 
    { 
        if (top == -1) { 
            System.out.println("Stack is Empty"); 
            return 0; 
        } 
        else { 
            int x = a[top]; 
            return x; 
        } 
    } 
    int pop() 
    { 
        if (top < 0) { 
            System.out.println("Stack is Empty"); 
            return 0; 
        } 
        else { 
            int x = a[top--]; 
            return x; 
        } 
    } 
    boolean isEmpty() 
    { 
        return (top < 0); 
    }
} 
  
class Demo1 { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(1); 
        s.push(2); 
        s.push(3); 
        System.out.println(s.pop() + " Popped "); 
        System.out.println(s.peek() + " peek value :"); 
        System.out.println(" stack is empty :   "+s.isEmpty()); 
        
    } 
} 
