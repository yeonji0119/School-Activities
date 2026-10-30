void main() {
    Scanner keyboard = new Scanner(System.in);

    int cost;
    double price, salesTax, purchaseTax, tax;

    cost = 1015000;

    price = cost * (1 + 0.3);
    salesTax = price * 0.1;
    purchaseTax = cost * 0.1;
    tax = salesTax - purchaseTax;

    System.out.println("**** 상품 판매 세금 계산 ****");

    System.out.println("매입원가 : " + cost + "원");
    System.out.println("정가 : " + price + "원");
    System.out.println("매출 세액 : " + salesTax + "원");
    System.out.println("매입 세액 : " + purchaseTax + "원");

    System.out.printf("납부 세액 : %.0f원", tax);
}
