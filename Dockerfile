# 使用 Tomcat 基础镜像
FROM tomcat:9.0

# 将 WAR 文件复制到 Tomcat 的 webapps 目录下
COPY target/ChooeatReservation-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/
