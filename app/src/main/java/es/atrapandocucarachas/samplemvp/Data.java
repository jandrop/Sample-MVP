package es.atrapandocucarachas.samplemvp;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Alejandro Platas Mallo
 * on 30/5/16.
 * V. 1.00
 */

public class Data {

    public static List<String> getData() {

        List<String> mItems = Arrays.asList(
                "item 1",
                "item 2",
                "item 3",
                "item 4",
                "item 5",
                "item 6",
                "item 7",
                "item 8",
                "item 9"
        );
        return mItems;
    }
}
