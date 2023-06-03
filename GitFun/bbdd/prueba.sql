create database prueba;
use prueba;


DROP TABLE IF EXISTS `personas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personas` (
  `documento` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `email` varchar(150) NOT NULL,
  PRIMARY KEY (`documento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ;

LOCK TABLES `personas` WRITE;

INSERT INTO `personas` VALUES (123,'123','123','123'),(666,'Jhon','Moreno','jhon@gmail.com'),(888,'Juan','Herrera','juan@gmail.com');

