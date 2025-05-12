package Myapp.bierki;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Pion extends PromowalnaBierka{

    //ScenaRozgrywkiController scena = new ScenaRozgrywkiController();
    public Pion(Kolor kolor, Stan stanb, int kolumna, int wiersz) {
        super(kolor, stanb, kolumna, wiersz);
        if(promowana == false){
            Image image = new Image(getClass().getResourceAsStream("/Myapp/"+setSkorka(skorka)+"/Pionek.png"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(50);
            imageView.setFitHeight(60);
            if(kolor==Kolor.BIALY){
                imageView.setRotate(180);
            }
            //scena.przyciski[kolumna][wiersz].setGraphic(imageView);
        }
        else{
            Image image = new Image(getClass().getResourceAsStream("/Myapp/"+setSkorka(skorka)+"/PromowanyPion.png"));
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
        System.out.println((kolumna == this.nrKolumny) && (wiersz == this.nrWiersza + odwrotka));
        return (kolumna == this.nrKolumny) && (wiersz == this.nrWiersza +odwrotka);
    }
}
