
# build.grandle
```
plugins {
    id "com.arenagod.gradle.MybatisGenerator" version "1.4"
}

configurations {
    mybatisGenerator
}

mybatisGenerator {
    verbose = true
    configFile = 'src/main/resources/generator.xml'
}
```

# src/main/resources/generator.xml

#exec
```
./gradlew  mbGenerator
```
