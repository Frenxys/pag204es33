public class Main {
    public static void main(String[] args) {
        // Creare alcune mail di esempio
        Mail mail1 = new Mail("mittente1", "Testo mail 1", "Oggetto mail 1");
        Mail mail2 = new Mail("mittente2", "Testo mail 2", "Oggetto mail 2");
        Mail mail3 = new Mail("mittente3", "Questo è un test", "Mail di prova");

        // Creare una MailBox e aggiungere le mail
        MailBox mailBox = new MailBox();
        mailBox.aggiungiMail(mail1);
        mailBox.aggiungiMail(mail2);
        mailBox.aggiungiMail(mail3);

        // Ricerca e stampa le mail che contengono il testo "test"
        System.out.println("Mail contenenti 'test':");
        mailBox.ricerca("test");

        // Eliminare una mail (ad esempio, la prima mail)
        mailBox.eliminaMail(0);

        // Ricerca nuovamente dopo l'eliminazione
        System.out.println("\nMail contenenti 'test' dopo l'eliminazione:");
        mailBox.ricerca("test");
    }
}
