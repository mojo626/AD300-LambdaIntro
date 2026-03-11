class Main {
    public static void main(String[] args) {
        SimpleRunnable.run();

        MathOperation add = (int a, int b) -> a + b;
        MathOperation subtract = (int a, int b) -> a - b;
        MathOperation multiply = (int a, int b) -> a * b;
        MathOperation divide = (int a, int b) -> a / b;

        System.out.println(add.operate(1, 2));
        System.out.println(subtract.operate(5, 2));
        System.out.println(multiply.operate(2, 3));
        System.out.println(divide.operate(6, 3));


        ListOperations.run();

        BuiltIn.run();

        Advanced.run();
    }
}
