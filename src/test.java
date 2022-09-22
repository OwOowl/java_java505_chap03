import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {

//        문제 1) p.121
        Scanner scan = new Scanner(System.in);

        int count; // 시행횟수
        int max; // 최대값
        int min; // 최소값


            // 무작위 숫자 선택
            Random r = new Random();

//            숫자 맞추기
            while (true) {
                int k = r.nextInt(100);
                count = 1;
                max = 99;
                min = 0;
                System.out.print("Up & Down게임입니다. 숨겨진 수를 맞추어 보세요 \n0-99\n" + count + ">>");
                for (count= 1; count < 99; count++) {
                    int num = scan.nextInt(); // 숫자 입력
                    if (num < k) {
                        System.out.print("더 높게 \n" + num + "-" + max + "\n" + count + ">>");
                        min = num; // 최솟값에 입력값 저장
                    } else if (num > k) {
                        System.out.print("더 낮게\n" + min + "-" + num + "\n" + count + ">>");
                        max = num; // 최댓값에 입력값 저장
                    } else {
                        System.out.println("맞았습니다.");
                        break;
                    }
                }
//            맞춘 후 재시작
                System.out.print("다시하시겠습니까(y/n)>>");
//            n
                if (scan.next().equals("n")) {
                    break;
                }
            }
            



        System.out.println();
        
//        문제 2) p.125 실습문제 1

        System.out.print("알파벳 한 문자를 입력하세요>>");
        String s = scan.next();
        char c = s.charAt(0);

        for (int i = 'a'; i <= c; i++) {    // int값 알파벳
            if (i <= c) {                   // 'a'가 입력한 알파벳보다 작거나 같을 때 i 출력
                System.out.print((char)i);
            }
            for (int j = i + 1; j <= c; j++) {  // 'b'가 입력값보다 작거나 같을 때 j출력
                System.out.print((char)j);
            }
            System.out.println();
        }


        System.out.println();

//        문제 3) p.126 실습문제 2
        int array[];
        array = new int[10];
        System.out.print("정수 10개를 입력>>");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
            if ((array[i] % 3) == 0) {      // 정수가 3의 배수일 때 출력
                System.out.print(array[i] + " ");
            }

        }

        System.out.println();

//        문제 4) p.126

//        배열 생성
        String eng[] = {"student", "love", "java", "happy", "future"};
        String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};

        while(true) {
            System.out.print("영어 단어를 입력하세요 >> ");
            String Word = scan.next();

//            프로그램 종료
            if(Word.equals("exit")) {
                System.out.print("종료합니다...");
                break;
            }
//            단어 출력
            else{
                for(int i = 0; i < eng.length; i++) {
                    if(Word.equals(eng[i])) {   // 입력 단어가 eng[i]와 일치할 때 kor[i] 출력
                        System.out.println(kor[i]);
                        break;
                    }
                    if(i == eng.length -1) {    // 배열 크기만큼 단어 검색 후 단어가 존재하지 않을 때
                        System.out.println("그런 영어 단어는 없습니다.");
                    }
                }
            }
        }

        System.out.println();

//        문제 5) p.129
        int intArray[][] =new int[3][4];


//    랜덤 정수 발생시켜 배열에 저장
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++){
                intArray[i][j] = (int)(Math.random()*10);
            }
        }

//        배열 출력
        for (int i = 0; i < intArray.length; i++) {
            for(int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j] + " " + " ");
            }
            System.out.println();
        }

//        배열의 합 출력
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                    sum = sum + intArray[i][j];
            }
            sum = sum + 0; // for문 안의 sum값을 저장
        }
        System.out.println("합은 " + sum);
    }
}
