package bierki;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Pion extends PromowalnaBierka{


    public Pion(Kolor kolor, Stan stanb, int kolumna, int wiersz) {
        super(kolor, stanb, kolumna, wiersz);
        if(promowana == false){
            Image image = new Image(getClass().getResourceAsStream("/Myapp/bierki/Pionek.png"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(50);
            imageView.setFitHeight(60);
            if(kolor==Kolor.BIALY){
                imageView.setRotate(180);
            }
        }
        else{
            Image image = new Image(getClass().getResourceAsStream("/Myapp/bierki/PromowanyPion.png"));
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(50);
            imageView.setFitHeight(60);
            if(kolor==Kolor.BIALY){
                imageView.setRotate(180);
            }
        }
    }

    @Override
    protected boolean czyLegalnyPrzedPromocja(int kolumna, int wiersz) {
        int odwrotka = (this.getKolor() == Kolor.BIALY)?1:-1;
        System.out.println((kolumna == this.nrKolumny) && (wiersz == this.nrWiersza + odwrotka));
        return (kolumna == this.nrKolumny) && (wiersz == this.nrWiersza +odwrotka);
    }
}
