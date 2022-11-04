package com.nhnacademy.gw1.parking.domian.car;

public enum PlateMiddleCharacter {
    A('가'),
    B('나'),
    C('다'),
    D('라'),
    E('마'),
    F('바'),
    G('사'),
    H('아'),
    I('자'),
    J('차'),
    K('카'),
    L('타'),
    M('파'),
    N('하');

    private char korChar;
    PlateMiddleCharacter(char korChar) {
        this.korChar = korChar;
    }
}
