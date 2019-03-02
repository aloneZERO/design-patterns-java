package structure.proxy;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 代理
 * <p>
 * 控制对其它对象的访问。
 * <p>
 * 代理有以下四类：
 * <pre>
 * 远程代理（Remote Proxy）：
 *      控制对远程对象（不同地址空间）的访问，它负责将请求
 *      及其参数进行编码，并向不同地址空间中的对象发送已经编码的请求。
 * 虚拟代理（Virtual Proxy）：
 *      根据需要创建开销很大的对象，它可以缓存实体的附加信息，
 *      以便延迟对它的访问，例如在网站加载一个很大图片时，不能
 *      马上完成，可以用虚拟代理缓存图片的大小信息，然后生成一张临时图片代替原始图片。
 * 保护代理（Protection Proxy）：
 *      按权限控制对象的访问，它负责检查调用者是否具有实现一个请求所必须的访问权限。
 * 智能代理（Smart Reference）：
 *      取代了简单的指针，它在访问对象时执行一些附加操作：记录
 *      对象的引用次数；当第一次引用一个对象时，将它装入内存；在访问
 *      一个实际对象前，检查是否已经锁定了它，以确保其它对象不能改变它。
 * </pre>
 * 示例：
 * 以下是一个虚拟代理的实现，模拟了图片延迟加载的情况下使用与图片大小相等的临时内容去
 * 替换原始图片，直到图片加载完成才将图片显示出来。
 *
 * @since 2019/3/2
 */
public class ImageViewer {
    public static void main(String[] args) throws Exception {
        String image = "http://image.jpg";
        URL imageURL = new URL(image);
        HighResolutionImage highResolutionImage =
                new HighResolutionImage(imageURL);
        ImageProxy imageProxy = new ImageProxy(highResolutionImage);
        imageProxy.showImage();
    }
}
