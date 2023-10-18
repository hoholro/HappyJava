public class MathBeanTest {
    public static void main(String[] args) {
        MathBean math = new MathBean();//heap 메모리에 올라간다
        math.PrintClassName();
        math.printNumber(5000);

        int x = math.getOne();
        System.out.println(x);

        int value = math.plus(200, 300);
        System.out.println(value);
    }
}
