package dji.v5.ux.mapkit.core.maps
/**
 *
 *  @author joe.yang@dji.com
 *  @date 2019-10-17 15:36
 */
/*
    属于DJI UX SDK中的地图模块（dji.v5.ux.mapkit.core.maps）
    setOnViewChangedListener(listener: () -> Unit)：设置视图改变时的监听器。
    当信息窗口的视图发生改变时，会调用传入的监听器函数。
 */

interface DJIInfoWindow {
    fun setOnViewChangedListener(listener: () -> Unit)

    fun onCreate()
    //onCreate()：在信息窗口创建时调用。可以在此方法中执行一些初始化操作。

    fun onDestroy()
    //onDestroy()：在信息窗口销毁时调用。可以在此方法中释放资源或进行清理工作。

}