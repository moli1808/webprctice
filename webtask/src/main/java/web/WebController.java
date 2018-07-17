package web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @GetMapping("/greeting")
<<<<<<< HEAD
    public String greeting(@RequestParam(name="intent", required=false, defaultValue="intent") String intent,@RequestParam(name="sentence", required=false, defaultValue="sentence") String sentence ) {

        return "greeting";//create new Object
    }

    @GetMapping("./getIntent")
    public String getIntent(){
       return "intent";
=======
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
>>>>>>> 915f1cab42d2ae26643f10d1287acf9941ebcb32
    }
}
