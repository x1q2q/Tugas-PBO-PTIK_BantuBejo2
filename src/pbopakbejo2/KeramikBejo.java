/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbopakbejo2;

/**
 *
 * @author rafikbojes
 */
public class KeramikBejo {
    int luasTanah,panjang,lebar,harga,isi,hargaMurah;
    String tipeMurah;
    
    KeramikBejo (int luas, int p, int l, int isi, int hrg){ // constructor
        this.luasTanah = luas; 
        this.panjang = p;
        this.lebar = l;
        this.harga = hrg;
        this.isi = isi;
    }
    
    float luasKeramik(){ // non-void method
      return this.panjang*this.lebar;
    };
    float luasTanahCM(){ // non-void method
        return this.luasTanah*100;
    };
    int hitungHarga(){ // non-void method
        return this.hitungBox() * this.harga;
    };
    int hitungBox(){ // non-void method
      double hasil =  (this.luasTanahCM()/this.luasKeramik() * 100)/this.isi;
      return (int) Math.round(hasil); 
    };
}
