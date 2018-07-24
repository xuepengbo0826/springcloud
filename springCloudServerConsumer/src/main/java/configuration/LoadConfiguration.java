package configuration;

import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: xuepengbo
 * @Date: 2018/7/17 11:43
 * @Description:
 */
@Configuration
public class LoadConfiguration {

    @Bean
    public IRule ribbionRule(){
        return new RoundRobinRule();
        //return new RandomRule();
        //return new AvailabilityFilteringRule();
    }
}
