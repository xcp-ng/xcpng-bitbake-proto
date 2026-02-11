
PN = "logrotate"
PE = "0"
PV = "3.22.0"
PR = "4.el10"
PACKAGES = "logrotate"


URI_logrotate = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/logrotate-3.22.0-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:logrotate = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) coreutils ( ) libselinux.so.1()(64bit) ( ) libpopt.so.0()(64bit) ( ) libselinux.so.1(LIBSELINUX_1.0)(64bit) ( ) libpopt.so.0(LIBPOPT_0)(64bit) ( ) libacl.so.1()(64bit) ( ) libacl.so.1(ACL_1.0)(64bit) ( )"
RPROVIDES:logrotate = "config(logrotate) ( =  3.22.0-4.el10) logrotate ( =  3.22.0-4.el10) logrotate(x86-64) ( =  3.22.0-4.el10)"
