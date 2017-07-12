package god.yeonju;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kakao on 2017. 7. 10..
 */
@Controller
public class RestaurantController {
//    @RequestMapping(value ="/",method = RequestMethod.GET)
//    public String restaurantShow(Model model){
//        model.addAttribute("restaurant",);
//        return "list";
//    }

    @RequestMapping("/")
    public String restaurantShow(Model model) {
        model.addAttribute("restaurant", new Restaurant());
        return "list";
    }
}
