# FakeQQServer
安卓作业假qq服务端

mysql-connector为mysql 8.0的连接驱动<br>
fakeqq.sql为对应的数据库<br>
服务端就实现了登陆注册 文件上传下载的功能 <br>
上传到 out->artifacts->fakeqq_Web_exploded->upload里 下载是下载这里的101.jpg的图片 可根据需求修改<br>
服务端启动后的首页是文件上传的页面<br>
地址可以使用localhost：8080/xxx/login?account=xxx&password=yyy或localhost：8080/xxx/register?account=xxx&password=yyy访问一下 返回的json字符串<br>
创建数据库 启动数据库服务 启动服务端后再启动前面上传的Android端 Android端功能才能正常使用<br>
功能较少 仅供参考<br>
