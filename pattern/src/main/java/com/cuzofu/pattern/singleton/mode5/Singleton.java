package com.cuzofu.pattern.singleton.mode5;

/**
 * 登记式/静态内部类</br>
 * 是否 Lazy 初始化：是</br>
 * 是否多线程安全：是</br>
 * 实现难度：一般</br>
 * 描述：这种方式能达到双检锁方式一样的功效，但实现更简单。对静态域使用延迟初始</br>
 * 化，应使用这种方式而不是双检锁方式。这种方式只适用于静态域的情况，双检锁方式</br>
 * 可在实例域需要延迟初始化时使用。</br>
 * 这种方式同样利用了ClassLoder机制来保证初始化instance时只有一个线程，它跟</br>
 * 第3种方式不同的是：第3种方式只要Singleton类被装载了，那么instance就会被</br>
 * 实例化（没有达到lazy loading效果），而这种方式是Singleton类被装载了，</br>
 * instance不一定被初始化。因为SingletonHolder类没有被主动使用，只有显示通</br>
 * 过调用 getInstance 方法时，才会显示装载 SingletonHolder 类，从而实例化</br>
 * instance。想象一下，如果实例化 instance 很消耗资源，所以想让它延迟加载，</br>
 * 另外一方面，又不希望在 Singleton 类加载时就实例化，因为不能确保Singleton</br>
 * 类还可能在其他的地方被主动使用从而被加载，那么这个时候实例化instance显然是不</br>
 * 合适的。这个时候，这种方式相比第 3 种方式就显得很合理。</br>
 * 
 * @author cuzofu
 *
 */
public class Singleton {

	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}

	private Singleton() {
	}

	public static final Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

}
