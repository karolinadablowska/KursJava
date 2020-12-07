package pl.karolina.enums;

public enum OpcjeMenu {
    DODAJ(1), USUN(2), WYSWIETL(3), ZAKONCZ(4);

    int value;

    OpcjeMenu(int value){
        this.value = value;
    }
}
