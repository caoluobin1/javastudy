package org.clb.util.stringsplitter;

import com.google.common.base.Splitter;

import java.util.Arrays;
import java.util.List;

public class SplitterUtil {
    public static List<String> get2(String a, String sp) {
        List<String> split = Splitter.on(sp).trimResults().splitToList(a);
        return split;
    }

    public static List<String> get(String a, String sp) {
        List<String> split = Arrays.asList(a.split(sp));
        return split;
    }

    public static void main(String[] args) {
        List<String> list = get("asd,as,aa,234 ,43 ,s", ",");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
