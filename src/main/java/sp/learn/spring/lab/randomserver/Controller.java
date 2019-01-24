package sp.learn.spring.lab.randomserver;

import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "random")
public class Controller {

    @Autowired
    ApplicationInfoManager applicationInfoManager;

    @GetMapping(value = "/")
    public String get() {
        return applicationInfoManager.getInfo().getHostName();
    }
}
