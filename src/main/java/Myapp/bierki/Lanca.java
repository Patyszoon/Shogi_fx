package Myapp.bierki;

import Myapp.ScenaRozgrywkiController;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Lanca extends PromowalnaBierka
{
    //ScenaRozgrywkiController scena = new ScenaRozgrywkiController();

    //do sprite'a bierki
    public Lanca(Kolor kolor, Stan stanb, int kolumna, int wiersz)
    {
        super(kolor, stanb, kolumna, wiersz);
        if (promowana == false)
        {
            Image image = new Image(getClass().getResourceAsStream("/Myapp/klasyczne/Lanca.png"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(50);
            imageView.setFitHeight(60);
            if (kolor == Kolor.BIALY)
            {
                imageView.setRotate(180);
            }
            //scena.przyciski[kolumna][wiersz].setGraphic(imageView);
        } else
        {
            Image image = new Image(getClass().getResourceAsStream("/Myapp/klasyczne/PromowanaLanca.png"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(50);
            imageView.setFitHeight(60);
            if (kolor == Kolor.BIALY)
            {
                imageView.setRotate(180);
            }
            //scena.przyciski[kolumna][wiersz].setGraphic(imageView);
        }

    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int kolumna, int wiersz)
    {
        return (kolumna == this.nrKolumny) && ((this.getKolor() == Kolor.BIALY) ? wiersz > this.nrWiersza : wiersz < this.nrWiersza);
    }
}
