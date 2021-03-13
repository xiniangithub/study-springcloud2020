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