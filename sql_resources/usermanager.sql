/*
Navicat MySQL Data Transfer

Source Server         : MyDemo
Source Server Version : 50728
Source Host           : localhost:3306
Source Database       : usermanager

Target Server Type    : MYSQL
Target Server Version : 50728
File Encoding         : 65001

Date: 2020-05-28 06:59:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tuserlogin
-- ----------------------------
DROP TABLE IF EXISTS `tuserlogin`;
CREATE TABLE `tuserlogin` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  `grade` varchar(20) DEFAULT 'p1',
  `email` varchar(255) DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=106 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tuserlogin
-- ----------------------------
INSERT INTO `tuserlogin` VALUES ('5', '朱秦尤许', '-7f55794e74d69da5dbe98b840e6be614', '1', 'zhu@126.com');
INSERT INTO `tuserlogin` VALUES ('6', '何吕施张', '-1ef523c6b645a65441a91fa80df077c2', '1', 'he@126.com');
INSERT INTO `tuserlogin` VALUES ('7', '孔曹严华', '-1ef523c6b645a65441a91fa80df077c2', '3', 'kong@126.com');
INSERT INTO `tuserlogin` VALUES ('8', '金魏陶姜', '-1ef523c6b645a65441a91fa80df077c2', '1', 'jin@126.com');
INSERT INTO `tuserlogin` VALUES ('9', '戚谢邹喻', '-1ef523c6b645a65441a91fa80df077c2', '1', 'qi@126.com');
INSERT INTO `tuserlogin` VALUES ('10', '柏水窦章', '-1ef523c6b645a65441a91fa80df077c2', '2', 'bai@126.com');
INSERT INTO `tuserlogin` VALUES ('11', '云苏潘葛', '-1ef523c6b645a65441a91fa80df077c2', '1', 'yun@126.com');
INSERT INTO `tuserlogin` VALUES ('12', '奚范彭郎', '123456', '2', 'xi@126.com');
INSERT INTO `tuserlogin` VALUES ('13', '鲁韦昌马', '123456', '2', 'lu@126.com');
INSERT INTO `tuserlogin` VALUES ('14', '苗凤花方', '123456', '1', 'miao@126.com');
INSERT INTO `tuserlogin` VALUES ('15', '俞任袁柳', '123456', '1', 'yu@126.com');
INSERT INTO `tuserlogin` VALUES ('16', '酆鲍史唐', '123456', '1', 'li@126.com');
INSERT INTO `tuserlogin` VALUES ('17', '费廉岑薛', '123456', '2', 'fei@126.com');
INSERT INTO `tuserlogin` VALUES ('18', '雷贺倪汤', '123456', '2', 'lei@126.com');
INSERT INTO `tuserlogin` VALUES ('19', '滕殷罗毕', '123456', '1', 'teng@126.com');
INSERT INTO `tuserlogin` VALUES ('20', '郝邬安常', '123456', '1', 'hao@126.com');
INSERT INTO `tuserlogin` VALUES ('21', '赵钱孙李', '123456', '1', 'zao@126.com');
INSERT INTO `tuserlogin` VALUES ('22', '周吴郑王', '123456', '1', 'zhou@126.com');
INSERT INTO `tuserlogin` VALUES ('23', '冯陈褚卫', '123456', '1', 'feng@126.com');
INSERT INTO `tuserlogin` VALUES ('24', '蒋沈韩杨', '123456', '2', 'jiang@126.com');
INSERT INTO `tuserlogin` VALUES ('25', '朱秦尤许', '123456', '1', 'zhu@126.com');
INSERT INTO `tuserlogin` VALUES ('26', '何吕施张', '123456', '1', 'he@126.com');
INSERT INTO `tuserlogin` VALUES ('27', '孔曹严华', '123456', '3', 'kong@126.com');
INSERT INTO `tuserlogin` VALUES ('28', '金魏陶姜', '123456', '1', 'jin@126.com');
INSERT INTO `tuserlogin` VALUES ('29', '戚谢邹喻', '123456', '1', 'qi@126.com');
INSERT INTO `tuserlogin` VALUES ('30', '柏水窦章', '123456', '2', 'bai@126.com');
INSERT INTO `tuserlogin` VALUES ('31', '云苏潘葛', '123456', '1', 'yun@126.com');
INSERT INTO `tuserlogin` VALUES ('32', '奚范彭郎', '123456', '2', 'xi@126.com');
INSERT INTO `tuserlogin` VALUES ('33', '鲁韦昌马', '123456', '2', 'lu@126.com');
INSERT INTO `tuserlogin` VALUES ('34', '苗凤花方', '123456', '1', 'miao@126.com');
INSERT INTO `tuserlogin` VALUES ('35', '俞任袁柳', '123456', '1', 'yu@126.com');
INSERT INTO `tuserlogin` VALUES ('36', '酆鲍史唐', '123456', '1', 'li@126.com');
INSERT INTO `tuserlogin` VALUES ('37', '费廉岑薛', '123456', '2', 'fei@126.com');
INSERT INTO `tuserlogin` VALUES ('38', '雷贺倪汤', '123456', '2', 'lei@126.com');
INSERT INTO `tuserlogin` VALUES ('39', '滕殷罗毕', '123456', '1', 'teng@126.com');
INSERT INTO `tuserlogin` VALUES ('40', '郝邬安常', '123456', '1', 'hao@126.com');
INSERT INTO `tuserlogin` VALUES ('41', '赵钱孙李', '123456', '1', 'zao@126.com');
INSERT INTO `tuserlogin` VALUES ('42', '周吴郑王', '123456', '1', 'zhou@126.com');
INSERT INTO `tuserlogin` VALUES ('43', '冯陈褚卫', '123456', '1', 'feng@126.com');
INSERT INTO `tuserlogin` VALUES ('44', '蒋沈韩杨', '123456', '2', 'jiang@126.com');
INSERT INTO `tuserlogin` VALUES ('45', '朱秦尤许', '123456', '1', 'zhu@126.com');
INSERT INTO `tuserlogin` VALUES ('46', '何吕施张', '123456', '1', 'he@126.com');
INSERT INTO `tuserlogin` VALUES ('47', '孔曹严华', '123456', '3', 'kong@126.com');
INSERT INTO `tuserlogin` VALUES ('48', '金魏陶姜', '123456', '1', 'jin@126.com');
INSERT INTO `tuserlogin` VALUES ('49', '戚谢邹喻', '123456', '1', 'qi@126.com');
INSERT INTO `tuserlogin` VALUES ('50', '柏水窦章', '123456', '2', 'bai@126.com');
INSERT INTO `tuserlogin` VALUES ('51', '云苏潘葛', '123456', '1', 'yun@126.com');
INSERT INTO `tuserlogin` VALUES ('52', '奚范彭郎', '123456', '2', 'xi@126.com');
INSERT INTO `tuserlogin` VALUES ('53', '鲁韦昌马', '123456', '2', 'lu@126.com');
INSERT INTO `tuserlogin` VALUES ('54', '苗凤花方', '123456', '1', 'miao@126.com');
INSERT INTO `tuserlogin` VALUES ('55', '俞任袁柳', '123456', '1', 'yu@126.com');
INSERT INTO `tuserlogin` VALUES ('56', '酆鲍史唐', '123456', '1', 'li@126.com');
INSERT INTO `tuserlogin` VALUES ('57', '费廉岑薛', '123456', '2', 'fei@126.com');
INSERT INTO `tuserlogin` VALUES ('58', '雷贺倪汤', '123456', '2', 'lei@126.com');
INSERT INTO `tuserlogin` VALUES ('59', '滕殷罗毕', '123456', '1', 'teng@126.com');
INSERT INTO `tuserlogin` VALUES ('60', '郝邬安常', '123456', '1', 'hao@126.com');
INSERT INTO `tuserlogin` VALUES ('61', '赵钱孙李', '123456', '1', 'zao@126.com');
INSERT INTO `tuserlogin` VALUES ('62', '周吴郑王', '123456', '1', 'zhou@126.com');
INSERT INTO `tuserlogin` VALUES ('63', '冯陈褚卫', '123456', '1', 'feng@126.com');
INSERT INTO `tuserlogin` VALUES ('64', '蒋沈韩杨', '123456', '2', 'jiang@126.com');
INSERT INTO `tuserlogin` VALUES ('65', '朱秦尤许', '123456', '1', 'zhu@126.com');
INSERT INTO `tuserlogin` VALUES ('66', '何吕施张', '123456', '1', 'he@126.com');
INSERT INTO `tuserlogin` VALUES ('67', '孔曹严华', '123456', '3', 'kong@126.com');
INSERT INTO `tuserlogin` VALUES ('68', '金魏陶姜', '123456', '1', 'jin@126.com');
INSERT INTO `tuserlogin` VALUES ('69', '戚谢邹喻', '123456', '1', 'qi@126.com');
INSERT INTO `tuserlogin` VALUES ('70', '柏水窦章', '123456', '2', 'bai@126.com');
INSERT INTO `tuserlogin` VALUES ('71', '云苏潘葛', '123456', '1', 'yun@126.com');
INSERT INTO `tuserlogin` VALUES ('72', '奚范彭郎', '123456', '2', 'xi@126.com');
INSERT INTO `tuserlogin` VALUES ('73', '鲁韦昌马', '123456', '2', 'lu@126.com');
INSERT INTO `tuserlogin` VALUES ('74', '苗凤花方', '123456', '1', 'miao@126.com');
INSERT INTO `tuserlogin` VALUES ('75', '俞任袁柳', '123456', '1', 'yu@126.com');
INSERT INTO `tuserlogin` VALUES ('76', '酆鲍史唐', '123456', '1', 'li@126.com');
INSERT INTO `tuserlogin` VALUES ('77', '费廉岑薛', '123456', '2', 'fei@126.com');
INSERT INTO `tuserlogin` VALUES ('78', '雷贺倪汤', '123456', '2', 'lei@126.com');
INSERT INTO `tuserlogin` VALUES ('79', '滕殷罗毕', '123456', '1', 'teng@126.com');
INSERT INTO `tuserlogin` VALUES ('80', '郝邬安常', '123456', '1', 'hao@126.com');
INSERT INTO `tuserlogin` VALUES ('84', '蒋沈韩杨', '123456', '2', 'jiang@126.com');
INSERT INTO `tuserlogin` VALUES ('85', '朱秦尤许', '123456', '1', 'zhu@126.com');
INSERT INTO `tuserlogin` VALUES ('86', '何吕施张', '123456', '1', 'he@126.com');
INSERT INTO `tuserlogin` VALUES ('87', '孔曹严华', '123456', '3', 'kong@126.com');
INSERT INTO `tuserlogin` VALUES ('88', '金魏陶姜', '123456', '1', 'jin@126.com');
INSERT INTO `tuserlogin` VALUES ('89', '戚谢邹喻', '123456', '1', 'qi@126.com');
INSERT INTO `tuserlogin` VALUES ('91', '云苏潘葛', '-1ef523c6b645a65441a91fa80df077c2', '1', 'yun@126.com');
INSERT INTO `tuserlogin` VALUES ('92', '奚范彭郎', '-1ef523c6b645a65441a91fa80df077c2', '2', 'xi@126.com');
INSERT INTO `tuserlogin` VALUES ('101', 'wyj', '-3b35bdc75f46dc7df233af65908a7b65', '1', 'wyj@126.com');
INSERT INTO `tuserlogin` VALUES ('102', 'admin', '-1ef523c6b645a65441a91fa80df077c2', '1', 'test@126.com');
INSERT INTO `tuserlogin` VALUES ('103', 'wyj', '-1ef523c6b645a65441a91fa80df077c2', '1', 'wyj@126.com');
INSERT INTO `tuserlogin` VALUES ('104', 'wyj', '202cb962ac59075b964b07152d234b70', '1', 'wyj@126.com');
INSERT INTO `tuserlogin` VALUES ('105', 'Test', '-1ef523c6b645a65441a91fa80df077c2', '2', '123@123');
