# 构建jar包
mvn clean install

# 进入到工程的根路径docker镜像的构建
docker build --build-arg JAR_FILE=target/*.jar -t wes/spring-docker .

# 开发容器端口并运行容器
docker run -p 8080:8080 wes/spring-docker

或者后面指定imageid (通过 docker image ls 查看)

