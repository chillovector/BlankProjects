package org.example;

import com.google.gson.Gson;

public class Main {

    static class Test {

        public Test(int i) {
            this.i = i;
        }

        private int i;
    }

    public static void main(String[] args) {
        Gson g = new Gson();
        Test test = new Test(1);
        System.out.println(g.toJson(test));
    }
}
