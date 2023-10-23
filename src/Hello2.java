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

/*
* new연산자를 사용할 때마다 메모리에 인스턴스가 생성된다.
인스턴스는 더 이상 참조되는 것이 없을 때, 나중에 (언제 될지는 모른다. 보통 메모리가 부족할때) 가비지 컬렉션이 된다.
static한 필드는 클래스가 로딩될 때 딱 한번 메모리에 올라가고 초기화 된다.
인스턴스 메소드는 인스턴스를 생성하고나서 레퍼런스 변수를 이용해 사용가능하다
클래스 메소드는 클래스명, 메소드명() 으로 사용가능하다
메소드 안에 선언된 변수들은 메소드가 실행될때 메모리에 생성되었다가, 메소드가 종료될때 사라진다.
*/