/*
Navicat MySQL Data Transfer

Source Server         : MyDemo
Source Server Version : 50728
Source Host           : localhost:3306
Source Database       : employee_erp

Target Server Type    : MYSQL
Target Server Version : 50728
File Encoding         : 65001

Date: 2020-05-28 06:59:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `department_id` int(11) unsigned NOT NULL,
  `department_name` varchar(20) NOT NULL,
  `department_leader` char(20) NOT NULL DEFAULT '',
  `department_address` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '1', '技术部', '张工', '办公楼三楼C室');
INSERT INTO `department` VALUES ('2', '2', '人力资源部', '王总', '办公楼四楼A室');
INSERT INTO `department` VALUES ('3', '3', '研发部', '赵工', '办公楼六楼B室');
INSERT INTO `department` VALUES ('4', '4', '市场部', '刘总', '办公室十楼G室');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `emp_id` int(11) unsigned NOT NULL,
  `emp_name` varchar(20) NOT NULL,
  `emp_gender` char(2) NOT NULL DEFAULT '',
  `emp_password` varchar(20) DEFAULT NULL,
  `emp_grade` varchar(20) DEFAULT 'p1',
  `emp_email` varchar(255) DEFAULT '',
  `emp_department_id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '1001', '赵钱孙李', '男', '123456', '1', 'zao@126.com', '3');
INSERT INTO `employee` VALUES ('2', '1002', '周吴郑王', '女', '123456', '1', 'zhou@126.com', '1');
INSERT INTO `employee` VALUES ('3', '1003', '冯陈褚卫', '女', '123456', '1', 'feng@126.com', '3');
INSERT INTO `employee` VALUES ('4', '1004', '蒋沈韩杨', '男', '123456', '2', 'jiang@126.com', '1');
INSERT INTO `employee` VALUES ('5', '1005', '朱秦尤许', ' 女', '123456', '1', 'zhu@126.com', '3');
INSERT INTO `employee` VALUES ('6', '1006', '何吕施张', ' 女', '123456', '1', 'he@126.com', '1');
INSERT INTO `employee` VALUES ('7', '1007', '孔曹严华', '女', '123456', '3', 'kong@126.com', '3');
INSERT INTO `employee` VALUES ('8', '1008', '金魏陶姜', '男', '123456', '1', 'jin@126.com', '2');
INSERT INTO `employee` VALUES ('9', '1009', '戚谢邹喻', '男', '123456', '1', 'qi@126.com', '1');
INSERT INTO `employee` VALUES ('10', '1010', '柏水窦章', '女', '123456', '2', 'bai@126.com', '3');
INSERT INTO `employee` VALUES ('11', '1011', '云苏潘葛', '男', '123456', '1', 'yun@126.com', '1');
INSERT INTO `employee` VALUES ('12', '1012', '奚范彭郎', '男', '123456', '2', 'xi@126.com', '3');
INSERT INTO `employee` VALUES ('13', '1013', '鲁韦昌马', '女', '123456', '2', 'lu@126.com', '1');
INSERT INTO `employee` VALUES ('14', '1014', '苗凤花方', '男', '123456', '1', 'miao@126.com', '1');
INSERT INTO `employee` VALUES ('15', '1015', '张三丰', '男', '123456', '13', 'zhang@123.com', '3');
INSERT INTO `employee` VALUES ('16', '1016', '酆鲍史唐', '男', '123456', '1', 'li@126.com', '1');
INSERT INTO `employee` VALUES ('17', '1017', '费廉岑薛', '男', '123456', '2', 'fei@126.com', '2');
INSERT INTO `employee` VALUES ('18', '1018', '雷贺倪汤', '女', '123456', '2', 'lei@126.com', '1');
INSERT INTO `employee` VALUES ('19', '1019', '滕殷罗毕', '男', '123456', '1', 'teng@126.com', '2');
INSERT INTO `employee` VALUES ('20', '1020', '郝邬安常', '女', '123456', '1', 'hao@126.com', '1');
INSERT INTO `employee` VALUES ('27', '1015', '张三丰', '男', '123456', '13', 'zhang@123.com', '3');
INSERT INTO `employee` VALUES ('32', '9999', '张三丰', '男', '123456', '13', 'zhang@123.com', '3');
INSERT INTO `employee` VALUES ('33', '9999', '张三丰', '男', '123456', '13', 'zhang@123.com', '3');
INSERT INTO `employee` VALUES ('34', '8888', '张无忌', '男', '123456', '13', 'zhang@123.com', '3');
INSERT INTO `employee` VALUES ('35', '8888', '张无忌', '男', '123456', '13', 'zhang@123.com', '3');
INSERT INTO `employee` VALUES ('36', '8888', '张无忌', '男', '123456', '13', 'zhang@123.com', '3');
INSERT INTO `employee` VALUES ('37', '8888', '张三丰', '男', '123456', '13', 'zhang@123.com', '3');
INSERT INTO `employee` VALUES ('38', '8888', '张无忌', '男', '123456', '13', 'zhang@123.com', '3');
INSERT INTO `employee` VALUES ('39', '1020', 'wyj', '男', '123456', 'p1', 'wyj@123.com', '0');
