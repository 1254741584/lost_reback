/*
Navicat MySQL Data Transfer

Source Server         : a
Source Server Version : 50027
Source Host           : localhost:3306
Source Database       : lost_reback

Target Server Type    : MYSQL
Target Server Version : 50027
File Encoding         : 65001

Date: 2017-09-02 10:31:35
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `collect`
-- ----------------------------
DROP TABLE IF EXISTS `collect`;
CREATE TABLE `collect` (
  `cid` int(11) NOT NULL auto_increment,
  `name` varchar(50) default NULL,
  `lostdate` varchar(50) default NULL,
  `lostinfo` text,
  `img` varchar(100) default NULL,
  `type` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  `uid` int(11) NOT NULL,
  PRIMARY KEY  (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of collect
-- ----------------------------

-- ----------------------------
-- Table structure for `lost`
-- ----------------------------
DROP TABLE IF EXISTS `lost`;
CREATE TABLE `lost` (
  `lid` int(11) NOT NULL auto_increment,
  `name` varchar(50) NOT NULL,
  `lostdate` varchar(20) default NULL,
  `lostinfo` text,
  `img` varchar(100) default NULL,
  `type` int(11) NOT NULL,
  `createdate` varchar(100) NOT NULL,
  `status` int(11) NOT NULL,
  `uid` int(11) NOT NULL,
  PRIMARY KEY  (`lid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



-- ----------------------------
-- Table structure for `manger`
-- ----------------------------
DROP TABLE IF EXISTS `manger`;
CREATE TABLE `manger` (
  `addr` varchar(200) NOT NULL,
  `mid` int(11) NOT NULL auto_increment,
  `name` varchar(50) default NULL,
  `uname` varchar(50) NOT NULL,
  `pwd` varchar(50) NOT NULL,
  PRIMARY KEY  (`mid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manger
-- ----------------------------

-- ----------------------------
-- Table structure for `success`
-- ----------------------------
DROP TABLE IF EXISTS `success`;
CREATE TABLE `success` (
  `sid` int(11) NOT NULL auto_increment,
  `lid` int(11) NOT NULL,
  `cid` int(11) NOT NULL,
  `sdata` varchar(50) NOT NULL,
  PRIMARY KEY  (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of success
-- ----------------------------

-- ----------------------------
-- Table structure for `type`
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `tid` int(11) NOT NULL auto_increment,
  `tname` varchar(20) NOT NULL,
  PRIMARY KEY  (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of type
-- ----------------------------
INSERT INTO type VALUES ('1', '手机');
INSERT INTO type VALUES ('2', '证件');
INSERT INTO type VALUES ('3', '书');
INSERT INTO type VALUES ('4', '伞');
INSERT INTO type VALUES ('5', '耳机');
INSERT INTO type VALUES ('6', '宠物');
INSERT INTO type VALUES ('7', '钥匙');
INSERT INTO type VALUES ('8', '钱包');
INSERT INTO type VALUES ('9', '其他');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL auto_increment,
  `uname` varchar(50) NOT NULL,
  `pwd` varchar(50) NOT NULL,
  `weixin` varchar(20) default NULL,
  `qq` varchar(20) default NULL,
  `tel` int(11) default NULL,
  `sign` varchar(200) default NULL,
  `img` varchar(50) default NULL,
  `ceatetime` varchar(50) NOT NULL,
  PRIMARY KEY  (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


