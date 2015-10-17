CREATE TABLE `t_test` (
  `d_id`   INT(11)          NOT NULL AUTO_INCREMENT
  COMMENT '主建Id',
  `d_name` VARCHAR(50)
           COLLATE utf8_bin NOT NULL
  COMMENT '名称',
  PRIMARY KEY (`d_id`),
  UNIQUE KEY `idx_test_name` (`d_name`) USING BTREE
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_bin