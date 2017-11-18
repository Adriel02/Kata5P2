package view;

import model.Histogram;
import model.Mail;

import java.util.List;

public class MailHistogramBuilder {
    public static Histogram<String> build(List<String> mail){
        Histogram<String> histo = new Histogram<>();
        for (String mail1:mail) {
            histo.increment(new Mail(mail1).getDomain());
        }
    return histo;
    }
}
