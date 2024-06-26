package com.baomidou.mybatisplus.extension.bo;

import java.util.Objects;

@FunctionalInterface
public interface Consumer5<T1, T2, T3, T4, T5> {
    void accept(T1 ti, T2 t2, T3 t3, T4 t4, T5 t5);

    default Consumer5<T1, T2, T3, T4, T5> andThen(Consumer5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> after) {
        Objects.requireNonNull(after);

        return (t1, t2, t3, t4, t5) -> {
            accept(t1, t2, t3, t4, t5);
            after.accept(t1, t2, t3, t4, t5);
        };
    }
}
