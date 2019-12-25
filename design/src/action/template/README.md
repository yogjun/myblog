定义：定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中
使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤

应用场景
算法的整体步骤很固定，但其中个别部分易变
当多个子类存在公共的行为时，可以将其提取出来并集中到一个公共父类中以避免代码重复
当需要控制子类的扩展时