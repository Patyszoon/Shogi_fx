package Myapp.bierki;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Goniec extends PromowalnaBierka{

    @Override
    protected boolean czyLegalnyPrzedPromocja(int kolumna, int wiersz) {
        if(kolumna == this.nrKolumny && wiersz == this.nrWiersza)return false;
        int odlegloscX = kolumna - this.nrKolumny;
        int odlegloscY = wiersz - this.nrWiersza;
        return (odlegloscY == odlegloscX) || ((odlegloscY * (-1)) == odlegloscX);
    }

    @Override
    protected boolean czyLegalnyPoPromocji(int kolumna, int wiersz) {
        if(kolumna == this.nrKolumny && wiersz == this.nrWiersza -1)return true;
        if(kolumna == this.nrKolumny && wiersz == this.nrWiersza +1)return true;
        if(kolumna == this.nrKolumny +1 && wiersz == this.nrWiersza)return true;
        if (kolumna == this.nrKolumny - 1 && wiersz == this.nrWiersza) return true;
        return czyLegalnyPrzedPromocja(kolumna, wiersz);
    }
    //ScenaRozgrywkiController scena = new ScenaRozgrywkiController();
    public Goniec(Kolor kolor, Stan stanb, int kolumna, int wiersz) {
        super(kolor, stanb, kolumna, wiersz);
        if(promowana == false){
            Image image = new Image(getClass().getResourceAsStream("/Myapp/"+setSkorka(skorka)+"/Goniec.png"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(50);
            imageView.setFitHeight(60);
            if(kolor==Kolor.BIALY){
                imageView.setRotate(180);
            }
            //scena.przyciski[kolumna][wiersz].setGraphic(imageView);
        }
        else{
            Image image = new Image(getClass().getResourceAsStream("/Myapp/"+setSkorka(skorka)+"/PromowanyGoniec.png"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(50);
            imageView.setFitHeight(60);
            if(kolor==Kolor.BIALY){
                imageView.setRotate(180);
            }
            //scena.przyciski[kolumna][wiersz].setGraphic(imageView);
        }

    }
}
