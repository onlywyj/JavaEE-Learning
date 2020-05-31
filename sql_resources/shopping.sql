/*
Navicat MySQL Data Transfer

Source Server         : MyDemo
Source Server Version : 50728
Source Host           : localhost:3306
Source Database       : shopping

Target Server Type    : MYSQL
Target Server Version : 50728
File Encoding         : 65001

Date: 2020-05-28 06:59:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `bookname` varchar(50) NOT NULL,
  `author` varchar(50) NOT NULL,
  `publishHouse` varchar(200) NOT NULL,
  `price` decimal(10,3) NOT NULL,
  `nums` decimal(10,3) DEFAULT '1000.000',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', 'jsp应用开发详解', '刘晓华', '电子工业出版社', '59.800', '500.000');
INSERT INTO `book` VALUES ('2', 'Java项目开发案例全程实录(第2版)', '李钟尉,陈丹丹', '清华大学出版社', '69.800', '200.000');
INSERT INTO `book` VALUES ('3', 'ASP.NET项目开发案例全程实录(第2版)', '郑齐心,房大伟,刘云峰', '清华大学出版社', '74.000', '456.000');
INSERT INTO `book` VALUES ('4', 'jquery技术内幕：深入解析jquery架构设计与实现原理', '高云', '机械工业出版社', '99.000', '200.000');
INSERT INTO `book` VALUES ('6', 'jsp应用开发详解', '刘晓华', '电子工业出版社', '59.800', '500.000');
INSERT INTO `book` VALUES ('7', 'jsp应用开发详解', '刘晓华', '电子工业出版社', '59.800', '500.000');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `tel` varchar(20) NOT NULL,
  `grade` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'wyj', '123', 'wyj@126.com', '1303030333', '2');
INSERT INTO `users` VALUES ('2', 'admin', '123', 'admin@126.com', '346789', '2');
INSERT INTO `users` VALUES ('3', 'admin', '123', 'admin@126.com', '346789', '2');
INSERT INTO `users` VALUES ('4', 'wyj', '123', 'wyj@126.com', '1303030333', '2');
