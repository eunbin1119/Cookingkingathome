-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- 생성 시간: 21-11-12 03:35
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
('감자탕', '뼈다귀해장국 만들 돼지 등뼈를 깨끗하게 씻은 후\r\n물을 붓고 삶아줍니다.\r\n돼지등뼈의 핏물도 제거하고 잡내도 없애주고\r\n불순물을 제거해줍니다.	\r\n센불로 10분 정도 끓여낸 후\r\n'),
('김치볶음밥', '백종원 김치볶음밥 센불만 기억하면 끝~!\r\n이제 시작해볼게요!	\r\n재료를 준비해주시구요!	\r\n신혼집이라 양가부모님댁에서 얻은 김치로 잘 먹고 있는데요\r\n김치가 많이 익은지라 설탕 '),
('김치찌개', '돼지고기는 핏물을 빼주세요	\r\n\r\n잘익은 김치 한포기를 꺼내서 잘라주세요\r\n\r\n냄비에 들기름 적당히 두르고	\r\n김치를 넣고 볶아주세요	\r\n다진마늘 한스푼, 설탕 한스푼 넣어주세요	'),
('비빔밥', '양파, 당근, 애호박을 채썰어서\r\n준비합니다.	\r\n비빔밥에 비벼먹을 양념장을 준비합니다.\r\n고추장 2T +간장 2T+설탕 1.5T+깨소금, 참기름 +식초 1T를 넣고 잘섞어\r\n양념'),
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
