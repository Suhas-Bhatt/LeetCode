// class MyQueue {

//     public MyQueue() {
        
//         Stack<Integer> s1 = new Stack<>();
//         Stack<Integer> s1 = new Stack<>();
//     }
    
//     public void push(int x) {
//         while(!s1.isEmpty()){
//             s2.push(s1.pop());
//         }
//         s1.push(data);
//         while(!s2.isEmpty()){
//             s1.push(s2.pop());
//         }
        
//     }
    
//     public int pop() {
//         if(s1.isEmpty()){
//             System.out.println("queue is empty");
//         }
//         return s1.pop();
//     }
    
//     public int peek() {
//         if(s1.isEmpty()){
//             System.out.println("queue is empty");
//         }
//         return s1.peek();
//     }
    
//     public boolean empty() {
//         return s1.isEmpty();
//     }
// }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

 class MyQueue {
    List<Integer> list;

    public MyQueue() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        return list.remove(0);
    }

    public int peek() {
        return list.get(0);
    }

    public boolean empty() {
        return list.size() == 0;
    }
}