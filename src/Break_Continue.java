import java.util.Scanner;

public class Break_Continue {
    public static void main(String[] args) {
//        break : 반복문 내에서 break 만나면 즉시 반복문 중단
        System.out.println("\n----- break -----\n");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("break 사용 시 현재 i 값 : " + i);
        }


//        continue : 반복문 내에서 continue 만나면 해당 루프만 중단하고 다음 루프로 넘어감
        System.out.println("\n----- continue -----\n");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("continue 사용 시 현재 i 값 : " + i);
        }


        System.out.println("\n----- 문제 4 -----\n");
//        문제 4) 구구단 전체를 출력하는 프로그램을 작성하세요
//        조건 1. 사용자 입력으로 2~9 까지의 숫자를 입력받고 해당 구구단을 출력
//        조건 2. 사용자 입력으로 받은 단수에 break와 continue를 사용하여 구구단을 작성하세요
        Scanner scan = new Scanner(System.in);
        System.out.println("구구단 단수를 입력하세요.");
        int num = scan.nextInt();

        for (int i = 2; i < 10; i++) {
            if (i == num) {
                break;
            }
            System.out.println("\n---" + i + "단---");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
                    }

        for (int i = 2; i < 10; i++) {

            if (i == num) {
                continue;
            }
            System.out.println("\n---" + i + "단---");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }




    }
}
