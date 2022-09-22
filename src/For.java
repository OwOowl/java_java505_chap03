import java.util.Scanner;

public class For {
    public static void main(String[] args) {

//        for문  : 가장 많이 사용되는 반복문
        System.out.println("\n-----for문-----\n");
        for (int i = 0; i <10; i++) {
            System.out.println(i);
        }

        System.out.println("\n-----while문-----\n");
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

//         for문과 while문의 차이점
//        1. 초기화 변수설정과  초기화 변수 카운트 위치
//        2. while문의 경우 초기화 변수 카운트 위치에 따라 결과값이 달라지지만 for문의 경우 항상 마지막에 동작하도록 형식이 고정되어있음
//        3. 초기화변수가 for문의 설정부분에 입력되면서 for문의 지역변수로 사용되어 같은 변수를 계속 사용할 수 있음


//        자바에서는 동일한 이름의 변수를 선언 할 수 없음
//        기존의 변수를 재활용하고 저장된 값을 초기화하여 사용해야함
//        for문의 지역변수(for문 안에서만 작동)로 사용되기때문에 동일한 이름의 변수 선언 가능
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }




        System.out.println("\n-----문제 1-----\n");
//        문제 1) 아래의 while문을 for문으로 변환하여 출력하세요

        for (int hit = 1; hit <= 10; hit++) {
            System.out.println("나무를 " + hit + "번 찍었습니다.");

            if (hit == 10) {
                System.out.println("나무가 넘어갑니다.");
            }
        }

        System.out.println("\n-----문제 2-----\n");
//        문제 2) 원하는 단수의 구구단을 출력하는 프로그램을 for문을 사용하여 출력
        Scanner scan = new Scanner(System.in);
        System.out.println("원하는 구구단을 입력하세요.");
        int dan = scan.nextInt();
        for (int cnt = 1; cnt < 10; cnt++) {
            System.out.println(dan + " * " + cnt + " = " + dan * cnt);
        }

        System.out.println("\n-----문제 3-----\n");
//        문제 3) for문을 사용하여 아래의 모양과 동일한 모양이 출력되도록 프로그래밍하세요.
//        *
//        **
//        ***
//        ****
//        *****
        String star = "";
        for (int i = 0; i < 5; i++) {
            star += "*";
            System.out.println(star);
        }




        System.out.println("\n-----중첩 for문-----\n");
//        중첩 for문
//        2차원 배열의 내용을 출력할 때 많이 사용함

        for (int i = 0; i <5; i++) {
            for (int j = 0; j <  5; j++) {
                System.out.println("i의 값 : " + i + "\tj의 값 : " + j);
            }
            System.out.println("----------");
        }

//        변수의 카운트부분을 ++를 사용한 단항연산자가 아닌 산출대입 연산자를 사용 시 원하는 크기만큼 카운트값 변경 가능
        for (int i = 2; i <10; i += 1) {
            System.out.println("-----" + i + "단 -----");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }

    }
}
