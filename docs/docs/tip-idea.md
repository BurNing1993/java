---
id: tip-idea
title: IDEA
sidebar_label: IDEA
---

## IDEA文件Template

### Class文件Template

:::tip Setting
Preferences>Editor>File and Code Templates>Class
:::

```java
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
 /**
 * Created by ${USER}
 * ${YEAR}-${MONTH}-${DAY} ${TIME}
 * ${DESCRIPTION}
 */
public class ${NAME} {

}
```

## 启动参数

### 端口

```java
// Run>Edit configuration >configuration>Environment>VM options
-Dserver.port=8888
```

![启动端口](./img/tip-idea-1.png '启动端口') 
