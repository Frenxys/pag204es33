import java.util.LinkedList;

public class MailBox {
    private LinkedList<Mail> mails = new LinkedList<Mail>();
    public void aggiungiMail(Mail m){
        mails.addFirst(m);
    }
    public void eliminaMail(int pos){
        mails.remove(pos);
    }
    public void ricerca(String testo){ //stampa tutte le mail che contengono il testo

    }
}
