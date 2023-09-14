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
        for (Mail mail : mails) {
            if (mail.getTesto().contains(testo)) {
                System.out.println("Mittente: " + mail.getMittente());
                System.out.println("Oggetto: " + mail.getOggetto());
                System.out.println("Testo: " + mail.getTesto());
                System.out.println("Timestamp: " + mail.getTimestamp());
                System.out.println();
            }
        }
    }
}
