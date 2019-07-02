docker 安装镜像方法
//查找镜像
docker search redis/mongo
//下载镜像
docker pull redis/mongo
//查看本地镜像
docker images
//移除本地镜像
docker rmi redis/mongo

//运行容器
docker run -d -p 3306:3306 mysql
//列出容器
docker ps
//停止容器
docker stop 容器id
//强制停止容器
docker kill 容器id
//启动已经停止的容器
docker start 容器id
//查看容器所有信息
docker inspect 容器id
//删除容器  只能删除已经停止的容器
docker rm 容器id