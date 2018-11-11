package ScanUrlToFile;

import java.io.*;
import java.net.URL;

public class ScanUrlToFile {

    public static void main(String[] args) {
        InputStream urlInput = null;
        OutputStream outputToFile = null;
        String searchResultUrl = "https://www.google.com.ua";

        writeFromUrlToFile(searchResultUrl, urlInput, outputToFile, "D:/Java Codding/HelloWorld/UrlPage1.txt");

        Thread secondThread = new Thread(() -> writeFromUrlToFile(searchResultUrl, urlInput, outputToFile, "D:/Java Codding/HelloWorld/UrlPage2.txt"));
        secondThread.run();
    }

    public static void writeFromUrlToFile(String urlForScan, InputStream in, OutputStream out, String fileToWrite) {

        try {
            in = new BufferedInputStream(new URL(urlForScan).openStream());
            out = new BufferedOutputStream(new FileOutputStream(fileToWrite));
            byte[] buffer = new byte[256];
            while (in.read(buffer) != -1) {
                out.write(buffer);
            }

        } catch (IOException readUrlException) {
            System.out.println("The URL: " + urlForScan + " can't be read. \nOr file " + fileToWrite + " can't be reached. \nPlease check URL and File path and try again!");
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ignored) {/*NOP*/}
            }
            if (out != null) {
                try {
                    closeQuietly(out);
                } catch (IOException ignored) { /*NOP*/}
            }
        }
        System.out.println("Internet page " + urlForScan + " was written to the file " + fileToWrite + " successfully!");
    }

    private static void closeQuietly(OutputStream out) throws IOException {
        out.flush();
        out.close();
    }
/*
    private static void readFullyByBuffer(InputStream in, int sizeOfBuffer) throws IOException {
        byte[] buffer = new byte[sizeOfBuffer];
        in.read(buffer);
    }

    private static void writeFullyByBuffer(InputStream in, OutputStream out, int sizeOfBuffer) throws IOException {
//        int count;
        byte[] buffer = new byte[sizeOfBuffer];
       */
    /* while ((count = in.read(buffer)) != -1) {*//*

            out.write(buffer);
       */
    /* }*//*

    }

    // Output block

    public static void outputToFile(InputStream urlStream, OutputStream outputStream, String fileName) {
        try {
            outputStream = new BufferedOutputStream(new FileOutputStream(fileName));
            writeFullyByBuffer(urlStream, outputStream, 128);

        } catch (IOException writeUrlException) {
            System.out.println("File: " + fileName + " wasn't written because of unexpected problem. Please, check file's name and path and try again!");
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();

                } catch (IOException ignore) { */
    /*NOP*//*
}
            }
        }
        System.out.println("Internet page was written to the file " + fileName + " successfully!");
    }
*/


}
