package day3

import java.util

import com.fcibook.quick.http.QuickHttp

/**
  * Created by yq on 2018/6/4.
  */
class LSh1 {
}

object LShHello{
  //ctrl+shift+f10 运行
  def main(args: Array[String]) {
    println("hello scala")//scala代码  ，ln=line
    System.out.println("hello world");//java代码
    println("a\t\nb")
    val a=3//Int
    val b = "nihao"//String
    val c = 3.4d//float==Float,Double精确度高
    val d = 3.4f//Float
    val e = true//Bloolean
    val f = Array(1,3,4,3,4,4)//Array数组,List
    val g = Array(1,"a","b")//
    //如果没有限制类型，放容易，拿不容易，降低性能
    val g1 = Array[Int](1,3,3)//Array[限制类型](参数列表)
    println(a+b+c+d+e+f+g)
    val h = Tuple2(1,2)//元组类型
    val f2 = List(1,2,3,4,43)
//    println(f2[0])//获取列表中的元素   [1,2,3,34]
    println("获取列表中的元素："+f2(0))
    //java/scala的占位符是%s,   python的占位符是{}
    val x = "今天星期%s，我很%s".format("6","^_^")
    println("字符串的占位符的使用:"+x)
  }
}

object LShDataType{
  def main(args: Array[String]) {
    println("hello scala")//scala代码  ，ln=line
    System.out.println("hello world");//java代码
    println("a\t\nb")
    val a:Int=3//Int
    val b:String = "nihao"//String
    val c:Double = 3.4d//float==Float,Double精确度高
    val d:Float = 3.4f//Float
    val e:Boolean = true//Boolean
    //水果              苹果。。。。水果！=苹果，水果[苹果]=苹果
    val f:Array[Int] = Array(1,3,4,3,4,4)//Array数组,List
    val g:Array[Any] = Array(1,"a","b")//
    //如果没有限制类型，放容易，拿不容易，降低性能
    val g1:Array[Int] = Array[Int](1,3,3)//Array[限制类型](参数列表)
    println(a+b+c+d+e+f+g)
    val h:Tuple2[Int,Int] = Tuple2(1,2)//元组类型
    val f2:List[Int]= List(1,2,3,4,43)
    //    println(f2[0])//获取列表中的元素   [1,2,3,34]
    println("获取列表中的元素："+f2(0))
    //java/scala的占位符是%s,   python的占位符是{}
    val x:String = "今天星期%s，我很%s".format("6","^_^")
    println("字符串的占位符的使用:"+x)
  }
}
//class/object{}  是一个单独的代码块
object LShDict{
  def main(args: Array[String]) {
//    val a = {"手机":"123456")  java(key->value,...)  python {key:value,...}
    val a = Map("手机"->"123456",
                "姓名"->"Chance",
                "上课列表"->List("python","scala","redis","spark"))//Map(java/scala)===Dict(python)
    println(a("手机"))
    val week = List("星期一","星期二","星期三","星期四","星期五","星期六","星期天")
    println("今天是" + week(0))
    //Map((key,value),..)
    val b = Map(("手机","123344"),("姓名","Chance"))
  }
}

object LShIf{
  def main(args: Array[String]) {
    //可选，二选一，三选其一。
    if(true){         // if boolean:xxxx   python   |  if(boolean){xxxx}    java
      println("可选")
      println("xxxxx")//代码块，函数体，if体
    }
    if(1>2){
      println("二选一")
    }else {
      println("else语句")
    }
    val score = 80
    if(score>90){
      println("优秀")
    }else if(score>60){
      println("及格")
    }else if(score>70){
      println("良好")
    }else{
      println("不及格")
    }
  }
}

object LShFor{
  def main(args: Array[String]) {
//    for    《当》  和集合也很搭
    val ls = List("当山峰没有棱角的时候",
                  "当河水不再流",
                  "当时间停住日夜不分",
                  "当天地万物化为虚有")
    println(ls.length)
    for(i <- ls){//  java for(i<-list){}    python for i in list:xxx
      println(i)
    }
    println("for 升级和if搭配")
    for(i <- ls if(i!="当河水不再流")){//while
      println(i)
    }
    println("for 升级和yield搭配")
//    for(i<-ls) println(i)//for语句如果里面只有一条指令，可以不写{}
    val fun1 = for(i<-ls) i
//    println(fun1)
    val fun2 = for(i<-ls) yield i
    println(fun2.toBuffer)
  }
}

object LShUrl{//ctrl+p   函数参数的提示
  //id=477&type=2&city=51&state=1
  def main(args: Array[String]) {
    import collection.JavaConversions._//scalaMap转换为javaMap的工具包
    /***id: 675,type: 2,city: 51,state: 1*/
    val paramsDict:java.util.Map[String,String] =
      mapAsJavaMap(Map("id"->"675","type"->"2","city"->"51","state"->"1"))
    val url = "http://www.gaokaopai.com/university-ajaxGetMajor.html"
    val info = new QuickHttp()
      .url(url)
      .addHeader("X-Requested-With","XMLHttpRequest")
      .addHeader("Connection","keep-alive")
      .addHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.181 Safari/537.36")
      .addParames(paramsDict)//如何将scala语言的Map转换成java语言的Map
      .post()
      .text()
    println(info)
  }
}

object LShLlambda{
  def main(args: Array[String]) {
    var x = 10//val 修饰的变量为不能修改的
    x = 3
    println("x:"+x)
    def sum(a:Int,b:Int): Int ={//def 函数名(参数:类型,...):返回类型={函数体}
      x = -1
      println("x被修改了")
      a+b
    }
    println(sum(3,4))
    println("最后的x:"+x)
  }
}
//
object LShLlambda1 extends App{
  println("xxxxx")
  var x = 10
  def sum(a:Int,b:Int): Int ={//def 函数名(参数:类型,...):返回类型={函数体}
    x = x - 1
    println("x被修改了")
    a+b
  }//
  sum(3,4)
  println("x:"+x)
}
//xml初识，解析...ctrl+q  查看变量类型
object LShXmlparse extends App{
  //scala.xml......
  var citys:scala.xml.Elem =
    <ul class="clearfix">
      <li data-val="北京" data-id="2" onclick="$.setVar('claimCity', 11)">北京</li>
      <li data-val="天津" data-id="2" onclick="$.setVar('claimCity', 12)">天津</li>
      <li data-val="河北" data-id="2" onclick="$.setVar('claimCity', 13)">河北</li>
      <li data-val="山西" data-id="2" onclick="$.setVar('claimCity', 14)">山西</li>
      <li data-val="内蒙古" data-id="2" onclick="$.setVar('claimCity', 15)">内蒙古</li>
      <li data-val="辽宁" data-id="2" onclick="$.setVar('claimCity', 21)">辽宁</li>
      <li data-val="吉林" data-id="2" onclick="$.setVar('claimCity', 22)">吉林</li>
      <li data-val="黑龙江" data-id="2" onclick="$.setVar('claimCity', 23)">黑龙江</li>
      <li data-val="上海" data-id="2" onclick="$.setVar('claimCity', 31)">上海</li>
      <li data-val="江苏" data-id="2" onclick="$.setVar('claimCity', 32)">江苏</li>
      <li data-val="浙江" data-id="2" onclick="$.setVar('claimCity', 33)">浙江</li>
      <li data-val="安徽" data-id="2" onclick="$.setVar('claimCity', 34)">安徽</li>
      <li data-val="福建" data-id="2" onclick="$.setVar('claimCity', 35)">福建</li>
      <li data-val="江西" data-id="2" onclick="$.setVar('claimCity', 36)">江西</li>
      <li data-val="山东" data-id="2" onclick="$.setVar('claimCity', 37)">山东</li>
      <li data-val="河南" data-id="2" onclick="$.setVar('claimCity', 41)">河南</li>
      <li data-val="湖北" data-id="2" onclick="$.setVar('claimCity', 42)">湖北</li>
      <li data-val="湖南" data-id="2" onclick="$.setVar('claimCity', 43)">湖南</li>
      <li data-val="广东" data-id="2" onclick="$.setVar('claimCity', 44)">广东</li>
      <li data-val="广西" data-id="2" onclick="$.setVar('claimCity', 45)">广西</li>
      <li data-val="海南" data-id="2" onclick="$.setVar('claimCity', 46)">海南</li>
      <li data-val="重庆" data-id="2" onclick="$.setVar('claimCity', 50)">重庆</li>
      <li data-val="四川" data-id="2" onclick="$.setVar('claimCity', 51)">四川</li>
      <li data-val="贵州" data-id="2" onclick="$.setVar('claimCity', 52)">贵州</li>
      <li data-val="云南" data-id="2" onclick="$.setVar('claimCity', 53)">云南</li>
      <li data-val="西藏" data-id="2" onclick="$.setVar('claimCity', 54)">西藏</li>
      <li data-val="陕西" data-id="2" onclick="$.setVar('claimCity', 61)">陕西</li>
      <li data-val="甘肃" data-id="2" onclick="$.setVar('claimCity', 62)">甘肃</li>
      <li data-val="青海" data-id="2" onclick="$.setVar('claimCity', 63)">青海</li>
      <li data-val="宁夏" data-id="2" onclick="$.setVar('claimCity', 64)">宁夏</li>
      <li data-val="新疆" data-id="2" onclick="$.setVar('claimCity', 65)">新疆</li>
    </ul>

  citys.child.foreach((cityOrSpace)=>{
    val onclick = cityOrSpace.attribute("onclick")//Some(),None
    if(onclick!=None){//城市
      //$.setVar('claimCity', 36)
      var s = onclick.get.toString()
      print(s.substring(s.indexOf(", ")+2,s.length-1))//Some
      print(",")
    }//11,12,13,14,15,21,22,23,31,32,33,34,35,36,37,41,42,43,44,45,46,50,51,52,53,54,61,62,63,64,65
  })
}

object LShFunc {
  def main(args: Array[String]) {
    val ls = List(1,2,3,3,5,8,10)
//    for(i <- ls){//指令式编程
//      println(i)
//    }
    def f(a:Int):Unit={
      println("a:"+a)
    }
    val f2 = (a:Int)=>println("a2:"+a)//匿名函数
    //函数式编程f
    ls.foreach(f)
    ls.foreach(f2)
    println("====for 和range很搭=======")
    for(i<- 0 to 3){
      println(i)
    }
    //1 到10，每个数都*10,
    val fx = (b:Int)=>{b+10}
    def fy(b:Int):Int=b*10

    1.to(10).map(fy).foreach(println(_))
    1.to(10).map(a=>a*10).foreach(println(_))
    1.to(10).map(_*10).foreach(println(_))//map   一对一
//   ((1,2),(3,3),(5,8),(10))
    ls.grouped(2).foreach(println(_))
    println("flatten：将多组抚平成一组")
    ls.grouped(2).flatten.foreach(println(_))//(1,2,3,3,5,8,10)
    println("wordcount")
//    val tup = (1,9)
//    tup._2 元组
//    println("我爱中国我爱中华".split("").toBuffer)
//我 爱 中 国 我 爱 中 华
    List("我","爱","中","国","我","爱","中","华")
    .map(a=>(a,1))//一对一   List((我,1),(爱,1),(中,1),(国,1),(我,1),(爱,1),(中,1),(华,1))
    .groupBy(a=>a._1)//分组  List((我,List((我,1),(我,1))),(爱,List((爱,1),(爱,1))),(中,List((中,1),(中,1))),(国,List((国,1))),(华,List((华,1))))
    .map(a=>(a._1,a._2.length))
    .foreach(a=>println(a._1+" "+a._2))
  }
}

object LShDing{
  def main(args: Array[String]) {
    var s = "$.setVar('claimCity', 36)"
    println(s.substring(s.indexOf(", ")+2,s.length-1))//substring(start,end)
    print(1.to(10,1).map(_*10))

    import java.util.Random
    println("请这位同学回答："+new Random().nextInt(47))
  }
}




