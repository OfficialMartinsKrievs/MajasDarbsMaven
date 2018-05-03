package lv.va.sludinajumuportals.resource;


import lv.va.sludinajumuportals.domain.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class GreetingController {

    
    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }
   
    @GetMapping("/reverse")
    public String greetingReverse(@ModelAttribute Greeting greeting) {
    return "reverse";
}
}

   
