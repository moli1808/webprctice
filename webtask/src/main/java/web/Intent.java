package web;

import org.springframework.data.annotation.Id;
import java.util.ArrayList;
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

}
