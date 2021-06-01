package fdu.daslab.schedulercenter;

import fdu.daslab.common.thrift.ThriftServer;
import fdu.daslab.schedulercenter.service.SchedulerHandler;
import fdu.daslab.thrift.schedulercenter.SchedulerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * 调度中心服务，职责是 接收新的job，按照调度策略 得到的最优的调度安排，执行这些调度任务，
 * 同时
 *
 * @author 唐志伟
 * @version 1.0
 * @since 5/18/21 7:49 PM
 */
@SpringBootApplication(scanBasePackages = {"fdu.daslab"})
public class SchedulerCenterApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SchedulerCenterApplication.class, args);
        try {
            SchedulerHandler schedulerHandler = context.getBean(SchedulerHandler.class);
            int port = Integer.parseInt(context.getEnvironment().getRequiredProperty("thrift.port"));
            SchedulerService.Processor<SchedulerService.Iface> processor = new SchedulerService.Processor<>(schedulerHandler);
            ThriftServer.start(port, processor);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
