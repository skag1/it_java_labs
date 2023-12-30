public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek()); // 3
        System.out.println(stack.pop()); // 3
        System.out.println(stack.pop()); // 2
        System.out.println(stack.peek()); // 1
        stack.push(4);
        System.out.println(stack.peek()); // 4
        System.out.println(stack.pop()); // 4
        System.out.println(stack.pop()); // 1
        System.out.println(stack.isEmpty()); // true
    }
}