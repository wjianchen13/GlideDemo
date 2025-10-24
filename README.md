# Glide基础使用
glide 基础使用 https://www.jianshu.com/p/41b496da5926


# 编译环境
android-studio-2024.3.2.15
gradle插件：8.10.1
gradle版本：gradle-8.11.1-bin

在 Glide 中，DiskCacheStrategy 枚举类用于设置图片的磁盘缓存策略，决定了 Glide 如何缓存图片到磁盘上。

以下是 DiskCacheStrategy 枚举类的常用取值及其含义：
DiskCacheStrategy.ALL: 表示将原始图片和转换后的图片都缓存到磁盘上。Glide 会在网络请求成功后将图片保存到磁盘缓存，并在后续加载同一张图片时直接使用缓存数据，避免再次从网络下载。
DiskCacheStrategy.NONE: 表示不缓存任何图片到磁盘上。每次加载图片时都会从网络或其他来源获取最新的图片数据，不会使用任何缓存数据。这在需要实时获取更新的图片时比较适用，但会增加网络请求的频率和时间。
DiskCacheStrategy.DATA: 表示只缓存原始图片数据到磁盘上，不缓存任何转换后的图片。这个策略适用于不需要对图片进行任何转换操作，只需缓存原始图片数据的场景。例如，你可能只需要将图片下载到本地以供后续分享或离线使用。
DiskCacheStrategy.RESOURCE: 表示只缓存转换后的图片资源到磁盘上，不缓存原始图片数据。这个策略适用于原始图片数据容易获取或不需要长期保存，但转换后的图片资源需要频繁使用的场景。例如，你可能有一个需要频繁加载和显示的转换后的圆形头像图片。
DiskCacheStrategy.AUTOMATIC: 表示根据图片的来源自动选择合适的缓存策略。Glide 会根据图片的来源（网络、本地、资源等）和转换操作来自动决定是否缓存图片以及缓存的形式。这是默认的缓存策略，适用于大多数情况。
通过选择适当的 DiskCacheStrategy，你可以根据需求来控制 Glide 如何缓存图片到磁盘上，平衡网络请求、缓存空间和图片加载性能。


# 参考文档
Android图片加载框架最全解析（六），探究Glide的自定义模块功能
https://zhuanlan.zhihu.com/p/92027112

踩坑啦！你确定你的Glide不会发生内存泄漏吗？
https://www.cnblogs.com/button123/p/15656988.html

Android深入了解Glide
https://blog.csdn.net/weixin_44780781/article/details/136192856

Glide 配置多个自定义的AppGlideModule
https://blog.51cto.com/u_16099264/12001283

Android Glide加载指定大小的Bitmap到内存
https://blog.51cto.com/u_16213675/11579810

Android图片加载框架最全解析（六），探究Glide的自定义模块功能
https://cloud.tencent.com/developer/article/1015781

Android图片加载框架最全解析（七），实现带进度的Glide图片加载功能
https://cloud.tencent.com/developer/inventory/4525/article/1015796

Android—Glide使用教程（四）
https://juejin.cn/post/6982815840408174599

Android图片加载框架最全解析（二），从源码的角度理解Glide的执行流程
https://cloud.tencent.com/developer/article/1015744





