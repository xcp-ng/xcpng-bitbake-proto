
PN = "vsftpd"
PE = "0"
PV = "3.0.5"
PR = "9.el10"
PACKAGES = "vsftpd"


URI_vsftpd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/vsftpd-3.0.5-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:vsftpd = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) /usr/bin/bash ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) libcap.so.2()(64bit) ( ) logrotate ( )"
RPROVIDES:vsftpd = "config(vsftpd) ( =  3.0.5-9.el10) vsftpd ( =  3.0.5-9.el10) vsftpd(x86-64) ( =  3.0.5-9.el10)"
