# Videos
基于微信小程序和目前主流的后端技术SpringBoot/SpringMvc来实现一个完整的短视频小程序App

记录：
拓展知识：
jacky-common：
 * 全局唯一id：\src\main\java\org\n3r\idworkerorg.n3r.idworker
 * Swagger2的使用： 地址：http://localhost:8081/swagger-ui.html

账号：1、移动 yidong
2、陈钰锋 123456

#### ffmpeg使用
ffmpeg.exe -i 12.gif -t 10 -y 12.mp4 //转换格式

#### zookeeper使用
1、安装位置： usr/local/zookeeper <br>  
2、启动服务端服务 /bin ./zkServer.sh start <br>
3、启动客户端服务 /bin ./zkCli.sh <br>
4、查看所有节点 ls /
5、查看节点所存的数据 get /admin/node
手动添加节点：create /admin/node data
 
#### mybatis-generatorConfig（spring boot逆向生成工具）的使用
#### Swagger2

#### 知识点
##### 一、注册
@RestController：@Controller和@ResponseBody注释（Spring4.0）

参数加@RequestBody：接受前台JSON数据类型对象

@RequestParam("new name"); 参数新名字

Mapper.selectOne(record); 根据传入条件选出某一条记录




