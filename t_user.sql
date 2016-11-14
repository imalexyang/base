/*
Navicat MySQL Data Transfer

Source Server         : 123456
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : base

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2016-11-14 22:29:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL COMMENT '名称',
  `nick` varchar(10) DEFAULT NULL COMMENT '昵称',
  `password` varchar(10) DEFAULT NULL COMMENT '密码',
  `createDate` datetime DEFAULT NULL,
  `updateDate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'admin', '管理员', '123456', null, null);
INSERT INTO `t_user` VALUES ('2', 'admin2', 'admin2', null, null, null);
INSERT INTO `t_user` VALUES ('3', 'admin3', 'admin3', null, null, null);
INSERT INTO `t_user` VALUES ('4', 'admin4', 'admin4', null, null, null);
INSERT INTO `t_user` VALUES ('5', 'admin5', 'admin5', null, null, null);
INSERT INTO `t_user` VALUES ('6', 'admin6', 'admin6', null, null, null);
INSERT INTO `t_user` VALUES ('7', 'admin6', 'admin6', null, null, null);
INSERT INTO `t_user` VALUES ('8', 'admin8', 'admin8', null, null, null);
INSERT INTO `t_user` VALUES ('9', 'admin9', 'admin9', null, null, null);
INSERT INTO `t_user` VALUES ('10', 'admin10', 'admin10', null, null, null);
INSERT INTO `t_user` VALUES ('11', 'admin11', 'admin11', null, null, null);
INSERT INTO `t_user` VALUES ('12', 'admin12', 'admin12', null, null, null);
