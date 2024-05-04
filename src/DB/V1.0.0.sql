-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: fs_agency
-- ------------------------------------------------------
-- Server version	8.0.34

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
-- Table structure for table `agency`
--

DROP TABLE IF EXISTS `agency`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agency` (
  `id` varchar(40) NOT NULL,
  `name` varchar(255) NOT NULL,
  `created_date` date DEFAULT NULL,
  `update_date` date DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `company_id` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agency`
--

LOCK TABLES `agency` WRITE;
/*!40000 ALTER TABLE `agency` DISABLE KEYS */;
/*!40000 ALTER TABLE `agency` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `id` varchar(40) NOT NULL,
  `Code` varchar(40) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `company` (
  `id` varchar(40) NOT NULL,
  `Company_ID` varchar(40) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `update_date` date DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company`
--

LOCK TABLES `company` WRITE;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
/*!40000 ALTER TABLE `company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `id` varchar(40) NOT NULL,
  `eCustomer_ID` varchar(40) DEFAULT NULL,
  `fullname` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `date_created` date DEFAULT NULL,
  `date_updated` date DEFAULT NULL,
  `ranking` varchar(40) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('075fcb6b-1e4f-4349-8f27-3872bcfaf568','OBZO-4381','Lê Anh Minh','ssyuee@gmail.com','09328783973','12 Lê Thánh Tôn P1 TPHCM','2004-09-10','2023-12-01',NULL,'DIAMOND',NULL,NULL),('076e4f50-3b09-4cd2-9be6-92bdd9ed8b20','OZQQ-5498','c','c','c','c','2023-12-05','2023-12-01',NULL,NULL,'c','MALE'),('10d34f6e-c83c-4642-8c4d-b62671f80da4','MJWM-1682','Phạm Nhất Minh','ssyuee@gmail.com','09328783973','12 Lê Thánh Tôn P1 TPHCM','2004-09-10','2023-11-26',NULL,'PLATINUM',NULL,'male'),('customer1','EC001','Nguyễn Văn A','nguyen.van.a@example.com','0123456789','123 Đường ABC, Quận 1, TP.Hồ Chí Minh','1990-05-15','2023-01-01','2023-02-15','Gold',NULL,'male'),('customer2','EC002','Trần Thị B','tran.thi.b@example.com','0987654321','456 Đường XYZ, Quận 2, TP.Hồ Chí Minh','1985-08-21','2023-03-10','2023-04-22','Silver',NULL,'male'),('customer3','EC003','Lê Văn C','le.van.c@example.com','0369852147','789 Đường LMN, Quận 3, TP.Hồ Chí Minh','1995-12-03','2023-05-18','2023-06-30','Bronze',NULL,'male'),('d6aba912-3cc9-48a6-844f-176fd94626a0','JVMY-9537','a1','a2','a3','a4','2023-12-16','2023-12-01',NULL,NULL,NULL,NULL),('e3af9f58-8fc8-46cf-a1e9-b090da1ba431','VEBG-2287','hcm','male','a','a','2023-11-14','2023-11-26',NULL,NULL,NULL,'male'),('e84a0c1a-a743-4867-9bcb-89ed6a21ceaf','VQKW-9400','hcm','male','a','a','2023-11-09','2023-11-26',NULL,NULL,NULL,'male');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exportingbill`
--

DROP TABLE IF EXISTS `exportingbill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `exportingbill` (
  `id` varchar(40) NOT NULL,
  `date_Export` date DEFAULT NULL,
  `date_Created` date DEFAULT NULL,
  `total` decimal(10,2) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `customer_id` varchar(40) DEFAULT NULL,
  `agency_id` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exportingbill`
--

LOCK TABLES `exportingbill` WRITE;
/*!40000 ALTER TABLE `exportingbill` DISABLE KEYS */;
INSERT INTO `exportingbill` VALUES ('7610187d-e609-44f3-8fe0-26c854c42c30',NULL,'2023-12-13',NULL,NULL,NULL,NULL),('eceeeaf5-4882-4438-a332-d0aea506f3e4',NULL,'2023-12-13',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `exportingbill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exportingtransaction`
--

DROP TABLE IF EXISTS `exportingtransaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `exportingtransaction` (
  `id` varchar(255) NOT NULL,
  `bill_ID` varchar(40) DEFAULT NULL,
  `food_ID` varchar(40) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exportingtransaction`
--

LOCK TABLES `exportingtransaction` WRITE;
/*!40000 ALTER TABLE `exportingtransaction` DISABLE KEYS */;
INSERT INTO `exportingtransaction` VALUES ('486b00ed-39dd-4fe3-bf8b-8dc4e707de18','7610187d-e609-44f3-8fe0-26c854c42c30','food6',41,6),('75ce541e-c903-4e79-8359-b2a17e3b5172','7610187d-e609-44f3-8fe0-26c854c42c30','food3',8,2),('ade256ae-e096-47cb-abe7-9d97ef08c777','7610187d-e609-44f3-8fe0-26c854c42c30','food10',9,2);
/*!40000 ALTER TABLE `exportingtransaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `food`
--

DROP TABLE IF EXISTS `food`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `food` (
  `id` varchar(40) NOT NULL,
  `Code` varchar(40) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `description` text,
  `specification` text,
  `category_id` varchar(40) DEFAULT NULL,
  `company_id` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food`
--

LOCK TABLES `food` WRITE;
/*!40000 ALTER TABLE `food` DISABLE KEYS */;
INSERT INTO `food` VALUES ('food1','F001','Bánh Burger',5.99,'Có sẵn','assets/food_1.jpg','Bánh burger thịt bò ngon với rau diếp và phô mai','NORMAL','C001','CO001'),('food10','F010','Kem',4.99,'Có sẵn','assets/food_2.jpg','Kem vani với sốt sô cô la và đường hạt','NORMAL','C010','CO005'),('food2','F002','Pizza',8.99,'Có sẵn','assets/food_3.jpg','Pizza Margherita truyền thống với cà chua và phô mai','NORMAL','C002','CO001'),('food3','F003','Salad',4.49,'Có sẵn','assets/food_4.jpg','Salad rau sống tươi ngon với sốt dầu giấm','NORMAL','C003','CO002'),('food4','F004','Mì Ý',7.99,'Có sẵn','assets/food_5.jpg','Mì Ý với sốt cà chua và xúc xích','NORMAL','C004','CO002'),('food5','F005','Sushi',12.99,'Có sẵn','assets/food_6.jpg','Combo sushi đa dạng với nước sốt và wasabi','NORMAL','C005','CO003'),('food6','F006','Cánh Gà Chiên',6.99,'Có sẵn','assets/food_7.jpg','Cánh gà cay nồng với sốt ranch','NORMAL','C006','CO003'),('food7','F007','Nước Trái Cây',3.99,'Có sẵn','assets/food_8.jpg','Nước trái cây dâu tây mát lạnh','NORMAL','C007','CO004'),('food8','F008','Taco',9.49,'Có sẵn','assets/food_9.jpg','Taco gà nướng với sốt salsa và guacamole','NORMAL','C008','CO004'),('food9','F009','Bò-Bít-Tết',15.99,'Có sẵn','assets/food_1.jpg','Bò bit tết nướng mỡ hành tỏi với khoai tây nghiền và măng tây','NORMAL','C009','CO005');
/*!40000 ALTER TABLE `food` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `importingbill`
--

DROP TABLE IF EXISTS `importingbill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `importingbill` (
  `id` varchar(255) NOT NULL,
  `agency_id` varchar(40) DEFAULT NULL,
  `customer_Id` varchar(40) DEFAULT NULL,
  `total` double DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `date_Import` date DEFAULT NULL,
  `date_Created` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `importingbill`
--

LOCK TABLES `importingbill` WRITE;
/*!40000 ALTER TABLE `importingbill` DISABLE KEYS */;
/*!40000 ALTER TABLE `importingbill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `importingtransaction`
--

DROP TABLE IF EXISTS `importingtransaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `importingtransaction` (
  `id` varchar(40) NOT NULL,
  `importing_Bil_lID` varchar(40) DEFAULT NULL,
  `merchandise_ID` varchar(40) DEFAULT NULL,
  `quality` float DEFAULT NULL,
  `amount` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `importingtransaction`
--

LOCK TABLES `importingtransaction` WRITE;
/*!40000 ALTER TABLE `importingtransaction` DISABLE KEYS */;
/*!40000 ALTER TABLE `importingtransaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventoryfood`
--

DROP TABLE IF EXISTS `inventoryfood`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventoryfood` (
  `id` varchar(40) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `update_date` date DEFAULT NULL,
  `quality` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventoryfood`
--

LOCK TABLES `inventoryfood` WRITE;
/*!40000 ALTER TABLE `inventoryfood` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventoryfood` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `merchandise`
--

DROP TABLE IF EXISTS `merchandise`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `merchandise` (
  `id` varchar(40) NOT NULL,
  `company_id` varchar(40) DEFAULT NULL,
  `Code` varchar(40) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `type_merchandise` varchar(255) DEFAULT NULL,
  `disable` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `merchandise`
--

LOCK TABLES `merchandise` WRITE;
/*!40000 ALTER TABLE `merchandise` DISABLE KEYS */;
/*!40000 ALTER TABLE `merchandise` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monthly_food_warehouse`
--

DROP TABLE IF EXISTS `monthly_food_warehouse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `monthly_food_warehouse` (
  `id` varchar(40) NOT NULL,
  `food_ID` varchar(40) DEFAULT NULL,
  `date_created` date DEFAULT NULL,
  `quality` int DEFAULT NULL,
  `amount` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monthly_food_warehouse`
--

LOCK TABLES `monthly_food_warehouse` WRITE;
/*!40000 ALTER TABLE `monthly_food_warehouse` DISABLE KEYS */;
/*!40000 ALTER TABLE `monthly_food_warehouse` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monthly_merchandise_warehouse`
--

DROP TABLE IF EXISTS `monthly_merchandise_warehouse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `monthly_merchandise_warehouse` (
  `id` varchar(40) NOT NULL,
  `agency_id` varchar(40) DEFAULT NULL,
  `merchandise_id` varchar(40) NOT NULL,
  `quanlity` float DEFAULT NULL,
  `total` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monthly_merchandise_warehouse`
--

LOCK TABLES `monthly_merchandise_warehouse` WRITE;
/*!40000 ALTER TABLE `monthly_merchandise_warehouse` DISABLE KEYS */;
/*!40000 ALTER TABLE `monthly_merchandise_warehouse` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-13 17:32:39
