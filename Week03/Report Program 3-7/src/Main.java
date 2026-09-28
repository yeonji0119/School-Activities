void main() {
    Scanner keyboard = new Scanner(System.in);

    double C;
    double F;

    System.out.print("섭씨 온도를 입력하세요 : ");
    C = keyboard.nextDouble();

    F = C * 9 / 5 + 32;

    System.out.printf("섭씨 %.1f도는 화씨 %.1f도 입니다.\n", C, F);
}