package sw2.clase7spring_ec2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping({"/","pagina1"})
    public String main(){
        return "pagina1";
    }

    @GetMapping("pagina2")
    public String pagina2(){
        return "pagina2";
    }

}