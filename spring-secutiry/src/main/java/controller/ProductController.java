package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/7/7
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    /*
    * 商品添加
    * */
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    /*
    * 商品添加
    * */
    @RequestMapping("/add")
    public String add() {
        return "product/productAdd";
    }

    /*
   * 商品修改
   * */
    @RequestMapping("/update")
    public String update() {
        return "product/productUpdate";
    }

    /*
   * 商品列表
   * */
    @RequestMapping("/list")
    public String list() {
        return "product/productList";
    }

    /*
    * 商品删除
     * */
    @RequestMapping("/del")
    public String del() {
        return "product/productDel";
    }

}
