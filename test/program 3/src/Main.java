
void main() {
    Scanner keyboard = new Scanner(System.in);

    int a, b, c;
    double s, area;
    String type;

    System.out.print("첫 번째 변 a : ");
    a = keyboard.nextInt();

    System.out.print("두 번째 변 b : ");
    b = keyboard.nextInt();

    System.out.print("세 번째 변 c : ");
    c = keyboard.nextInt();

    if (a > 0 && b > 0 && c > 0 &&
            a + b > c && a + c > b && b + c > a) {

        System.out.println("삼각형이 성립합니다.");

        if (a == b && b == c)
            type = "정 삼각형";
        else if (a == b || b == c || a == c)
            type = "이등변 삼각형";
        else
            type = "일반 삼각형";

        if (a * a + b * b == c * c ||
                a * a + c * c == b * b ||
                b * b + c * c == a * a)
            type = type + " (직각 삼각형)";

        System.out.println("삼각형의 종류 : " + type);

        s = (a + b + c) / 2.0;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.printf("삼각형의 면적 : %.2f ㎠", area);

    } else {
        System.out.println("삼각형 아님");
    }
}