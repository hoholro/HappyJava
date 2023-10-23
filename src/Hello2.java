public class Hello2 {

    static int i;
        static{   i =500;
        System.out.println("static block");//ㅇㅝㄴ해는 static field를 초기화한다
    }
    public static void main(String[] args) {
        System.out.println("hello~");
    }
}


//javac Hello2.java
//java Hello2
//