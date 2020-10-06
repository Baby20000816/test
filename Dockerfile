FROM registry.cn-hangzhou.aliyuncs.com/library-bd/openjdk:8-jdk-alpine
LABEL maintainer="1273163614@qq.com"
# 指定工作目录
WORKDIR /app
COPY content-center-0.0.1-SNAPSHOT.jar ./app.jar
# 设置时区为上海
ENV TZ Asia/Shanghai
# 设置时区为上海
ENV JAVA_OPS -Duser.timezone=Asia/Shanghai
EXPOSE 8004
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","./app.jar"]