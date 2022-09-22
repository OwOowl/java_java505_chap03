import java.util.Scanner;

public class Array {
    public static void main(String args[]) {

//        배열(Array) : 하나의 이름으로 여러개의 데이터를 저장하기 위한 데이터 타입
//        자바의 배열은 동일한 데이터 타입만 저장할 수 있음
//        배열은 index를 가지고 있으며 데이터를 index를 통해 구분
//        index는 0부터 시작
//        new 키워드를 사용하여 배열을 초기화 시 해당 데이터타입의 초기값으로 초기화됨
//        지정된 크기 이상의 index에 접근 시 에러발생
//        배열 선언 시 배열의 크기를 설정하는 부분에 변수 사용 금지
//        변수는 변경되는 값이기 때문에 배열의 크기가 어떻게 될지 알 수 없음.
//        index 접근할 때는 변수 사용 가능

//        사용법 :
//          선언 : 1. 데이터타입 배열명[] = new 데이터타입[크기]
//                2. 데이터타입 배열명[];  배열명 = new 데이터타입[크기]
//                3. 데이터타입 배열명[] = {데이터1, 데이터2, 데이터3, ...}

//          사용 : 1. 배열명[index]; (지정한 index에 있는 데이터를 불러오기)
//                2. 배열명[index] = 데이터; (지정한 index에 데이터를 저장)



//       빈 배열 선언, 메모리상에 array1이라는 빈 배열을 등록
        int array1[];

//        System.out.println(array1); // 초기화 하지 않은 배열 사용으로 에러

//        배열 초기화, 해당 배열 사용 시 반드시 초기화작업 필요
        array1 = new int[5];
        System.out.println("배열 array1의 메모리 주소 : " +array1);
        System.out.println("배열 array1의 index 0의 값 : " + array1[0]);
        array1[2] = 10;
        System.out.println("배열 array1의 index 2의 값 : " + array1[2]);
        System.out.println("배열 array1의 index 4의 값 : " + array1[4]);
//        System.out.println("배열 array1의 index 4의 값 : " + array1[5]);
        System.out.println("배열 array1의 길이 : " + array1.length);

        System.out.println("\n");

        int array2[] = new int[5];
        System.out.println("배열 array2의 메모리 주소 : " +array2);
        System.out.println("배열 array2의 index 0의 값 : " + array2[0]);
        array2[2] = 20;
        System.out.println("배열 array2의 index 2의 값 : " + array2[2]);
        System.out.println("배열 array2의 index 4의 값 : " + array2[4]);
//        System.out.println("배열 array2의 index 5의 값 : " + array2[5]);
        System.out.println("배열 array2의 길이 : " + array2.length);


        System.out.println("\n");

//        아래 방법으로 배열만들 때 반드시 선언과 동시에 데이터 입력.
        int array3 [] = {10, 20, 30, 40, 50};
        System.out.println("배열 array3의 메모리 주소 : " +array3);
        System.out.println("배열 array3의 index 0의 값 : " + array3[0]);
        array3[2] = 300;
        System.out.println("배열 array3의 index 2의 값 : " + array3[2]);
        System.out.println("배열 array3의 index 4의 값 : " + array3[4]);
//        System.out.println("배열 array3의 index 5의 값 : " + array3[5]);
        System.out.println("배열 array3의 길이 : " + array3.length);


//        int array4[];
//        array4 = {10, 20, 30, 40, 50};
//        선언 후 데이터 추후에 입력 시 오류발생.






        System.out.println("\n---- 문제 5----");
//        문제 5) int타입의 변수 intArray를 생성하고 크기를 10으로 설정한 후 각 index에 1~10까지의 데이터를 입력, 저장된 데이터 출력

//        배열생성 1. int intArray[] = new int[10];
//        배열생성 2. int intArray[];
//                  intArray[] = new int[10];
//        intArray[0] = 1;
//        intArray[1] = 2;
//        intArray[2] = 3;
//        intArray[3] = 4;
//        intArray[4] = 5;
//        intArray[5] = 6;
//        intArray[6] = 7;
//        intArray[7] = 8;
//        intArray[8] = 9;
//        intArray[9] = 10;


        int intArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println("intArray[0]의 값 : " + intArray[0]);
            System.out.println("intArray[1]의 값 : " + intArray[1]);
            System.out.println("intArray[2]의 값 : " + intArray[2]);
            System.out.println("intArray[3]의 값 : " + intArray[3]);
            System.out.println("intArray[4]의 값 : " + intArray[4]);
            System.out.println("intArray[5]의 값 : " + intArray[5]);
            System.out.println("intArray[6]의 값 : " + intArray[6]);
            System.out.println("intArray[7]의 값 : " + intArray[7]);
            System.out.println("intArray[8]의 값 : " + intArray[8]);
            System.out.println("intArray[9]의 값 : " + intArray[9]);


        System.out.println("\n---- 문제 6----");
//        문제 6) 문제5의 intArray에 저장된 겂을 모두 합하는 프로그램 작성
        int sum = intArray[0] + intArray[1] + intArray[2] + intArray[3] + intArray[4] +
                  intArray[5] + intArray[6] + intArray[7] + intArray[8] + intArray[9];
        System.out.println("intArray의 합 : " + sum);








        System.out.println("\n---- 기본 타입과 레퍼런스 타입----");
//        기본 타입. 데이터를 직접 저장
        int a = 10;
        int b = 20;
        System.out.println("변수 a의 값 : " + a + "\t변수 b의 값 : " + b);
//         변수 a의 값을 b에 복사해서 넘겨줌
        b = a;
        System.out.println("변수 a의 값 : " + a + "\t변수 b의 값 : " + b);
//        변수 a의 값을 변경해도 변수 b의 값은 그대로 남아있음.
        a = 100;
        System.out.println("변수 a의 값 : " + a + "\t변수 b의 값 : " + b);


        System.out.println();
//        레퍼런스 타입. 데이터를 주소에 저장
        int arr1[] = {100};
        int arr2[] = {200};
        System.out.println("배열 arr1의 주소 : " + arr1 + "\t배열 arr2의 주소 : " + arr2);
        System.out.println("배열 arr1[0]의 값 : " + arr1[0] + "\t배열 arr2[0]의 값 : " + arr2[0]);

        arr2 = arr1;
        System.out.println("배열 arr1의 주소 : " + arr1 + "\t배열 arr2의 주소 : " + arr2);
        System.out.println("배열 arr1[0]의 값 : " + arr1[0] + "\t배열 arr2[0]의 값 : " + arr2[0]);

        arr1[0] = 1000;
        System.out.println("배열 arr1의 주소 : " + arr1 + "\t배열 arr2의 주소 : " + arr2);
        System.out.println("배열 arr1[0]의 값 : " + arr1[0] + "\t배열 arr2[0]의 값 : " + arr2[0]);

        int arrayInt[];
        arrayInt = new int[5];
        int max = 0; // 현재 가장 큰 값을 저장할 변수
        System.out.println("양수 5개를 입력하세요");
        Scanner scan = new Scanner(System.in);

        for (int i =0; i < 5; i++) {
//            사용자 입력을 통해 데이터를 배열에 저장
            arrayInt[i] = scan.nextInt();
//            배열에 저장된 데이터를 max와 비교
            if (arrayInt[i] > max) {
//                배열에 저장된 데이터를 max에 저장
                max = arrayInt[i];
            }
        }

        System.out.println("가장 큰 수는 " + max + "입니다.");








        System.out.println("\n---- for ~ each ---- \n");

//        기존 for문을 사용한 배열의 데이터 출력
        int arrNum1 [] = {10, 20, 30, 40, 50};
        int total1 = 0;

        for (int i = 0; i < arrNum1.length; i++) {
            System.out.println("arrNum1[" + i + "] : " + arrNum1[i]);
        }

        for (int i = 0; i < arrNum1.length; i++) {
            total1 = arrNum1[i];
            System.out.println("total1 : " + total1);
        }

//        for ~ each를 사용한 배열의 데이터 출력
//        반복가능한 객체의 크기만큼 동작
        int arrNum2[] = {10, 20, 30, 40, 50};
        int total2 = 0;
        for (int num : arrNum2) {
            System.out.println("num : " + num);
        }

        for (int num : arrNum2) {
            total2 = total2 + num;
            System.out.println("total2 : " + total2);
        }

        int [] n = {1, 2, 3, 4, 5};
        sum = 0;
        for (int k : n) {
            System.out.print(k + " ");
            sum += k;
        }
        System.out.println("합은 " + sum);

        String f[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};
        for (String s : f) {
            System.out.print(s + " ");
        }

    }
}
