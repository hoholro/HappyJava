public class NumberOverflow {
    public static void main (String[] args){
        int value = 10;
        int maxInt = Integer.MAX_VALUE; // 정수가 표현할수있는 가장큰값

        System.out.println(value + 1);
        System.out.println(maxInt + 1);
    }
}


//오버플로우 : 계산결과가 최댓값을 넘거나. 최솟값보다 작을경우 음수는 양수로, 양수는 음수로
//바뀌는 문제가 발생하는데 이것을 오버플로우라고 한다. byte 개념숙지 - 자료구조를 이해하면 됩니다.