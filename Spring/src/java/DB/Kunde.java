package DB;
// Generated 07.06.2016 13:30:50 by Hibernate Tools 4.3.1



/**
 * Kunde generated by hbm2java
 */
public class Kunde  implements java.io.Serializable {


     private int idKunde;
     private String name;
     private String vorname;
     private String plz;
     private String ort;
     private String stra�e;
     private Integer prio;

    public Kunde() {
    }

	
    public Kunde(int idKunde) {
        this.idKunde = idKunde;
    }
    public Kunde(int idKunde, String name, String vorname, String plz, String ort, String stra�e, Integer prio) {
       this.idKunde = idKunde;
       this.name = name;
       this.vorname = vorname;
       this.plz = plz;
       this.ort = ort;
       this.stra�e = stra�e;
       this.prio = prio;
    }
   
    public int getIdKunde() {
        return this.idKunde;
    }
    
    public void setIdKunde(int idKunde) {
        this.idKunde = idKunde;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getVorname() {
        return this.vorname;
    }
    
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getPlz() {
        return this.plz;
    }
    
    public void setPlz(String plz) {
        this.plz = plz;
    }
    public String getOrt() {
        return this.ort;
    }
    
    public void setOrt(String ort) {
        this.ort = ort;
    }
    public String getStra�e() {
        return this.stra�e;
    }
    
    public void setStra�e(String stra�e) {
        this.stra�e = stra�e;
    }
    public Integer getPrio() {
        return this.prio;
    }
    
    public void setPrio(Integer prio) {
        this.prio = prio;
    }




}

