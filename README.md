Napiši Java program koji omogućuje kopiranje izvorne binarne datoteke.

Tražite od korisnika putanju do originalne datoteke (npr. C:/temp/original.pdf)

Tražite od korisnika naziv destinacijske datoteke (npr. C:/temp/ kopija.pdf)

Koristeći FileInputStream i FileOutputStream, kopirajte byte po byte iz izvorne datoteke u destinacijsku

Obradite sve moguće potencijalne iznimke (putanja ne postoji, nemate prava za pisanje ili čitanje, ...)

Po završetku, provjerite je li kopija uspješno napravljena, te ju pokušajte otvoriti kroz File Explorer.

Prouči klasu java.io.File. Pronađi metode exists() i delete(). Provjerite programski je datoteka prethodno uspješno kopirana (metoda exists) I ako je, pobrisite ju (metoda delete)
