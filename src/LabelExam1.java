public class LabelExam1 {
    public static void main(String[] args) {
        outter:
        for (int i =0; i<3; i++){
            for(int k =0; k <3; k++){
                if(i == 0 && k ==2)
                    break outter;
                System.out.println(i + "," +k);
            }
        }
    }
}
//중첩된 반복문을 한번에 빠져나가고 싶을때 break라벨을 사용한다
/*
break와 continue문의 한계
break는 현재 반복문을 빠져나가는데 사용한다
continue는 continue문 아래 부분을 실행하지 않고 다시 반복한다

그렇다면 중첩반복문을 한번에 빠져나가려면?
continue이하를 실행하지 않고 한번에 중첩 반복문을 반복하려면 어떻게 해야할까?
-> 이럴때 label을 사용한다.
 */