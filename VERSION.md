[toc]

# v1.0
- 搭建工程基本模块：
  - 提供者支付模块：study-springcloud2020-provider-payment8001
  - 消费者订单模块：study-springcloud2020-consumer-order80
  - 公共模块：study-springcloud2020-api-commons

# v1.1
- 服务注册与发现：Eureka
  - Eureka Server集群模块1：study-springcloud2020-eureka-server7001
  - Eureka Server集群模块2：study-springcloud2020-eureka-server7002
  - Provider集群模块
    - study-springcloud2020-provider-payment8001
    - study-springcloud2020-provider-payment8002
  - Provider注册到EurekaServer集群中
  - Consumer注册到EurekaServer集群中
  
# v1.2
- 服务注册与发现：Zookeeper
  - 服务提供者模块：study-springcloud2020-provider-zookeeper-payment8004
  - 服务消费者模块：study-springcloud2020-consumer-zookeeper-order80
  
 # v1.3
 - 负载均衡服务调用：Ribbon 
   - 改造study-springcloud2020-consumer-order80，测试Ribbon；
 
 # v1.4
 - 负载均衡服务调用：OpenFeign
   - OpenFeign示例：study-springcloud2020-consumer-openfeign-order80
 
 # v1.5
 - 服务熔断降级：Hystrix
 
 #v1.6
 - 服务网关：Gateway