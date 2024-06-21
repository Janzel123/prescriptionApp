-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 21, 2024 at 04:01 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `prescriptionapp`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_appointment`
--

CREATE TABLE `tbl_appointment` (
  `a_id` int(50) NOT NULL,
  `p_id` int(50) NOT NULL,
  `a_date` varchar(50) NOT NULL,
  `a_time` varchar(50) NOT NULL,
  `a_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_appointment`
--

INSERT INTO `tbl_appointment` (`a_id`, `p_id`, `a_date`, `a_time`, `a_status`) VALUES
(201, 101, '05-20-24', '14:00', 'Pending'),
(203, 102, '04-16-2024', '8:00', 'Finished');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_patient`
--

CREATE TABLE `tbl_patient` (
  `p_id` int(50) NOT NULL,
  `p_name` varchar(50) NOT NULL,
  `p_age` int(50) NOT NULL,
  `p_gender` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_patient`
--

INSERT INTO `tbl_patient` (`p_id`, `p_name`, `p_age`, `p_gender`) VALUES
(101, 'Frank Fuentes', 25, 'Male'),
(102, 'Luchiano Ramos', 27, 'Male'),
(103, 'John Smith', 30, 'male'),
(104, 'Joyce Lane', 13, 'Female'),
(105, 'Christine Byers', 52, 'Female');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_prescription`
--

CREATE TABLE `tbl_prescription` (
  `pr_id` int(50) NOT NULL,
  `u_id` int(50) NOT NULL,
  `p_id` int(50) NOT NULL,
  `a_id` int(50) NOT NULL,
  `pr_diagnosis` varchar(50) NOT NULL,
  `pr_medicine` varchar(50) NOT NULL,
  `pr_dosage` int(50) NOT NULL,
  `pr_frequency` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_prescription`
--

INSERT INTO `tbl_prescription` (`pr_id`, `u_id`, `p_id`, `a_id`, `pr_diagnosis`, `pr_medicine`, `pr_dosage`, `pr_frequency`) VALUES
(301, 101, 101, 201, 'Fever', 'Biogesic', 100, 3),
(302, 101, 102, 203, 'Headache', 'Bioflu', 20, 3);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `u_id` int(50) NOT NULL,
  `u_name` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_password` varchar(50) NOT NULL,
  `u_type` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`u_id`, `u_name`, `u_email`, `u_username`, `u_password`, `u_type`) VALUES
(101, 'Janzel Babon', 'janzel@email.com', 'janzel', '12345', 'Doctor'),
(102, 'Joel Ramos', 'joel@email.com', 'joel', '54321', 'Frontdesk'),
(103, 'Nicole Pellerin', 'nicole@email.com', 'nicole', '12345', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_appointment`
--
ALTER TABLE `tbl_appointment`
  ADD PRIMARY KEY (`a_id`),
  ADD KEY `p_id` (`p_id`);

--
-- Indexes for table `tbl_patient`
--
ALTER TABLE `tbl_patient`
  ADD PRIMARY KEY (`p_id`);

--
-- Indexes for table `tbl_prescription`
--
ALTER TABLE `tbl_prescription`
  ADD PRIMARY KEY (`pr_id`),
  ADD KEY `u_id` (`u_id`),
  ADD KEY `p_id` (`p_id`),
  ADD KEY `a_id` (`a_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_appointment`
--
ALTER TABLE `tbl_appointment`
  MODIFY `a_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=204;

--
-- AUTO_INCREMENT for table `tbl_patient`
--
ALTER TABLE `tbl_patient`
  MODIFY `p_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=106;

--
-- AUTO_INCREMENT for table `tbl_prescription`
--
ALTER TABLE `tbl_prescription`
  MODIFY `pr_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=303;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `u_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=105;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_appointment`
--
ALTER TABLE `tbl_appointment`
  ADD CONSTRAINT `tbl_appointment_ibfk_2` FOREIGN KEY (`p_id`) REFERENCES `tbl_patient` (`p_id`);

--
-- Constraints for table `tbl_prescription`
--
ALTER TABLE `tbl_prescription`
  ADD CONSTRAINT `tbl_prescription_ibfk_2` FOREIGN KEY (`u_id`) REFERENCES `tbl_user` (`u_id`),
  ADD CONSTRAINT `tbl_prescription_ibfk_3` FOREIGN KEY (`p_id`) REFERENCES `tbl_patient` (`p_id`),
  ADD CONSTRAINT `tbl_prescription_ibfk_4` FOREIGN KEY (`a_id`) REFERENCES `tbl_appointment` (`a_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
