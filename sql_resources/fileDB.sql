DROP DATABASE IF EXISTS `fileDB`;
create database fileDB;
use fileDB;

-- ----------------------------
-- Table structure for myfile
-- ----------------------------
DROP TABLE IF EXISTS `myfile`;
CREATE TABLE `myfile` (
  `id` int(11) unsigned NOT NULL auto_increment,
  `fileName` varchar(255) NOT NULL,
  `authorName` varchar(20) NOT NULL default '',
  `fileSize`   int(11) NOT NULL default 0,
  `fileCount` int(11),
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;