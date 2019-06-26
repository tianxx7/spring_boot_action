package cn.txx.ch3.conditional;

/* *
 * 描述:
 * @user tianxinxing
 * @date 2019/6/23
 */
public class LinuxListService implements ListService{
    @Override
    public String showListCmd() {
        return "ls";
    }
}
