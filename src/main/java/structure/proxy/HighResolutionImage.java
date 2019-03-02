package structure.proxy;

import lombok.Getter;

import java.net.URL;

/**
 * 高分辨率图像
 * @since 2019/3/2
 */
@Getter
public class HighResolutionImage implements Image {

    private URL imageURL;
    private long startTime;
    private int height;
    private int width;

    public HighResolutionImage(URL imageURL) {
        this.imageURL = imageURL;
        this.startTime = System.currentTimeMillis();
        this.width = 1920;
        this.height = 1080;
    }

    public boolean isLoad() {
        // 模拟图片加载，延迟 3s 加载完成
        long endTime = System.currentTimeMillis();
        return endTime - startTime > 300;
    }

    @Override
    public void showImage() {
        System.out.println("Real Image: " + imageURL);
    }
}
