
PN = "smc-tools"
PE = "0"
PV = "1.8.4"
PR = "1.el10"
PACKAGES = "smc-tools"


URI_smc-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/smc-tools-1.8.4-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:smc-tools = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) /usr/bin/bash ( ) libnl-3.so.200()(64bit) ( ) libnl-3.so.200(libnl_3)(64bit) ( ) libnl-genl-3.so.200()(64bit) ( ) libnl-genl-3.so.200(libnl_3)(64bit) ( )"
RPROVIDES:smc-tools = "libsmc-preload.so.1()(64bit) ( ) smc-tools ( =  1.8.4-1.el10) smc-tools(x86-64) ( =  1.8.4-1.el10)"
