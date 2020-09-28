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
public class HitungKeramik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] tipeKeramik = {"Keramik A","Keramik B","Keramik C"};
       int[] hargaKeramik = new int[3];
       KeramikBejo keramik;
       for(int i=0; i<tipeKeramik.length;i++){
           switch(i){
               case 0:
                   keramik = new KeramikBejo(100,30,30,10,54000);
                   hargaKeramik[0] = keramik.hitungHarga();
                   break;
                   
                case 1:
                   keramik = new KeramikBejo(100,40,50,5,65000);
                   hargaKeramik[1] = keramik.hitungHarga();
                   break;
                   
                 default:
                   keramik = new KeramikBejo(100,30,40,8,60000);
                   hargaKeramik[2] = keramik.hitungHarga();
                   break; 
           }
           
           System.out.println(tipeKeramik[i] + " membutuhkan kurang lebih "+ 
                   keramik.hitungBox()+" box untuk menutupi luas "+keramik.luasTanah+" m2.");
           System.out.println("Total biaya yang diperlukan "+tipeKeramik[i] 
                   + " adalah Rp. "+ keramik.hitungHarga()+"\n");  
           if(i+1 == tipeKeramik.length){
               for(int j=0; j<hargaKeramik.length; j++){
                if((keramik.hitungHarga())>hargaKeramik[j]){
                    keramik.hargaMurah=hargaKeramik[j];
                    keramik.tipeMurah=tipeKeramik[j];
                }
               }
                System.out.println("\n Ditarik kesimpulan bahwa merk "+keramik.tipeMurah+" dengan harga Rp."+keramik.hargaMurah+
                " adalah yang termurah dan sesuai kebutuhan.");
            }   
       } 
    }
}
