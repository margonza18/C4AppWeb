-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema bd_g53
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bd_g53
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bd_g53` DEFAULT CHARACTER SET utf8 ;
USE `bd_g53` ;

-- -----------------------------------------------------
-- Table `bd_g53`.`personas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_g53`.`personas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `tipo_documento` VARCHAR(45) NULL,
  `documento` VARCHAR(12) NULL,
  `nombre_completo` VARCHAR(80) NULL,
  `telefono` VARCHAR(20) NULL,
  `correo` VARCHAR(45) NULL,
  `fecha_nacimiento` DATE NULL,
  `direccion` VARCHAR(45) NULL,
  `estado` BIT(1) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_g53`.`roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_g53`.`roles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `descripcion` VARCHAR(100) NULL,
  `estado` BIT(1) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_g53`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_g53`.`usuarios` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `usuario` VARCHAR(45) NULL,
  `contrasenia` VARCHAR(100) NULL,
  `estado` BIT(1) NULL,
  `persona_id` INT NOT NULL,
  `rol_id` INT NOT NULL,
  PRIMARY KEY (`id`),
    CONSTRAINT `fk_usuarios_personas`
    FOREIGN KEY (`persona_id`)
    REFERENCES `bd_g53`.`personas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuarios_roles1`
    FOREIGN KEY (`rol_id`)
    REFERENCES `bd_g53`.`roles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_g53`.`permisos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_g53`.`permisos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `descripcion` VARCHAR(100) NULL,
  `estado` BIT(1) NULL,
  `ruta` VARCHAR(100) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_g53`.`permisos_roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_g53`.`permisos_roles` (
  `idpermiso_rol` INT NOT NULL,
  `permiso_id` INT NOT NULL,
  `rol_id` INT NOT NULL,
  PRIMARY KEY (`idpermiso_rol`),
  CONSTRAINT `fk_permisos_roles_permisos1`
    FOREIGN KEY (`permiso_id`)
    REFERENCES `bd_g53`.`permisos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_permisos_roles_roles1`
    FOREIGN KEY (`rol_id`)
    REFERENCES `bd_g53`.`roles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_g53`.`departamentos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_g53`.`departamentos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(45) NULL,
  `nombre` VARCHAR(100) NULL,
  `estado` BIT(1) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_g53`.`ciudades`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_g53`.`ciudades` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(45) NULL,
  `nombre` VARCHAR(100) NULL,
  `estado` BIT(1) NULL,
  `departamento_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_ciudades_departamentos1`
    FOREIGN KEY (`departamento_id`)
    REFERENCES `bd_g53`.`departamentos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_g53`.`tipos_inmuebles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_g53`.`tipos_inmuebles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(45) NULL,
  `nombre` VARCHAR(100) NULL,
  `estado` BIT(1) NULL,
  `descripcion` VARCHAR(100) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_g53`.`costes_administraciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_g53`.`costes_administraciones` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(45) NULL,
  `nombre` VARCHAR(100) NULL,
  `estado` BIT(1) NULL,
  `valor_mes` DOUBLE NULL,
  `tipo_inmueble_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_costes_administraciones_tipos_inmuebles1`
    FOREIGN KEY (`tipo_inmueble_id`)
    REFERENCES `bd_g53`.`tipos_inmuebles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_g53`.`datos_conjuntos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_g53`.`datos_conjuntos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(45) NULL,
  `nombre` VARCHAR(12) NULL,
  `direccion` VARCHAR(45) NULL,
  `telefono` VARCHAR(20) NULL,
  `correo` VARCHAR(45) NULL,
  `estado` BIT(1) NULL,
  `ciudad_id` INT NOT NULL,
  `usuario_administrador_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_datos_conjuntos_ciudades1`
    FOREIGN KEY (`ciudad_id`)
    REFERENCES `bd_g53`.`ciudades` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_datos_conjuntos_usuarios1`
    FOREIGN KEY (`usuario_administrador_id`)
    REFERENCES `bd_g53`.`usuarios` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_g53`.`inmuebles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_g53`.`inmuebles` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `matricula_inmobiliaria` VARCHAR(100) NULL,
  `estado` BIT(1) NULL,
  `usuario_duenio_id` INT NOT NULL,
  `ciudad_id` INT NOT NULL,
  `tipo_inmueble_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_inmuebles_usuarios1`
    FOREIGN KEY (`usuario_duenio_id`)
    REFERENCES `bd_g53`.`usuarios` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_inmuebles_ciudades1`
    FOREIGN KEY (`ciudad_id`)
    REFERENCES `bd_g53`.`ciudades` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_inmuebles_tipos_inmubles1`
    FOREIGN KEY (`tipo_inmueble_id`)
    REFERENCES `bd_g53`.`tipos_inmuebles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_g53`.`bitacoras`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_g53`.`bitacoras` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(45) NULL,
  `descripcion` VARCHAR(100) NULL,
  `estado` BIT(1) NULL,
  `inmueble_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_bitacoras_inmuebles1`
    FOREIGN KEY (`inmueble_id`)
    REFERENCES `bd_g53`.`inmuebles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_g53`.`registros_servicios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_g53`.`registros_servicios` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(100) NULL,
  `nombre` VARCHAR(45) NULL,
  `descripcion` VARCHAR(100) NULL,
  `valor` DOUBLE NULL,
  `estado` BIT(1) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_g53`.`bitacoras_facturas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_g53`.`bitacoras_facturas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `referencia_pago` VARCHAR(45) NULL,
  `estado_factura` VARCHAR(45) NULL,
  `fecha_pago` DATE NULL,
  `refencia_codigo_banco` DOUBLE NULL,
  `estado` BIT(1) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_g53`.`registros_facturas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_g53`.`registros_facturas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `referencia_pago` VARCHAR(100) NULL,
  `valor_total` DOUBLE NULL,
  `mes` VARCHAR(45) NULL,
  `estado` BIT(1) NULL,
  `coste_administracion_id` INT NOT NULL,
  `inmueble_id` INT NOT NULL,
  `bitacora_factura_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_registro_facturas_coste_adminstracion1`
    FOREIGN KEY (`coste_administracion_id`)
    REFERENCES `bd_g53`.`costes_administraciones` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_registros_facturas_inmuebles1`
    FOREIGN KEY (`inmueble_id`)
    REFERENCES `bd_g53`.`inmuebles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_registros_facturas_bitacoras_facturas1`
    FOREIGN KEY (`bitacora_factura_id`)
    REFERENCES `bd_g53`.`bitacoras_facturas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_g53`.`notificaciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_g53`.`notificaciones` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(45) NULL,
  `contenido` VARCHAR(100) NULL,
  `fecha_inicio` DATE NULL,
  `fecha_finalizacion` DATE NULL,
  `estado` BIT(1) NULL,
  `usuario_administrador_id` INT NOT NULL,
  PRIMARY KEY (`id`),
   CONSTRAINT `fk_notificaciones_usuarios1`
    FOREIGN KEY (`usuario_administrador_id`)
    REFERENCES `bd_g53`.`usuarios` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_g53`.`Registros_facturas_registros_servicios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bd_g53`.`Registros_facturas_registros_servicios` (
  `idRegistro_factura_registro_servicio` INT NOT NULL,
  `registro_servicio_id` INT NOT NULL,
  `registro_factura_id` INT NOT NULL,
  PRIMARY KEY (`idRegistro_factura_registro_servicio`),
  CONSTRAINT `fk_Registros_facturas_registros_servicios_registros_servicios1`
    FOREIGN KEY (`registro_servicio_id`)
    REFERENCES `bd_g53`.`registros_servicios` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Registros_facturas_registros_servicios_registros_facturas1`
    FOREIGN KEY (`registro_factura_id`)
    REFERENCES `bd_g53`.`registros_facturas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
