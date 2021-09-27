/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thor.mathutil.main;

import com.thor.mathutil.core.MathUtil;

/**
 *
 * @author Nguyen Tan Loc
 */
public class Main {

    public static void main(String[] args) {

        MathUtil.getFactorial(-5);
        // test manual, đưa data, gọi hàm check, so sánh expected vs actual
        // tất cả, đặc biệt phần cmp là phải bằng mắt, cho từng trường hợp, từng tình huống...

        System.out.println("0? = ?1 " + MathUtil.getFactorial(0));
        System.out.println("1? = ?1 " + MathUtil.getFactorial(1));
        System.out.println("2? = ?4 " + MathUtil.getFactorial(2));
        System.out.println("3? = ?6 " + MathUtil.getFactorial(3));

    }
}
