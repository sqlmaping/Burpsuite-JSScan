# Burpsuite JsScan 插件
burpsuite插件：主动和被动进行JS扫描并分析其中的可利用点
+ 目前实现了主动扫描和被动扫描
+ 主动扫描模块使用了珍藏字典
+ 被动扫描模块将会分析每一个经过burpsuite的请求，如果是js文件就会保存
## 后续功能
+ 排除各种JS库，只分析自定义JS
+ 具体可利用点的分析
![1.png](https://i.loli.net/2020/11/06/RM8jVsQmy1DZJWN.png)
![2.png](https://i.loli.net/2020/11/06/mxkrsZ5iv6FjW89.png)
