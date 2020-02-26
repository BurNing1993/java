---
id: spring-boot-lombok
title: Lombok
sidebar_label: Lombok
---

## [安装 IDEA _Lombok_ 插件](https://projectlombok.org/setup/intellij)

## 引入依赖

```xml
<!-- pom.xml -->
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
</dependency>
```

## [常用注解](https://projectlombok.org/features/all)

### @Getter/@Setter

自动生成 getter / setter 方法

### @Data

@Data 包含了 @ToString、@EqualsAndHashCode、@Getter / @Setter 和@RequiredArgsConstructor 的功能

### 日志(@Slf4j/@Log)

```java
@Slf4j
public class TestLog {
    public void test(){
        log.info("test:{}","test");
    }
}
```
