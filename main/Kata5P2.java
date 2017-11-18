package main;

import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReaderDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Kata5P2 {
    public List<String> mailList;
    Histogram<String> histogram;

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        Kata5P2 kata5P2=new Kata5P2();
        kata5P2.execute();
    }

    private void input() throws IOException, SQLException, ClassNotFoundException {
        mailList= MailListReaderDB.read();
    }

    private void process(){
        histogram = MailHistogramBuilder.build(mailList);
    }

    private void output(){
        HistogramDisplay histoDisplay= new HistogramDisplay(histogram);
        histoDisplay.execute();
    }

    private void execute() throws IOException, SQLException, ClassNotFoundException {
        input();
        process();
        output();
    }
}