/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikachugame;

import java.util.Random;

/**
 *
 * @author Faruk
 */
public class Bilgisayar extends Oyuncu {
    
    public Bilgisayar() {
        super();
    }
    
    public Bilgisayar(int id,String adi,int skor) {
        super(id,adi,skor);
    }
    
    @Override public Pokemon kartSec(){
        Random rand = new Random();
        int c=0;
        do {
            int a = rand.nextInt(this.kartListesi.size());
            if(this.kartListesi.get(a).getKartKullanildiMi()==false){
              c=1;
              return this.kartListesi.get(a);
            }
        }while(c==0);
        return new Pokemon();
    }
}
