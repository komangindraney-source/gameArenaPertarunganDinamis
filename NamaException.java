public class NamaException extends Exception{
    public NamaException(String pesan){
        super(pesan);
    }
    
    public NamaException(String pesan, Throwable cause){
        super(pesan, cause);
    }
}