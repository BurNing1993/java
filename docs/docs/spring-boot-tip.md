---
id: spring-boot-tip
title: Tip
sidebar_label: Tip
---

## Logback-spring配置

[logback-spring.xml](./logback-spring.xml)

## 测试

:::warning
Junit 5 移除@RunWith(SpringRunner.class)注解,使用@ExtendWith(SpringExtension.class),使用Assertions断言
:::

:::tip
主类使用@ExtendWith(SpringExtension.class)注解,子类继承主类使用测试和
:::

## 实用方法

- copyProperties(复制对象属性)

```java
BeanUtils.copyProperties(Object source, Object target)
```

:::warning
注意:属性为*null*也会拷贝
:::
