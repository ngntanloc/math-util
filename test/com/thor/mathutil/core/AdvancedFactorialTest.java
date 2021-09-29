/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thor.mathutil.core;

import static com.thor.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Nguyen Tan Loc
 */
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {

    //ta viết kĩ thuật mới, tách data ra hẳn các lệnh kiểm tra hàm
    // data này ta có thể đặt ở các file .txt, .csv, .excel, database bên ngoài
//    @Before/@BeforeAll/[Before]
    // hàm tải load data vào ram
//    @Test
    // input và output/expecterd là những cặp
    // nhiều cặp cần phải test, do đó data để test hàm sẽ là mảng 2 chiều
    // mảng 2 chiều này sẻ đc nạp từ .txt, db...
    // hoặc ta tạo luôn 1 mảng 2 chiều ngay đây
    @Parameters
    public static Object[][] initData() {   // tên hàm tùy ý
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 120}
        };
    }

    // ta cần map 2 cột vào 2 biến để lát hồi nhồi/feed chúng vào
    // hàm checkFactorial, ta gọi là testing kiểu tham số hóa
    //                              parameterized testing
    @Parameter(value = 0) // map với cột 0 của tập data
    public int input;

    @Parameter(value = 1) // map với cột 1 của tập data
    public long expected;

    @Test
    public void checkFactorialGivenRightArgumentReturnsWell() {

        assertEquals(expected, getFactorial(input));
    }

    // một số framework nhanh gọn hơn thì 
//    @Test{data đây luôn}
//    public void checkFactorialGivenRightArgumentReturnsWell(cột map, biến) {
//        
//        Assert.assertEquals(expected, (MathUtil.getFactorial(input)));
//    }
}
