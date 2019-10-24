/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Kelompok16;

import javax.ejb.Stateful;

/**
 *
 * @author Afif
 */
@Stateful
public class LoginSession implements LoginSessionLocal {
    public final String [] Nama = {"Afif Wica", "Edho Satrio", "Yogiaa", "Rizkuu", "Wildann"};
    public final String [] Nim = {"211201161300599", "211201161300800", "211201161300900", "211201161300900", "211201161300800"};

   private String checkNama (String param){
        for (int i = 0; i< Nama.length; i++){
            if (param.equals (Nama[i])){
                return "Nama Praktikan : " + Nama[i]+"("+Nim[i]+")";   
            }
        }
        return null;
    }
    
    private String checkNim (String param){
        for (int i = 0; i< Nim.length; i++){
            if (param.equals (Nim[i])){
                return "Nama Praktikan : " + Nama[i]+"("+Nim[i]+")";
            }
        }
        return null;
    }
    
    
    public String search (String param){
        if (checkNama(param) != null) return checkNama(param);
        else if (checkNim(param) != null) return checkNim(param);
        return null;
    }
    
    
    private boolean loginStatus = false;
    @Override
    public boolean Login(String Nama, String Nim) {
      
      
      return Nama.equals(this.Nama[0]) && Nim.equals(this.Nim[0])  ||
              Nama.equals(this.Nama[1]) && Nim.equals(this.Nim[1]) || 
              Nama.equals(this.Nama[2]) && Nim.equals(this.Nim[2]) ||
              Nama.equals(this.Nama[3]) && Nim.equals(this.Nim[3]) ||
              Nama.equals(this.Nama[4]) && Nim.equals(this.Nim[4]);
        
    }
    
    @Override
    public boolean isLoginStatus() {
        return loginStatus;
    }
    @Override
    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    
}
