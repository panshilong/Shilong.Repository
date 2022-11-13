# Shilong.Repository
学习移动开发的个人实验作业

SC 开头文件表示实验的完成版
SC+数字 表示是实验几相关文件（完成版）

SC3_1_MainActivit.java——表示实验3主活动类
SC3_1_ListViewAdapter.java——表示实验3的相关类
sc3_1.xml——表示实验3的主页面
sc3_1_itemlist_view.xml——表示实验3需要用到的相关页面


SY 开头文件表示自进行实验
SY+单词表示某种类型的自实验
SY+数字表示以某个实验作业为原型的自实验

每个实验块会有好几个小实验，有的小实验需要改动main方法，所以独立生成这些main方法
通过改变 AndroidManifest.xml 中 具体的 Activity 的活动状态来改变 当前的 启动页面

![image](screenshot\ActivityEdit(changeMainXML).jpg)



实验1——将版本文件上传到github——已完成

实验2——实现几个布局器布局
  由于实验2基本不涉及main方法的修改，所以共用一个main类 SC2_MainActivity.java 通过修改 setContentView(R.layout.sc2_1) 方法中的 layout 来切换不同页面的预览
  sc2_1—~—sc2_4 共四个页面 
    

SC2-1——线性布局

![image](screenshot\s2_1.jpg)

实现如下

![image](screenshot\sc2_1.jpg)


SC2-2——表格布局

![image](screenshot\s2_2.jpg)

实验如下

![image](screenshot\sc2_2.jpg)

SC2-3——约束布局

![image](screenshot\s2_3.jpg)

实现如下

![image](screenshot\sc2_3.jpg)

SC2-4——约束布局2

![image](screenshot\s2_4.jpg)

实现如下

![image](screenshot\sc2_4.jpg)

出现问题：始终不知道如何不让Button把ViewImage元素覆盖掉，目前怎么都百度不到答案，也找不到问题所在
或许应该使用其他的控件


实验3——界面组件
  由于有的实验都基本有main方法的修改，所以从这里开始，子实验基本带有自己的mian类 
    可以不这么写，但是 新手学习 为了
    写起来不考虑逻辑
    不需要去查看不同实验相关文件之间的关联BUG
    尽大可能避免各种奇怪的BUG
    采用这种一个实验对应一个软件包 每一个子实验有自己的main类和相关类 每个子实验有自己的xml 的形式
  

SC3_1——ListView用法（SimpleAdapter）

![image](screenshot\s3_1.jpg)

实验如下：

![image](screenshot\sc3_1.jpg)

没有采用ListView，使用了RecyclerView


SC3_2——AlertDialog弹窗

![image](screenshot\s3_2.jpg)

实验如下：

![image](screenshot\sc3_2.jpg)


SC3_3——XML菜单

![image](screenshot\s3_3.jpg)

实现如下：

1.启动

![image](screenshot\sc3_3_qidong.jpg)

2.改变字体大小

![image](screenshot\sc3_3_TextSizeChange.jpg)

3.点击普通按钮

![image](screenshot\sc3_3_Check_Normal_but.jpg)

4.改变字体颜色

![image](screenshot\sc3_3_TextColorChange.jpg)

SC3_4——ActionMode上下文菜单

![image](screenshot\s3_4.jpg)

实现如下：

![image](screenshot\sc3_4.jpg)