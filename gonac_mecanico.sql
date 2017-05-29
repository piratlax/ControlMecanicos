-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 08-05-2017 a las 06:08:15
-- Versión del servidor: 10.1.19-MariaDB
-- Versión de PHP: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gonac_mecanico`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado`
--

CREATE TABLE `estado` (
  `idEstado` int(11) NOT NULL,
  `camion` int(11) NOT NULL,
  `mecanico` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `estado` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mecanico`
--

CREATE TABLE `mecanico` (
  `id` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `paterno` varchar(30) NOT NULL,
  `materno` varchar(30) NOT NULL,
  `completo` varchar(150) NOT NULL,
  `area` varchar(20) NOT NULL,
  `usuario` varchar(15) NOT NULL,
  `clave` varchar(15) NOT NULL,
  `celular` varchar(10) NOT NULL,
  `email` varchar(30) NOT NULL,
  `activo` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `mecanico`
--

INSERT INTO `mecanico` (`id`, `nombre`, `paterno`, `materno`, `completo`, `area`, `usuario`, `clave`, `celular`, `email`, `activo`) VALUES
(6, 'Juan', 'Perez', 'Perez', 'Juan Perez Perez', 'Mecanica', 'juan', 'perez', '246445455', 'kakska@sdsds.com', 'no'),
(7, 'Pedro', 'Lopez', 'Lopez', 'Pedro Lopez Lopez', 'Mecanica', 'peter', 'lopez', '246559878', 'kkaiia@747.com', 'no'),
(8, 'Luis', 'Sanchez', 'Sancho', 'Luis Sanchez Sancho', 'Mecanica', 'luis', '4321', '24656565', 'jashjas@jdoso.com', 'no');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `id` int(11) NOT NULL,
  `genero` varchar(30) NOT NULL,
  `vehiculo` varchar(10) NOT NULL,
  `reporte` text NOT NULL,
  `fecha` date NOT NULL,
  `hora` varchar(10) NOT NULL,
  `estado` varchar(15) NOT NULL,
  `mecanico` varchar(5) NOT NULL,
  `bahia` varchar(10) NOT NULL,
  `color` varchar(10) NOT NULL,
  `diagnostico` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`id`, `genero`, `vehiculo`, `reporte`, `fecha`, `hora`, `estado`, `mecanico`, `bahia`, `color`, `diagnostico`) VALUES
(2, 'N', 'G-234', 'Ponchado de llanta', '2017-04-07', '2:16 PM', 'asignado', '6', 'Bahia 1', 'rojo', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `usuario` varchar(30) NOT NULL,
  `clave` varchar(30) NOT NULL,
  `categoria` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `nombre`, `usuario`, `clave`, `categoria`) VALUES
(1, 'Administrador', 'admin', 'admin', 'Administrador'),
(2, 'Operador', 'operador', 'operador', 'Operador'),
(3, 'Observador', 'observador', 'observador', 'Consultor'),
(4, 'Luis Sanchez Sancho', 'luis', '4321', 'Mecanico');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculo`
--

CREATE TABLE `vehiculo` (
  `idUnidad` int(3) NOT NULL,
  `numero` varchar(6) DEFAULT NULL,
  `tipo` varchar(14) DEFAULT NULL,
  `marca` varchar(13) DEFAULT NULL,
  `placa` varchar(9) DEFAULT NULL,
  `tipo_placa` varchar(7) DEFAULT NULL,
  `serie` varchar(17) DEFAULT NULL,
  `modelo` varchar(26) DEFAULT NULL,
  `motor` varchar(14) DEFAULT NULL,
  `propiedad` varchar(5) DEFAULT NULL,
  `activo` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

--
-- Volcado de datos para la tabla `vehiculo`
--

INSERT INTO `vehiculo` (`idUnidad`, `numero`, `tipo`, `marca`, `placa`, `tipo_placa`, `serie`, `modelo`, `motor`, `propiedad`, `activo`) VALUES
(1, 'G-211', 'Cam', 'FREIGHTLINER', 'XB-02-808', 'ESTATAL', 'JLMBBH1S9CK005238', '2012', 'D70477', 'Gonac', 'no'),
(2, 'G-234', 'Cam', 'FREIGHTLINER', 'XB-02-572', 'ESTATAL', 'JLMBBH1S7DK010200', '2013', 'D78048', 'Gonac', 'no'),
(3, 'G-235', 'Cam', 'FREIGHTLINER', 'XB-24-004', 'ESTATAL', 'JLMBBH1S9DK010201', '2013', 'D78049', 'Gonac', 'si'),
(4, 'G-236', 'Cam', 'FREIGHTLINER', 'XB-02-710', 'ESTATAL', 'JLMBBH1S4DK010204', '2013', 'D78080', 'Gonac', 'si'),
(5, 'G-237', 'Cam', 'FREIGHTLINER', 'XB-02-618', 'ESTATAL', 'JLMBBH1S6DK010205', '2013', 'D78082', 'Gonac', 'si'),
(6, 'G-239', 'Cam', 'FREIGHTLINER', 'XB-02-602', 'ESTATAL', 'JLMBBH1S1DK009222', '2013', 'D78026', 'Gonac', 'si'),
(7, 'G-240', 'Cam', 'FREIGHTLINER', 'XB-02-573', 'ESTATAL', 'JLMBBH1S3DK009223', '2013', 'D78028', 'Gonac', 'si'),
(8, 'G-243', 'Cam', 'ISUZU 400', 'XB-17-145', 'ESTATAL', 'JAANPR751D7005008', '2013', '107308', 'Gonac', 'si'),
(9, 'G-246', 'Cam', 'ISUZU 300', 'RH72912', 'ESTATAL', 'JAANMR85OD7500405', '2013', 'N/A', 'Gonac', 'si'),
(10, 'G-249', 'Cam', 'NISSAN NP300', 'RH82646', 'ESTATAL', '3N6DD25TXEK095751', '2014', 'N/A', 'Gonac', 'si'),
(11, 'G-241', 'Cam', 'NISSAN ', 'RG42215', 'ESTATAL', '3N6DD14S27K038174', '2007', 'N/A', 'Gonac', 'si'),
(12, 'G-251', 'Cam', 'ISUZU 300', 'LA52671', 'ESTATAL', 'JAANMR853F7500321', '2015', 'N/A', 'Gonac', 'si'),
(13, 'G-252', 'Cam', 'ISUZU 300', 'LA52693', 'ESTATAL', 'JAANMR853F7500322', '2015', 'N/A', 'Gonac', 'si'),
(14, 'G-282', 'Cam', 'ISUZU 300', 'XB56264', 'ESTATAL', 'JAANMR85267500412', '2016', 'N/A', 'Gonac', 'si'),
(15, 'G-205', 'Torton', 'FREIGHTLINER', '521EE6', 'FEDERAL', '3ALFCYCS7DDBX5816', 'FREIGHTLINER 2013', '90291000941913', 'Gonac', 'si'),
(16, 'G-206', 'Torton', 'FREIGHTLINER', '423EE6', 'FEDERAL', '3ALFCYCS5DDBX5815', 'FREIGHTLINER 2013', '90291000941853', 'Gonac', 'si'),
(17, 'G-229', 'Torton', 'FREIGHTLINER', '327DT9', 'FEDERAL', '3ALFCYCS6DDBX6598', 'FREIGHTLINER 2013', '90291000972929', 'Gonac', 'si'),
(18, 'G-230', 'Torton', 'FREIGHTLINER', '338DT9', 'FEDERAL', '3ALFCYCS0DDFG4289', 'FREIGHTLINER 2013', '902910C0990115', 'Gonac', 'si'),
(19, 'G-231', 'Torton', 'FREIGHTLINER', '337DT9', 'FEDERAL', '3ALFCYCS7DDFG4290', 'FREIGHTLINER 2013', '902910C0990120', 'Gonac', 'si'),
(20, 'G-233', 'Torton', 'FREIGHTLINER', '345DT9', 'FEDERAL', '3ALFCYCS0DDFG4292', 'FREIGHTLINER 2013', '902910C0991764', 'Gonac', 'si'),
(21, 'G-207', 'Rabon', 'FREIGHTLINER', '419EE6', 'FEDERAL', '3ALACYCS2CDBL3482', 'FREIGHTLINER 2012', '90291900884898', 'Gonac', 'si'),
(22, 'G-208', 'Rabon', 'FREIGHTLINER', '422EE6', 'FEDERAL', '3ALACYCS4CDBK3990', 'FREIGHTLINER 2012', '90291900915915', 'Gonac', 'si'),
(23, 'G-209', 'Rabon', 'FREIGHTLINER', '073EU2', 'FEDERAL', '3ALACYCS8CDBK3992', 'FREIGHTLINER 2012', '90291900915492', 'Gonac', 'si'),
(24, 'G-210', 'Rabon', 'FREIGHTLINER', '418EE6', 'FEDERAL', '3ALACYCS3CDBN3725', 'FREIGHTLINER 2012', '90291900907206', 'Gonac', 'si'),
(25, 'G-218', 'Rabon', 'FREIGHTLINER', '307DT9', 'FEDERAL', '3ALACYCS6DDBX5803', 'FREIGHTLINER 2013', '90291900973330', 'Gonac', 'si'),
(26, 'G-219', 'Rabon', 'FREIGHTLINER', '305DT9', 'FEDERAL', '3ALACYCS8DDBX5804', 'FREIGHTLINER 2013', '90291900976383', 'Gonac', 'si'),
(27, 'G-220', 'Rabon', 'FREIGHTLINER', '306DT9', 'FEDERAL', '3ALACYCSXDDBX5805', 'FREIGHTLINER 2013', '90291900972882', 'Gonac', 'si'),
(28, 'G-221', 'Rabon', 'FREIGHTLINER', '322DT9', 'FEDERAL', '3ALACYCS1DDBX5806', 'FREIGHTLINER 2013', '90291900972290', 'Gonac', 'si'),
(29, 'G-222', 'Rabon', 'FREIGHTLINER', '325DT9', 'FEDERAL', '3ALACYCS5DDBX5808', 'FREIGHTLINER 2013', '90291900983728', 'Gonac', 'si'),
(30, 'G-223', 'Rabon', 'FREIGHTLINER', '321DT9', 'FEDERAL', '3ALACYCS7DDBX5809', 'FREIGHTLINER 2013', '90291900985224', 'Gonac', 'si'),
(31, 'G-224', 'Rabon', 'FREIGHTLINER', '320DT9', 'FEDERAL', '3ALACYCS3DDBX5810', 'FREIGHTLINER 2013', '902919C0985353', 'Gonac', 'si'),
(32, 'G-225', 'Rabon', 'FREIGHTLINER', '326DT9', 'FEDERAL', '3ALACYCS5DDBX5811', 'FREIGHTLINER 2013', '902919C0984801', 'Gonac', 'si'),
(33, 'G-226', 'Rabon', 'FREIGHTLINER', '344DT9', 'FEDERAL', '3ALACYCS7DDBX5812', 'FREIGHTLINER 2013', '902919C0985345', 'Gonac', 'si'),
(34, 'G-227', 'Rabon', 'FREIGHTLINER', '334DT9', 'FEDERAL', '3ALACYCS9DDBX5813', 'FREIGHTLINER 2013', '902919C0985075', 'Gonac', 'si'),
(35, 'G-228', 'Rabon', 'FREIGHTLINER', '335DT9', 'FEDERAL', '3ALACYCS4DDBX6464', 'FREIGHTLINER 2013', '902919C0984651', 'Gonac', 'si'),
(36, 'G-232', 'Rabon', 'FREIGHTLINER', '336DT9', 'FEDERAL', '3ALFCYCS9DDFG4291', 'FREIGHTLINER 2013', '902910C0990467', 'Gonac', 'si'),
(37, 'G-244', 'Rabon', 'FREIGHTLINER', '116EU2', 'FEDERAL', '3ALACYCSXEDFM3594', 'FREIGHTLINER 2014', '902910C1022048', 'Gonac', 'si'),
(38, 'G-245', 'Rabon', 'FREIGHTLINER', '115EU2', 'FEDERAL', '3ALACYCS3EDFR9117', 'FREIGHTLINER 2014', '902910C1007125', 'Gonac', 'si'),
(39, 'G-247', 'Rabon', 'FREIGHTLINER', '400EV3', 'FEDERAL', '3ALACYCS0FDGF7889', 'FREIGHTLINER 2015', '902910C1066800', 'Gonac', 'si'),
(40, 'G-248', 'Rabon', 'FREIGHTLINER', '398EV3', 'FEDERAL', '3ALACYCS7FDGF7890', 'FREIGHTLINER 2015', '902910C1066792', 'Gonac', 'si'),
(41, 'G-258', 'Rabon', 'FREIGHTLINER', '504EV3', 'FEDERAL', '3ALACYCSOGDHB0740', 'FREIGHTLINER 2016', '902919C1088969', 'Gonac', 'si'),
(42, 'G-275', 'Rabon', 'FREIGHTLINER', '122EV3', 'FEDERAL', '3ALACYCS2GDHN2640', 'FREIGHTLINER 2016', '902919C1101392', 'Gonac', 'si'),
(43, 'G-276', 'Rabon', 'FREIGHTLINER', '524EV3', 'FEDERAL', '3ALACYCS4GDHN2641', 'FREIGHTLINER 2016', '902919C1102257', 'Gonac', 'si'),
(44, 'G-277', 'Rabon', 'FREIGHTLINER', '523EV3', 'FEDERAL', '3ALACYCS6GDHN2642', 'FREIGHTLINER 2016', '902919C1102246', 'Gonac', 'si'),
(45, 'G-278', 'Rabon', 'FREIGHTLINER', '526EV3', 'FEDERAL', '3ALACYCS5GDHN2647', 'FREIGHTLINER 2016', '902919C1104740', 'Gonac', 'si'),
(46, 'G-279', 'Rabon', 'FREIGHTLINER', '525EV3', 'FEDERAL', '3ALACYCS5GDHH9178', 'FREIGHTLINER 2016', '902919C1093397', 'Gonac', 'si'),
(47, 'G-284', 'Rabon', 'FREIGHTLINER', '44AA4W', 'FEDERAL', '3ALACYCS1HDHX4405', 'FREIGHTLINER 2017', '902919C1110362', 'Gonac', 'si'),
(48, 'G-285', 'Rabon', 'FREIGHTLINER', '45AA4W', 'FEDERAL', '3ALACYCSXHDHX4404', 'FREIGHTLINER 2017', '902919C1110154', 'Gonac', 'si'),
(49, 'G-319', 'Rabon', 'FREIGHTLINER', '08AB6M', 'FEDERAL', '3ALACYCSXHDHX4418', 'FREIGHTLINER 2017', '902919C1124431', 'Gonac', 'si'),
(50, 'G-320', 'Rabon', 'FREIGHTLINER', '90AB5M', 'FEDERAL', '3ALACYCSXHDHX4421', 'FREIGHTLINER 2017', '902919C1124095', 'Gonac', 'si'),
(51, 'G-290', 'Rabon', 'FREIGHTLINER', '88AB5M', 'FEDERAL', '3ALACYCS4HDHX4415', 'FREIGHTLINER 2017', '902919C1119470', 'Gonac', 'si'),
(52, 'G-291', 'Rabon', 'FREIGHTLINER', '92AB5M', 'FEDERAL', '3ALACYCS1HDHX4422', 'FREIGHTLINER 2017', '902919C1124376', 'Gonac', 'si'),
(53, 'G-292', 'Rabon', 'FREIGHTLINER', '96AB5M', 'FEDERAL', '3ALACYCS0HDHX4413', 'FREIGHTLINER 2017', '902919C1118771', 'Gonac', 'si'),
(54, 'G-293', 'Rabon', 'FREIGHTLINER', '89AB5M', 'FEDERAL', '3ALACYCS2HDHX4414', 'FREIGHTLINER 2017', '902919C1119478', 'Gonac', 'si'),
(55, 'G-294', 'Rabon', 'FREIGHTLINER', '98AB5M', 'FEDERAL', '3ALACYCS9HDHX4412', 'FREIGHTLINER 2017', '902919C1118700', 'Gonac', 'si'),
(56, 'G-295', 'Rabon', 'FREIGHTLINER', '91AB5M', 'FEDERAL', '3ALACYCS8HDHX4420', 'FREIGHTLINER 2017', '902919C1124352', 'Gonac', 'si'),
(57, 'G-296', 'Rabon', 'FREIGHTLINER', '85AB5M', 'FEDERAL', '3ALACYCS7HDHX4411', 'FREIGHTLINER 2017', '902919C1118572', 'Gonac', 'si'),
(58, 'G-297', 'Rabon', 'FREIGHTLINER', '95AB5M', 'FEDERAL', '3ALACYCS7HDHX4358', 'FREIGHTLINER 2017', '902919C1113810', 'Gonac', 'si'),
(59, 'G-298', 'Rabon', 'FREIGHTLINER', '97AB5M', 'FEDERAL', '3ALACYCS1HDHX4419', 'FREIGHTLINER 2017', '902919C1124345', 'Gonac', 'si'),
(60, 'G-299', 'Rabon', 'FREIGHTLINER', '80AB5M', 'FEDERAL', '3ALACYCS3HDHX4423', 'FREIGHTLINER 2017', '902919C1124427', 'Gonac', 'si'),
(61, 'G-300', 'Rabon', 'FREIGHTLINER', '83AB5M', 'FEDERAL', '3ALACYCS5HDHX4424', 'FREIGHTLINER 2017', '902919C1124311', 'Gonac', 'si'),
(62, 'G-301', 'Rabon', 'FREIGHTLINER', '87AB5M', 'FEDERAL', '3ALACYCS9HDHX4426', 'FREIGHTLINER 2017', '902919C1124086', 'Gonac', 'si'),
(63, 'G-302', 'Rabon', 'FREIGHTLINER', '94AB5M', 'FEDERAL', '3ALACYCS5HDHX4357', 'FREIGHTLINER 2017', '902919C1111682', 'Gonac', 'si'),
(64, 'G-303', 'Rabon', 'FREIGHTLINER', '93AB5M', 'FEDERAL', '3ALACYCS3HDHX4356', 'FREIGHTLINER 2017', '902910C1113807', 'Gonac', 'si'),
(65, 'G-304', 'Rabon', 'FREIGHTLINER', '04AC2C', 'FEDERAL', '3ALACYCS5HDHX4410', 'FREIGHTLINER 2017', '902919C1118495', 'Gonac', 'si'),
(66, 'G-031', 'Trailer', 'INTERNATIONAL', '039EE6', 'FEDERAL', '3HSNEAPT53N073669', 'INTER 2003', '14046145', 'Gonac', 'si'),
(67, 'G-212', 'Trailer', 'KENWORTH', '448EE6', 'FEDERAL', '3WKDD00XXDF844929', 'KENWORTH 2013', '35305878', 'Gonac', 'si'),
(68, 'G-213', 'Trailer', 'KENWORTH', '441EE6', 'FEDERAL', '3WKDD00X4DF844926', 'KENWORTH 2013', '35305877', 'Gonac', 'si'),
(69, 'G-214', 'Trailer', 'KENWORTH', '447EE6', 'FEDERAL', '3WKDD00X6DF844927', 'KENWORTH 2013', '35305879', 'Gonac', 'si'),
(70, 'G-215', 'Trailer', 'KENWORTH', '445EE6', 'FEDERAL', '3WKDD00X8DF844928', 'KENWORTH 2013', '35305880', 'Gonac', 'si'),
(71, 'G-217', 'Trailer', 'KENWORTH', '442EE6', 'FEDERAL', '3WKDD00X6DF844930', 'KENWORTH 2013', '35306206', 'Gonac', 'si'),
(72, 'G-242', 'Trailer', 'KENWORTH', '355DT9', 'FEDERAL', '3WKDD00X3EF852677', 'KENWORTH 2014', '35314254', 'Gonac', 'si'),
(73, 'G-253', 'Trailer', 'KENWORTH', '453EV3', 'FEDERAL', '3WKADP0X0FF859759', 'KENWORTH 2015 T660', 'Y047840', 'Gonac', 'si'),
(74, 'G-255', 'Trailer', 'KENWORTH', '452EV3', 'FEDERAL', '3WKADP0X7FF859760', 'KENWORTH 2015 T660', NULL, 'Gonac', 'si'),
(75, 'G-286', 'Trailer', 'KENWORTH', '66-AA-4W', 'FEDERAL', '3WKYD00X6HF500599', 'KENWORTH 2017 T680', '35339656', 'Gonac', 'si'),
(76, 'G-287', 'Trailer', 'KENWORTH', '67-AA-4W', 'FEDERAL', '3WKYD00X6HF500600', 'KENWORTH 2017 T680', '35339660', 'Gonac', 'si'),
(77, 'G-305', 'Trailer', 'FREIGHTLINER', '06AB6M', 'FEDERAL', '3AKJGLDR0HSHX4026', 'FREIGHTLINER 2017 CASCADIA', '472908S0439727', 'Gonac', 'si'),
(78, 'G-306', 'Trailer', 'FREIGHTLINER', '10AB6M', 'FEDERAL', '3AKJGLDR2HSHX4027', 'FREIGHTLINER 2017 CASCADIA', '472908S0444129', 'Gonac', 'si'),
(79, 'G-307', 'Trailer', 'FREIGHTLINER', '02AB6M', 'FEDERAL', '3AKJGLDR3HSHX4019', 'FREIGHTLINER 2017 CASCADIA', '472908S0443200', 'Gonac', 'si'),
(80, 'G-308', 'Trailer', 'FREIGHTLINER', '05AB6M', 'FEDERAL', '3AKJGLDR5HSHX4023', 'FREIGHTLINER 2017 CASCADIA', '472908S0448656', 'Gonac', 'si'),
(81, 'G-309', 'Trailer', 'FREIGHTLINER', '07AB6M', 'FEDERAL', '3AKJGLDR3HSJA0834', 'FREIGHTLINER 2017 CASCADIA', '472908S0434557', 'Gonac', 'si'),
(82, 'G-310', 'Trailer', 'FREIGHTLINER', '01AB6M', 'FEDERAL', '3AKJGLDR9HSJA0837', 'FREIGHTLINER 2017 CASCADIA', '472908S0447909', 'Gonac', 'si'),
(83, 'G-311', 'Trailer', 'FREIGHTLINER', '09AB6M', 'FEDERAL', '3AKJGLDR7HSJA0836', 'FREIGHTLINER 2017 CASCADIA', '472908S0445430', 'Gonac', 'si'),
(84, 'G-312', 'Trailer', 'FREIGHTLINER', '04AB6M', 'FEDERAL', '3AKJGLDR1HSHX4021', 'FREIGHTLINER 2017 CASCADIA', '472908S0446509', 'Gonac', 'si'),
(85, 'G-313', 'Trailer', 'FREIGHTLINER', '12AB6M', 'FEDERAL', '3AKJGLDR9HSHX4025', 'FREIGHTLINER 2017 CASCADIA', '472908S0427041', 'Gonac', 'si'),
(86, 'G-314', 'Trailer', 'FREIGHTLINER', '03AB6M', 'FEDERAL', '3AKJGLDRXHSHX4020', 'FREIGHTLINER 2017 CASCADIA', NULL, 'Gonac', 'si'),
(87, 'G-250', 'Full', 'FREIGHTLINER', '399EV3', 'FEDERAL', '3AKJGLCK6FSGD9436', 'FREIGHTLINER 2015', NULL, 'Gonac', 'si'),
(88, 'G-254', 'Full', 'KENWORTH', '454EV3', 'FEDERAL', '3WKADP0X9FF859761', 'KENWORTH 2015', NULL, 'Gonac', 'si'),
(89, 'G-262', 'Full', 'FREIGHTLINER', '499EV3', 'FEDERAL', '3AKJGLDR9GSHH9199', 'FREIGHTLINER 2016', '472908S0352604', 'Gonac', 'si'),
(90, 'G-272', 'Full', 'FREIGHTLINER', '513EV3', 'FEDERAL', '3AKJGLDR4GSHP6604', 'FREIGHTLINER 2016 CASCADIA', '47290850375908', 'Gonac', 'si'),
(91, 'G-273', 'Full', 'FREIGHTLINER', '515EV3', 'FEDERAL', '3AKJGLDR6GSHP6605', 'FREIGHTLINER 2016', '47290850375882', 'Gonac', 'si'),
(92, 'G-263', 'Full', 'FREIGHTLINER', '498EV3', 'FEDERAL', '3AKJGLDR1GSHH9200', 'FREIGHTLINER 2016', '472908S0352615', 'Gonac', 'si'),
(93, 'G-315', 'Full', 'FREIGHTLINER', '84AB5M', 'FEDERAL', '3AKJGLDR2HSJA1067', 'FREIGHTLINER 2017 CASCADIA', '472908S0456845', 'Gonac', 'si'),
(94, 'G-316', 'Full', 'FREIGHTLINER', '81AB5M', 'FEDERAL', '3AKJGLDR4HSJA1068', 'FREIGHTLINER 2017 CASCADIA', '472908S0456705', 'Gonac', 'si'),
(95, 'G-317', 'Full', 'FREIGHTLINER', '86AB5M', 'FEDERAL', '3AKJGLDR6HSJA1069', 'FREIGHTLINER 2017 CASCADIA', '472908S0457051', 'Gonac', 'si'),
(96, 'G-318', 'Full', 'FREIGHTLINER', '82AB5M', 'FEDERAL', '3AKJGLDR4HSJA1071', 'FREIGHTLINER 2017 CASCADIA', '472908S0457141', 'Gonac', 'si'),
(97, 'G-004', 'Remolque 48´', 'REMOLQUE', '900UC4', 'FEDERAL', '3C9CS482320033077', 'ALTAMIRANO 2002', 'N/A', 'Gonac', 'si'),
(98, 'G-006', 'Remolque 40´', 'REMOLQUE', '780UC4', 'FEDERAL', '3C9CS402330033819', 'ALTAMIRANO 2003', 'N/A', 'Gonac', 'si'),
(99, 'G-007', 'Remolque 40´', 'REMOLQUE', '782UC4', 'FEDERAL', '3C9CS402X20033329', 'ALTAMIRANO 2002', 'N/A', 'Gonac', 'si'),
(100, 'G-010', 'Remolque 40´', 'REMOLQUE', '877UC4', 'FEDERAL', '3C9CS402830033847', 'ALTAMIRANO 2003', 'N/A', 'Gonac', 'si'),
(101, 'G-011', 'Remolque 40´', 'REMOLQUE', '781UC4', 'FEDERAL', '3C9CS402X30033848', 'ALTAMIRANO 2003', 'N/A', 'Gonac', 'si'),
(102, 'G-022', 'Remolque 40´', 'REMOLQUE', '761UC4', 'FEDERAL', '3C9CS402020033078', 'ALTAMIRANO 2002', 'N/A', 'Gonac', 'si'),
(103, 'G-023', 'Remolque 40´', 'REMOLQUE', '854UC4', 'FEDERAL', '3C9CS402220033079', 'ALTAMIRANO 2002', 'N/A', 'Gonac', 'si'),
(104, 'G-028', 'Remolque 40´', 'REMOLQUE', '862UC4', 'FEDERAL', '3AWV240291X422002', 'FRUEHAUF 2001 ', 'N/A', 'Gonac', 'si'),
(105, 'G-032', 'Remolque 40´', 'REMOLQUE', '859UC4', 'FEDERAL', '3C9CS402940034328', 'ALTAMIRANO 2003 ', 'N/A', 'Gonac', 'si'),
(106, 'G-034', 'Remolque 40´', 'REMOLQUE', '863UC4', 'FEDERAL', '3C9CS402340034325', 'ALTAMIRANO 2004', 'N/A', 'Gonac', 'si'),
(107, 'G-036', 'Remolque 40´', 'REMOLQUE', '857UC4', 'FEDERAL', '3C9CS402540034326', 'ALTAMIRANO 2003', 'N/A', 'Gonac', 'si'),
(108, 'G-038', 'Remolque 40´', 'REMOLQUE', '860UC4', 'FEDERAL', '3C9CS402740034327', 'ALTAMIRANO 2004', 'N/A', 'Gonac', 'si'),
(109, 'G-052', 'Remolque 48´', 'REMOLQUE', '951WM8', 'FEDERAL', '982CCTLSA007414', 'LOZANO-98', 'N/A', 'Gonac', 'si'),
(110, 'G-053', 'Remolque 48´', 'REMOLQUE', '045UA2', 'FEDERAL', '982CCTLSA007645', 'LOZANO-98', 'N/A', 'Gonac', 'si'),
(111, 'G-054', 'Remolque 40´', 'REMOLQUE', '808WM8', 'FEDERAL', '3T9CC4828XM021035', 'LOZANO-99', 'N/A', 'Gonac', 'si'),
(112, 'G-060', 'Remolque 40´', 'REMOLQUE', '861UC4', 'FEDERAL', '3C9CS402X20033167', 'ALTAMIRANO 2002', 'N/A', 'Gonac', 'si'),
(113, 'G-070', 'Remolque 48´', 'REMOLQUE', '083UA2', 'FEDERAL', '3C9CS482140034585', 'ALTAMIRANO 2004', 'N/A', 'Gonac', 'si'),
(114, 'G-072', 'Remolque 48´', 'REMOLQUE', '855UC4', 'FEDERAL', '3C9CS482X40034617', 'ALTAMIRANO 2004', 'N/A', 'Gonac', 'si'),
(115, 'G-076', 'Remolque 48´', 'REMOLQUE', '878UC4', 'FEDERAL', '3C9CS482640034615', 'ALTAMIRANO 2004', 'N/A', 'Gonac', 'si'),
(116, 'G-079', 'Remolque 40´', 'REMOLQUE', '767UC4', 'FEDERAL', '3C9CS402540034620', 'ALTAMIRANO 2004', 'N/A', 'Gonac', 'si'),
(117, 'G-080', 'Remolque 40´', 'REMOLQUE', '128UA2', 'FEDERAL', '3C9CS402740034621', 'ALTAMIRANO 2004', 'N/A', 'Gonac', 'si'),
(118, 'G-101', 'Remolque Tolva', 'REMOLQUE', '942WM8', 'FEDERAL', '5HTSP462345X86000', 'HEIL 2004', 'N/A', 'Gonac', 'si'),
(119, 'G-108', 'Remolque 40´', 'REMOLQUE', '801UC4', 'FEDERAL', '1UYVS24005P635810', 'UTILITY 2005', 'N/A', 'Gonac', 'si'),
(120, 'G-116', 'Remolque 40´', 'REMOLQUE', '805UC4', 'FEDERAL', '3C9CS402370035446', 'ALTAMIRANO 2007', 'N/A', 'Gonac', 'si'),
(121, 'G-117', 'Remolque 40´', 'REMOLQUE', '803UC4', 'FEDERAL', '3C9CS402570035447', 'ALTAMIRANO 2007', 'N/A', 'Gonac', 'si'),
(122, 'G-120', 'Remolque 40´', 'REMOLQUE', '779UC4', 'FEDERAL', '3C9CS402970035483', 'ALTAMIRANO 2007', 'N/A', 'Gonac', 'si'),
(123, 'G-121', 'Remolque 40´', 'REMOLQUE', '778UC4', 'FEDERAL', '3C9CS402770035482', 'ALTAMIRANO 2007', 'N/A', 'Gonac', 'si'),
(124, 'G-124', 'Remolque 40´', 'REMOLQUE', '748UC4', 'FEDERAL', '3C9CS402570035481', 'ALTAMIRANO 2007', 'N/A', 'Gonac', 'si'),
(125, 'G-125', 'Remolque 40´', 'REMOLQUE', '802UC4', 'FEDERAL', '3C9CS402370035480', 'ALTAMIRANO 2007', 'N/A', 'Gonac', 'si'),
(126, 'G-274', 'Remolque 40´', 'REMOLQUE', '096WM9', 'FEDERAL', '1UYVS2400GP660015', 'UTILITY2016', 'N/A', 'Gonac', 'si'),
(127, 'G-161', 'Remolque 48´', 'REMOLQUE', '790WM8', 'FEDERAL', '3CXCC482XCM000352', 'LOZANO 2012', 'N/A', 'Gonac', 'si'),
(128, 'G-162', 'Remolque 48´', 'REMOLQUE', '148UA2', 'FEDERAL', '3CXCC4821CM000353', 'LOZANO 2012', 'N/A', 'Gonac', 'si'),
(129, 'G-163', 'Remolque 48´', 'REMOLQUE', '789WM8', 'FEDERAL', '3CXCC4823CM000354', 'LOZANO 2012', 'N/A', 'Gonac', 'si'),
(130, 'G-164', 'Remolque 48´', 'REMOLQUE', '791WM8', 'FEDERAL', '3CXCC4825CM000355', 'LOZANO 2012', 'N/A', 'Gonac', 'si'),
(131, 'G-165', 'Remolque 48´', 'REMOLQUE', '149UA2', 'FEDERAL', '3CXCC4827CM000356', 'LOZANO 2012', 'N/A', 'Gonac', 'si'),
(132, 'G-166', 'Remolque 48´', 'REMOLQUE', '147UA2', 'FEDERAL', '3CXCC4829CM000357', 'LOZANO 2012', 'N/A', 'Gonac', 'si'),
(133, 'G-167', 'Remolque 48´', 'REMOLQUE', '146UA2', 'FEDERAL', '3CXCC4820CM000358', 'LOZANO 2012', 'N/A', 'Gonac', 'si'),
(134, 'G-168', 'Remolque 48´', 'REMOLQUE', '145UA2', 'FEDERAL', '3CXCC4822CM000359', 'LOZANO 2012', 'N/A', 'Gonac', 'si'),
(135, 'G-256', 'Remolque 48´', 'REMOLQUE', '054WM9', 'FEDERAL', '1GRAP9620FJ647147', 'GREAT DANE', 'N/A', 'Gonac', 'si'),
(136, 'G-257', 'Remolque 48´', 'REMOLQUE', '055WM9', 'FEDERAL', '1GRAP9622FJ647148', 'GREAT DANE', 'N/A', 'Gonac', 'si'),
(137, 'G-261', 'Remolque 48´', 'REMOLQUE', '076WM9', 'FEDERAL', '1GRAP9625FJ647158', 'GREAT DANE', 'N/A', 'Gonac', 'si'),
(138, 'G-265', 'Remolque 53´', 'REMOLQUE', '087WM9', 'FEDERAL', '1GRAP0625GJ653362', 'GREAT DANE', 'N/A', 'Gonac', 'si'),
(139, 'G-266', 'Remolque 53´', 'REMOLQUE', '086WM9', 'FEDERAL', '1GRAP0624GJ653367', 'GREAT DANE', 'N/A', 'Gonac', 'si'),
(140, 'G-268', 'Remolque 53´', 'REMOLQUE', '092WM9', 'FEDERAL', '1GRAP0625GJ653300', 'GREAT DANE', 'N/A', 'Gonac', 'si'),
(141, 'G-269', 'Remolque 53´', 'REMOLQUE', '093WM9', 'FEDERAL', '1GRAP0623GJ653442', 'GREAT DANE', 'N/A', 'Gonac', 'si'),
(142, 'G-270', 'Remolque 53´', 'REMOLQUE', '094WM9', 'FEDERAL', '1GRAP0622GJ653366', 'GREAT DANE', 'N/A', 'Gonac', 'si'),
(143, 'G-271', 'Remolque 53´', 'REMOLQUE', '095WM9', 'FEDERAL', '1GRAP062XGJ653471', 'GREAT DANE', 'N/A', 'Gonac', 'si'),
(144, 'G-267', 'Remolque 40´', 'REMOLQUE', '088WM9', 'FEDERAL', '1UYVS2409GP551908', 'UTILITY', 'N/A', 'Gonac', 'si'),
(145, 'G-280', 'Remolque 40´', 'REMOLQUE', '100WM9', 'FEDERAL', '1UYVS2409GU660208', 'UTILITY', 'REFRIGERADAS', 'Gonac', 'si'),
(146, 'G-281', 'Remolque 40´', 'REMOLQUE', '101WM9', 'FEDERAL', '1UYVS2400GU660209', 'UTILITY', 'REFRIGERADAS', 'Gonac', 'si'),
(147, 'G-288', 'Remolque 48´', 'REMOLQUE', '137 WM 9', 'FEDERAL', '1UYVS2487H3030801', 'UTILITY', 'N/A', 'Gonac', 'si'),
(148, 'G-289', 'Remolque 48´', 'REMOLQUE', '138 WM 9', 'FEDERAL', '1UYVS2489H3030802', 'UTILITY', 'N/A', 'Gonac', 'si'),
(149, 'G-321', 'Remolque 48´', 'REMOLQUE', '153WM9', 'FEDERAL', '1UYVS248XH3030808', 'UTILITY', 'N/A', 'Gonac', 'si'),
(150, 'G-322', 'Remolque 48´', 'REMOLQUE', '154WM9', 'FEDERAL', '1UYVS2481H3030809', 'UTILITY', 'N/A', 'Gonac', 'si'),
(151, 'G-323', 'Remolque 48´', 'REMOLQUE', '152WM9', 'FEDERAL', '1UYVS2488H3030810', 'UTILITY', 'N/A', 'Gonac', 'si'),
(152, 'G-012', 'Dolly', 'DOLLY', '1PN1950', 'ESTATAL', '3C9DC112930043849', 'ALTAMIRANO 2003', 'N/A', 'Gonac', 'si'),
(153, 'G-025', 'Dolly', 'DOLLY', 'N/A', 'N/A', '3C9DC112520043331', 'ALTAMIRANO 2002', 'N/A', 'Gonac', 'si'),
(154, 'G-029', 'Dolly', 'DOLLY', 'N/A', 'N/A', '3AWE108211X423001', 'FRUEHAUF 2001', 'N/A', 'Gonac', 'si'),
(155, 'G-033', 'Dolly', 'DOLLY', '1PN1954', 'ESTATAL', '3C9DC112740044323', 'ALTAMIRANO 2003', 'N/A', 'Gonac', 'si'),
(156, 'G-037', 'Dolly', 'DOLLY', '1PN1955', 'ESTATAL', '3C9DC112940044324', 'ALTAMIRANO 2003', 'N/A', 'Gonac', 'si'),
(157, 'G-118', 'Dolly', 'DOLLY', '1PN4489', 'ESTATAL', '3C9DC112470045448', 'ALTAMIRANO 2007', 'N/A', 'Gonac', 'si'),
(158, 'G-122', 'Dolly', 'DOLLY', '1PN4570', 'ESTATAL', '3C9DC112X70045485', 'ALTAMIRANO 2007', 'N/A', 'Gonac', 'si'),
(159, 'G-126', 'Dolly', 'DOLLY', '1PN4580', 'FEDERAL', '3C9DC112870045484', 'ALTAMIRANO 2007', 'N/A', 'Gonac', 'si'),
(160, '977698', 'Dolly', 'DOLLY', 'N/A', 'N/A', '3C9DSA2277T107134', 'UTILITY 2007', 'N/A', 'Tip', 'si'),
(161, 'G-259', 'Dolly', 'DOLLY', 'N/A', 'N/A', '3BYDC1226GH010556', 'DE LUCIO 2016', 'N/A', 'Gonac', 'si'),
(162, 'G-260', 'Dolly', 'DOLLY', 'N/A', 'N/A', '3BYDC1224GH010555', 'DE LUCIO 2016', 'N/A', 'Gonac', 'si'),
(163, 'G-264', 'Dolly', 'DOLLY', 'N/A', 'N/A', '3BYDC1222GH010800', 'DE LUCIO 2016', 'N/A', 'Gonac', 'si'),
(164, 'GP-003', 'Chechibus', 'FREIGHTLINER', '1WZF92', 'FEDERAL', '3MBAA2DM0EM048205', 'MB 2014', '924933C1003634', 'Gonac', 'si'),
(165, 'GP-012', 'Chechibus', 'FREIGHTLINER', '1WZG89', 'FEDERAL', '3MBAA3CN97M022379', 'MB 2007', '90495600619996', 'Gonac', 'si'),
(166, 'GP-014', 'Chechibus', 'FREIGHTLINER', '1WZH17', 'FEDERAL', '3MBAA2DM5FM053207', 'MB 2015', NULL, 'Gonac', 'si');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `estado`
--
ALTER TABLE `estado`
  ADD PRIMARY KEY (`idEstado`);

--
-- Indices de la tabla `mecanico`
--
ALTER TABLE `mecanico`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD PRIMARY KEY (`idUnidad`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `estado`
--
ALTER TABLE `estado`
  MODIFY `idEstado` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `mecanico`
--
ALTER TABLE `mecanico`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT de la tabla `servicio`
--
ALTER TABLE `servicio`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  MODIFY `idUnidad` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=167;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
