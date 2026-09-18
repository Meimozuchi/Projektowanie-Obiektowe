//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Ania");
    System.out.println("Bartek");
    System.out.println("Kasia");

//    String imie = "Wojciech";
//    int rok = 2009;
//    double liczba = 0.66;
//
//    System.out.println("Mam na imię " + imie + " mam " + (2026 - rok) + " lat  i będę pisać maturę za " + liczba + " roku.");
//
//    Scanner scan = new Scanner(System.in);
//    System.out.println("wpisz temperature: ");
//    double temp = scan.nextDouble();
//    System.out.println("Temperatura to " + temp + "stopnie celsjusza" );
//    double ftemp = temp * 1.8 + 32.0;
//    System.out.println("W farenheitach to " + ftemp);
//
//    System.out.println("podaj pierwszy bok");
//    double bok1 = scan.nextDouble();
//    System.out.println("podaj drugi bok");
//    double bok2 = scan.nextDouble();
//    System.out.println("podaj trzeci bok");
//    double bok3 = scan.nextDouble();
//    System.out.println("obwód tego trójkąta to " + (bok1 + bok2 + bok3));
//
//    Scanner slowa = new Scanner(System.in);
//    System.out.println("podaj pierwsze słowo");
//    String slowo1 = slowa.nextLine();
//    System.out.println("podaj drugie słowo");
//    String slowo2 = slowa.nextLine();
//    System.out.println("podaj trzecie słowo");
//    String slowo3 = slowa.nextLine();
//    System.out.println(slowo3 +"," + slowo2 + "," + slowo1);
//
//    Scanner dlug = new Scanner(System.in);
//    System.out.println("Podaj słowo");
//    String slowo = dlug.nextLine();
//    System.out.println(slowo + " ma " + slowo.length() + " liter ");

    double x = 5;
    double y = 2;
    double wynik = x/y;
    System.out.println(wynik);

    Scanner upper = new Scanner(System.in);
    System.out.println("podaj slowo");
    String slowoup = upper.nextLine();
    System.out.println("twoje słowo zapisane wielkimi literami " + slowoup.toUpperCase());

    Scanner kolo = new Scanner(System.in);
    System.out.println("podaj promień koła");
    int promien = kolo.nextInt();
    double pole = (Math.PI * Math.pow(promien, 2));
    System.out.println("pole twojego koła to " + Math.round(pole));

}
