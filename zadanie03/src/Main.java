void main() {
    Scanner scanner = new Scanner(System.in);
//    System.out.println("podaj liczbę ");
//    int suma = 0;
//    int liczba;
//
//    for (;;) {
//        liczba = scanner.nextInt(); {
//            if (liczba == 0) {
//                break;
//            }
//        }
//        suma += liczba;
//    }
//
//System.out.println("suma twoich liczb to " +  suma);

//    int wylosowana =  (int)(Math.random() * 101);
//    int twoja;
//
//    System.out.println("sporoboj zgadnac liczbe od 1 do 100");
//
//    do {
//        System.out.println("podaj swoja liczbe");
//        twoja =  scanner.nextInt();
//        if (twoja > wylosowana) {
//            System.out.println("Podałeś za dużą wartość");
//        } else if (twoja < wylosowana) {
//            System.out.println("Podałeś za małą wartość");
//        } else {
//            System.out.println("Gratulacje");
//        }
//    } while (twoja != wylosowana);

//    System.out.println("podaj znak wypelnienia");
//    char z = scanner.next().charAt(0);
//
//    System.out.println("podaj szerokosc");
//    int a = scanner.nextInt();
//
//    System.out.println("podaj dlugosc");
//    int b = scanner.nextInt();
//
//    System.out.println("podaj x lewego gornego boku");
//    int x = scanner.nextInt();
//
//    System.out.println("podaj y lewego gornego boku");
//    int y = scanner.nextInt();
//
//    for (int i = 0; i < y - 1; i++ );
//    System.out.println();
//
//    for (int i = 0; i < a; i++) {
//        for (int j = 0; j < x - 1; j++ );
//        System.out.print(" ");
//    }
//
//    for (int j = 0; j < b; j++);{
//        System.out.print(z);
//    }
//    System.out.println();

//    System.out.println("podaj wysokosc");
//    int y = scanner.nextInt();
//
//    for (int i = 1; i <= y; i++) {
//        for (int j = 1; j <= y - i; j++){
//            System.out.print(" ");
//        }
//
//        for (int k = 1; k <= (2 * i - 1); k ++ ){
//            System.out.print("*");
//        }
//        System.out.println();
//    }



//    System.out.println("podaj liczbę");
//    int liczba = scanner.nextInt();
//
//    if (liczba < 0) {
//        System.out.println("tylko liczby dodatnie mają silnie");
//    } else {
//        int silnia = 1;
//
//        for (int i = 1; i <= liczba; i++ ) {
//            silnia *= i;
//        }
//        System.out.println("silnia twojej liczby wynosi " + silnia);
//    }

    System.out.println("podaj slowo");
    String slowo = scanner.nextLine();;

    String odwroconeslowo = new StringBuilder(slowo).reverse().toString();

    if (slowo.equals(odwroconeslowo)) {
        System.out.println("twoje slowo jest palindromem");
    } else {
        System.out.println("twoje slowo nie jest palindromem");
    }


}



