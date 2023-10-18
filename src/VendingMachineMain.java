public class VendingMachineMain {
    public static void main (String[] args){
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();
//  static 이 붙은 메소드는 클래스 메소드라고 부른다
//  메소드는 기능,행위라고 한다
//  클래스 메소드는 인스턴스를 생성하지 않아도 사용할수가 있다
//  -> 메모리에 올라가 있다
//  인스턴스로 메모리에 올라가야 오브젝트라고 부를수가 있다
//  메소드에서 사용하는건 의존한다라고 생각하기 **진짜중요
//  VendingMachineMain은 String 클래스에도 의존한다
//  클래스명 변수명 = new 클래스명();

//  인스턴스를 만드는 세가지 방법
//  1 .new 연산자와 생성자를 이용하여 인스턴스를 만드는 방법
//  2. 클래스 로더를 이용하는 방법
//  3. 메모리에 있는 인스턴스를 복제하여 만드는 방법

      String product = vm1.pushProductButton(100);
//      vm1.printVersion(); // static한 메소드는 레퍼런스변수명.static메소드()
      System.out.println(product);
      //sout 단축키 기억하자
      String product2 = vm2.pushProductButton(200);
    }
}


//q. javac를 이용해 컴파일을 하면, 소스 파일이 있던 곳에 class파일이
//생성되었다.VendingMachineMain 이라고 실행하면 JVM은 어디서 찾을까?
//CLASSPATH 경로에서 Hello클래스를 찾아서 실행합니다!


/*
객체지향문법- static 메소드
static한 메소드는 인스턴스를 생성하지 않아도 호출할수 있다.
- 클래스를 실행하면 JVM은 CLASSPATH를 통해 클래스를 찾아서 읽어 들이고 클래스 정보를 PERM이라는 메모리 영역에 저장한다.
- PERM 메모리에 올라간 것은 인스턴스가 아니라 클래스에 대한 정보이므로 혼동하지 말 것.
- PERM에 클래스 정보가 올라가면 JVM은 해당 클래스가 가지고 있는 메소드 정보들을 알게 된다(static or instance).
- Stack 메모리에 올라간 것들은 실행되고 있는 메소드 정보들이다.
- 메소드 안에 선언된 변수를 parameter, 매개변수, 지역변수라고 한다.
- 지역변수는 메소드가 종료되면 사라진다.
- 같은 메소드를 동시에 열 번을 호출한다면 그 메소드 안의 지역 변수는 각각 다른 메모리 영역에 저장되어 사용된다.
**
메소드안에 선언된 지역변수는 메소드가 실행될때 생성되었다가
메소드가 종료될 때 사라진다.
동시에 메소드가 호출되도 문제가 없다 라고 이해하면 된다.
 */