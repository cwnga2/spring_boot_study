# include relative lib

./demo require ./demo_lib

demo/settings.gradle
```
include 'demo_lib' //change use other name, ex: demo_lib1
project(':demo_lib').projectDir = new File('../demo_lib') //project(':<SAME_AS_INCLUDE>'

```

demo/build.gradle
```
	implementation(project(":demo_lib")) //"<SAME_AS_INCLUDE>"
```
