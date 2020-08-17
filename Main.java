public class Main {
    public static void main(String[] args) {

        MyStack<Integer> test = new MyStack<>();

        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        test.push(5);
        System.out.println(test.toString());


        test.pop();
        test.pop();
        System.out.println(test.toString());


    }
}
