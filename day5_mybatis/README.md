# sql
```
create database spring;

CREATE TABLE `orders` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `order_no` varchar(50) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

```

# build.grandle
```
    //mybatis
    implementation 'org.mybatis.spring.boot:mybatis-spring-boot-starter:2.1.1'
    implementation 'mysql:mysql-connector-java'
```

application.setting

```
spring.datasource.url=jdbc:mysql://localhost:3306/spring?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=true
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-calls-name=com.mysql.cj.jdbc.Driver


# mybatis
## src/main/java/resources/mappers/*.xml
mybatis.mapper-locations=classpath:mappers/*.xml
## src/main/java/src/
mybatis.type-aliases-package=com.example.demo.model
```

# model
Order
```
package com.example.demo.model;

import lombok.Data;

@Data
public class Order {
    private int id;
    private String orderNo;
    private int amount;
}
```


# mapper
OrderMapper <-> OrderMapper.xml

OrderMapper.xml
ResourceMap


# scan mapper
- optional1: Application
@MapperScan("com.example.demo.mapper")

- optional2

@Mapper
OrderMapper

- usage
@Resource
OrderMapper orderMapper


