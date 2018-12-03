# CakesShop
### 作者：vili &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 联系方式1976763043@qq.com

*2018年javaweb大作业,基于jsp和servlet的javaweb的电商网站*

## 目录

* [1.项目功能](#1)
* [2.项目开发环境](#2)
* [3.项目还原设置](#3)
* [4.项目截图](#4)

<h2 id="1">1.项目功能</h2>

### 前台功能
1.商品基本展示,包括推荐商品展示和类型商品展示.

2.推荐商品包括条幅推荐,热销推荐和新品推荐.

3.按照商品类型展示商品.

4.商品详细信息展示.

5.商品加入购物车.

6.修改购物车内商品信息,例如数量等.

6.用户登录.

7.用户注册.

8.修改个人信息,包括密码和收获信息.

9.购物车付款.

10.用户订单查询.

11.根据关键字搜索商品.

### 后台功能

*当管理员用户登录后会显示后台管理按钮,点击介意进入后台管理页面*

1.订单操作:包括按状态查询订单,修改订单状态(发货,完成,删除).

2.用户操作:包括查询所有用户,新增用户,修改用户密码,修改用户信息和删除用户.

3.商品类目操作:包括查看所有类目,增加商品类目,修改商品类目信息以及删除商品类目.

4.商品操作:包括查询所有商品,新增商品,修改现有商品信息以及删除商品.

*注意,删除用户时需要先删除用户下的所有订单,才可以删除用户,删除商品类目时,要先删除类目下的商品,才能删除商品类目,删除商品时,可直接删除,他的推荐信息也会直接删除!*

<h2 id="2">2.项目开发环境</h2>

1.项目使用IDEA 2017.3.5进行开发.

2.Tomcat版本为 8.5.35,服务器上部署版本相同.

3.数据库为mysql 5.7.

4.开发过程中使用到插件有从c3p0,DButil,Beanutil,Fileupload,Jstl,Mysql-connector等,jar包版本详见/web/WEB-INF/lib目录.

<h2 id="3">3.项目还原设置</h2>

1.在本地或服务器上安装mysql数据库(如果版本较高请考虑更新数据库连接驱动).

2.将CookieShop/database/cakesshop.sql文件还原至数据库中.

3.在CookieShop/src/c3p0-config.xml中的文字替换,主要有连接字符串,用户名和密码.

4.使用idea打开项目并重新指定jdk.

5.下载Tomcat并在IDEA中配置.

6.运行项目.

<h2 id="4">4.项目截图</h2>

### 用户界面

主页:

![avatar](https://raw.githubusercontent.com/vi-li/MarkdownPictureRepository/master/CakesShop/主页.png)

按类目查询商品:

![avatar](https://raw.githubusercontent.com/vi-li/MarkdownPictureRepository/master/CakesShop/类目商品.png)

热销商品:

![avatar](https://raw.githubusercontent.com/vi-li/MarkdownPictureRepository/master/CakesShop/热销商品.png)

新品商品:

![avatar](https://raw.githubusercontent.com/vi-li/MarkdownPictureRepository/master/CakesShop/新品商品.png)

商品详细信息:

![avatar](https://raw.githubusercontent.com/vi-li/MarkdownPictureRepository/master/CakesShop/商品详细信息.png)
 
注册:
 
![avatar](https://raw.githubusercontent.com/vi-li/MarkdownPictureRepository/master/CakesShop/注册.png)
 
登录:

![avatar](https://raw.githubusercontent.com/vi-li/MarkdownPictureRepository/master/CakesShop/登录.png)

个人中心:

![avatar](https://raw.githubusercontent.com/vi-li/MarkdownPictureRepository/master/CakesShop/个人中心.png)

购物车:

![avatar](https://raw.githubusercontent.com/vi-li/MarkdownPictureRepository/master/CakesShop/购物车.png)
 
搜索商品:

![avatar](https://raw.githubusercontent.com/vi-li/MarkdownPictureRepository/master/CakesShop/搜索商品.png)

### 后台界面

订单管理:

![avatar](https://raw.githubusercontent.com/vi-li/MarkdownPictureRepository/master/CakesShop/订单管理.png)
 
用户管理:

![avatar](https://raw.githubusercontent.com/vi-li/MarkdownPictureRepository/master/CakesShop/用户管理.png)

商品类目管理:

![avatar](https://raw.githubusercontent.com/vi-li/MarkdownPictureRepository/master/CakesShop/商品类目管理.png)

商品管理:

![avatar](https://raw.githubusercontent.com/vi-li/MarkdownPictureRepository/master/CakesShop/商品管理.png)

新增商品:

![avatar](https://raw.githubusercontent.com/vi-li/MarkdownPictureRepository/master/CakesShop/新增商品.png)
