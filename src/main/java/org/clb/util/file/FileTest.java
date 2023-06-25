package org.clb.util.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) {
        try {
            StringBuilder command = new StringBuilder("wkhtmltopdf");
            command.append(" --enable-local-file-access");
            command.append(" ");
            command.append("E:\\cpms\\html_template\\RussiaCopy\\Individual\\1216857092efff87c764bbed86eb9718-760adc12ab4f4e008f75490357643fd3\\1216857092efff87c764bbed86eb9718.html");
            command.append(" ");
            command.append("E:\\dddww.pdf");
            Runtime.getRuntime().exec(command.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void a() {
        File file = new File("/ccc.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write("ccc".getBytes());
            fos.flush();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
