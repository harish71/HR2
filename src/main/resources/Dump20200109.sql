-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: hr
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `application`
--

DROP TABLE IF EXISTS `application`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `application` (
  `id` int(11) NOT NULL,
  `time` datetime(6) DEFAULT NULL,
  `fkid31` int(11) DEFAULT NULL,
  `fkid32` int(11) DEFAULT NULL,
  `fkid52` int(11) DEFAULT NULL,
  `fkid53` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKtdfcwscli1idhkhowfa4k0db9` (`fkid31`),
  KEY `FK1ft9wx345ne4mi5ylj8s3d8ig` (`fkid32`),
  KEY `FKnl0m5lfyquhyee3yfc6obaj8u` (`fkid52`),
  KEY `FKf66ds57fwh5b7pcahmhbi4ygi` (`fkid53`),
  CONSTRAINT `FK1ft9wx345ne4mi5ylj8s3d8ig` FOREIGN KEY (`fkid32`) REFERENCES `openning` (`id`),
  CONSTRAINT `FKf66ds57fwh5b7pcahmhbi4ygi` FOREIGN KEY (`fkid53`) REFERENCES `openning` (`id`),
  CONSTRAINT `FKnl0m5lfyquhyee3yfc6obaj8u` FOREIGN KEY (`fkid52`) REFERENCES `candidate` (`id`),
  CONSTRAINT `FKtdfcwscli1idhkhowfa4k0db9` FOREIGN KEY (`fkid31`) REFERENCES `candidate` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `application`
--

LOCK TABLES `application` WRITE;
/*!40000 ALTER TABLE `application` DISABLE KEYS */;
/*!40000 ALTER TABLE `application` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `candidate`
--

DROP TABLE IF EXISTS `candidate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `candidate` (
  `id` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `exp` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone` bigint(20) DEFAULT NULL,
  `fkid27` int(11) DEFAULT NULL,
  `fkid48` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKmjtko9bjbiedptiftehswocgv` (`fkid27`),
  KEY `FKdwkvc48kwsgrefwf2x4utw9is` (`fkid48`),
  CONSTRAINT `FKdwkvc48kwsgrefwf2x4utw9is` FOREIGN KEY (`fkid48`) REFERENCES `qualification` (`id`),
  CONSTRAINT `FKmjtko9bjbiedptiftehswocgv` FOREIGN KEY (`fkid27`) REFERENCES `qualification` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `candidate`
--

LOCK TABLES `candidate` WRITE;
/*!40000 ALTER TABLE `candidate` DISABLE KEYS */;
INSERT INTO `candidate` VALUES (2,'earqwerqwe',22,'SDFSDF',1231231,NULL,NULL),(6,'up@gm',22,'slokam',232323,NULL,4),(7,'asdf@adf',22,'Name 1212',3423424,NULL,5),(13,'asdfsaf@asd',233,'asdfasd',2121,NULL,5),(14,'asdfasdf',21,'FRFRFR',3424,NULL,4),(15,'asdfasdf',3242,'Helllo',5345435,NULL,5);
/*!40000 ALTER TABLE `candidate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fk_table24`
--

DROP TABLE IF EXISTS `fk_table24`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fk_table24` (
  `fk_column25` int(11) NOT NULL,
  `fk_column26` int(11) NOT NULL,
  KEY `FKpmgmu7pdio3mecw9df2pqwnk0` (`fk_column26`),
  KEY `FKqt0gpb2tdbqabyilu05ohss42` (`fk_column25`),
  CONSTRAINT `FKpmgmu7pdio3mecw9df2pqwnk0` FOREIGN KEY (`fk_column26`) REFERENCES `skill` (`id`),
  CONSTRAINT `FKqt0gpb2tdbqabyilu05ohss42` FOREIGN KEY (`fk_column25`) REFERENCES `openning` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fk_table24`
--

LOCK TABLES `fk_table24` WRITE;
/*!40000 ALTER TABLE `fk_table24` DISABLE KEYS */;
/*!40000 ALTER TABLE `fk_table24` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fk_table28`
--

DROP TABLE IF EXISTS `fk_table28`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fk_table28` (
  `fk_column29` int(11) NOT NULL,
  `fk_column30` int(11) NOT NULL,
  KEY `FK9nabkou5wvajpd8tbxofqi2mb` (`fk_column30`),
  KEY `FKl22t34ln7iehpykwpobufvkku` (`fk_column29`),
  CONSTRAINT `FK9nabkou5wvajpd8tbxofqi2mb` FOREIGN KEY (`fk_column30`) REFERENCES `skill` (`id`),
  CONSTRAINT `FKl22t34ln7iehpykwpobufvkku` FOREIGN KEY (`fk_column29`) REFERENCES `candidate` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fk_table28`
--

LOCK TABLES `fk_table28` WRITE;
/*!40000 ALTER TABLE `fk_table28` DISABLE KEYS */;
/*!40000 ALTER TABLE `fk_table28` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fk_table45`
--

DROP TABLE IF EXISTS `fk_table45`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fk_table45` (
  `fk_column46` int(11) NOT NULL,
  `fk_column47` int(11) NOT NULL,
  KEY `FK6f2co0tos04tgipyamhl01iv` (`fk_column47`),
  KEY `FKqaxb8xidgeo51x0h237bl1pv7` (`fk_column46`),
  CONSTRAINT `FK6f2co0tos04tgipyamhl01iv` FOREIGN KEY (`fk_column47`) REFERENCES `skill` (`id`),
  CONSTRAINT `FKqaxb8xidgeo51x0h237bl1pv7` FOREIGN KEY (`fk_column46`) REFERENCES `openning` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fk_table45`
--

LOCK TABLES `fk_table45` WRITE;
/*!40000 ALTER TABLE `fk_table45` DISABLE KEYS */;
INSERT INTO `fk_table45` VALUES (21,10),(21,11),(21,12);
/*!40000 ALTER TABLE `fk_table45` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fk_table49`
--

DROP TABLE IF EXISTS `fk_table49`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fk_table49` (
  `fk_column50` int(11) NOT NULL,
  `fk_column51` int(11) NOT NULL,
  KEY `FKc0x36utub4d76ko8fbh1rvyxk` (`fk_column51`),
  KEY `FKkp1lvl22mct3nhnee33dxoxc3` (`fk_column50`),
  CONSTRAINT `FKc0x36utub4d76ko8fbh1rvyxk` FOREIGN KEY (`fk_column51`) REFERENCES `skill` (`id`),
  CONSTRAINT `FKkp1lvl22mct3nhnee33dxoxc3` FOREIGN KEY (`fk_column50`) REFERENCES `candidate` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fk_table49`
--

LOCK TABLES `fk_table49` WRITE;
/*!40000 ALTER TABLE `fk_table49` DISABLE KEYS */;
INSERT INTO `fk_table49` VALUES (6,1),(6,3),(7,3),(13,10),(13,11),(13,12),(14,11),(14,12),(15,10),(15,11),(15,12);
/*!40000 ALTER TABLE `fk_table49` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (22),(22),(22),(22),(22),(22),(22),(22),(22),(22),(22),(22),(22);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `interview_invitation`
--

DROP TABLE IF EXISTS `interview_invitation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `interview_invitation` (
  `id` int(11) NOT NULL,
  `time` datetime(6) DEFAULT NULL,
  `fkid33` int(11) DEFAULT NULL,
  `fkid35` int(11) DEFAULT NULL,
  `fkid34` int(11) DEFAULT NULL,
  `fkid54` int(11) DEFAULT NULL,
  `fkid56` int(11) DEFAULT NULL,
  `fkid55` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK8mni2rk7f35459y3yh1qisx2t` (`fkid33`),
  KEY `FKbp0j070bfluj13aqf4jrvmjkk` (`fkid35`),
  KEY `FKan92ed4g4u2dfmnuyauvsvsak` (`fkid34`),
  KEY `FK6swv9ixj82gj2lk2996wxmld2` (`fkid54`),
  KEY `FKgwmrfeya3krcqw5q9bciftvru` (`fkid56`),
  KEY `FKf9d6837jpyhvjxjndmv6a74u` (`fkid55`),
  CONSTRAINT `FK6swv9ixj82gj2lk2996wxmld2` FOREIGN KEY (`fkid54`) REFERENCES `candidate` (`id`),
  CONSTRAINT `FK8mni2rk7f35459y3yh1qisx2t` FOREIGN KEY (`fkid33`) REFERENCES `candidate` (`id`),
  CONSTRAINT `FKan92ed4g4u2dfmnuyauvsvsak` FOREIGN KEY (`fkid34`) REFERENCES `location` (`id`),
  CONSTRAINT `FKbp0j070bfluj13aqf4jrvmjkk` FOREIGN KEY (`fkid35`) REFERENCES `inteview_level` (`id`),
  CONSTRAINT `FKf9d6837jpyhvjxjndmv6a74u` FOREIGN KEY (`fkid55`) REFERENCES `location` (`id`),
  CONSTRAINT `FKgwmrfeya3krcqw5q9bciftvru` FOREIGN KEY (`fkid56`) REFERENCES `inteview_level` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `interview_invitation`
--

LOCK TABLES `interview_invitation` WRITE;
/*!40000 ALTER TABLE `interview_invitation` DISABLE KEYS */;
/*!40000 ALTER TABLE `interview_invitation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inteview_level`
--

DROP TABLE IF EXISTS `inteview_level`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inteview_level` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inteview_level`
--

LOCK TABLES `inteview_level` WRITE;
/*!40000 ALTER TABLE `inteview_level` DISABLE KEYS */;
/*!40000 ALTER TABLE `inteview_level` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `joining`
--

DROP TABLE IF EXISTS `joining`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `joining` (
  `id` int(11) NOT NULL,
  `empid` varchar(255) DEFAULT NULL,
  `time` datetime(6) DEFAULT NULL,
  `fkid41` int(11) DEFAULT NULL,
  `fkid42` int(11) DEFAULT NULL,
  `fkid62` int(11) DEFAULT NULL,
  `fkid63` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2kpwf0wjhpef6mixi7betfqkd` (`fkid41`),
  KEY `FKafixkm5wx0aad459u02ug3puu` (`fkid42`),
  KEY `FKh3k3klv5ctx8ndg9gdxaqkpn3` (`fkid62`),
  KEY `FKb720fwoy4s5n9u6xdba7a3b33` (`fkid63`),
  CONSTRAINT `FK2kpwf0wjhpef6mixi7betfqkd` FOREIGN KEY (`fkid41`) REFERENCES `candidate` (`id`),
  CONSTRAINT `FKafixkm5wx0aad459u02ug3puu` FOREIGN KEY (`fkid42`) REFERENCES `location` (`id`),
  CONSTRAINT `FKb720fwoy4s5n9u6xdba7a3b33` FOREIGN KEY (`fkid63`) REFERENCES `location` (`id`),
  CONSTRAINT `FKh3k3klv5ctx8ndg9gdxaqkpn3` FOREIGN KEY (`fkid62`) REFERENCES `candidate` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `joining`
--

LOCK TABLES `joining` WRITE;
/*!40000 ALTER TABLE `joining` DISABLE KEYS */;
/*!40000 ALTER TABLE `joining` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `location` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location`
--

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
/*!40000 ALTER TABLE `location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `offer`
--

DROP TABLE IF EXISTS `offer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `offer` (
  `id` int(11) NOT NULL,
  `fkid38` int(11) DEFAULT NULL,
  `fkid39` int(11) DEFAULT NULL,
  `fkid40` int(11) DEFAULT NULL,
  `fkid59` int(11) DEFAULT NULL,
  `fkid60` int(11) DEFAULT NULL,
  `fkid61` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK8y25mmma1gitsmtklnfo8jsbv` (`fkid38`),
  KEY `FKk65567n9ivf8s23treyiegxgc` (`fkid39`),
  KEY `FK9hfn7qmgk4jy79qhv55q4ubl8` (`fkid40`),
  KEY `FKq6su2vku8eq52o07faq26vc00` (`fkid59`),
  KEY `FK9okgltcbjaiy6u37y450tgkiy` (`fkid60`),
  KEY `FKowdbgovc0r18sv0bqoqatl6ar` (`fkid61`),
  CONSTRAINT `FK8y25mmma1gitsmtklnfo8jsbv` FOREIGN KEY (`fkid38`) REFERENCES `candidate` (`id`),
  CONSTRAINT `FK9hfn7qmgk4jy79qhv55q4ubl8` FOREIGN KEY (`fkid40`) REFERENCES `salary_details` (`id`),
  CONSTRAINT `FK9okgltcbjaiy6u37y450tgkiy` FOREIGN KEY (`fkid60`) REFERENCES `position` (`id`),
  CONSTRAINT `FKk65567n9ivf8s23treyiegxgc` FOREIGN KEY (`fkid39`) REFERENCES `position` (`id`),
  CONSTRAINT `FKowdbgovc0r18sv0bqoqatl6ar` FOREIGN KEY (`fkid61`) REFERENCES `salary_details` (`id`),
  CONSTRAINT `FKq6su2vku8eq52o07faq26vc00` FOREIGN KEY (`fkid59`) REFERENCES `candidate` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `offer`
--

LOCK TABLES `offer` WRITE;
/*!40000 ALTER TABLE `offer` DISABLE KEYS */;
/*!40000 ALTER TABLE `offer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `openning`
--

DROP TABLE IF EXISTS `openning`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `openning` (
  `id` int(11) NOT NULL,
  `exp` int(11) DEFAULT NULL,
  `noofope` int(11) DEFAULT NULL,
  `fkid22` int(11) DEFAULT NULL,
  `fkid23` int(11) DEFAULT NULL,
  `fkid43` int(11) DEFAULT NULL,
  `fkid44` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKoyegwrcn1a68ubevh2s11nkxx` (`fkid22`),
  KEY `FKqri1eh1q1vcchsd43lyukh8x` (`fkid23`),
  KEY `FKnoipc59fsy8c6csw8oeiiucou` (`fkid43`),
  KEY `FKrm6frb3f8gs4698t98ueki4qx` (`fkid44`),
  CONSTRAINT `FKnoipc59fsy8c6csw8oeiiucou` FOREIGN KEY (`fkid43`) REFERENCES `position` (`id`),
  CONSTRAINT `FKoyegwrcn1a68ubevh2s11nkxx` FOREIGN KEY (`fkid22`) REFERENCES `position` (`id`),
  CONSTRAINT `FKqri1eh1q1vcchsd43lyukh8x` FOREIGN KEY (`fkid23`) REFERENCES `qualification` (`id`),
  CONSTRAINT `FKrm6frb3f8gs4698t98ueki4qx` FOREIGN KEY (`fkid44`) REFERENCES `qualification` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `openning`
--

LOCK TABLES `openning` WRITE;
/*!40000 ALTER TABLE `openning` DISABLE KEYS */;
INSERT INTO `openning` VALUES (21,36,5,NULL,NULL,18,4);
/*!40000 ALTER TABLE `openning` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `position`
--

DROP TABLE IF EXISTS `position`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `position` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `position`
--

LOCK TABLES `position` WRITE;
/*!40000 ALTER TABLE `position` DISABLE KEYS */;
INSERT INTO `position` VALUES (16,'Fresher'),(17,'SoftwareEngineer'),(18,'SrSoftwareEngineer'),(19,'TL'),(20,'Manager');
/*!40000 ALTER TABLE `position` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qualification`
--

DROP TABLE IF EXISTS `qualification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `qualification` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qualification`
--

LOCK TABLES `qualification` WRITE;
/*!40000 ALTER TABLE `qualification` DISABLE KEYS */;
INSERT INTO `qualification` VALUES (4,'Btech'),(5,'Mtech');
/*!40000 ALTER TABLE `qualification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salary_details`
--

DROP TABLE IF EXISTS `salary_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `salary_details` (
  `id` int(11) NOT NULL,
  `basic` double DEFAULT NULL,
  `hra` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary_details`
--

LOCK TABLES `salary_details` WRITE;
/*!40000 ALTER TABLE `salary_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `salary_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shortlisted`
--

DROP TABLE IF EXISTS `shortlisted`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shortlisted` (
  `id` int(11) NOT NULL,
  `expsal` double DEFAULT NULL,
  `prosal` double DEFAULT NULL,
  `fkid36` int(11) DEFAULT NULL,
  `fkid37` int(11) DEFAULT NULL,
  `fkid57` int(11) DEFAULT NULL,
  `fkid58` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1u9gj720p9gdfdwy86fuycjp7` (`fkid36`),
  KEY `FK9lhc4unavhdbfo3hx19er84qa` (`fkid37`),
  KEY `FKbkrlkhratf7it8oeib9olvh9p` (`fkid57`),
  KEY `FK8ks8w3ad9n5xxcmy8cqak9svh` (`fkid58`),
  CONSTRAINT `FK1u9gj720p9gdfdwy86fuycjp7` FOREIGN KEY (`fkid36`) REFERENCES `candidate` (`id`),
  CONSTRAINT `FK8ks8w3ad9n5xxcmy8cqak9svh` FOREIGN KEY (`fkid58`) REFERENCES `position` (`id`),
  CONSTRAINT `FK9lhc4unavhdbfo3hx19er84qa` FOREIGN KEY (`fkid37`) REFERENCES `position` (`id`),
  CONSTRAINT `FKbkrlkhratf7it8oeib9olvh9p` FOREIGN KEY (`fkid57`) REFERENCES `candidate` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shortlisted`
--

LOCK TABLES `shortlisted` WRITE;
/*!40000 ALTER TABLE `shortlisted` DISABLE KEYS */;
/*!40000 ALTER TABLE `shortlisted` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `skill`
--

DROP TABLE IF EXISTS `skill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `skill` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `skill`
--

LOCK TABLES `skill` WRITE;
/*!40000 ALTER TABLE `skill` DISABLE KEYS */;
INSERT INTO `skill` VALUES (1,'SPRING IOC'),(3,'Hibernate'),(8,'DesignPattern'),(9,'Angular'),(10,'CSS'),(11,'Spring BOOT'),(12,'MicroServicecs');
/*!40000 ALTER TABLE `skill` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-09 20:23:39
