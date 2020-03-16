---
id: spring-cloud-communication
title: SpringCloud服务间通信
sidebar_label: 服务间通信
---

> 假设存在 SERVER 服务

```java
// SERVER port:8080
@RestController
public class ServerController {

    @GetMapping("/message")
    public String message(){
        return  "Message from server!";
    }
}
```

## RestTemplate(3种方式)

### 固定 URL

```java
@GetMapping("/getServerMsg")
public String getMsg(){
    RestTemplate restTemplate =new RestTemplate();
    String response = restTemplate.getForObject("http://localhost:8080/message",String.class);
    return  response;
}
```

### LoadBalancerClient

```java
@Autowired
private LoadBalancerClient loadBalancerClient;

@GetMapping("/getServerMsg")
public String getMsg(){
    ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
    String url = String.format("http://%s:%s", serviceInstance.getHost(), serviceInstance.getPort()) + "/message";
    RestTemplate restTemplate = new RestTemplate();
    String response = restTemplate.getForObject(url, String.class);
    return  response;
}
```

### @LoadBalanced

```java
// config/RestTemplateConfig
@Component
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate()
    }
}
```

```java
 @Autowired
private RestTemplate restTemplate;

@GetMapping("/getServerMsg")
public String getMsg(){
    String response = restTemplate.getForObject("http://PRODUCT/message",String.class);
    return  response;
}
```

---

## OpenFeign

1. 增加依赖

```xml
<!-- pom.xml -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>
```

2. 启动类添加@EnableFeignClients

```java
@SpringBootApplication
@EnableFeignClients
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
```

:::tip
多模块项目@EnableFeignClients注解增加basePackages参数

```java
@EnableFeignClients(basePackages="com.xx.xx")
```

:::


3. 使用@FeignClient

```java
@FeignClient(name = "SERVER")
public interface Client {

    @GetMapping("/message")
    String getServerMsg();
}
```

4. 调用方法

```java
@Autowired
private Client client;

@GetMapping("/getServerMsg")
public String getMsg(){
    String response = client.getServerMsg();
    return  response;
}
```
