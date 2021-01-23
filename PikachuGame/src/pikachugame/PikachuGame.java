package pikachugame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random; 
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class PikachuGame extends JFrame {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu("Pikachu","Elektrik",40);
        Bulbasaur bulbasaur = new Bulbasaur("Bulbasaur","Çim",50);
        Charmander charmander = new Charmander("Charmander","Ateş",60);
        Squirtle squirtle = new Squirtle("Squirtle","Su",30);
        Zubat zubat = new Zubat("Zubat","Hava",50);
        Psyduck psyduck = new Psyduck("Psyduck","Su",20);
        Snorlax snorlax = new Snorlax("Snorlax","Normal",30);
        Butterfree butterfree = new Butterfree("Butterfree","Hava",10);
        Jigglypuff jigglypuff = new Jigglypuff("Jigglypuff","Ses",70);
        Meowth meowth = new Meowth("Meowth","Normal",40);
        Bilgisayar pc = new Bilgisayar(1,"Faruk",0);
        Kullanici user = new Kullanici(1,"Sefa",0);
        Pokemon []kartlar=new Pokemon[10];
        kartlar[0]=pikachu;
        kartlar[1]=bulbasaur;
        kartlar[2]=charmander;
        kartlar[3]=squirtle;
        kartlar[4]=zubat;
        kartlar[5]=psyduck;
        kartlar[6]=snorlax;
        kartlar[7]=butterfree;
        kartlar[8]=jigglypuff;
        kartlar[9]=meowth;
        Random rand = new Random();
        for(int i=0;i<3;i++){
            int a = rand.nextInt(10);
            if(kartlar[a].getKartSahipliMi()==false){
                kartlar[a].setKartSahipliMi();
                pc.setKartListesi(kartlar[a]);
            }else{
                i--;
            }
        }
        for(int i=0;i<3;i++){
            int a = rand.nextInt(10);
            if(kartlar[a].getKartSahipliMi()==false){
                kartlar[a].setKartSahipliMi();
                user.setKartListesi(kartlar[a]);
            }else{
                i--;
            }
        }
        
        /*for(int i=0;i<pc.kartListesi.size();i++){
            System.out.println(pc.kartListesi.get(i).pokemonAdi+"("+pc.kartListesi.get(i).hasarPuaniGoster()+")");
            System.out.println(user.kartListesi.get(i).pokemonAdi+"("+user.kartListesi.get(i).hasarPuaniGoster()+")");
        }*/
        JFrame sema = new JFrame();
        sema.setTitle("FARUK");
        sema.setSize(600,400);
        sema.setLocation(100,100);
        sema.setResizable(false);
        
        JPanel GUI = new JPanel();
        GUI.setLayout(null);
        
        JPanel pcPanel = new JPanel();
        pcPanel.setSize(600,100);
        pcPanel.setLocation(0,50);
        GUI.add(pcPanel);
        
        /*JLabel pcTitle = new JLabel("Bilgisayarın Kartları");
        pcTitle.setSize(200,50);
        pcTitle.setLocation(0,0);
        pcTitle.setHorizontalAlignment(0);
        pcPanel.add(pcTitle);*/
        
        ArrayList<JLabel> pcKart = new ArrayList<JLabel>();
        for(int i=0;i<pc.kartListesi.size();i++){
            JLabel pcKartTmp = new JLabel(pc.kartListesi.get(i).pokemonAdi+" ("+pc.kartListesi.get(i).hasarPuaniGoster()+")");
            pcKartTmp.setSize(200,50);
            pcKartTmp.setToolTipText(pc.kartListesi.get(i).pokemonAdi);
            pcKartTmp.setLocation(200,0);
            pcKartTmp.setHorizontalAlignment(0);
            pcPanel.add(pcKartTmp);
            pcKart.add(pcKartTmp);
        }
        JPanel userPanel = new JPanel();
        userPanel.setSize(600,100);
        userPanel.setLocation(0,250);
        GUI.add(userPanel);
        for(int i=0;i<user.kartListesi.size();i++){
            Pokemon akart = user.kartListesi.get(i);
            int hasar = akart.hasarPuaniGoster();
            String Adi = akart.pokemonAdi;
            JButton userKart = new JButton(Adi+"("+hasar+")");
            userKart.setSize(200,100);
            userKart.setHorizontalAlignment(0);
            userKart.addActionListener(new ActionListener(){          
                public void actionPerformed(ActionEvent e) {
                    Pokemon kart = pc.kartSec();
                    kart.setKartKullanildiMi();
                    akart.setKartKullanildiMi();
                    JOptionPane message = new JOptionPane();
                    if(kart.hasarPuaniGoster()>hasar){
                        pc.setSkor();
                        message.showMessageDialog(sema,"Bilgisayarın Kartı "+kart.pokemonAdi+", Senin Kartın "+Adi+" yendi.","Bilgisayar:"+pc.SkorGoster()+" Oyuncu:"+user.SkorGoster(), JOptionPane.INFORMATION_MESSAGE);
                    }else if(kart.hasarPuaniGoster()<hasar){
                        user.setSkor();
                        message.showMessageDialog(sema,"Senin Kartın "+Adi+", Bilgisayarın Kartı "+kart.pokemonAdi+" yendi.","Bilgisayar:"+pc.SkorGoster()+" Oyuncu:"+user.SkorGoster(), JOptionPane.INFORMATION_MESSAGE);   
                    }else{
                        message.showMessageDialog(sema,"Senin Kartın "+Adi+", Bilgisayarın Kartı "+kart.pokemonAdi+" ile berabere kaldı.","Bilgisayar:"+pc.SkorGoster()+" Oyuncu:"+user.SkorGoster(), JOptionPane.INFORMATION_MESSAGE);
                    }
                    if(user.kartListesi.size()<5){
                        int b,c=0;
                        do{
                            b = rand.nextInt(10);
                            if(kartlar[b].getKartSahipliMi()==false){
                                c=1;
                                kartlar[b].setKartSahipliMi();
                                user.kartListesi.add(kartlar[b]);
                                userKart.setText(kartlar[b].pokemonAdi+" ("+kartlar[b].hasarPuaniGoster()+")");
                            }
                        }while(c==0);
                        c=0;
                        do{
                            b = rand.nextInt(10);
                            if(kartlar[b].getKartSahipliMi()==false){
                                c=1;
                                kartlar[b].setKartSahipliMi();
                                pc.kartListesi.add(kartlar[b]);
                                for (JLabel label: pcKart){
                                    if(label.getToolTipText()==kart.pokemonAdi){
                                        label.setText(kartlar[b].pokemonAdi+" ("+kartlar[b].hasarPuaniGoster()+")");
                                        label.setToolTipText(kartlar[b].pokemonAdi);
                                    }
                                }
                            }
                        }while(c==0);
                    }else{
                        userKart.setVisible(false);
                        for (JLabel label: pcKart){
                            if(label.getToolTipText()==kart.pokemonAdi){
                                label.setVisible(false);
                            }
                        }
                    }
                    
                    
                }
            });
            userPanel.add(userKart);
        }
        sema.setContentPane(GUI);
        sema.setVisible(true);
        
    }
}
