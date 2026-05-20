public class slime extends Musuh implements bisaloot{
    public slime(){
        super("slime asam",50);
    }
    @Override
    public void serangpemain(){
        System.out.println(this.namaMusuh + "slime melompat dan menyiram cairan asam! hp player -15");
    }

    @Override
    public void Bersuara(){
        System.out.println(this.namaMusuh + "slime bersuara = wkwkww " );
    }

    @Override
    public void jatuhkanItem(){
        System.out.println(this.namaMusuh + "loop drop = slime ");
    }
}