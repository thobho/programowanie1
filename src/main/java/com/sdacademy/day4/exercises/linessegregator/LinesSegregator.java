package com.sdacademy.day4.exercises.linessegregator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LinesSegregator {

    private String[] filePaths;


    public LinesSegregator(String[] filePaths) {
        this.filePaths = filePaths;
    }

    public void write() throws IOException {
        write(getLines(), "result");
    }

    public void write(List<Line> lines, String filename) throws IOException {
        File newFile = new File(filename);
        newFile.createNewFile();

        FileWriter fileWriter = new FileWriter(newFile);
        lines.forEach(line->{
            try {
                fileWriter.write(line.text+"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        fileWriter.flush();
    }

    public List<Line> getLines() throws FileNotFoundException {
        List<File> files = loadFiles();
        List<Line> lines = new ArrayList<>();
        for (File file:files) {
            lines.addAll(readLines(file));
        }
        Collections.sort(lines);
        return lines;
    }

    private List<Line> readLines(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        List<Line> result = new ArrayList<>();
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            String number = line.split(" ")[0];
            result.add(new Line(Integer.parseInt(number), line));
        }
        return result;
    }

    public List<File> loadFiles() {
        List<File> result = new ArrayList<>();
        for (int i = 0; i < filePaths.length; i++) {
            result.add(new File(filePaths[i]));
        }
        return result;
    }

    private static class Line implements Comparable<Line>{
        private int number;
        private String text;

        public Line(int number, String text) {
            this.number = number;
            this.text = text;
        }

        @Override
        public int compareTo(Line o) {
            return o.number - this.number;
        }
    }

    public static void main(String[] args) {
        String[] filePaths = {"first", "second"};
        LinesSegregator linesSegregator = new LinesSegregator(filePaths);
        try {
            linesSegregator.write();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
