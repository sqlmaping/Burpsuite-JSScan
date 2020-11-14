# Burpsuite JsScan 插件
burpsuite插件：主动和被动进行JS扫描并分析其中的可利用点
+ 目前实现了主动扫描和被动扫描
+ 主动扫描模块使用了珍藏字典
+ 被动扫描模块将会分析每一个经过burpsuite的请求，如果是js文件就会保存
****
## 后续功能
+ 排除各种JS库，只分析自定义JS，有效发现目标
+ 具体可利用点的分析，例如ajax语法等
+ 考虑将扫描到的自定义JS文件自动添加到自带字典中，逐步完善字典
+ 考虑集合各种算法，对语义进行分析，生成POC等功能（长远考虑）
## 下一个Burpsuite插件：Burpsuite-UAScan（Unauthorized access）
+ 主要用于自动化测试未授权访问
+ 通过对比有无Cookie字段的返回长度得出结论
****
![1.png](http://ftp.bmp.ovh/imgs/2020/11/ef3b32186cf9cd1a.png)
****
![2.png](http://ftp.bmp.ovh/imgs/2020/11/a639d8257ad00798.png)
****
