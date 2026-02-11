
PN = "frr"
PE = "0"
PV = "10.1"
PR = "10.el10"
PACKAGES = "frr frr-selinux"


URI_frr = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/frr-10.1-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:frr = "/bin/sh ( ) systemd ( ) shadow-utils ( ) hostname ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/sh ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) /usr/bin/python3 ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) /usr/bin/bash ( ) libcrypt.so.2()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) libreadline.so.8()(64bit) ( ) libjson-c.so.5()(64bit) ( ) libjson-c.so.5(JSONC_0.14)(64bit) ( ) libprotobuf-c.so.1()(64bit) ( ) librpm.so.10()(64bit) ( ) librpmio.so.10()(64bit) ( ) libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit) ( ) libnetsnmp.so.40()(64bit) ( ) libcap.so.2()(64bit) ( ) net-snmp ( ) libnetsnmpagent.so.40()(64bit) ( ) ncurses ( ) libnetsnmpmibs.so.40()(64bit) ( ) libcares.so.2()(64bit) ( ) libyang.so.2()(64bit) ( ) frr-selinux ( if  selinux-policy-targeted)"
RPROVIDES:frr = "group(frr) ( ) libfrr.so.0()(64bit) ( ) libfrr_pb.so.0()(64bit) ( ) libfrrcares.so.0()(64bit) ( ) libfrrfpm_pb.so.0()(64bit) ( ) libfrrsnmp.so.0()(64bit) ( ) libmgmt_be_nb.so.0()(64bit) ( ) config(frr) ( =  10.1-10.el10) frr ( =  10.1-10.el10) frr(x86-64) ( =  10.1-10.el10) group(frrvty) ( =  ZyBmcnJ2dHkgLQAA) routingdaemon ( =  10.1-10.el10) user(frr) ( =  dSBmcnIgLSAiRlJSb3V0aW5nIHJvdXRpbmcgc3VpdGUiIC92YXIvcnVuL2ZyciAvc2Jpbi9ub2xvZ2lu)"

URI_frr-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/frr-selinux-10.1-10.el10.noarch.rpm;unpack=0"
RDEPENDS:frr-selinux = "/bin/sh ( ) selinux-policy-targeted ( ) policycoreutils ( ) policycoreutils-python-utils ( ) libselinux-utils ( ) selinux-policy-base ( >=  40.13.25) selinux-policy ( >=  40.13.25)"
RPROVIDES:frr-selinux = "frr-selinux ( =  10.1-10.el10)"
