package cn.txx.ch4.domain;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/24
 */
public class DemoObj {
    private Long id;
    private String name;

    /*jackson对对象和json做转换时一定需要此空构造*/
    public DemoObj() {
    }

    public DemoObj(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
