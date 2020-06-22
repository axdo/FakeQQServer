/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 80017
Source Host           : localhost:3306
Source Database       : fakeqq

Target Server Type    : MYSQL
Target Server Version : 80017
File Encoding         : 65001

Date: 2020-06-20 09:51:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for category_
-- ----------------------------
DROP TABLE IF EXISTS `category_`;
CREATE TABLE `category_` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category_
-- ----------------------------
INSERT INTO `category_` VALUES ('1', 'category1');
INSERT INTO `category_` VALUES ('2', 'category2');
INSERT INTO `category_` VALUES ('3', 'category3');
INSERT INTO `category_` VALUES ('4', 'category4');
INSERT INTO `category_` VALUES ('5', 'category5');

-- ----------------------------
-- Table structure for qq_user
-- ----------------------------
DROP TABLE IF EXISTS `qq_user`;
CREATE TABLE `qq_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of qq_user
-- ----------------------------
INSERT INTO `qq_user` VALUES ('1', 'aaa', '12345');
INSERT INTO `qq_user` VALUES ('2', 'ad', '111');
INSERT INTO `qq_user` VALUES ('10', 'qq', '11');
INSERT INTO `qq_user` VALUES ('11', 'mike', '123456');
INSERT INTO `qq_user` VALUES ('12', 'john', '111111');
INSERT INTO `qq_user` VALUES ('13', 'aaaaa', '111111');
INSERT INTO `qq_user` VALUES ('14', 'qa', '111');
INSERT INTO `qq_user` VALUES ('15', 'ttttt', '111111');
INSERT INTO `qq_user` VALUES ('16', 'qaz', '123');
INSERT INTO `qq_user` VALUES ('17', 'qwer', '111');
INSERT INTO `qq_user` VALUES ('19', 'zxc', '111');
INSERT INTO `qq_user` VALUES ('20', 'qqqqe', '2222');
INSERT INTO `qq_user` VALUES ('21', 'fll', '111');
INSERT INTO `qq_user` VALUES ('23', 'android1', '000000');
INSERT INTO `qq_user` VALUES ('24', 'qwertyu', '1111111');
