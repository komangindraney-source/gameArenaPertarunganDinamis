public abstract class Musuh {
    protected String namaMusuh;
    protected int healthPoint;

    public Musuh(String nama,int hp) {
        this.namaMusuh = nama;
        this.healthPoint = hp;
    }

    
    // method concrete
    public void terimaDamage(int damage) {
        this.healthPoint -= damage;
        System.out.println(this.namaMusuh + "kena serangan biasa. sisa hp :" + this.healthPoint);
    }
    
    // method abstract
    public abstract void serangpemain();

    public abstract void Bersuara();

    

}