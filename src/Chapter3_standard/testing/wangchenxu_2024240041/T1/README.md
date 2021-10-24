2021-10-14 测试项目
====
继承结构  
```dtd
Human  ->Man  
        ->Woman
```  
接口实现结构
```dtd
Show   -> ShowInfo1  
        ->ShowInfo2
OperateWay  ->OperateWay1
            ->OperateWay2
```
普通类继承结构
```dtd
Computer  ->NoteBookPC
          ->PadPc
```
设计理念:  
**人类(Human)** 可以 **操作(实现OperateWay接口)** **计算机(Computer)** 选择性地**显示(实现Show接口)** 信息。  
对于 **计算机(Computer)** 应当具备显示信息的能力，这一点体现在 **显示函数(ShowMessage)** 。  
人类调取计算机实现显示的策略是通过调用计算机的显示函数实现的。

