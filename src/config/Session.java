/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author Frank
 */
public class Session {
    
    private static Session instance;
    
    private int uid;
    private String uname;
    private String uemail;
    private String uusername;
    private String utype;
    
    private Session(){
        
    }

    public static synchronized Session getInstance() {
        if(instance == null){
            instance = new Session();
        }
        return instance;
        
    }

    public static boolean isInstanceEmpty() {
        return instance == null;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUusername() {
        return uusername;
    }

    public void setUusername(String uusername) {
        this.uusername = uusername;
    }

    public String getUtype() {
        return utype;
    }

    public void setUtype(String utype) {
        this.utype = utype;
    }
    
    
    
    
   
    
    
    
}
