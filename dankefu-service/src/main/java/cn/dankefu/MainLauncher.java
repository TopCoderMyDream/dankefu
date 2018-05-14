package cn.dankefu;

import org.nutz.boot.NbApp;
import org.nutz.integration.shiro.ShiroSessionProvider;
import org.nutz.ioc.Ioc;
import org.nutz.ioc.impl.PropertiesProxy;
import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.mvc.annotation.Encoding;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.annotation.SessionBy;

/*
 * author: 蛋蛋的忧伤
 * date: 2018/5/8  20:18
 */
@IocBean(create = "init", depose = "depose")
@Modules(packages = "cn.dankefu")
@Encoding(input = "UTF-8", output = "UTF-8")
@SessionBy(ShiroSessionProvider.class)
public class MainLauncher {
    private static final Log log = Logs.get();
    @Inject("refer:$ioc")
    private Ioc ioc;
    @Inject
    private PropertiesProxy conf;


    public static void main(String[] args) throws Exception {
        new NbApp().setArgs(args).setPrintProcDoc(true).run();
    }

    public void init() {
    }

    public void depose() {

    }
}