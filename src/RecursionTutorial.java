public class RecursionTutorial {
    public static void main(String[] args) {
        try {
            sayHi(3);
        } catch (StackOverflowError e) {
            System.out.println("It ran too much");
        }
    }

    private static void sayHi(int count) {
        System.out.println("Hi!");

        if (count <= 1) {
            return;
        }
        
        sayHi(count-1);
    }
}
