// TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
// 프로그램은 처음 실습 내용입니다.
/* %s 문자열 형식으로 출력이고 %d 10진 정수 형식으로 출력
 */

void main() {
    String name = "박연지";  // 문자열 데이터 선언문 (대입문)
    int age = 21;      // 정수형 데이터


    age = age + 1; // 처리 문장

    System.out.printf("이름은 : %s, 나이 : %d 살\n", name, age);   // %s에서 s는 String을 뜻하는거고 %d에서 d는 10진수를 뜻하는거


    System.out.print("대한민국\n");
    System.out.println("경복대학교");
    System.out.println("Computer");

    System.out.println();   // soutp <enter>를 치면 System.out.println();이 생성됩니다.
    System.out.println("박연지");
}
