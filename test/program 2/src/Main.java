
void main() {
    Scanner keyboard = new Scanner(System.in);

    double time;
    int day, hour, minute, second;

    System.out.print("시간 입력 : ");
    time = keyboard.nextDouble();

    day = (int)(time / 24);
    hour = (int)time % 24;
    minute = (int)((time - (int)time) * 60);
    second = (int)((((time - (int)time) * 60) - minute) * 60);

    System.out.println("시간은 " + day + " 일 " +
            hour + " 시간 " + minute + " 분 " +
            second + " 초 입니다");
}
