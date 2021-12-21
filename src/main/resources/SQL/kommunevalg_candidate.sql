-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: kommunevalg
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `candidate`
--

DROP TABLE IF EXISTS `candidate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `candidate` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_Name` varchar(225) DEFAULT NULL,
  `last_Name` varchar(225) DEFAULT NULL,
  `party_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `party_id_idx` (`party_id`),
  CONSTRAINT `party_id` FOREIGN KEY (`party_id`) REFERENCES `party` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `candidate`
--

LOCK TABLES `candidate` WRITE;
/*!40000 ALTER TABLE `candidate` DISABLE KEYS */;
INSERT INTO `candidate` VALUES (1,'Kirsten ','Jensen',1),(2,'Thomas ','Brücker',1),(3,'Louise ','Colding',1),(4,'Susanne ','Kristensen',1),(5,'Jamil ','Cheheibar',1),(6,'Christina','Thorholm',2),(7,'Jørgen ','Suhr',2),(8,'Charlotte ','Kaufmanas',2),(9,'Mette ','Grønvaldt',2),(10,'Anne ','Lintrup',2),(11,'Peter ','Ingemann Bentsen',3),(12,'Nikolaj ','Frederiksen',3),(13,'Stine ','Østlund',3),(14,'Christoffer ','Lorenzen',3),(15,'Kate ','Horsbøl',3),(16,'Morten ','Bille',4),(17,'John ','Falch',4),(18,'Martin ','Vinther',4),(19,'Kenn ','Hadberg',4),(20,'Lars ','Elbrandt',5),(21,'Janne ','Lunding Olsen',5),(22,'Mads ','Munk Hansen',5),(23,'Rasmus ','Alexander Meyer',5),(24,'Flemming ','Thornæs',5),(25,'Rikke ','Macholm',5),(26,'Elisabeth','Stieper Tofte',6),(27,'Ulrik ','Ringgaard Mathorne',6),(28,'Martin ','Plambæk',6),(29,'Henrik ','Forsberg',7),(30,'Lars ','Ole Skovgaard Larsen',8),(31,'Jette ','Juul',8),(32,'Henning ','Westermann',8),(33,'Klaus ','Markussen',9),(34,'Dan ','Riise',9),(35,'Peter ','Frederiksen',9),(36,'Annette ','Rieva',9),(37,'Øzgen ','Yücel',9),(38,'Bjarne ','Holm',10),(39,'Tue ','Tortzen',11),(40,'Sabri ','Yilmaz',11),(41,'Anne ','Mette ',11),(42,'Hildur ','Johnson',11),(43,'Karl ','Erik Rasmussen',11),(44,'The','LuckyNumber44',1),(50,'Test_first_name','Test_last_name',1),(51,'Test_first_name','Test_last_name',1),(52,'Test_first_name','Test_last_name',1),(53,'Test_first_name','Test_last_name',1);
/*!40000 ALTER TABLE `candidate` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-20 23:03:29
