Assignment - Metrika, pregled i statička analiza

1. LOC za sve prikazane fajlove:
Calculator.java = 188;
Start.java      =  26;
Suma = 188 + 26 = 214;

2. Ciklomacka složenost navedenog koda: Dobijenom metrikom 15 navedeni kod spada u umereno kompleksan kod sa umerenim rizikom.

3. Kongnitivna složenost navedenog koda: Dobijenom metrikom 13 navedeni kod spada u umereno kompleksan koda sa umerenim rizikom.

4. Neformalni pregled:
Dostavljena MIT licenca;
Calculator.java = 188 = Kod koji sadrži simbole osnovnih matematičkih operacija, sa if i else naredbama vrste toka;
Start.java = 26 = Kod za aktiviranje skenera. Koristi while petlju sa if i else naredbama vrste toka;

5. Statička analiza: Primenom Visual Studio Code korišćenjem SonarLint "Calculator.java" ima 8 prijavljenih problema:
Ln  4,Col 14 = Dodati privatni konstruktor kako bi se sakrio privatni;
Ln 18,Col 30 = Preimenovati metodu "ToString" da bi se sprečio bilo kakakav sukob sa metodom "toString" definisano u superklasi "java.lang.Object";
Ln  1,Col  1 = Premestiti ovo datoteku u imenovani paket;
Ln 18,Col 30 = Preimenujte ime ove metode tako da odgovara regularnom izrazu;
Ln 24,Col 26 = Preimenujte ime ove metode tako da odgovara regularnom izrazu;
Ln 70,Col 29 = Odmah vratiti ovaj izraz umesto da ga dodelite privremeno promenljivoj "textResult"; 
Ln 74,Col 25 = Preimenujte ime ove metode tako da odgovara regularnom izrazu;
Ln183,Col 13 = Ukloniti ovaj suvišni skok;
Primenom Visual Studio Code korišćenjem SonarLint "Start.java" ima 4 prijavljana problema;
Ln  8,Col  3 = Zameniti ovu upotrebu System.out ili System.err sa logerom;
Ln 19,Col  5 = Zameniti ovu upotrebu System.out ili System.err sa logerom;
Ln  1,Col  1 = Premestiti ovo datoteku u imenovani paket;
Ln  6,Col 10 = Preimenujte ovu lokalnu promenljivu da odgovara regularnom izrazu; 
