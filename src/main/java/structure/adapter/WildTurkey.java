package structure.adapter;

/**
 * @since 2019/3/2
 */
class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("gobble!");
    }
}
