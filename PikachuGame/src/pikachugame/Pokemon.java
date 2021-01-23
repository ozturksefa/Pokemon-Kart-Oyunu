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
public class Pokemon {
    public String pokemonAdi;
    public String pokemonTip;
    public Boolean kartSahipliMi;
    
    public Pokemon(){
        this.pokemonAdi = "";
        this.pokemonTip = "";
        this.kartSahipliMi = false;
    }
    
    public Pokemon(String pokemonAdi,String pokemonTip){
        this.pokemonAdi = pokemonAdi;
        this.pokemonTip = pokemonTip;
        this.kartSahipliMi = false;
    }
    
    public int hasarPuaniGoster(){
        return 0;
    }

    public boolean getKartKullanildiMi() {
        return false;
    }
    
    public void setKartKullanildiMi() {
    }
    
    public boolean getKartSahipliMi() {
        return kartSahipliMi;
    }
    
    public void setKartSahipliMi() {
        this.kartSahipliMi = true;
    }
}
