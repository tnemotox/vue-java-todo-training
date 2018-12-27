package sandbox.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 画面を表示するコントローラです。
 *
 * @author t.nemoto.x
 */
@Controller
@RequestMapping("/")
public class BaseController {

    /**
     * TODO画面に遷移するURLです。
     *
     * @return 計算機画面
     */
    @GetMapping(value = "/index")
    public String index() {
        return "index";
    }
}
