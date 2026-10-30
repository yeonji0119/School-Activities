
void main() {
    Scanner keyboard = new Scanner(System.in);

    int age, fee;
    String type;

    System.out.println("**** 시내버스 이용 요금 계산 ****");

    System.out.print("\t\t나이 : ");
    age = keyboard.nextInt();

    type = (age < 7) ? "어린이" :
            (age <= 18) ? "청소년" :
                    (age <= 64) ? "성인" : "경로 우대";

    fee = (age < 7 || age >= 65) ? 0 :
            (age <= 18) ? 1000 : 1500;

    System.out.println("\t\t구분 : " + type);

    System.out.println("\t\t요금 : " +
            ((fee == 0) ? "무료" : fee + "원"));
}

