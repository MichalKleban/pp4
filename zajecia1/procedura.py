def proceduraDopisu(nazwaPliku, tresc):
    with open(nazwaPliku, "a") as plik:
        plik.write(tresc)

proceduraDopisu("testProcedury.txt", "Przykladowy dopis do pliku")