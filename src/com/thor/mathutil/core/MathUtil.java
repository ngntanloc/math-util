/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thor.mathutil.core;

/**
 *
 * @author Nguyen Tan Loc
 */
public class MathUtil {
    
    // viết theo kiểu đệ quy - recursion
    // gọi lại chính mình với quy mô khác
    // búp bê ng Nga
    // 5! = 1 x 2 x 3 x 4 x  5
    // 5! = 5 x 4!
    // 4! = 4 x 3!
    // 3! = 3 x 2!
    // 2! = 2 x 1!
    // 1! = 1 -> điểm dừng
    // n! = n x (n-1)!
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid arg, n must be between 0..20");
        
        if (n == 0 || n == 1)
            return 1; // điểm dừng
        
        return n * getFactorial(n-1);
        
    }

    // viết hàm tính giai thừa n! = 1.2.3.4....n
    // 0! - 1! = 1
    // 21! - tràn kiểu long
    // <0! ko tính đc, ko có giai thừa cho số âm
//    public static long getFactorial(int n) {
//
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("n must be between 0..20");
//        }
//
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//
//        long product = 1; // tích dồn
//
//        for (int i = 2; i <= n; i++) {
//            product *= i;
//        }
//
//        return product;
//    }
}

// TDD - Test Driven Development
// Test First Development
// Khi viết code, ta phải lưu ý ngay việc viết test case/tình huống test app/hàm phải đc đề cập ngay
// test ngay những gì ta sẽ viết ra, test trước khi ta viết hoàn thiện code
// 
