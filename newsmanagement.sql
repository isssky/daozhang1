/*
 Navicat Premium Data Transfer

 Source Server         : 你挑着担
 Source Server Type    : MySQL
 Source Server Version : 50515
 Source Host           : localhost:3306
 Source Schema         : newsmanagement

 Target Server Type    : MySQL
 Target Server Version : 50515
 File Encoding         : 65001

 Date: 17/11/2019 22:54:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for news_comment
-- ----------------------------
DROP TABLE IF EXISTS `news_comment`;
CREATE TABLE `news_comment`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `newsid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `author` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `createdate` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of news_comment
-- ----------------------------
INSERT INTO `news_comment` VALUES (1, '1', '将发生', '刘三姐', '2019-10-09');
INSERT INTO `news_comment` VALUES (2, '2', '方法', '小刘', '2019-10-16');

SET FOREIGN_KEY_CHECKS = 1;
