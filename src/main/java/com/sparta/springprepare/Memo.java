package com.sparta.springprepare;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Memo {
    private String username;
    private String contents;

    //    public Memo(String username, String contents) {
//        this.username = username;
//        this.contents = contents;
//    }
    public static void main(String[] args) {
        Memo m = new Memo("123","456");

    }
}

