create database cmcore default character set utf8;
use cmcore;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for n_player
-- ----------------------------
-- DROP TABLE IF EXISTS `n_player`;
CREATE TABLE `n_player`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '玩家名（一般情况下也是唯一的）',
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '所属用户',
  `createTime` datetime(0) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `player_name`(`name`) USING BTREE COMMENT '玩家名通常是唯一的'
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = 'player表，对应游戏中的玩家，一个user可以对应多个player' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for permission
-- ----------------------------
-- DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission`  (
  `user_name` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户名',
  `group` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '拥有的权限组，null时表示默认',
  `status` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT '1' COMMENT '状态， 0-失效，1-有效',
  `create_time` datetime(0) DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`user_name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for permission_group
-- ----------------------------
-- DROP TABLE IF EXISTS `permission_group`;
CREATE TABLE `permission_group`  (
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '权限组名',
  `permission` text CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '权限，逗号分开，',
  `status` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '1' COMMENT '状态， 0-失效，1-有效',
  `createTime` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of permission_group
-- ----------------------------
INSERT INTO `permission_group` VALUES ('wanne', 'ssss,2333', '1', '2020-02-12 21:24:42');

-- ----------------------------
-- Table structure for player_login_log
-- ----------------------------
-- DROP TABLE IF EXISTS `player_login_log`;
CREATE TABLE `player_login_log`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '玩家名',
  `ip` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT 'ip地址',
  `loginTime` datetime(0) DEFAULT NULL COMMENT '登录时间',
  `outTime` datetime(0) DEFAULT NULL COMMENT '退出时间',
  `force` varchar(2) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '是否强制退出标志，0-正常退出，1-服务器关闭，2-被踢出',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '备注（备用）',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `playerLoginLog_name_login`(`name`, `loginTime`) USING BTREE COMMENT '玩家登录时间索引',
  INDEX `playerLoginLog_name_out`(`name`, `outTime`) USING BTREE COMMENT '玩家退出时间索引'
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for preffix_suffix
-- ----------------------------
-- DROP TABLE IF EXISTS `preffix_suffix`;
CREATE TABLE `preffix_suffix`  (
  `id` int(11) NOT NULL COMMENT '主键',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '玩家名',
  `preffix` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT '' COMMENT '前缀',
  `suffix` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT '' COMMENT '后缀',
  `updateTime` datetime(0) DEFAULT NULL COMMENT '更新时间',
  `creatTime` datetime(0) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '玩家展示名字的前缀和后缀。默认不会保存，仅当第一次设置的时候才有' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for preffix_suffix_log
-- ----------------------------
-- DROP TABLE IF EXISTS `preffix_suffix_log`;
CREATE TABLE `preffix_suffix_log`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '玩家名',
  `oldPreffix` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '旧前缀',
  `newPreffix` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '新前缀',
  `oldSuffiex` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '旧后缀',
  `newSuffix` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '新后缀',
  `createTime` datetime(0) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `preffixsuffixlog_name`(`name`) USING BTREE COMMENT '前缀后缀记录玩家索引'
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '玩家前缀后缀变化日志记录' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
-- 
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userName` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户名(通常是唯一的)',
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '密码',
  `tagName` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '展示名',
  `registerTime` datetime(0) DEFAULT NULL COMMENT '注册时间',
  `gender` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '性别',
  `email` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '邮箱',
  `qq` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT 'qq',
  `phone` varchar(15) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `user_username`(`userName`) USING BTREE COMMENT '用户名'
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'wanne seville', '1111', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (2, 'wanne1', '123', NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for wealth
-- ----------------------------
-- DROP TABLE IF EXISTS `wealth`;
CREATE TABLE `wealth`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户名player#name',
  `currency1` double NOT NULL DEFAULT 10000 COMMENT '币种1',
  `currency2` double NOT NULL DEFAULT 100 COMMENT '币种2',
  `createTime` datetime(0) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `wealth_name`(`name`) USING BTREE COMMENT '财产玩家名索引'
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for wealth_log
-- ----------------------------
-- DROP TABLE IF EXISTS `wealth_log`;
CREATE TABLE `wealth_log`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `playerName` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '玩家名',
  `currencyType` varchar(2) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '货币类别，默认和wealth中的保持一致，1-货币1，2-货币2',
  `before` double DEFAULT NULL COMMENT '原始数额',
  `after` double DEFAULT NULL COMMENT '变化后的数额',
  `chg` double DEFAULT NULL COMMENT '变化数额',
  `reason` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '理由',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '备注（保留）',
  `createTime` datetime(0) DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `wealth_log_time`(`createTime`) USING BTREE COMMENT '财产变化记录时间索引',
  INDEX `wealth_log_player`(`playerName`, `currencyType`) USING BTREE COMMENT '财产变化记录玩家货币索引'
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '财产变化记录（如果两种货币都变化了，那么就是两条记录）' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
