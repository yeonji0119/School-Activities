//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    byte value1 = 127; // -128 ~ 127]
    int value2 = 40000; // 컴퓨터는 int가 제일 편하여 좋아함 -> 처리하기가 쉽기때문이다
    short value22 = 32767; // 16비트라서 ..
    long value3 = 40000L;
    double value4 = 3.14;
    float value5 = 3.14f;
    char value6 = 'A';    //A가 들어간 곳에 한글도 가능하다, 이중 따옴표는 쓸 수 없다
    String value7 = "가";


    System.out.printf("%d + 1 = %d\n", value1, value1 + 1);
}
