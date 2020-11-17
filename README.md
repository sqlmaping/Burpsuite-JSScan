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
****
# Burpsuite Jsscan Plugin
Burpsuite plug-in: active and passive JS scanning and analysis of available points
+ At present, active scanning and passive scanning are realized
+ The active scanning module uses a collection dictionary
+ The passive scan module will analyze every request passing through burpsuite, and if it is JS file, it will be saved
****
## Follow Up Functions
+ Exclude all kinds of JS libraries, only analyze custom JS, effectively discover the target
+ The analysis of specific points can be used, such as Ajax syntax
+ Consider automatically adding the scanned custom JS file to the dictionary to improve the dictionary step by step
+ Consider the collection of various algorithms, semantic analysis, generation of POC and other functions (long-term consideration)
****
![1.png](https://xuyiqing-1257927651.cos.ap-beijing.myqcloud.com/burpsuite/js-1.jpg)
****
![2.png](https://xuyiqing-1257927651.cos.ap-beijing.myqcloud.com/burpsuite/js-2.jpg)
****
