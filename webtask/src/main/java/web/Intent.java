package web;

import org.springframework.data.annotation.Id;
import java.util.ArrayList;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
import javax.persistence.Entity;

@Entity
public class Intent {
//    private int rows;
    private String intent;
    private String sentence;
    private ArrayList list;

    public Intent(ArrayList list){
//        this.rows = rows;
        this.list = list;
    }

//    @GetMapping(./getIntent)
    public String getIntent(){
        return intent;
    }

//    public int getRows(){
//        return rows;
//    }

//    @GetMapping(./getSentence)
    public String getSentence(){
        return sentence;
    }

=======

public class Intent {
    private int rows;
    private String sentence;
    private ArrayList list;

    public Intent(int rows, ArrayList list){
        this.rows = rows;
        this.list = list;
    }

>>>>>>> 915f1cab42d2ae26643f10d1287acf9941ebcb32
}
