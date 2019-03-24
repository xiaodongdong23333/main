-- 创建表
CREATE TABLE `graduate` (
  `student_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL ,
  `score` int(11) NOT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 ;

-- 初始化数据
INSERT INTO `graduate` (`student_id`, `name`, `score`)
VALUES
    (2015, 'Tom', 100),
    (2016, 'Jerry', 100);


/*AUTO_INCREMENT非常重要,增加模块时时学号递增*/