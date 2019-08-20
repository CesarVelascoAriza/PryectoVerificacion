
/**
 * Author:  Cesar
 * Created: 19/08/2019
 */
CREATE TABLE prueba.ROL (
IdRol numeric(19, 0) PRIMARY KEY,
 DescripcionRol varchar(30) NOT NULL,
 UsuarioAdicionado varchar(30) NOT NULL,
 FechaAdicionado date NOT NULL );

CREATE TABLE prueba.USUARIO (IdUsuario INT IDENTITY (1,1) PRIMARY KEY, DocumentoUsu varchar(45) NOT NULL,NomUsuario varchar(40) NOT NULL, ApeUsuario varchar(40) NOT NULL, IdrolUsu numeric(19, 0) NOT NULL, LoginUsu varchar(40) NOT NULL, ContrasenaUsu varchar(30) NOT NULL,UsuarioAdicionado varchar(30) NOT NULL, 
					  FechaAdicionado Datetime NOT NULL);




