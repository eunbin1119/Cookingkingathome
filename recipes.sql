-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- 생성 시간: 21-11-12 03:26
-- 서버 버전: 10.4.21-MariaDB
-- PHP 버전: 7.4.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 데이터베이스: `recipe`
--

-- --------------------------------------------------------

--
-- 테이블 구조 `recipes`
--

CREATE TABLE `recipes` (
  `food` varchar(100) NOT NULL,
  `Recipe` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 테이블의 덤프 데이터 `recipes`
--

INSERT INTO `recipes` (`food`, `Recipe`) VALUES
('김치볶음밥', '백종원 김치볶음밥 센불만 기억하면 끝~!\r\n이제 시작해볼게요!	\r\n재료를 준비해주시구요!	\r\n신혼집이라 양가부모님댁에서 얻은 김치로 잘 먹고 있는데요\r\n김치가 많이 익은지라 설탕 '),
('김치찌개', '돼지고기는 핏물을 빼주세요	\r\n\r\n잘익은 김치 한포기를 꺼내서 잘라주세요\r\n\r\n냄비에 들기름 적당히 두르고	\r\n김치를 넣고 볶아주세요	\r\n다진마늘 한스푼, 설탕 한스푼 넣어주세요	'),
('소 갈비찜', '갈비는 일단 핏물을 빼주세요\r\n저는 물을 번갈아가며 1시간 반정도 빼줬어요	\r\n분량의 양념은 미리 한곳에 섞어서 준비해주세요\r\n설탕 1/2컵, 맛술 1/2컵, 물 1컵, 진간장 1');

--
-- 덤프된 테이블의 인덱스
--

--
-- 테이블의 인덱스 `recipes`
--
ALTER TABLE `recipes`
  ADD PRIMARY KEY (`food`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
