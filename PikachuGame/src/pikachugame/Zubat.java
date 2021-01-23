/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikachugame;

/**
 *
 * @author Faruk
 */
public class Zubat extends Pokemon {
    public int hasarPuani;
    public boolean kartKullanildiMi;

    public Zubat() {
        super();
        this.hasarPuani = 0;
        this.kartKullanildiMi = false;
    }
    
    public Zubat(String pokemonAdi, String pokemonTip, int hasarPuani) {
        super(pokemonAdi, pokemonTip);
        this.hasarPuani = hasarPuani;
        this.kartKullanildiMi = false;
    }
    
    @Override public int hasarPuaniGoster(){
        return hasarPuani;
    }
    
    @Override public boolean getKartKullanildiMi(){
        return kartKullanildiMi;
    }
    
    @Override public void setKartKullanildiMi(){
        this.kartKullanildiMi = true;
    }
    
}