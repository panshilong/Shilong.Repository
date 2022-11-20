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

![s2_1](https://user-images.githubusercontent.com/38639268/202885027-df9a9256-249f-4866-88f5-73949b8cae8a.jpg)

实现如下

![sc2_1](https://user-images.githubusercontent.com/38639268/202885032-d06147cf-dc89-4feb-9237-761ebadf2d08.jpg)


SC2-2——表格布局

![s2_2](https://user-images.githubusercontent.com/38639268/202885047-7a9e9f0b-9806-45be-b34c-84f5de905a6e.jpg)

实验如下

![sc2_2](https://user-images.githubusercontent.com/38639268/202885044-e2ee5ed8-4ac2-49e2-94f8-5c96b6e2b69f.jpg)

SC2-3——约束布局

![s2_3](https://user-images.githubusercontent.com/38639268/202885049-367c3c24-3b3b-4600-9b46-5a41617e5317.jpg)

实现如下

![sc2_3](https://user-images.githubusercontent.com/38639268/202885052-c487c71c-00f8-4e63-a45a-f7707ff1be8a.jpg)

SC2-4——约束布局2

![s2_4](https://user-images.githubusercontent.com/38639268/202885053-8f0f73c5-0804-4bec-86cb-71e0aab23da9.jpg)

实现如下

![sc2_4](https://user-images.githubusercontent.com/38639268/202885058-66432733-33db-4a1b-bbf5-1ecc3d40d4c2.jpg)

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

![s3_1](https://user-images.githubusercontent.com/38639268/202885066-afa0285a-af9c-4cf2-a777-74933a45cb57.jpg)

实验如下：

![sc3_1](https://user-images.githubusercontent.com/38639268/202885070-4e5b8cb2-aba7-45a8-a823-955e13b933d2.jpg)

没有采用ListView，使用了RecyclerView


SC3_2——AlertDialog弹窗

![s3_2](https://user-images.githubusercontent.com/38639268/202885074-88ede0c6-3f60-4f2b-a20e-533afbb797b0.jpg)

实验如下：

![sc3_2](https://user-images.githubusercontent.com/38639268/202885078-b3b24891-3b88-4be8-9387-d572e2fcaba6.jpg)


SC3_3——XML菜单

![s3_3](https://user-images.githubusercontent.com/38639268/202885085-ce7ed83f-d3dc-4968-8ac7-28e05f71529d.jpg)

实现如下：

1.启动

![sc3_3_qidong](https://user-images.githubusercontent.com/38639268/202885122-57ed7e25-fac5-4786-b234-91e675b12eb7.jpg)

2.改变字体大小

![sc3_3_TextSizeChange](https://user-images.githubusercontent.com/38639268/202885138-605d5c1e-6cd9-4942-b3eb-aaab6b71d7ff.jpg)

3.点击普通按钮

![sc3_3_Check_Normal_but](https://user-images.githubusercontent.com/38639268/202885125-f32c393c-8c6a-43f6-bc75-e4d86ebfcb96.jpg)

4.改变字体颜色

![sc3_3_TextColorChange](https://user-images.githubusercontent.com/38639268/202885139-fce5ab19-41fb-49ce-b7a7-57af9eaff910.jpg)

SC3_4——ActionMode上下文菜单

![s3_4](https://user-images.githubusercontent.com/38639268/202885147-015ee258-d4e1-46d4-ab25-95dcfa8dd06a.jpg)

实现如下：

![sc3_4](https://user-images.githubusercontent.com/38639268/202885151-34c8bb5b-9e8f-4d69-94d9-9a1ca957eeec.jpg)
