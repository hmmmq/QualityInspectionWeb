CREATE DATABASE  IF NOT EXISTS `qualitydb` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `qualitydb`;
-- MySQL dump 10.13  Distrib 8.0.30, for macos12 (x86_64)
--
-- Host: 127.0.0.1    Database: qualitydb
-- ------------------------------------------------------
-- Server version	5.7.31-log

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
-- Table structure for table `completion_acceptance_record`
--

DROP TABLE IF EXISTS `completion_acceptance_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `completion_acceptance_record` (
  `record_id` int(11) NOT NULL AUTO_INCREMENT,
  `project_id` int(11) DEFAULT NULL,
  `project_name` varchar(255) NOT NULL,
  `structure_type` varchar(255) DEFAULT NULL,
  `number_of_floors_area` varchar(255) DEFAULT NULL,
  `construction_unit` varchar(255) DEFAULT NULL,
  `technical_director` varchar(255) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `project_manager` varchar(255) DEFAULT NULL,
  `project_technical_director` varchar(255) DEFAULT NULL,
  `completion_date` date DEFAULT NULL,
  `subdivision_acceptance` text,
  `quality_control_data` text,
  `safety_function_check` text,
  `appearance_quality` text,
  `subdivision_acceptance_status` int(11) DEFAULT NULL,
  `quality_control_data_status` int(11) DEFAULT NULL,
  `safety_function_check_status` int(11) DEFAULT NULL,
  `appearance_quality_status` int(11) DEFAULT NULL,
  `constructing_unit` varchar(255) DEFAULT NULL,
  `supervision_unit` varchar(255) DEFAULT NULL,
  `construction_unit2` varchar(255) DEFAULT NULL,
  `design_unit` varchar(255) DEFAULT NULL,
  `survey_unit` varchar(255) DEFAULT NULL,
  `construction_unit_signature` varchar(255) DEFAULT NULL,
  `construction_unit_signature_date` date DEFAULT NULL,
  `supervision_unit_signature` varchar(255) DEFAULT NULL,
  `supervision_unit_signature_date` date DEFAULT NULL,
  `conclusion` text,
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `inspection`
--

DROP TABLE IF EXISTS `inspection`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inspection` (
  `inspection_id` int(11) NOT NULL AUTO_INCREMENT,
  `inspector` varchar(255) NOT NULL,
  `project_id` int(11) NOT NULL,
  `project_name` varchar(255) NOT NULL,
  `project_description` text,
  `standard1_status` int(11) NOT NULL,
  `standard1_reason` text,
  `standard2_status` int(11) NOT NULL,
  `standard2_reason` text,
  `standard3_status` int(11) NOT NULL,
  `standard3_reason` text,
  `standard4_status` int(11) NOT NULL,
  `standard4_reason` text,
  `standard5_status` int(11) NOT NULL,
  `standard5_reason` text,
  `standard6_status` int(11) NOT NULL,
  `standard6_reason` text,
  `standard7_status` int(11) NOT NULL,
  `standard7_reason` text,
  `standard8_status` int(11) NOT NULL,
  `standard8_reason` text,
  `standard9_status` int(11) NOT NULL,
  `standard9_reason` text,
  PRIMARY KEY (`inspection_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `pre_acceptance_record`
--

DROP TABLE IF EXISTS `pre_acceptance_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pre_acceptance_record` (
  `record_id` int(11) NOT NULL AUTO_INCREMENT,
  `project_id` int(11) DEFAULT NULL,
  `project_name` varchar(255) NOT NULL,
  `project_location` varchar(255) NOT NULL,
  `constructing_unit` varchar(255) DEFAULT NULL,
  `construction_unit` varchar(255) NOT NULL,
  `supervision_unit` varchar(255) NOT NULL,
  `design_unit` varchar(255) NOT NULL,
  `scale_description` text,
  `building_area` decimal(10,2) DEFAULT NULL,
  `number_of_floors` int(11) DEFAULT NULL,
  `start_date` date DEFAULT NULL,
  `completion_date` date DEFAULT NULL,
  `main_structure_status` int(11) NOT NULL,
  `main_structure_reason` text,
  `decoration_status` int(11) NOT NULL,
  `decoration_reason` text,
  `roofing_status` int(11) NOT NULL,
  `roofing_reason` text,
  `plumbing_installation_status` int(11) NOT NULL,
  `plumbing_installation_reason` text,
  `sanitary_fixtures_status` int(11) NOT NULL,
  `sanitary_fixtures_reason` text,
  `electrical_wiring_status` int(11) NOT NULL,
  `electrical_wiring_reason` text,
  `distribution_box_status` int(11) NOT NULL,
  `distribution_box_reason` text,
  `ventilation_duct_status` int(11) NOT NULL,
  `ventilation_duct_reason` text,
  `air_conditioning_status` int(11) NOT NULL,
  `air_conditioning_reason` text,
  `overall_quality_status` int(11) NOT NULL,
  `overall_quality_reason` text,
  `documentation_completeness_status` int(11) NOT NULL,
  `documentation_completeness_reason` text,
  `pre_acceptance_conclusion_status` int(11) NOT NULL,
  `issues_description` text,
  `rectification_requirements` text,
  `rectification_deadline` date DEFAULT NULL,
  `responsible_person` varchar(255) DEFAULT NULL,
  `construction_unit_signature` varchar(255) DEFAULT NULL,
  `supervision_unit_signature` varchar(255) DEFAULT NULL,
  `constructing_unit_signature` varchar(255) DEFAULT NULL,
  `design_unit_signature` varchar(255) DEFAULT NULL,
  `acceptance_date` date DEFAULT NULL,
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `process`
--

DROP TABLE IF EXISTS `process`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `process` (
  `process_id` int(11) NOT NULL AUTO_INCREMENT,
  `process_name` varchar(255) NOT NULL,
  `process_description` text,
  `status` int(11) NOT NULL,
  `responsible_person` varchar(255) DEFAULT NULL,
  `fail_reason` varchar(45) DEFAULT NULL,
  `document_path` varchar(255) DEFAULT NULL,
  `project_id` int(11) DEFAULT NULL,
  `project_name` varchar(255) DEFAULT NULL,
  `project_description` text,
  `start_date` date DEFAULT NULL,
  `estimated_completion_date` date DEFAULT NULL,
  `coverage_area` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`process_id`)
) ENGINE=InnoDB AUTO_INCREMENT=123 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `project` (
  `project_id` int(11) NOT NULL AUTO_INCREMENT,
  `project_name` varchar(255) NOT NULL,
  `project_description` text,
  `start_date` date DEFAULT NULL,
  `estimated_completion_date` date DEFAULT NULL,
  `coverage_area` varchar(255) DEFAULT NULL,
  `project_status` int(11) NOT NULL,
  `fail_reason` varchar(255) DEFAULT NULL,
  `final_suggestion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`project_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` int(11) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-04 18:47:31
