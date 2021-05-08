# prepare
## create other database 1
```
create database spring
create database spring2
```

create table in spring, spring2

```
CREATE TABLE `tb_order` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `order_no` varchar(100) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

```

# setup
applicaton.properties

```
# for database spring
spring.datasource.primary.jdbc-url=jdbc:mysql://localhost:3306/spring?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=true
spring.datasource.primary.username=root
spring.datasource.primary.password=root
spring.datasource.primary.driver-calls-name=com.mysql.cj.jdbc.Driver

# for database spring2
spring.datasource.secondary.jdbc-url=jdbc:mysql://localhost:3306/spring2?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=true
spring.datasource.secondary.username=root
spring.datasource.secondary.password=root
spring.datasource.secondary.driver-calls-name=com.mysql.cj.jdbc.Driver
```

# config/DataSourceConfig
```
@Configuration
public class DataSourceConfig {
  @Primary
  @Bean(name = "primaryDataSource")
  @ConfigurationProperties(prefix = "spring.datasource.primary")
  public DataSource primaryDataSource() {
    return DataSourceBuilder.create().build();
  }

  @Bean(name = "secondaryDataSource")
  @ConfigurationProperties(prefix = "spring.datasource.secondary")
  public DataSource secondaryDataSource() {
    return DataSourceBuilder.create().build();
  }

  @Bean(name = "primaryJdbcTemplate")
  public JdbcTemplate primaryJdbcTemplate(@Qualifier("primaryDataSource") DataSource dataSource) {
    return new JdbcTemplate(dataSource);
  }

  @Bean(name = "secondaryJdbcTemplate")
  public JdbcTemplate secondaryJdbcTemplate(@Qualifier("secondaryDataSource") DataSource dataSource) {
    return new JdbcTemplate(dataSource);
  }
}
```

# usage
```

	@Resource
	@Qualifier("primaryJdbcTemplate")
	private JdbcTemplate jdbcTemplate;

    @Resource
	@Qualifier("secondaryJdbcTemplate")
	private JdbcTemplate jdbcTemplate2;
```

