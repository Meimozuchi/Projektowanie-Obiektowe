//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Ania");
    System.out.println("Bartek");
    System.out.println("Kasia");

    String imie = "Wojciech";
    int rok = 2009;
    double liczba = 0.66;

    System.out.println("Mam na imię " + imie + " mam " + (2026 - rok) + " lat  i będę pisać maturę za " + liczba + " roku.");

    Scanner scan = new Scanner(System.in);
    System.out.println("wpisz temperature: ");
    int temp = scan.nextInt();
    System.out.println("Temperatura to " + temp + "stopnie celsjusza" );
    double ftemp = temp * 1.8 + 32.0;
    System.out.println("W farenheitach to " + ftemp);
}
