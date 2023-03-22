1、查看覆盖率生成文件首先得有target/class文件
执行mvn jacoco:instrument  可以查看到插桩文件


合并覆盖率
java -jar jacococli.jar merge file1.exec file2.exec --destfile merged.exec

生成报告
java -jar jacococli.jar report merged.exec --classfiles /Users/hucheng/Documents/javaCode/jacoco-test/target/classes/com/test/jacocotest/ --html /Users/hucheng/Documents/javaCode/jacoco-test
