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
public class Pikachu extends Pokemon {
    public int hasarPuani;
    public boolean kartKullanildiMi;

    public Pikachu() {
        super();
        this.hasarPuani = 0;
        this.kartKullanildiMi = false;
    }
    
    public Pikachu(String pokemonAdi, String pokemonTip, int hasarPuani) {
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
