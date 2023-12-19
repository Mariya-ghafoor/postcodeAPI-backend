DROP TABLE IF EXISTS `postcodes`;

CREATE TABLE `postcodes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `postcode` varchar(255) NOT NULL DEFAULT '',
  `suburb` varchar(255) NOT NULL DEFAULT ''

  PRIMARY KEY (`id`),
  KEY `postcode` (`postcode`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci
-- ) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

LOCK TABLES `postcodes` WRITE;

INSERT INTO `postcodes` (postcode,suburb) VALUES (1,2000,'BARANGAROO')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (2,'2000','DARLING HARBOUR')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (3,'2000','DAWES POINT')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (4,'2000','HAYMARKET')

UNLOCK TABLES;
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (5,'2000','MILLERS POINT')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (6,'2000','PARLIAMENT HOUSE')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (7,'2000','SYDNEY')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (8,'2000','SYDNEY SOUTH')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (9,'2000','THE ROCKS')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (10,'2001','SYDNEY')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (11,'2002','WORLD SQUARE')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (12,'2004','ALEXANDRIA MC')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (13,'2004','EASTERN SUBURBS MC')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (14,'2006','THE UNIVERSITY OF SYDNEY')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (15,'2007','BROADWAY')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (16,'2007','ULTIMO')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (17,'2008','CHIPPENDALE')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (18,'2008','DARLINGTON')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (19,'2008','GOLDEN GROVE')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (20,'2009','DARLING ISLAND')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (21,'2009','PYRMONT')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (22,'2010','DARLINGHURST')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (23,'2010','SURRY HILLS')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (24,'2010','TAYLOR SQUARE')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (25,'2011','ELIZABETH BAY')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (26,'2011','HMAS KUTTABUL')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (27,'2011','KINGS CROSS')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (28,'2011','POTTS POINT')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (29,'2011','RUSHCUTTERS BAY')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (30,'2011','WOOLLOOMOOLOO')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (31,'2012','STRAWBERRY HILLS')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (32,'2013','STRAWBERRY HILLS')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (33,'2015','ALEXANDRIA')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (34,'2015','BEACONSFIELD')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (35,'2015','EVELEIGH')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (36,'2016','REDFERN')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (37,'2017','WATERLOO')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (38,'2017','ZETLAND')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (39,'2018','EASTLAKES')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (40,'2018','ROSEBERY')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (41,'2019','BANKSMEADOW')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (42,'2019','BOTANY')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (43,'2020','MASCOT')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (44,'2020','SYDNEY DOMESTIC AIRPORT')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (45,'2020','SYDNEY INTERNATIONAL AIRPORT')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (46,'2021','CENTENNIAL PARK')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (47,'2021','MOORE PARK')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (48,'2021','PADDINGTON')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (49,'2022','BONDI JUNCTION')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (50,'2022','BONDI JUNCTION PLAZA')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (51,'2022','QUEENS PARK')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (52,'2023','BELLEVUE HILL')
-- INSERT INTO `postcodes` (postcode,suburb) VALUES (53,'2024','BRONTE')