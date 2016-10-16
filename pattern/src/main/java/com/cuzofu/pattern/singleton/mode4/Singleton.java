package com.cuzofu.pattern.singleton.mode4;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）,线程安全</br>
 * JDK 版本：JDK1.5 起</br>
 * 是否 Lazy 初始化：是</br>
 * 是否多线程安全：是</br>
 * 实现难度：较复杂</br>
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。</br>
 * getInstance() 的性能对应用程序很关键。</br>
 * 
 * @author cuzofu
 *
 */
public class Singleton {

	private volatile static Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}

}
