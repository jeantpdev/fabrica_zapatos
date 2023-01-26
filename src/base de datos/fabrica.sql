-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-01-2023 a las 22:50:00
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `fabrica`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `calzados`
--

CREATE TABLE `calzados` (
  `Marca` varchar(255) NOT NULL,
  `Modelo` varchar(255) NOT NULL,
  `Categoria` varchar(255) NOT NULL,
  `Precio` varchar(255) NOT NULL,
  `idProducto` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `calzadosmarca`
--

CREATE TABLE `calzadosmarca` (
  `Marca` varchar(255) NOT NULL,
  `Modelo` varchar(255) NOT NULL,
  `Categoria` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `Cedula` varchar(255) NOT NULL,
  `Nombre` varchar(255) NOT NULL,
  `Apellido` varchar(255) NOT NULL,
  `Correo` varchar(255) NOT NULL,
  `Direccion` varchar(255) NOT NULL,
  `Celular` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturacion`
--

CREATE TABLE `facturacion` (
  `Nombre` varchar(255) NOT NULL,
  `Cedula` varchar(255) NOT NULL,
  `Producto` varchar(255) NOT NULL,
  `Cantidad` varchar(255) NOT NULL,
  `Total` varchar(255) NOT NULL,
  `idFactura` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materiales`
--

CREATE TABLE `materiales` (
  `Material` varchar(255) NOT NULL,
  `Cantidad` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proovedores`
--

CREATE TABLE `proovedores` (
  `Nombre` varchar(255) NOT NULL,
  `Celular` varchar(255) NOT NULL,
  `Correo` varchar(255) NOT NULL,
  `Direccion` varchar(255) NOT NULL,
  `idProveedor` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `proovedores`
--

INSERT INTO `proovedores` (`Nombre`, `Celular`, `Correo`, `Direccion`, `idProveedor`) VALUES
('Jean', '3113109661', 'jeantpdev@gmail.com', 'aca', '2232');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `usuario` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `calzados`
--
ALTER TABLE `calzados`
  ADD PRIMARY KEY (`idProducto`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`Cedula`);

--
-- Indices de la tabla `facturacion`
--
ALTER TABLE `facturacion`
  ADD PRIMARY KEY (`idFactura`);

--
-- Indices de la tabla `materiales`
--
ALTER TABLE `materiales`
  ADD PRIMARY KEY (`Material`);

--
-- Indices de la tabla `proovedores`
--
ALTER TABLE `proovedores`
  ADD PRIMARY KEY (`idProveedor`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
