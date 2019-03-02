package structure.proxy;

import lombok.AllArgsConstructor;

/**
 * @since 2019/3/2
 */
@AllArgsConstructor
public class ImageProxy implements Image {

    private HighResolutionImage highResolutionImage;

    @Override
    public void showImage() {
        while (!highResolutionImage.isLoad()) {
            try {
                System.out.println("Temp Image: "
                        + highResolutionImage.getWidth() + " X "
                        + highResolutionImage.getHeight());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        highResolutionImage.showImage();
    }
}
