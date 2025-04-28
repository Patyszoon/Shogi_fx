package bierki;


import Myapp.ScenaRozgrywkiController;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Skoczek extends PromowalnaBierka {
    //ScenaRozgrywkiController scena = new ScenaRozgrywkiController();
    public Skoczek(Kolor kolor, Stan stanb, int kolumna, int wiersz) {
        super(kolor, stanb, kolumna, wiersz);
        nieSkoczek = false;
        if(promowana == false){
            Image image = new Image(getClass().getResourceAsStream("/Myapp/bierki/Skoczek.png"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(50);
            imageView.setFitHeight(60);
            if(kolor==Kolor.BIALY){
                imageView.setRotate(180);
            }
            //scena.przyciski[kolumna][wiersz].setGraphic(imageView);
        }
        else{
            Image image = new Image(getClass().getResourceAsStream("/Myapp/bierki/PromowanySkoczek.png"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(50);
            imageView.setFitHeight(60);
            if(kolor==Kolor.BIALY){
                imageView.setRotate(180);
            }
            //scena.przyciski[kolumna][wiersz].setGraphic(imageView);
        }

    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int kolumna, int wiersz) {
        int odwrotka = (this.getKolor() == Kolor.BIALY)?1:-1;
        if(kolumna == this.nrKolumny -1 && wiersz == this.nrWiersza +2*odwrotka)return true;
        return kolumna == this.nrKolumny + 1 && wiersz == this.nrWiersza + 2*odwrotka;
    }
}
