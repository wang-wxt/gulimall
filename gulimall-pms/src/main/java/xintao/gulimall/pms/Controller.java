package xintao.gulimall.pms;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther Snine
 * @create 2021-02-01-15:05
 */
@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("test")
    public void test(){
        System.out.println("王新涛");
    }


}
