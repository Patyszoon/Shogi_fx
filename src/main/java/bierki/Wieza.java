package bierki;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Wieza extends PromowalnaBierka{

    public Wieza(Kolor kolor, Stan stanb, int kolumna, int wiersz) {
        super(kolor, stanb, kolumna, wiersz);
        if(promowana == false){
            Image image = new Image(getClass().getResourceAsStream("/Myapp/bierki/Wieza.png"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(50);
            imageView.setFitHeight(60);
            if(kolor==Kolor.BIALY){
                imageView.setRotate(180);
            }
        }
        else{
            Image image = new Image(getClass().getResourceAsStream("/Myapp/bierki/PromowanaWieza.png"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(50);
            imageView.setFitHeight(60);
            if(kolor==Kolor.BIALY){
                imageView.setRotate(180);
            }
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
