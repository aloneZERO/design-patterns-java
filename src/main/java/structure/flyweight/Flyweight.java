package structure.flyweight;

/**
 * @since 2019/3/2
 */
public interface Flyweight {
    // ExtrinsicState：外部状态，每个享元对象的外部状态不同
    void doOperation(String extrinsicState);
}
