
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
    Scanner max3 = new Scanner(System.in);
    System.out.println("podaj 3 liczby");
    int lic1 = max3.nextInt();
    int lic2 = max3.nextInt();
    int lic3 = max3.nextInt();
    System.out.println("najwieksze jest " + Math.max(lic1, Math.max(lic2,lic3)));

    System.out.println("podaj numer miesiaca od 1 do 12");
    Scanner miesiace = new Scanner(System.in);
    int miesiac = miesiace.nextInt();

     switch (miesiac) {
        case 1:
            System.out.println("Styczen");
            break;
        case 2:
            System.out.println("Luty");
            break;
         case 3:
             System.out.println("Marzec");
             break;
         case 4:
             System.out.println("Kwiecien");
             break;
         case 5:
             System.out.println("Maj");
             break;
         case 6:
             System.out.println("Czerwiec");
             break;
         case 7:
             System.out.println("Lipiec");
             break;
         case 8:
             System.out.println("Sierpien");
             break;
         case 9:
             System.out.println("Wrzesien");
             break;
         case 10:
             System.out.println("Pazdziernik");
             break;
         case 11:
             System.out.println("Listopad");
             break;
         case 12:
             System.out.println("Grudzien");
             break;
        default:
            System.out.println("taki miesiac nie istnieje");


    };
}











































