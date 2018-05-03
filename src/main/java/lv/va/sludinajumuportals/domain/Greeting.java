package lv.va.sludinajumuportals.domain;

public class Greeting {

    public static Greeting reverse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String name;
    private long id;
    private String content;
    private String vards;
    private String uzvards;
    private int vecums;
    private String pilseta;
    private String hobijs;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

     public String getVards() {
        return vards;
    }

    public void setVards(String vards) {
        this.vards = vards;
    }
    public String getUzvards() {
        return uzvards;
    }

    public void setUzvards(String uzvards) {
        this.uzvards = uzvards;
    }
    public int getVecums() {
        return vecums;
    }

    public void setVecums(int vecums) {
        this.vecums = vecums;
    }
    public String getPilseta() {
        return pilseta;
    }
    
    public void setPilseta(String pilseta) {
        this.pilseta = pilseta;
    }
    public String getHobijs() {
        return hobijs;
    }
    
    public void setHobijs(String hobijs) {
        this.hobijs = hobijs;
    }
}