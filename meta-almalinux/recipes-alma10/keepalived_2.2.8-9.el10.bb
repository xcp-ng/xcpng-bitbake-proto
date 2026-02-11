
PN = "keepalived"
PE = "0"
PV = "2.2.8"
PR = "9.el10"
PACKAGES = "keepalived"


URI_keepalived = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/keepalived-2.2.8-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:keepalived = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libsystemd.so.0()(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libnetsnmp.so.40()(64bit) ( ) libnl-3.so.200()(64bit) ( ) libnl-3.so.200(libnl_3)(64bit) ( ) libnl-genl-3.so.200()(64bit) ( ) libnl-genl-3.so.200(libnl_3)(64bit) ( ) libnetsnmpagent.so.40()(64bit) ( ) libmagic.so.1()(64bit) ( ) libmnl.so.0()(64bit) ( ) libmnl.so.0(LIBMNL_1.0)(64bit) ( ) libnetsnmpmibs.so.40()(64bit) ( ) libnftnl.so.11()(64bit) ( ) libnftnl.so.11(LIBNFTNL_11)(64bit) ( ) libnl-3.so.200(libnl_3_2_27)(64bit) ( ) libsystemd.so.0(LIBSYSTEMD_214)(64bit) ( )"
RPROVIDES:keepalived = "config(keepalived) ( =  2.2.8-9.el10) keepalived ( =  2.2.8-9.el10) keepalived(x86-64) ( =  2.2.8-9.el10)"
