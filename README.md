# -# 学生选课系统设计
* 班级：计G191
* 学号：2019322049
* 姓名：宋小军
## 一、实验目的
分析学生选课系统
使用GUI窗体及其组件设计窗体界面
完成学生选课过程业务逻辑编程
基于文件保存并读取数据
处理异常

## 二、要求:
一、系统角色分析及类设计
例如：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择课程。
定义每种角色人员的属性，及其操作方法。
属性示例： 人员（编号、姓名、性别……）
教师（编号、姓名、性别、所授课程、……）
   学生（编号、姓名、性别、所选课程、……）
   课程（编号、课程名称、上课地点、时间、授课教师、……）
以上属性仅为示例，同学们可以自行扩展。

二、要求:
1、设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作。

2、基于事件模型对业务逻辑编程，实现在界面上支持上述操作。

3、针对操作过程中可能会出现的各种异常，做异常处理

4、基于输入/输出编程，支持学生、课程、教师等数据的读写操作。

5、基于Github.com提交实验，包括实验SRC源文件夹程序、README.MD实验报告文档。

6、本次实验是综合性实验，在40%的实验成绩中占比最大，望同学们认真对待。
三、代码展示

Frame f = new Frame();//建立一个空窗口。
      f.setTitle("Frame WHERECOME du");
      FlowLayout fl = new FlowLayout();  //使用流布局
         f.setLayout(fl);//修改布局管理
         f.setSize(500, 400);//设置窗口大小,
         f.setLocation(300, 200);//设置窗口的初始位置
         f.setVisible(true);//显示窗口。
         
MyActionListener myActionListener = new MyActionListener(textField);//创建一个按钮监听事件对象

button1.addActionListener(myActionListener);//添加myActionListener监听事件
   f.add(button1);
   
button2.addActionListener(myActionListener2);//添加myActionListener监听事件
   f.add(button2);
        f.setLayout(null);//清空布局
    }
    
public void putcourse(){
		if(course==null){
			System.out.println("Not to choose course");
		}else{
		this.toString();
		}
	}
	public String toString(){
	
//		System.out.println("Student toString is operating");
		return id+name+sex+course+teather.getName();
	}
public A(int id,String name,String place,int time,int mark){
		this.id=id;
		this.name=name;
		this.place=place;
		this.time=time;
		this.mark=mark;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
}

package bao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 A course=new A(1, "Japonese", "tokyo",3,3);
		 D teather=new D(1, "wang老师", "women",course);
		 C student=new C(1, "小王", "men",course,teather);
		 System.out.println(student.toString());
		 student.delete();
//		 student.setCourse(null);
//		 student.setTeather(null);
		 student.putcourse();
		 
	}



		
四、实现
![image](https://github.com/sxj110/qimozuoye/blob/master/3.PNG)
![image](https://github.com/sxj110/qimozuoye/blob/master/4.PNG)


五、实验心得
   java的学习可以说很久了，但是感觉自己好像就是只会对着书里的代码写东西，感觉自己就只是入门了，现在感觉想要进阶很难，我想过是我自己基础不牢的原因，
教学视频看过了，但现在想想自己好像什也没留下（主要是做的笔记少），一直以来都是自学自己的，现在想想，或许我应该问问多学长学姐和老师，多多利用课堂时间，课下多练习，多拿点题目来练习。
   这里也不按着书本写一些知识点上来了，感觉那就是在抄东西，写了一个的登录界面，当然不全是我自己的全部知识成果，老师在蓝墨云上发的代码和同学交流来
完成此次实验。
