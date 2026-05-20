public class zombi extends Musuh{
    public zombi(){
        super("zombi killer",150);
    }
    @Override
    public void serangpemain(){
        System.out.println(this.namaMusuh + "zombi berlari dan menggigit kaki! hp player - 20");
    }

    @Override
    public void Bersuara(){
        System.out.println(this.namaMusuh + "zombi bersuara = gilakk lu brokk" );
    }
}