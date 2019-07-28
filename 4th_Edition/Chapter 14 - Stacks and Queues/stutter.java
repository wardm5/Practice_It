//  Write a method stutter that takes a stack of integers as a parameter and replaces every value in the stack with 
//  two occurrences of that value.

public void stutter(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<Integer>();    
    while(!s.isEmpty())
        q.add(s.pop());          
    while(!q.isEmpty())
        s.push(q.remove());                    
    while(!s.isEmpty())
        q.add(s.pop());                                  
    while(!q.isEmpty()) {
        int n = q.remove();
        s.push(n);
        s.push(n);
    }
}
