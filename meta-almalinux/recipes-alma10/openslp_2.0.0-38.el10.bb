
PN = "openslp"
PE = "0"
PV = "2.0.0"
PR = "38.el10"
PACKAGES = "openslp openslp-devel openslp-server"


URI_openslp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openslp-2.0.0-38.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openslp = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libresolv.so.2()(64bit) ( )"
RPROVIDES:openslp = "libslp.so.1()(64bit) ( ) config(openslp) ( =  2.0.0-38.el10) openslp ( =  2.0.0-38.el10) openslp(x86-64) ( =  2.0.0-38.el10)"

URI_openslp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openslp-devel-2.0.0-38.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openslp-devel = "libslp.so.1()(64bit) ( ) openslp(x86-64) ( =  2.0.0-38.el10)"
RPROVIDES:openslp-devel = "openslp-devel ( =  2.0.0-38.el10) openslp-devel(x86-64) ( =  2.0.0-38.el10)"

URI_openslp-server = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/openslp-server-2.0.0-38.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:openslp-server = "/bin/sh ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/bash ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) iproute ( ) libresolv.so.2()(64bit) ( ) openslp(x86-64) ( =  2.0.0-38.el10)"
RPROVIDES:openslp-server = "config(openslp-server) ( =  2.0.0-38.el10) openslp-server ( =  2.0.0-38.el10) openslp-server(x86-64) ( =  2.0.0-38.el10)"
