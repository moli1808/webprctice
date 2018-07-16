package web;

import org.springframework.data.annotation.Id;
import java.util.ArrayList;

public class Intent {
    private int rows;
    private String sentence;
    private ArrayList list;

    public Intent(int rows, ArrayList list){
        this.rows = rows;
        this.list = list;
    }

}
