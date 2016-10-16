package com.cuzofu.pattern.singleton.mode3;

/**
 * 饿汉式,线程安全</br>
 * 是否 Lazy 初始化：否</br>
 * 是否多线程安全：是</br>
 * 实现难度：易</br>
 * 描述：这种方式比较常用，但容易产生垃圾对象。</br>
 * 优点：没有加锁，执行效率会提高。</br>
 * 缺点：类加载时就初始化，浪费内存。</br>
 * 它基于ClassLoder机制避免了多线程的同步问题，不过instance在类装载时就实例化，</br>
 * 虽然导致类装载的原因有很多种，在单例模式中大多数都是调用getInstance方法，但是</br>
 * 也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化instance显</br>
 * 然没有达到 lazy loading 的效果。</br>
 * 
 * @author cuzofu
 *
 */
public class Singleton {

	private static Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}

}
