package com.matrix.software.application.restservice;

import java.util.Objects;

//record understand like enumn bản ghi là 1 hạn chế của class
//Là 1 hạn chế của class ko cho phép thay đổi dữ liệu của class
//Chỉ có contructor và chỉ có thể try cập vào lấy dữ liệu trường trong class
// 
//final class Greeting

public record Greeting(long id,String content) {
}
