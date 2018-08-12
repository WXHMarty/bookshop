/*
Navicat MySQL Data Transfer

Source Server         : MARTY
Source Server Version : 50624
Source Host           : localhost:3306
Source Database       : bookshop

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2016-07-04 10:19:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'abc123456', 'e10adc3949ba59abbe56e057f20f883e');
INSERT INTO `admin` VALUES ('6', 'asd123456', 'e10adc3949ba59abbe56e057f20f883e');

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `bid` int(11) NOT NULL,
  `bname` varchar(50) NOT NULL,
  `author` varchar(200) DEFAULT NULL,
  `picture` varchar(50) DEFAULT NULL,
  `publishing` varchar(200) DEFAULT NULL,
  `publish_time` varchar(20) DEFAULT NULL,
  `word_number` varchar(15) NOT NULL,
  `which_edtion` varchar(15) NOT NULL,
  `total_page` varchar(15) NOT NULL,
  `print_time` varchar(20) NOT NULL,
  `print_number` varchar(15) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `author_summary` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', '丰乳肥臀', '莫言', '16.jpg', '上海文艺出版社', '2012年6月', '542000', '1', '621', '2012年6月', '1', '《丰乳肥臀》是莫言早期创作中的一座高峰,小说从抗日战争一直写到新中国改革开放之后，以汪洋恣肆的笔触对波澜壮阔的历史进行了描绘。', '莫言，山东高密人，1955年生。著有《红高粱家族》、《酒国》、《丰乳肥臀》、《檀香刑》、《生死疲劳》、《蛙》等长篇小说十一部', '24', '500');
INSERT INTO `book` VALUES ('2', '平凡的世界', '路遥', '17.jpg', '北京十月文艺出版社', '2012年5月', '1100000', '2', '480', '2012年5月', '1', '茅盾文学奖皇冠上的明珠激励千万青年的不朽经典', '路遥（1949-1992）原名王卫国，1949年12月3日生于陕西榆林市清涧县一个贫困的农民家庭，7岁时因为家里困难被过继给延川县农村的伯父', '19.6', '600');
INSERT INTO `book` VALUES ('3', '白鹿原', '陈忠实', '18.jpg', '北京十月文艺出版社', '2012年7月', '526000', '1', '322', '2012年7月', '1', '茅盾文学奖获奖经典作品，权威未删节平装版', '陈忠实是我国当代著名作家，任中国作家协会副主席，《白鹿原》是其成名著作', '23.1', '540');
INSERT INTO `book` VALUES ('4', '副省长夫人', '季良', '19.jpg', '珠海出版社', '2012年8月', '350000', '1', '331', '2012年8月', '1', '常务副省长穆桑俞的舅子、云雾县的代理县长邱俊辉偷情，事后女孩控告他强奸，因为她的手指甲上沾着他的血液．铁证如山', '季良，男，土家族，大学文化，1959年2月出生于湖南慈利的知识分子家庭', '77', '650');
INSERT INTO `book` VALUES ('5', '藏海花', '南派三叔', '20.jpg', '北京联合出版公司', '2012年9月', '277000', '1', '262', '2012年9月', '1', '南派三叔2012新作《藏海花》：《盗墓笔记》前传，闷油瓶的盗墓传奇！流潋紫倾心推荐', '南派三叔，本名徐磊，男，浙江人，现居杭州。被称为中国最会讲故事的小说家，激荡想象力剧情的推崇者', '18.1', '470');
INSERT INTO `book` VALUES ('6', '狼图腾', '姜戎', '21.jpg', '长江文艺出版社', '2012年10月', '511000', '1', '408', '2012年10月', '1', '这是世界上迄今为止惟一一部描绘、研究蒙古草原狼的“旷世奇书”。阅读此书，将是我们这个时代享用不尽的关于狼图腾的精神盛宴', '姜戎，58岁。北京人。北京某大学研究人员。主业：政治经济学，偏重政治学方面', '14.4', '520');
INSERT INTO `book` VALUES ('7', '面包树上的女人', '张小娴', '22.jpg', '北京十月文艺出版社', '2012年11月', '130000', '1', '256', '2012年11月', '1', '张小娴都市爱情小说经典代表作，面包树三部曲之一', '张小娴，华语文坛最耀眼的名字。迄今已出版超过四十本小说和散文集，独创了一种既温柔又犀利的爱情文学', '29.3', '650');
INSERT INTO `book` VALUES ('8', '天堂蒜薹之歌', '莫言', '23.jpg', '上海文艺出版', '2012年12月', '331000', '1', '331', '2012年12月', '1', '2012年度诺贝尔文学奖获得者，中国著名作家莫言十一部长篇小说完整集结，重磅亮相', '莫言，先后毕业于解放军艺术学院文学系（1984－1986）和北京师范大学?鲁迅文学院研究生班（1989－1991），获文艺学硕士学位', '206.7', '850');
INSERT INTO `book` VALUES ('9', '康熙大帝', '二月河', '24.jpg', '长江文艺出版社', '2012年2月', '337000', '1', '223', '2012年2月', '1', '这一卷主要描写康熙晚年选择皇储以及众阿哥为争当皇储勾心斗角的故事', '二月河：本名凌解放。当代著名历史小说作家。现为中国作家协会会员，河南省作家协会副主席', '20.6', '510');
INSERT INTO `book` VALUES ('10', '人生', '路遥', '2.jpg', '北京十月文艺出版社', '2012年3月', '144000', '2', '248', '2012年3月', '1', '影响千万青年的励志名篇-- 马云、贾樟柯倾情推荐', '路遥（1949—1992）原名王卫国，1949年12月3日生于陕西榆林市清涧县一个贫困的农民家庭，7岁时因为家里困难被过继给延川县农村的伯父', '19.7', '564');
INSERT INTO `book` VALUES ('11', '活着', '余华', '3.jpg', '作家出版社', '2012年3月', '136000', '3', '191', '2012年4月', '28', '《活着》是一部充满血泪的小说。余华通过一位中国农民的苦难生活讲述了人如何去承受巨大的苦难；讲述了眼泪的丰富和宽广', '余华，1960年4月3日生于浙江杭州，曾经从事过5年的牙医工作，1983年开始写作，已经完成长篇小说4部，中短篇小说集6部，随笔集3部，其作品被翻译成二十多种文字，在近三十个国家出版', '22.1', '357');
INSERT INTO `book` VALUES ('12', '围城', '钱钟书', '4.jpg', '人民文学出版社', '2012年4月', '254000', '2', '362', '2012年4月', '1', '钱锺书所著的《围城》是一幅栩栩如生的世井百态图，人生的酸甜苦辣千般滋味均在其中得到了淋漓尽致的体现', '钱钟书，原名仰先，字默存，号槐聚，曾用笔名中书君，中国现代著名作家、文学研究家。曾为《毛泽东选集》英文版翻译小组成员', '23', '652');
INSERT INTO `book` VALUES ('13', '中国历代通俗演义', '蔡东藩', '5.jpg', '上海科学技术文献出版社', '2012年5月', '6240000', '1', '1100', '2012年5月', '1', '蔡东藩先生的这套《中国历代通俗演义》从秦汉写到民国，全书共一千余回，五百多万字，写了近二千二百年的历史', '蔡东藩（1877-1945），浙江萧山人。1890年（光绪十六年）考中秀才。1910年赴北京朝考得中，分发福建，以知县候补，因不满官场恶习，于1911年称病归', '16.3', '564');
INSERT INTO `book` VALUES ('14', '沈从文集：边城', '沈从文', '6.jpg', '北京十月文艺出版社', '2012年6月', '411000', '1', '464', '2012年6月', '1', '边城是沈从文小说的代表作，是我国文学史上一部优秀的抒发乡土情怀的中篇小说', '沈从文（1902－1988），原名沈岳焕，字崇文。湖南凤凰县人.沈从文是现代著名作家、历史文物研究家、京派小说代表人物', '29.3', '213');
INSERT INTO `book` VALUES ('15', '林海雪原', '曲波', '7.jpg', '人民文学出版社', '2013年6月', '400000', '1', '526', '2013年6月', '1', '书里所写的是东北民主联军一支小分队，在团参谋长少剑波的率领下，深入林海雪原执行剿匪任务的过程', '曲波（1923-2002），山东龙口人。1938年参加八路军，曾任连、营指挥员。解入军战争时期曾率领解入军小分队在东北牧丹江一带进行剿匪战斗', '15.9', '863');
INSERT INTO `book` VALUES ('16', '县委班子', '许开祯', '8.jpg', '凤凰出版社', '2013年8月', '280000', '1', '283', '2013年8月', '1', '非常有内涵！许开祯经典之作，一本书看清官场里的所有门道', '许开祯，甘肃省文学院签约作家，曾任政府秘书、乡企厂长、大型企业集团副总经理，身在官场数十年。2002年开始走上专业创作之路，代表作有《省委班子》《拿下》《打黑》《政法书记》《黑手》等作品', '18.8', '152');
INSERT INTO `book` VALUES ('17', '荣宝斋', '都梁', '9.jpg', '北京联合出版公司', '2013年9月', '420000', '1', '412', '2013年9月', '1', '都梁家国四部曲之四，根据真实故事创作而成，讲述“家族奋斗”创造商业传奇的鸿篇巨作', '都梁，上世纪50年代生人，因出版《亮剑》《血色浪漫》《狼烟北平》和《荣宝斋》而蛮声文坛。四部小说均被改编成同名电视剧，其中《亮剑》和《血色浪漫》红遍大江南北，《狼烟北平》和《荣宝斋》在北京地区极受欢迎。', '16.9', '576');
INSERT INTO `book` VALUES ('18', '鲁迅－呐喊·彷徨', '鲁迅', '10.jpg', '译林出版社', '2013年4月', '190000', '1', '287', '2013年4月', '1', '重读鲁迅文字，体会他对现实社会与人生的冷峻刻画，感受他对旧礼教和国民性的深刻批判', '鲁迅(1881-1936)，文学家、思想家和革命家。原名周树人，字豫才，浙江绍兴人。著有小说集《呐喊》、《彷徨》、《故事新编》，散文集《朝花夕拾》，散文诗集《野草》，杂文集《坟》、《热风》、《华盖集》、《南腔北凋集》、《且介亭杂文》等。', '30.3', '654');
INSERT INTO `book` VALUES ('19', '京华烟云(林语堂著)', '林语堂', '11.jpg', '陕西师范大学出版社', '2013年8月', '13000', '1', '611', '2013年8月', '1', '《京华烟云》是林语堂旅居巴黎时于1938年8月至1939年8月间用英文写就的长篇小说，并题献给“英勇的中国士兵”', '林语堂（1895年10月3日—1976年3月26日）福建龙溪人。原名和乐，后改玉堂，又改语堂。1912年入上海圣约翰大学，毕业后在清华大学任教。1919年秋赴美哈佛大学文学系。1922年获文学硕士学位。同年转赴德国入莱比锡大学，专攻语言学', '25.8', '581');
INSERT INTO `book` VALUES ('20', '结婚十年', '苏青', '12.jpg', '中国妇女出版社', '2013年10月', '200000', '1', '260', '2013年10月', '1', '她和张爱玲是中国孤岛时期荒芜文坛上并列的奇葩，这是一本畅销中国半个世纪的长篇小说', '苏青（1914年～1982年） 中国作家，小说家、散文家、剧作家。是与张爱玲齐名的海派女作家的代表人物。浙江宁波人。1933年考入国立中央大学（1949年更名为南京大学）外文系，后肄业移居上海。', '30.6', '357');
INSERT INTO `book` VALUES ('21', '边城.长河', '沈从文', '13.jpg', '天津人民出版社', '2013年4月', '200000', '1', '200', '2013年4月', '1', '沈从文小说是中国现代小说的典范。本书收入最能代表沈从文艺术水平的中篇小说《边城》和长篇小说《长河》', '沈从文(1902-1988)，原名沈岳焕，字崇文，湖南凤凰县人。现代著名作家、历史文物研究家、京派小说代表人物，二十世纪最优秀的中国文学家之一。他一生笔耕不辍，著作颇丰，作品结集约有八十多部，是现代作家中成书最多的一位', '28.8', '225');
INSERT INTO `book` VALUES ('22', '歧途佳人', '歧途佳人', '14.jpg', '中国三峡出版社', '2013年2月', '120000', '1', '100', '2013年2月', '1', '这篇小说是苏青以自己的婚恋经历和理想破灭过程为背景，加以耳闻目睹了黑社会里各种尔虞我诈的事件和人性丑恶的一面，再经过提炼而写成', '苏青最好的时候能够做到一种“天涯若比邻”的广大亲切，唤起了古往今来无所不在的妻性母性的回忆……', '19.8', '214');
INSERT INTO `book` VALUES ('23', '血色浪漫', '张爱玲', '15.jpg', '北京十月文艺出版社', '2013年5月', '252000', '1', '351', '2013年5月', '1', '没有炮火的年代，一代人的青春挥洒在武斗与呐喊声中，这是他们阳光灿烂的日子，他们的浪漫在血色昏黄中弥漫成昨日的记忆', '张爱玲，中国现代作家。张爱玲的家世显赫，祖父张佩纶是清末名臣，祖母李菊耦是朝廷重臣李鸿章的长女。张爱玲一生创作大量文学作品，她的书信也被人们作为著作的一部分加以研究', '25.7', '465');

-- ----------------------------
-- Table structure for categroy
-- ----------------------------
DROP TABLE IF EXISTS `categroy`;
CREATE TABLE `categroy` (
  `cid` int(11) NOT NULL,
  `cname` varchar(50) NOT NULL,
  `cvalue` varchar(100) NOT NULL,
  `gradeid` int(11) DEFAULT NULL,
  `bnumber` int(11) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of categroy
-- ----------------------------
INSERT INTO `categroy` VALUES ('1', 'Book', '图书', '0', '0');
INSERT INTO `categroy` VALUES ('2', 'Recommend', '推荐', '0', '23');
INSERT INTO `categroy` VALUES ('3', 'New', '新书', '0', '17');
INSERT INTO `categroy` VALUES ('4', 'Hot', '热卖', '0', '18');
INSERT INTO `categroy` VALUES ('5', 'Novel', '小说', '1', '23');
INSERT INTO `categroy` VALUES ('6', 'Youth', '青春', '1', '0');
INSERT INTO `categroy` VALUES ('7', 'Humanity And Social Science', '人文社科', '1', '0');
INSERT INTO `categroy` VALUES ('8', 'Management', '管理', '1', '0');
INSERT INTO `categroy` VALUES ('9', 'Children', '少儿', '1', '0');
INSERT INTO `categroy` VALUES ('10', 'Foreign Language', '外语', '1', '0');
INSERT INTO `categroy` VALUES ('11', 'Computer', '计算机', '1', '0');
INSERT INTO `categroy` VALUES ('12', 'Chinese Contemporary Novel', '当代小说', '5', '9');
INSERT INTO `categroy` VALUES ('13', 'Chinese Modern Novel', '近现代小说', '5', '16');
INSERT INTO `categroy` VALUES ('14', 'Chinese Classical Novel', '古典小说', '5', '0');
INSERT INTO `categroy` VALUES ('15', 'Four Classic Novels', '四大名著', '5', '0');
INSERT INTO `categroy` VALUES ('16', 'Translated Works', '世界名著', '5', '0');
INSERT INTO `categroy` VALUES ('17', 'School', '校园', '6', '0');
INSERT INTO `categroy` VALUES ('18', 'Love', '爱情/情感', '6', '0');
INSERT INTO `categroy` VALUES ('19', 'Grow Up', '叛逆/成长', '6', '0');
INSERT INTO `categroy` VALUES ('20', 'Fantasy', '玄幻', '6', '0');
INSERT INTO `categroy` VALUES ('21', 'Original', '原创', '6', '0');
INSERT INTO `categroy` VALUES ('22', 'Political', '政治', '7', '0');
INSERT INTO `categroy` VALUES ('23', 'Economic', '经济', '7', '0');
INSERT INTO `categroy` VALUES ('24', 'Law', '法律', '7', '0');
INSERT INTO `categroy` VALUES ('25', 'Philosophy', '哲学', '7', '0');
INSERT INTO `categroy` VALUES ('26', 'History', '历史', '7', '0');
INSERT INTO `categroy` VALUES ('27', 'Commen Management', '管理学', '8', '0');
INSERT INTO `categroy` VALUES ('28', 'Strategic Management', '战略管理', '8', '0');
INSERT INTO `categroy` VALUES ('29', 'Marketing', '市场营销', '8', '0');
INSERT INTO `categroy` VALUES ('30', 'Business History', '商业史传', '8', '0');
INSERT INTO `categroy` VALUES ('31', 'E-Business', '电子商务', '8', '0');
INSERT INTO `categroy` VALUES ('32', '0-2', '0-2岁', '9', '0');
INSERT INTO `categroy` VALUES ('33', '3-6', '3-6岁', '9', '0');
INSERT INTO `categroy` VALUES ('34', '7-10', '7-10岁', '9', '0');
INSERT INTO `categroy` VALUES ('35', '11-14', '11-14岁', '9', '0');
INSERT INTO `categroy` VALUES ('36', 'Child Literature', '儿童文学', '9', '0');
INSERT INTO `categroy` VALUES ('37', 'English', '英语', '10', '0');
INSERT INTO `categroy` VALUES ('38', 'Japanese', '日语', '10', '0');
INSERT INTO `categroy` VALUES ('39', 'Korean', '韩语', '10', '0');
INSERT INTO `categroy` VALUES ('40', 'Russian', '俄语', '10', '0');
INSERT INTO `categroy` VALUES ('41', 'German', '德语', '10', '0');
INSERT INTO `categroy` VALUES ('42', 'Computer Theory', '计算机理论', '11', '0');
INSERT INTO `categroy` VALUES ('43', 'Database', '数据库', '11', '0');
INSERT INTO `categroy` VALUES ('44', 'Programming', '程序设计', '11', '0');
INSERT INTO `categroy` VALUES ('45', 'Artificial Intelligence', '人工智能', '11', '0');
INSERT INTO `categroy` VALUES ('46', 'Computer Examination', '计算机考试', '11', '0');

-- ----------------------------
-- Table structure for categroy_book
-- ----------------------------
DROP TABLE IF EXISTS `categroy_book`;
CREATE TABLE `categroy_book` (
  `bid` int(11) NOT NULL,
  `cid` int(11) NOT NULL,
  PRIMARY KEY (`cid`,`bid`),
  KEY `FKm2bl2t9n5b7ql5wvgnmhbnnru` (`bid`),
  CONSTRAINT `FK5fy5wf2i3mirwi9tq9ch6f01d` FOREIGN KEY (`cid`) REFERENCES `categroy` (`cid`),
  CONSTRAINT `FKm2bl2t9n5b7ql5wvgnmhbnnru` FOREIGN KEY (`bid`) REFERENCES `book` (`bid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of categroy_book
-- ----------------------------
INSERT INTO `categroy_book` VALUES ('1', '2');
INSERT INTO `categroy_book` VALUES ('1', '3');
INSERT INTO `categroy_book` VALUES ('1', '4');
INSERT INTO `categroy_book` VALUES ('1', '5');
INSERT INTO `categroy_book` VALUES ('1', '12');
INSERT INTO `categroy_book` VALUES ('2', '2');
INSERT INTO `categroy_book` VALUES ('2', '3');
INSERT INTO `categroy_book` VALUES ('2', '4');
INSERT INTO `categroy_book` VALUES ('2', '5');
INSERT INTO `categroy_book` VALUES ('2', '12');
INSERT INTO `categroy_book` VALUES ('3', '2');
INSERT INTO `categroy_book` VALUES ('3', '3');
INSERT INTO `categroy_book` VALUES ('3', '4');
INSERT INTO `categroy_book` VALUES ('3', '5');
INSERT INTO `categroy_book` VALUES ('3', '13');
INSERT INTO `categroy_book` VALUES ('4', '2');
INSERT INTO `categroy_book` VALUES ('4', '3');
INSERT INTO `categroy_book` VALUES ('4', '4');
INSERT INTO `categroy_book` VALUES ('4', '5');
INSERT INTO `categroy_book` VALUES ('4', '13');
INSERT INTO `categroy_book` VALUES ('5', '2');
INSERT INTO `categroy_book` VALUES ('5', '3');
INSERT INTO `categroy_book` VALUES ('5', '4');
INSERT INTO `categroy_book` VALUES ('5', '5');
INSERT INTO `categroy_book` VALUES ('5', '13');
INSERT INTO `categroy_book` VALUES ('6', '2');
INSERT INTO `categroy_book` VALUES ('6', '4');
INSERT INTO `categroy_book` VALUES ('6', '5');
INSERT INTO `categroy_book` VALUES ('6', '12');
INSERT INTO `categroy_book` VALUES ('7', '2');
INSERT INTO `categroy_book` VALUES ('7', '5');
INSERT INTO `categroy_book` VALUES ('7', '12');
INSERT INTO `categroy_book` VALUES ('8', '2');
INSERT INTO `categroy_book` VALUES ('8', '3');
INSERT INTO `categroy_book` VALUES ('8', '5');
INSERT INTO `categroy_book` VALUES ('8', '12');
INSERT INTO `categroy_book` VALUES ('9', '2');
INSERT INTO `categroy_book` VALUES ('9', '3');
INSERT INTO `categroy_book` VALUES ('9', '4');
INSERT INTO `categroy_book` VALUES ('9', '5');
INSERT INTO `categroy_book` VALUES ('9', '13');
INSERT INTO `categroy_book` VALUES ('10', '2');
INSERT INTO `categroy_book` VALUES ('10', '3');
INSERT INTO `categroy_book` VALUES ('10', '4');
INSERT INTO `categroy_book` VALUES ('10', '5');
INSERT INTO `categroy_book` VALUES ('10', '12');
INSERT INTO `categroy_book` VALUES ('10', '13');
INSERT INTO `categroy_book` VALUES ('11', '2');
INSERT INTO `categroy_book` VALUES ('11', '3');
INSERT INTO `categroy_book` VALUES ('11', '5');
INSERT INTO `categroy_book` VALUES ('11', '12');
INSERT INTO `categroy_book` VALUES ('12', '2');
INSERT INTO `categroy_book` VALUES ('12', '4');
INSERT INTO `categroy_book` VALUES ('12', '5');
INSERT INTO `categroy_book` VALUES ('12', '13');
INSERT INTO `categroy_book` VALUES ('13', '2');
INSERT INTO `categroy_book` VALUES ('13', '4');
INSERT INTO `categroy_book` VALUES ('13', '5');
INSERT INTO `categroy_book` VALUES ('13', '13');
INSERT INTO `categroy_book` VALUES ('14', '2');
INSERT INTO `categroy_book` VALUES ('14', '5');
INSERT INTO `categroy_book` VALUES ('14', '13');
INSERT INTO `categroy_book` VALUES ('15', '2');
INSERT INTO `categroy_book` VALUES ('15', '3');
INSERT INTO `categroy_book` VALUES ('15', '4');
INSERT INTO `categroy_book` VALUES ('15', '5');
INSERT INTO `categroy_book` VALUES ('15', '13');
INSERT INTO `categroy_book` VALUES ('16', '2');
INSERT INTO `categroy_book` VALUES ('16', '3');
INSERT INTO `categroy_book` VALUES ('16', '4');
INSERT INTO `categroy_book` VALUES ('16', '5');
INSERT INTO `categroy_book` VALUES ('16', '13');
INSERT INTO `categroy_book` VALUES ('17', '2');
INSERT INTO `categroy_book` VALUES ('17', '3');
INSERT INTO `categroy_book` VALUES ('17', '4');
INSERT INTO `categroy_book` VALUES ('17', '5');
INSERT INTO `categroy_book` VALUES ('17', '13');
INSERT INTO `categroy_book` VALUES ('18', '2');
INSERT INTO `categroy_book` VALUES ('18', '4');
INSERT INTO `categroy_book` VALUES ('18', '5');
INSERT INTO `categroy_book` VALUES ('18', '13');
INSERT INTO `categroy_book` VALUES ('19', '2');
INSERT INTO `categroy_book` VALUES ('19', '3');
INSERT INTO `categroy_book` VALUES ('19', '4');
INSERT INTO `categroy_book` VALUES ('19', '5');
INSERT INTO `categroy_book` VALUES ('19', '13');
INSERT INTO `categroy_book` VALUES ('20', '2');
INSERT INTO `categroy_book` VALUES ('20', '3');
INSERT INTO `categroy_book` VALUES ('20', '4');
INSERT INTO `categroy_book` VALUES ('20', '5');
INSERT INTO `categroy_book` VALUES ('20', '12');
INSERT INTO `categroy_book` VALUES ('21', '2');
INSERT INTO `categroy_book` VALUES ('21', '3');
INSERT INTO `categroy_book` VALUES ('21', '4');
INSERT INTO `categroy_book` VALUES ('21', '5');
INSERT INTO `categroy_book` VALUES ('21', '13');
INSERT INTO `categroy_book` VALUES ('22', '2');
INSERT INTO `categroy_book` VALUES ('22', '3');
INSERT INTO `categroy_book` VALUES ('22', '4');
INSERT INTO `categroy_book` VALUES ('22', '5');
INSERT INTO `categroy_book` VALUES ('22', '13');
INSERT INTO `categroy_book` VALUES ('23', '2');
INSERT INTO `categroy_book` VALUES ('23', '3');
INSERT INTO `categroy_book` VALUES ('23', '5');
INSERT INTO `categroy_book` VALUES ('23', '12');
INSERT INTO `categroy_book` VALUES ('23', '13');

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `itid` int(11) NOT NULL,
  `itname` varchar(100) DEFAULT NULL,
  `itpicture` varchar(50) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `order_num` int(11) NOT NULL,
  `amount` double NOT NULL,
  `bid` int(11) NOT NULL,
  `uid` int(11) NOT NULL,
  PRIMARY KEY (`itid`),
  KEY `FK5lm0q7m3wvx47ccyquhcpd9mf` (`uid`),
  CONSTRAINT `FK5lm0q7m3wvx47ccyquhcpd9mf` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of item
-- ----------------------------

-- ----------------------------
-- Table structure for itprod
-- ----------------------------
DROP TABLE IF EXISTS `itprod`;
CREATE TABLE `itprod` (
  `ipid` int(11) NOT NULL,
  `proname` varchar(20) NOT NULL,
  `pro_num` int(11) NOT NULL,
  `oid` int(11) DEFAULT NULL,
  PRIMARY KEY (`ipid`),
  KEY `FKhxbjc3728jlaeeymjqw1ui102` (`oid`),
  CONSTRAINT `FKhxbjc3728jlaeeymjqw1ui102` FOREIGN KEY (`oid`) REFERENCES `orders` (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of itprod
-- ----------------------------

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `oid` int(11) NOT NULL,
  `ord_num` bigint(20) NOT NULL,
  `order_time` varchar(20) NOT NULL,
  `total_price` double NOT NULL,
  `receive_name` varchar(100) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `zipCode` varchar(8) DEFAULT NULL,
  `mobile` varchar(100) DEFAULT NULL,
  `phone` varchar(100) DEFAULT NULL,
  `uid` int(11) NOT NULL,
  PRIMARY KEY (`oid`),
  KEY `FK58x4l9shxmkb7pismj4ilt7pj` (`uid`),
  CONSTRAINT `FK58x4l9shxmkb7pismj4ilt7pj` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------

-- ----------------------------
-- Table structure for sellbook
-- ----------------------------
DROP TABLE IF EXISTS `sellbook`;
CREATE TABLE `sellbook` (
  `sid` int(11) NOT NULL,
  `bid` int(11) NOT NULL,
  `sellbname` varchar(20) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `sellAmount` int(11) NOT NULL,
  `allprice` double DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sellbook
-- ----------------------------

-- ----------------------------
-- Table structure for sellcensus
-- ----------------------------
DROP TABLE IF EXISTS `sellcensus`;
CREATE TABLE `sellcensus` (
  `scid` int(11) NOT NULL,
  `purchaser_id` int(11) NOT NULL,
  `purchaser` varchar(20) DEFAULT NULL,
  `sellBook_id` int(11) NOT NULL,
  `sellBook` varchar(20) DEFAULT NULL,
  `sellTime` varchar(20) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `buyAmount` int(11) NOT NULL,
  PRIMARY KEY (`scid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sellcensus
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `reg_time` varchar(20) NOT NULL,
  `last_login_time` varchar(20) NOT NULL,
  `last_login_ip` varchar(15) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'abc123456', 'e10adc3949ba59abbe56e057f20f883e', '2016?07?01?', '2016年07月01日', '0:0:0:0:0:0:0:1');
