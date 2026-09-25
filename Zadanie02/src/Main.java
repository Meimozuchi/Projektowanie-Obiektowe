
void main() {
//
//    Scanner podzielnosc = new Scanner(System.in);
//    System.out.println("podaj liczbe");
//    int pt = podzielnosc.nextInt();
//    if (pt % 3 == 0 ) {
//        System.out.println("twoja liczba jest podzilna przez 3");
//    } else {
//        System.out.println("twoja liczba nie jest podzielna przez 3");
//    }
//
//    Scanner trzy = new Scanner(System.in);
//    System.out.println("podaj 3 liczby");
//    int l1 = trzy.nextInt();
//    int l2 = trzy.nextInt();
//    int l3 = trzy.nextInt();
//    if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
//        System.out.println("taki trojkat istnieje");
//    } else {
//        System.out.println("taki trojkat nie istnieje");
//    }
//    Scanner max = new Scanner(System.in);
//    System.out.println("podaj 2 liczby");
//    int li1 = max.nextInt();
//    int li2 = max.nextInt();
//    System.out.println("wieksze jest " + Math.max(li1, li2));
//
//    Scanner max3 = new Scanner(System.in);
//    System.out.println("podaj 3 liczby");
//    int lic1 = max3.nextInt();
//    int lic2 = max3.nextInt();
//    int lic3 = max3.nextInt();
//    System.out.println("najwieksze jest " + Math.max(lic1, Math.max(lic2,lic3)));
//
//    System.out.println("podaj numer miesiaca od 1 do 12");
//    Scanner miesiace = new Scanner(System.in);
//    int miesiac = miesiace.nextInt();
//
//     switch (miesiac) {
//        case 1:
//            System.out.println("Styczen");
//            break;
//        case 2:
//            System.out.println("Luty");
//            break;
//         case 3:
//             System.out.println("Marzec");
//             break;
//         case 4:
//             System.out.println("Kwiecien");
//             break;
//         case 5:
//             System.out.println("Maj");
//             break;
//         case 6:
//             System.out.println("Czerwiec");
//             break;
//         case 7:
//             System.out.println("Lipiec");
//             break;
//         case 8:
//             System.out.println("Sierpien");
//             break;
//         case 9:
//             System.out.println("Wrzesien");
//             break;
//         case 10:
//             System.out.println("Pazdziernik");
//             break;
//         case 11:
//             System.out.println("Listopad");
//             break;
//         case 12:
//             System.out.println("Grudzien");
//             break;
//        default:
//            System.out.println("taki miesiac nie istnieje");
//
//
//    };

//    Scanner scimie = new Scanner(System.in);
//    String mojeimie = "Wojtek";
//    System.out.println("Podaj swoje imie bez polskich znakow");
//    String twimie = scimie.nextLine();
//    if (twimie.equalsIgnoreCase(mojeimie)) {
//        System.out.println("mamy takie samo imie");
//    } else {
//        System.out.println("mamy rozne imiona");
//    }

//    Scanner scwiek = new Scanner(System.in);
//    System.out.println("podaj swoj wiek");
//    int wiek = scwiek.nextInt();
//    boolean status = (wiek >= 18) ? true : false;
//    System.out.println(status);

//    Scanner scrok = new Scanner(System.in);
//    System.out.println("podaj rok ");
//    int rok = scrok.nextInt();
//    if (rok % 4 == 0 && rok % 100 != 0 || rok % 400 == 0 ){
//        System.out.println("twoj rok jest przestepny");
//    }else {
//        System.out.println("twoj rok nie jest przestepny");
//    }


//    Scanner scwagawzrost = new Scanner(System.in);
//    System.out.println("podaj wagę");
//    double waga = scwagawzrost.nextDouble();
//    System.out.println("podaj wzrost w metrach");
//    double wzrost = scwagawzrost.nextDouble();
//    double bmi = (waga/Math.sqrt(wzrost));
//    if (bmi > 18.5 && bmi < 24.9) {
//        System.out.println("waga prawidlowa");
//    } else if (bmi > 24.9) {
//        System.out.println("nadwaga");
//    } else {
//        System.out.println("niedowaga");
//    }
//    System.out.println(bmi);

    Scanner scannerrat = new Scanner(System.in);

    double cena = 0;
    int liczbarat = 0;
    while (true) {
        System.out.println("podaj cene towaru(od 100 do 10 000");
        if (scannerrat.hasNextDouble()) {
            cena = scannerrat.nextDouble();
            if (cena >= 100 && cena <= 10000) {
                break;
            } else {
                System.out.println("błąd");
            }
        }
    }
        while (true) {
            System.out.println("podaj liczbę rat (od 6 do 48) ");
            if (scannerrat.hasNextInt()) {
                liczbarat = scannerrat.nextInt();
                if (liczbarat >= 6 && liczbarat <= 48) {
                    break;
                } else {
                    System.out.println("błąd");
                }
            }
        }

        double oprocentowanie = 0.0;
        if (liczbarat >= 6 && liczbarat <= 12) {
            oprocentowanie = 0.025;
        } else if (liczbarat >= 13 && liczbarat <= 24) {
            oprocentowanie = 0.05;
        } else if (liczbarat >= 25 && liczbarat <= 48) {
            oprocentowanie = 0.1;
        }
        double kosztods = cena * oprocentowanie;
        double dosplaty = cena + kosztods;
        double miesiecznar = dosplaty / liczbarat;


    System.out.printf(Locale.US, "cena towaru %.2f zl\n", cena);
    System.out.println("liczba rat: " + liczbarat);
    System.out.printf(Locale.US, "oprocentowanie %.1f%%\n", oprocentowanie * 100);
    System.out.printf(Locale.US, "kwota odsetek %.2f zl\n", kosztods);
    System.out.printf(Locale.US, "łaczna kwota do zaplaty %.2f zl\n", dosplaty);
    System.out.printf(Locale.US, "wysokosc miesiecznej raty %.2f zl\n", miesiecznar );

}











































