package structure.adapter;

import lombok.AllArgsConstructor;

/**
 * @since 2019/3/2
 */
@AllArgsConstructor
class TurkeyAdapter implements Duck {

    Turkey turkey;

    @Override
    public void quack() {
        turkey.gobble();
    }
}
