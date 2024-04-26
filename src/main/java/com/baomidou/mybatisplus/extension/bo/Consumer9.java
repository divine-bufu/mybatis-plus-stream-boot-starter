package com.baomidou.mybatisplus.extension.bo;

import java.util.Objects;

@FunctionalInterface
public interface Consumer9<T1, T2, T3, T4, T5, T6, T7, T8, T9> {
    void accept(T1 ti, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9);

    default Consumer9<T1, T2, T3, T4, T5, T6, T7, T8, T9>

    andThen(Consumer9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9> after) {
        Objects.requireNonNull(after);

        return (t1, t2, t3, t4, t5, t6, t7, t8, t9) -> {
            accept(t1, t2, t3, t4, t5, t6, t7, t8, t9);
            after.accept(t1, t2, t3, t4, t5, t6, t7, t8, t9);
        };
    }
}
