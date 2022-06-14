package com.bewater.cording.interview.javajuc.线程池;

import java.util.concurrent.Callable;

public class ZD implements Callable {
    @Override
    public String call() throws Exception {
        return "zd最屌";
    }

}
