package god.yeonju;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kakao on 2017. 7. 10..
 */
@Controller
public class RestaurantController {
//    @RequestMapping(value ="/",method = RequestMethod.GET)
//    public String restaurantShow(Model model){
//        model.addAttribute("restaurant",new Restaurant());
//        return "list";
//    }

    @RequestMapping("/hello1")
    public String index(Model model) {
        model.addAttribute("name", "SpringBlog from Millky");
        return "hello";
    }
}
