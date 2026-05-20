public class naga extends Musuh implements BisaTerbang {
    public naga(){
        super("naga laut",500);

    }
    @Override
    public void serangpemain(){
        System.out.println(this.namaMusuh + "naga menyemburkan air laut asin ! hp player -50");
    }

    @Override
    public void Bersuara(){
        System.out.println(this.namaMusuh + "naga bersuara = hahahah " );
    }

    @Override
    public void lepasLandas(){
        System.out.println(this.namaMusuh + "terbang tinggi! Sulit diserang. " );
    }

    @Override
    public void seranganUdara(){
        System.out.println(this.namaMusuh + "menyemburkan badai api! pemain -80 HP." );
    }
}