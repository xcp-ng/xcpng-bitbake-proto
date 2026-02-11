
PN = "sysstat"
PE = "0"
PV = "12.7.6"
PR = "2.el10"
PACKAGES = "sysstat"


URI_sysstat = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sysstat-12.7.6-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sysstat = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libpcp.so.3()(64bit) ( ) libpcp.so.3(PCP_3.22)(64bit) ( ) findutils ( ) xz ( ) libpcp_import.so.1()(64bit) ( ) libpcp_import.so.1(PCP_IMPORT_1.0)(64bit) ( ) libsensors.so.4()(64bit) ( )"
RPROVIDES:sysstat = "config(sysstat) ( =  12.7.6-2.el10) sysstat ( =  12.7.6-2.el10) sysstat(x86-64) ( =  12.7.6-2.el10)"
