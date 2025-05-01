package bierki;

import Myapp.ScenaRozgrywkiController;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Wieza extends PromowalnaBierka{
    //ScenaRozgrywkiController scena = new ScenaRozgrywkiController();
    public Wieza(Kolor kolor, Stan stanb, int kolumna, int wiersz) {
        super(kolor, stanb, kolumna, wiersz);
        if(promowana == false){
            Image image = new Image(getClass().getResourceAsStream("/Myapp/klasyczne/Wieza.png"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(50);
            imageView.setFitHeight(60);
            if(kolor==Kolor.BIALY){
                imageView.setRotate(180);
            }
            //scena.przyciski[kolumna][wiersz].setGraphic(imageView);
        }
        else{
            Image image = new Image(getClass().getResourceAsStream("/Myapp/klasyczne/PromowanaWieza.png"));
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
    protected boolean czyLegalnyPoPromocji(int kolumna, int wiersz) {
        if(kolumna == this.nrKolumny -1 && wiersz == this.nrWiersza -1)return true;
        if(kolumna == this.nrKolumny -1 && wiersz == this.nrWiersza +1)return true;
        if(kolumna == this.nrKolumny +1 && wiersz == this.nrWiersza +1)return true;
        if(kolumna == this.nrKolumny +1 && wiersz == this.nrWiersza -1)return true;
        return czyLegalnyPrzedPromocja(kolumna, wiersz);
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int kolumna, int wiersz) {
        if(kolumna == this.nrKolumny && wiersz == this.nrWiersza) return false;
        if((kolumna == this.nrKolumny) || (wiersz == this.nrWiersza)) return true;
        return false;
    }
}
