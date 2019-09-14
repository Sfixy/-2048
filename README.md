# Android 2048
## 项目简介
#### 项目名称
2048
#### 项目背景
应实验室的假期要求（没有达到标准），做了点小东西，练练手的同时，也熟悉一下了Android的开发流程。
#### 使用语言
Java
## 项目效果
![](https://github.com/Sfixy/-2048/blob/master/images/test.gif)
## 项目特点
使用LinearLayout布局，绑定GridLayout，TextView。
三个Java类MainActivity，GameView，Card
## 项目基本架构
MainActivity控制分数累计
Card类制作每一张显示数字的小卡片（颜色、大小），包含显示数字，判断卡片数字是否相等等功能
GameView类是程序的核心。屏幕点击控制，建立Card类，建立卡片上的数字，相同卡片数字相加操作，检测游戏结束，均在这里完成
## 制作环境
在Android环境下开发的2048小游戏。
虚拟机运行Android7.0，API 24
## 游戏指南
2048游戏是靠折叠相同数字使他们相加，进而得到一个新数字。只能上下左右滑动，每次滑动均会产生一个新数字，相同数字相加会累计分数。
