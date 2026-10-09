//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
   int width;
   int height;
   int length;
   int vol;

   Scanner keyboard = new Scanner(System.in);

    System.out.print("직육면체 가로 세로 높이 입력 : ");
    width = keyboard.nextInt();
    height = keyboard.nextInt();
    length = keyboard.nextInt();

    vol = width * length * height;

    System.out.printf("직육면체 가로 : %d cm\n", width);
    System.out.printf("직육면체 세로 : %d cm\n", length);
    System.out.printf("직육면체 높이 : %d cm\n", height);
    System.out.printf("직육면체 부피 : %d ㎤\n", vol);
}
