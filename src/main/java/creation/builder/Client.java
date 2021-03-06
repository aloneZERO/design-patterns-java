package creation.builder;

/**
 * 生成器模式
 * <p>
 * 封装一个对象的构造过程，并允许按步骤构造。
 *
 * @since 2019/2/15
 */
public class Client {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        final int count = 26;
        for (int i=0; i< count; i++) {
            sb.append((char) ('a'+i));
        }
        System.out.println(sb.toString());
        assert "abcdefghijklmnopqrstuvwxyz"
                .equals(sb.toString());
    }

}
