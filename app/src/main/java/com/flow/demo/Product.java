package com.flow.demo;

import java.util.List;

/**
 * Created by Frank on 2018/4/19.
 */

public class Product {

    public List<Classify> classify;

    static public class Classify {
        public String title;
        List<Des> des;

        public Classify(String title, List<Des> des) {
            this.title = title;
            this.des = des;
        }

        public static class Des {
            boolean isSelect;
            String des;

            public Des(String des) {
                this.des = des;
            }
        }

    }


}
