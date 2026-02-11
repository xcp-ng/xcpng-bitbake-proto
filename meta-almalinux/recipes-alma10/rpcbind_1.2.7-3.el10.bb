
PN = "rpcbind"
PE = "0"
PV = "1.2.7"
PR = "3.el10"
PACKAGES = "rpcbind"


URI_rpcbind = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/rpcbind-1.2.7-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rpcbind = "/bin/sh ( ) coreutils ( ) systemd ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) glibc-common ( ) libtirpc.so.3()(64bit) ( ) libtirpc.so.3(TIRPC_0.3.0)(64bit) ( ) setup ( ) libtirpc.so.3(TIRPC_PRIVATE)(64bit) ( ) libtirpc.so.3(TIRPC_0.3.3)(64bit) ( )"
RPROVIDES:rpcbind = "config(rpcbind) ( =  1.2.7-3.el10) portmap ( =  1.2.7-3.el10) rpcbind ( =  1.2.7-3.el10) rpcbind(x86-64) ( =  1.2.7-3.el10)"
