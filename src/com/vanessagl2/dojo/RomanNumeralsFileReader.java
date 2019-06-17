package com.vanessagl2.dojo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RomanNumeralsFileReader {
    public static void main(String[] args) throws Exception {
        File file = new File("input.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        List<String> all = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            all.add(line);
        }

        Map<String, String> result = new RomanConverter().translate(all);

        for (String rs : result.keySet()) {
            System.out.println(rs + " = " + result.get(rs));
        }
    }
}
