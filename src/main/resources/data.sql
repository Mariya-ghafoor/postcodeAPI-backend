-- MariaDB dump 10.19  Distrib 10.6.12-MariaDB, for Linux (x86_64)
--
-- Host: mysql.hostinger.ro    Database: u574849695_22
-- ------------------------------------------------------
-- Server version	10.6.12-MariaDB-cll-lve

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `postcodes`
--

DROP TABLE IF EXISTS `postcodes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `postcodes` (
  `id` int(9) unsigned NOT NULL AUTO_INCREMENT,
  `postcode` int(9) unsigned NOT NULL,
  `suburb` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `suburb` (`suburb`),
  KEY `postcode` (`postcode`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `postcodes`
--

LOCK TABLES `postcodes` WRITE;
/*!40000 ALTER TABLE `postcodes` DISABLE KEYS */;
INSERT INTO `postcodes` VALUES (1,6447,'barangaroo'),(2,7936,'darling island'),(3,1852,'surry hills'),(4,6322,'alexandria'),(5,3577,'waterloo'),(6,3287,'bronte');

-- INSERT INTO `postcodes` (postcode,suburb) VALUES (1,2000,'BARANGAROO')
-- ,(2,2001,'SYDNEY')
-- ,(3,2002,'WORLD SQUARE')
-- ,(4,2004,'ALEXANDRIA MC')
-- ,(5,2006,'THE UNIVERSITY OF SYDNEY')
-- ,(6,2007,'BROADWAY')
-- ,(7,2008,'CHIPPENDALE')
-- ,(8,2053,'GOLDEN GROVE')
-- ,(9,2009,'DARLING ISLAND')
-- ,(10,2010,'SURRY HILLS')
-- ,(11,2052,'ELIZABETH BAY')
-- ,(12,2011,'KINGS CROSS')
-- ,(13,2012,'STRAWBERRY HILLS')
-- ,(14,2013,'STRAWBERRY HILLS')
-- ,(15,2015,'ALEXANDRIA')
-- ,(16,2016,'REDFERN')
-- ,(17,2017,'WATERLOO')
-- ,(18,2018,'EASTLAKES')
-- ,(19,2019,'BOTANY')
-- ,(20,2020,'MASCOT')
-- ,(21,2021,'PADDINGTON')
-- ,(22,2022,'BONDI JUNCTION')
-- ,(23,2023,'BELLEVUE HILL')
-- ,(24,2024,'BRONTE');





/*!40000 ALTER TABLE `postcodes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-19 12:28:39
