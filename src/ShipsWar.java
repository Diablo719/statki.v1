import java.util.Random;
import java.util.Scanner;

public class ShipsWar {
    public static void main(String[] args) {

        int[][] polaBota = {    {11, 21, 31, 41},
                                 {12, 22, 32, 42},
                                 {13, 23, 33, 43},
                                 {14, 24, 34, 44}};

        int liczbaWierszyBota = polaBota.length;
        int liczbaKolumnBota = polaBota[0].length;

        Random random1 = new Random();
        int losowyWierszbota = random1.nextInt(liczbaWierszyBota);
        int losowaKolumnabota = random1.nextInt(liczbaKolumnBota);

        int wartoscNaLosowymPoluBota = polaBota[losowyWierszbota][losowaKolumnabota];
        // System.out.println(wartoscNaLosowymPoluBota + " statek bota test");


        Scanner sc = new Scanner(System.in);
        System.out.println("wybierz pole swojego statku\n"+
                "                {11, 21, 31, 41},\n" +
                "                {12, 22, 32, 42},\n" +
                "                {13, 23, 33, 43},\n" +
                "                {14, 24, 34, 44}" );
        int statek = sc.nextInt(); // umiejscowienie swojego statku na planszy

        int a=5; // int okreslajacy liczbe rund
     
        while (a>0) {
            a--;
            System.out.println("wybierz pole do ataku");
            Scanner sc1 = new Scanner(System.in);
            int ruchGracza = sc1.nextInt();

            if (ruchGracza == wartoscNaLosowymPoluBota) {
                System.out.println("hit trafiles bota wygrałeś");
                break;
            }


            int[][] polagracza = {
                                  {11, 21, 31, 41},
                                  {12, 22, 32, 42},
                                  {13, 23, 33, 43},
                                  {14, 24, 34, 44}
            };

            Random random = new Random();
            int liczbaWierszy = polagracza.length;
            int liczbaKolumn = polagracza[0].length;
            int losowyWiersz = random.nextInt(liczbaWierszy);
            int losowaKolumna = random.nextInt(liczbaKolumn);
            int wartoscNaLosowymPolu = polagracza[losowyWiersz][losowaKolumna];
            System.out.println("bot srzela w " + wartoscNaLosowymPolu);
           // System.out.println("test" + 11);

            // int abc = wartoscNaLosowymPolu;
           // if(statek == 11 ){ // test przegrywania
            if(statek == wartoscNaLosowymPolu ){
                System.out.println("hit zostales trafiony przegrałeś ");
                break;}
        }

    }

}





//    wybierz pole swojego statku
//                        {11, 21, 31, 41},
//                        {12, 22, 32, 42},
//                        {13, 23, 33, 43},
//                        {14, 24, 34, 44}
//                        11
//                        wybierz pole do ataku
//                        33
//                        bot srzela w11
//                        hit zostales trafiony przegrałeś
// zrobic 2 statki jeden na 2 pola jeden na 3
// licznik co sprawdza czy to nie jest trafione pole


//!(abc == wartoscNaLosowymPolu)

//C:\Users\ingus\.jdks\openjdk-21.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.2.5\lib\idea_rt.jar=50197:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.2.5\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\ingus\IdeaProjects\BattleShipsWorkEdition\out\production\BattleShipsWorkEdition ShipsWar
//        wybierz pole swojego statku
//        {11, 21, 31, 41},
//        {12, 22, 32, 42},
//        {13, 23, 33, 43},
//        {14, 24, 34, 44}
//        23
//        wybierz pole do ataku
//        11
//        bot srzela w21
//        wybierz pole do ataku
//        34
//        hit trafiles bota wygrałeś
//
//        Process finished with exit code 0
