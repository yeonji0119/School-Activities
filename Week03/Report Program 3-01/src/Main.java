void main() {
    Scanner keyboard = new Scanner(System.in);

    int num1;
    int num2;

    System.out.print("첫번째 숫자를 입력하세요 : ");
    num1 = keyboard.nextInt();

    System.out.print("두번째 숫자를 입력하세요 : ");
    num2 = keyboard.nextInt();

    System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
}
