package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author marcin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
        Scanner zad = new Scanner(System.in);
        System.out.println("Podaj numer zadania: ");
        int zadanie = zad.nextInt();
        System.out.println();
        System.out.println("Wybrales zadanie numer " + zadanie + ". Oto jego rozwiazanie: ");
        System.out.println();
        switch (zadanie) {
            case 3:
                int k;
                System.out.println("Podaj 10 rzeczywistych elementow tablicy: ");
                do {
                    Scanner scanner = new Scanner(System.in);
                    int[] tab = new int[10];
                    for (int z = 0; z < tab.length; z++) {
                        tab[z] = scanner.nextInt();
                    }
                    System.out.println("Z ktorej funkcjonalnosci chcesz skorzystac:");
                    System.out.println("1. Wyswietlanie tablicy od pierwszego do ostatniego indeksu\n"
                            + "2. Wyswietlanie tablicy od ostatniego do pierwszego indeksu\n"
                            + "3. Wyswietlanie elementów o nieparzystych indeksach\n"
                            + "4. Wyswietlanie elementów o parzystych indeksach ?\n");
                    int fun = scanner.nextInt();
                    System.out.println();

                    if (fun == 1) {
                        System.out.println("Wybrales funkcjonalnosc o  numerze " + fun + ". Oto jej wynik: ");
                        for (k = 0; k < tab.length; k++) {
                            System.out.println(tab[k]);
                        }
                        break;
                    } else if (fun == 2) {
                        System.out.println("Wybrales funkcjonalnosc o  numerze " + fun + ". Oto jej wynik: ");
                        for (k = tab.length - 1; k >= 0; k--) {
                            System.out.println(tab[k]);
                        }
                        break;
                    } else if (fun == 3) {
                        System.out.println("Wybrales funkcjonalnosc o  numerze " + fun + ". Oto jej wynik: ");
                        for (k = 0; k < tab.length; k++) {
                            if (k % 2 != 0) {
                                System.out.println(tab[k]);
                            }
                        }
                        break;
                    } else if (fun == 4) {
                        System.out.println("Wybrales funkcjonalnosc o  numerze " + fun + ". Oto jej wynik: ");
                        for (k = 0; k < tab.length; k++) {
                            if (k % 2 == 0) {
                                System.out.println(tab[k]);
                            }
                        }
                        break;
                    } else {
                        System.out.println("Nie ma funkcjonalnosci o takim oznakowaniu");
                        System.out.println("Wprowadz elementy tablicy jeszcze raz: ");
                    }

                } while (true);
                break;

            case 4:
                System.out.println("Podaj 10 rzeczywistych elementow tablicy: ");
                Scanner scanner = new Scanner(System.in);
                int[] tab = new int[10];
                for (int y = 0; y < tab.length; y++) {
                    tab[y] = scanner.nextInt();
                }
                int l;
                System.out.println("Z ktorej funkcjonalnosci chcesz skorzystac:");
                System.out.println("1. Wyswietlanie sumy elementow tablicy\n"
                        + "2. Wyswietlanie iloczynu elementow tablicy\n"
                        + "3. Wyswietlanie sredniej wartosci\n"
                        + "4. Wyswietlanie wartosci minimalnej\n"
                        + "5. Wyswietlanie wartosci maksymalnej ?\n");
                int fun = scanner.nextInt();
                System.out.println();
                switch (fun) {
                    case 1:
                        double suma = 0;
                        for (l = 0; l < tab.length; l++) {
                            suma += tab[l];
                        }
                        suma *= 100;
                        suma = Math.round(suma);
                        suma /= 100;
                        System.out.println("Wartosc sumy elementow tablicy wynosi: " + suma);
                        break;
                    case 2:
                        double iloczyn = 1;
                        for (l = 0; l < tab.length; l++) {
                            iloczyn *= tab[l];
                        }
                        iloczyn *= 100;
                        iloczyn = Math.round(iloczyn);
                        iloczyn /= 100;
                        System.out.println("Wartosc iloczynu elementow tablicy wynosi: " + iloczyn);
                        break;
                    case 3:
                        double suma3 = 0;
                        for (l = 0; l < tab.length; l++) {
                            suma3 += tab[l];
                        }
                        double srednia = suma3 / tab.length;
                        srednia *= 100;
                        srednia = Math.round(srednia);
                        srednia /= 100;
                        System.out.println("Srednia wartosc elementow tablicy wynosi: " + srednia);
                        break;
                    case 4:
                        double min = tab[0];
                        for (l = 1; l < tab.length; l++) {
                            if (min > tab[l]) {
                                min = tab[l];
                            }
                        }
                        System.out.println("Minimalna wartosc wsrod elementow tablicy wynosi: " + min);
                        break;

                    case 5:
                        double max = tab[0];
                        for (l = 1; l < tab.length; l++) {
                            if (max < tab[l]) {
                                max = tab[l];
                            }
                        }
                        System.out.println("Maksymalna wartosc wsrod elementow tablicy wynosi: " + max);
                        break;

                    default:
                        System.out.println("Podales nieprawidlowy numer funkcjonalnosci");
                        break;
                }
                break;

            case 5:
                for (int m = 20; m >= 0; m--) {
                    if (m == 2 || m == 6 || m == 9 || m == 15 || m == 19) {
                        continue;
                    }
                    System.out.println(m);
                }
                break;

            case 6:
                while (true) {
                    Scanner zad6 = new Scanner(System.in);
                    double liczba = zad6.nextDouble();
                    if (liczba < 0) {
                        System.out.println("Podales liczbe mniejsza od zera - koniec petli");
                        break;
                    }
                }

                //drugi sposob
//                for(;;){
//                    Scanner zad6 = new Scanner(System.in);
//                    double liczba = zad6.nextDouble();
//                    if (liczba < 0) {
//                        System.out.println("Podales liczbe mniejsza od zera - koniec petli");
//                        break;
//                    }
//                }
                break;

            case 7:
                Scanner zad7 = new Scanner(System.in);
                System.out.println("Podaj liczbę elementow tablicy: ");
                int w = zad7.nextInt();
                System.out.println();
                System.out.println("Wprowadz elementy tablicy: ");
                int[] tablica = new int[w];
                for (int n = 0; n < tablica.length; n++) {
                    tablica[n] = zad7.nextInt();
                }
                System.out.println();
                System.out.println("Tablica wyglada tak: ");
                System.out.println();
                for (int p = 0; p < tablica.length; p++) {
                    System.out.print(tablica[p] + " ");
                }
                System.out.println();
                System.out.println();
                System.out.println("Z ktorej funkcjonalnosci chcesz skorzystac:");
                System.out.println("1. Sortowanie babelkowe\n"
                        + "2. Sortowanie przez wstawianie\n");
                int r = zad7.nextInt();
                System.out.println();
                switch (r) {
                    case 1:
                        b_sort(tablica);
                        break;

                    case 2:
                        insertionsort(tablica);
                        for (int t = 0; t < w; t++) {
                            System.out.println(tablica[t]);
                        }
                        break;
                }
                break;

            default:
                System.out.println();
                System.out.println("Nie ma zadania o takim numerze");
                break;
        }

    }

    /*
     * Programy sortowanie liczb calkowitych metoda babelkowa i metoda przez wstawianie
     * zostaly pobrane ze strony www.algorytm.org
     */
    public static void b_sort(int tab[]) {
        int temp;
        int zmiana = 1;
        while (zmiana > 0) {
            zmiana = 0;
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    temp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                    zmiana++;
                }
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }

    public static void swap(int[] tablica, int i, int j) {
        int temp = tablica[i];
        tablica[i] = tablica[j];
        tablica[j] = temp;
    }

    public static void insertionsort(int[] tablica) {
        for (int i = 1; i < tablica.length; i++) {

            for (int j = i - 1; j >= 0; j--) {
                if (tablica[j] > tablica[j + 1]) {
                    swap(tablica, j, j + 1);
                } else {
                    break;
                }
            }
        }
    }

}
