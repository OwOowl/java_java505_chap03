import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        System.out.println("\n----- while 문-----\n");

        // while : 가장 기본적인 반복문
        // while문 실행 시 while문 밖에 초기화 변수를 선언. while 안에 초기화 변수의 카운트가 필요
        // 변수선언 먼저하소 while문 조건식.
        int hit = 0;

        while (hit < 10) {
            hit++;
            System.out.println("나무를 " + hit + "번 찍었습니다.");

            if (hit == 10) {
                System.out.println("나무가 넘어갑니다.");
            }
        }


        // while 사용 시 주의점
        // 1. 초기화 변수의 카운트 부분의 위치에 따라 결과가 달라짐
        // 1.1 프로그래밍이 익숙치 않을 때는 변수의 카운트 부분을 고정하여 사용하는 것이 좋음
        // 2. while문을 탈출할 수 있는 조건을 반드시 명시해야 함
        // 2.1 break문을 사용하여 탈출 가능(반복문 즉시 종료)
        System.out.println("\n-----while문 사용 시 주의점-----\n");
        hit = 0;

        while (hit < 5) {
            hit++;
            System.out.println("나무를 " + hit + "번 찍었습니다.");

            // hit++;
            if (hit == 5) {
                System.out.println("나무가 넘어갑니다.");
            }
            // hit++;
        }


        System.out.println("\n----------\n");
        // 문제 2) whlie문을 사용하여 1~10까지 화면에 출력하는 프로그램 작성
        int num = 0;

        while (num<10) {
            num++;
            System.out.println(num);
        }


        System.out.println("\n----------\n");






        // 문제 3) while문을 사용하여 1~10까지의 총합을 구하는 프로그램을 작성
        num = 0;
        int total = 0;

        while (num<10) {
            num++;
            total = total + num;
            System.out.println(total);

        }





        System.out.println("\n----- 책 예제 -----\n");
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int n = 0;
        double sum = 0.0;

        System.out.println("정수를 입력하고 마지막에 0을 입력하세요");

        // while문 조건식에 탈출조건 함께지정
        // 키보드 입력을 통한 데이터가 0이 아닐경우 while문 실행
        while ((n = scan.nextInt()) != 0) {
            sum = sum + n;
            count++;
        }

        System.out.println("수의 개수는 " + count + "개 이며, ");
        // double형과 int의 연산이 수행되면 double형으로 자동 형변환이 된다.
        System.out.println("평균은 " + sum / count + "입니다");






        // 문제 4) while문을 사용하여 지정한 단수의 구구단을 출력
        // 출력형태 : 5 * 1 = 5
        System.out.print("출력하고자 하는 구구단의 단수를 입력하세요 : ");
        count = 1;
        int dan = scan.nextInt();
        while (count < 10){
            System.out.println(dan + " * " + count + " = " + (dan * count));
            count++;

        }









        // 다중 while문 : 하나의 while문 안에 또 다른 while문이 있는 형태
        System.out.println("\n----- 중첩 while문 -----\n");

/*        int i = 0;
        int j = 0;
        while (i < 5) {
            while(j < 5) {
                System.out.println("i : " + i + "\tj :" + j);
                j++;
            }
            i++;
            j = 0;
        }*/

        int i = 0;

        while (i < 5) {
            int j = 0;
            while(j < 5) {
                System.out.println("i : " + i + "\tj :" + j);
                j++;
            }
            i++;

        }


        // 문제 5) while문을 사용하여 2~9단까지의 구구단을 모두 출력하는 프로그램작성
        // 다중 while문
        // 출력 형태 : 5 * 1 = 5

        dan = 2;
        while (dan < 10) {
            System.out.println("----- " + dan + "단 -----");
            count = 1;
            while (count < 10) {
                System.out.println(dan + " * " + count + " = " + (dan * count));
                count++;
            }
            dan++;
        }







        // do - while : 기본적으로 while문과 동일. 반복조건 나중에 확인하기 때문에 조건이 false라도 무조건 1회 실행
        System.out.println("\n----- do while문 사용하기-----\n");

        // while
        System.out.println("----- 일반 while-----");
        int c1 = 10;
        while (c1 < 5) {
            System.out.println(c1);
            c1++;
        }

        // do while
        System.out.println("----- do while-----");
        int c2 = 10;
        do {
            System.out.println(c2);
            c2++;
        } while (c2 < 5);

    }
}