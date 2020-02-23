        <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
            <modelVersion>4.0.0</modelVersion>
            <groupId>com.luo</groupId>
            <artifactId>ESimple</artifactId>
            <version>0.0.1-SNAPSHOT</version>
            <packaging>war</packaging>

            <properties>
                <!-- spring版本号 -->
                <spring.version>4.3.3.RELEASE</spring.version>
                <!-- junit版本号 -->
                <junit.version>4.12</junit.version>
                <!-- mybatis版本号 -->
                <mybatis.version>3.2.1</mybatis.version>
                <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
            </properties>

            <dependencies>
                <!-- 添加Spring依赖 -->
                <dependency>
                    <groupId>org.springframework</groupId>
                    <artifactId>spring-core</artifactId>
                    <version>${spring.version}</version>
                </dependency>
                <dependency>
                    <groupId>org.springframework</groupId>
                    <artifactId>spring-webmvc</artifactId>
                    <version>${spring.version}</version>
                </dependency>
                <dependency>
                    <groupId>org.springframework</groupId>
                    <artifactId>spring-context</artifactId>
                    <version>${spring.version}</version>
                </dependency>
                <dependency>
                    <groupId>org.springframework</groupId>
                    <artifactId>spring-context-support</artifactId>
                    <version>${spring.version}</version>
                </dependency>
                <dependency>
                    <groupId>org.springframework</groupId>
                    <artifactId>spring-aop</artifactId>
                    <version>${spring.version}</version>
                </dependency>
                <dependency>
                    <groupId>org.springframework</groupId>
                    <artifactId>spring-aspects</artifactId>
                    <version>${spring.version}</version>
                </dependency>
                <dependency>
                    <groupId>org.springframework</groupId>
                    <artifactId>spring-tx</artifactId>
                    <version>${spring.version}</version>
                </dependency>
                <dependency>
                    <groupId>org.springframework</groupId>
                    <artifactId>spring-jdbc</artifactId>
                    <version>${spring.version}</version>
                </dependency>
                <dependency>
                    <groupId>org.springframework</groupId>
                    <artifactId>spring-web</artifactId>
                    <version>${spring.version}</version>
                </dependency>

                <!--单元测试依赖 -->
                <dependency>
                    <groupId>junit</groupId>
                    <artifactId>junit</artifactId>
                    <version>${junit.version}</version>
                    <scope>test</scope>
                </dependency>

                <!--spring单元测试依赖 -->
                <dependency>
                    <groupId>org.springframework</groupId>
                    <artifactId>spring-test</artifactId>
                    <version>${spring.version}</version>
                    <scope>test</scope>
                </dependency>

                <!--mybatis依赖 -->
                <dependency>
                    <groupId>org.mybatis</groupId>
                    <artifactId>mybatis</artifactId>
                    <version>${mybatis.version}</version>
                </dependency>

                <!-- mybatis/spring包 -->
                <dependency>
                    <groupId>org.mybatis</groupId>
                    <artifactId>mybatis-spring</artifactId>
                    <version>1.2.0</version>
                </dependency>

                <!-- mysql驱动包 -->
                <dependency>
                    <groupId>mysql</groupId>
                    <artifactId>mysql-connector-java</artifactId>
                    <version>5.1.29</version>
                </dependency>

                <!-- javaee-api包 注意和项目使用的JDK版本对应 -->
                <dependency>
                    <groupId>javax</groupId>
                    <artifactId>javaee-api</artifactId>
                    <version>6.0</version>
                    <scope>provided</scope>
                </dependency>

                <!-- javaee-web-api包 注意和项目使用的JDK版本对应 -->
                <dependency>
                    <groupId>javax</groupId>
                    <artifactId>javaee-web-api</artifactId>
                    <version>6.0</version>
                    <scope>provided</scope>
                </dependency>

                <!-- JSON包 -->
                <dependency>
                    <groupId>com.alibaba</groupId>
                    <artifactId>fastjson</artifactId>
                    <version>1.2.21</version>
                </dependency>

                <dependency>
                    <groupId>com.fasterxml.jackson.core</groupId>
                    <artifactId>jackson-databind</artifactId>
                    <version>2.7.4</version>
                </dependency>

                <!--<dependency>
                    <groupId>net.sf.json-lib</groupId>
                    <artifactId>json-lib</artifactId>
                    <version>2.4</version>
                </dependency>-->

                <dependency>
                    <groupId>commons-lang</groupId>
                    <artifactId>commons-lang</artifactId>
                    <version>2.6</version>
                </dependency>

                <dependency>
                    <groupId>commons-beanutils</groupId>
                    <artifactId>commons-beanutils</artifactId>
                    <version>1.8.3</version>
                </dependency>

                <dependency>
                    <groupId>commons-collections</groupId>
                    <artifactId>commons-collections</artifactId>
                    <version>3.2</version>
                </dependency>

                <dependency>
                    <groupId>commons-logging</groupId>
                    <artifactId>commons-logging</artifactId>
                    <version>1.1.1</version>
                </dependency>

                <dependency>
                    <groupId>net.sf.ezmorph</groupId>
                    <artifactId>ezmorph</artifactId>
                    <version>1.0.6</version>
                </dependency>

                <!-- 日志 
                <dependency>
                    <groupId>log4j</groupId>
                    <artifactId>log4j</artifactId>
                    <version>1.2.17</version>
                </dependency>
                -->
                <!-- 解析xml -->
                <dependency>
                    <groupId>dom4j</groupId>
                    <artifactId>dom4j</artifactId>
                    <version>1.6.1</version>
                </dependency>

                <dependency>
                    <groupId>jaxen</groupId>
                    <artifactId>jaxen</artifactId>
                    <version>1.1.6</version>
                </dependency>

                <dependency>
                    <groupId>org.apache.httpcomponents</groupId>
                    <artifactId>httpclient</artifactId>
                    <version>4.3.6</version>
                </dependency>
                
                <dependency>
                    <groupId>com.googlecode.log4jdbc</groupId>
                    <artifactId>log4jdbc</artifactId>
                    <version>1.2</version>
                </dependency>
                <dependency>
                        <groupId>org.slf4j</groupId>
                        <artifactId>slf4j-api</artifactId>
                        <version>1.7.22</version>
                </dependency>
            <!--
            Linux系统上包冲突 
            <dependency>
                <groupId>org.slf4j</groupId>
                <artifactId>slf4j-simple</artifactId>
                <version>1.6.4</version>
            </dependency> -->
            <dependency>
                    <groupId>ch.qos.logback</groupId>
                    <artifactId>logback-classic</artifactId>
                    <version>1.1.8</version>
                </dependency>
                <dependency>
                    <groupId>ch.qos.logback</groupId>
                    <artifactId>logback-core</artifactId>
                    <version>1.1.8</version>
                </dependency>
                <dependency>
                    <groupId>ch.qos.logback</groupId>
                    <artifactId>logback-access</artifactId>
                    <version>1.1.8</version>
                </dependency>
        </dependencies>
            <build>
                <finalName>esimple</finalName>
                <plugins>
                    <plugin>
                        <artifactId>maven-compiler-plugin</artifactId>
                        <configuration>
                            <source>1.8</source>
                            <target>1.8</target>
                            <!-- 指明编译源代码时使用的字符编码，
                            maven编译的时候默认使用的GBK编码，
                            通过encoding属性设置字符编码，
                            告诉maven这个项目使用UTF-8来编译 -->
                            <encoding>utf8</encoding>
                        </configuration>
                    </plugin>
                </plugins>
            </build>
        </project>
