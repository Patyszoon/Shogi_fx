package Myapp.bierki;

import Myapp.ScenaRozgrywkiController;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Krol extends Bierka{

    @Override
    public boolean czyLegalny(int kolumna, int wiersz)
    {
        if(kolumna == this.nrKolumny && wiersz == this.nrWiersza) return false;
        for(int xl = kolumna-1; xl <= kolumna+1; xl++)
            for(int yl = wiersz-1; yl <= wiersz+1; yl++)
                if(xl == this.nrKolumny && yl == this.nrWiersza) return true;
        return false;
    }
    //ScenaRozgrywkiController scena = new ScenaRozgrywkiController();
    public Krol(Kolor kolor, Stan stanb, int kolumna, int wiersz) {
        super(kolor, stanb, kolumna, wiersz);

        if(kolor==Kolor.BIALY){
            Image image = new Image(getClass().getResourceAsStream("/Myapp/klasyczne/Krol.png"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(50);
            imageView.setFitHeight(60);
            imageView.setRotate(180);
            //scena.przyciski[kolumna][wiersz].setGraphic(imageView);
        }
        else{
            Image image = new Image(getClass().getResourceAsStream("/Myapp/klasyczne/Krol2.png"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(50);
            imageView.setFitHeight(60);
            //scena.przyciski[kolumna][wiersz].setGraphic(imageView);
        }
    }
}
