/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thor.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Nguyen Tan Loc
 */
public class FactorialTest {

    @Test
    public void checkFactorialGivenRightArgumentReturnsWell() {

        long expected = 120;
        long actual = MathUtil.getFactorial(5);

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        Assert.assertEquals(1, MathUtil.getFactorial(0));
    }

    // check xem có xuất hiện ngoại lệ hay ko khi đưa data cà chớn!!!
    @Test(expected = IllegalArgumentException.class)
    public void checkFactorialGivenWrongArgumentThrowsException() {
        // ta ko dùng hàm assertEsquals (2 values so sánh)
        // ngoại lệ chỉ có thể thấy nó xuất hiện hay ko??

        MathUtil.getFactorial(-5);
    }
}

// QUY ƯỚC XANH ĐỎ:
//1. XANH, TẤT CẢ TÌNH HÌNH SO SÁNH, XÀI HÀM PHẢI CÙNG XANH
//2. ĐỎ: CHỈ CẦN 1 TÍNH HUỐNG XÀI HÀM BỊ ĐỎ, THÌ COI NHƯ CẢ HÀM ĐỎ
//ĐỎ:
//HOẶC BẠN TÍNH TOÁN TRONG THUẬT TOÁN/HÀM SAI
//HOẶC BẠN KÌ VỌNG SAI
