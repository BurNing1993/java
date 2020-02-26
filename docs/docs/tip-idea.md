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
