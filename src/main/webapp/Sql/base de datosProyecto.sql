/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Cesar
 * Created: 19/08/2019
 */
CREATE TABLE ROL (idRol numeric(19, 0) NOT NULL, descripcionRol varchar(30) NOT NULL, PRIMARY KEY (idRol));
CREATE TABLE USUARIO (idUsuario numeric(19, 0) NOT NULL, nomUsuario varchar(45), rolUsuario numeric(19, 0) NOT NULL, pasword varchar(30) NOT NULL, PRIMARY KEY (idUsuario));
COMMENT ON COLUMN USUARIO.idUsuario IS 'Id usuario';
COMMENT ON COLUMN USUARIO.nomUsuario IS 'nombre del usuario';
COMMENT ON COLUMN USUARIO.rolUsuario IS 'id del rol que tiene el usuario';
ALTER TABLE USUARIO ADD CONSTRAINT FKUSUARIO330298 FOREIGN KEY (rolUsuario) REFERENCES ROL (idRol);

