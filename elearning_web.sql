/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : elearning_web

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2019-05-13 18:53:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `grade`
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `sNo` int(10) NOT NULL,
  `sName` varchar(10) NOT NULL,
  `sClass` int(10) DEFAULT NULL,
  `uGrade` int(10) DEFAULT NULL,
  `mGrade` int(10) DEFAULT NULL,
  `fGrade` int(10) DEFAULT NULL,
  `pGrade` int(10) DEFAULT NULL,
  `overGrade` int(10) DEFAULT NULL,
  PRIMARY KEY (`sNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of grade
-- ----------------------------
INSERT INTO `grade` VALUES ('1', '张三', '1', '80', '70', '65', '90', '82');
INSERT INTO `grade` VALUES ('2', '李四', '2', null, null, null, null, null);

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sNo` int(10) NOT NULL,
  `sPassword` varchar(20) NOT NULL,
  `sClass` int(10) NOT NULL,
  `sName` varchar(10) NOT NULL,
  `choice` int(10) DEFAULT NULL,
  `sEmail` varchar(30) DEFAULT NULL,
  `sPhone` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`sNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '123', '1', '张三', '0', '123', '456');
INSERT INTO `student` VALUES ('2', '123', '2', '李四', '0', '789', '000');

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `tNo` int(10) NOT NULL,
  `tPassword` varchar(20) NOT NULL,
  `tClass` int(10) DEFAULT NULL,
  `tName` varchar(10) NOT NULL,
  `tEmail` varchar(30) DEFAULT NULL,
  `tPhone` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`tNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '123', '1', '韩万江', '123', '456');
INSERT INTO `teacher` VALUES ('2', '123', '2', '姜立新', '789', '000');
