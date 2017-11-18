package main;

import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;

import java.io.IOException;
import java.util.List;

public class Kata5P2 {
    public List<Mail> mailList;
    Histogram<String> histogram;

    public static void main(String[] args) throws IOException {
        Kata5P2 kata5P2=new Kata5P2();
        kata5P2.execute();
    }

    private void input() throws IOException {
        String filename ="emails.txt";
        mailList= MailListReader.read(filename);
    }

    private void process(){
        histogram = MailHistogramBuilder.build(mailList);
    }

    private void output(){
        HistogramDisplay histoDisplay= new HistogramDisplay(histogram);
        histoDisplay.execute();
    }

    private void execute() throws IOException {
        input();
        process();
        output();
    }
}