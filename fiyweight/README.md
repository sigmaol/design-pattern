# 享元模式

## 0x01.定义与类型

- 定义：提供了减少对象数量从而改善应用所需的对象结构的方法
- 运用共享技术有效地支持大量细粒度的对象
- 类型：结构型

## 0x02.适用场景

- 常常应用于系统底层的开发，以便解决系统的性能问题。
- 系统有大量相似对象，需要缓冲池的场景。

## 0x03.优点

- 减少对象的创建，降低内存中对象的数量，降低系统的内存，提高效率
- 减少内存之外的其他资源占用

## 0x04.缺点

- 关注内/外部状态，关注线程安全问题
- 是系统，程序的逻辑复杂化

## 0x05.扩展

- 内部状态：在享元对象的内部，不会随着环境改变而改变的部分。
- 外部状态：不可以共享的状态，记录在享元对象的外部。

## 0x06.相关的设计模式

- 享元模式和代理模式：当代理模式消耗性能比较大的时候，就可以用享元模式
- 享元模式和单例模式：容器单例，享元模式就是复用对象的思想。

## 0x07.源码中的享元模式

- JDK： Integer.valueOf(),--IntegerCache
- Tomcat: GenericObjectPoolConfig, GenericKeyedPoolConfig