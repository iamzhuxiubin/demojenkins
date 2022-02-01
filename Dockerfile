# jdk 环境
FROM openjdk:8-jdk-alpine
# 缓存处理
VOLUME /tmp
# 将 jar 包复制到当前环境中
COPY ./target/demojenkins.jar demojenkins.jar
# 执行命令
ENTRYPOINT ["java","-jar","/demojenkins.jar", "&"]