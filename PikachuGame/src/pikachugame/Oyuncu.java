/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pikachugame;

import java.util.ArrayList;


/**
 *
 * @author Faruk
 */
public class Oyuncu {
    public int oyuncuID;
    public String oyuncuAdi;
    public int Skor;
    ArrayList<Pokemon> kartListesi = new ArrayList<Pokemon>();
    
    public Oyuncu(){
        this.oyuncuID = 0;
        this.oyuncuAdi = "";
        this.Skor = 0;
    }
    
    public Oyuncu(int id,String adi,int skor){
        this.oyuncuID = id;
        this.oyuncuAdi = adi;
        this.Skor = skor;
    }
    
    public int SkorGoster(){
        return Skor;
    }
    
    public void setSkor(){
        Skor += 1;
    }
    
    public void setKartListesi(Pokemon kart){
        kartListesi.add(kart);
    }
    
    public Pokemon kartSec(){
        return new Pokemon();
    }
}
