
PN = "ppp"
PE = "0"
PV = "2.5.0"
PR = "13.el10"
PACKAGES = "ppp ppp-devel"


URI_ppp = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ppp-2.5.0-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ppp = "/bin/sh ( ) /usr/bin/getent ( ) /usr/sbin/groupadd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypto.so.3()(64bit) ( ) /usr/bin/sh ( ) systemd ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libglib-2.0.so.0()(64bit) ( ) libsystemd.so.0()(64bit) ( ) /usr/bin/bash ( ) libsystemd.so.0(LIBSYSTEMD_209)(64bit) ( ) libpam.so.0()(64bit) ( ) libpam.so.0(LIBPAM_1.0)(64bit) ( ) libssl.so.3()(64bit) ( ) libssl.so.3(OPENSSL_3.0.0)(64bit) ( ) libresolv.so.2()(64bit) ( ) libcrypt.so.2()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) /etc/pam.d/system-auth ( ) libpcap.so.1()(64bit) ( ) glibc ( >=  2.0.6) libpcap ( >=  14:0.8.3-6)"
RPROVIDES:ppp = "bundled(linux-atm) ( =  2.4.1) config(ppp) ( =  2.5.0-13.el10) ppp ( =  2.5.0-13.el10) ppp(x86-64) ( =  2.5.0-13.el10)"

URI_ppp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ppp-devel-2.5.0-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ppp-devel = "/usr/bin/pkg-config ( ) pkgconf-pkg-config ( ) ppp(x86-64) ( =  2.5.0-13.el10)"
RPROVIDES:ppp-devel = "pkgconfig(pppd) ( =  2.5.0) ppp-devel ( =  2.5.0-13.el10) ppp-devel(x86-64) ( =  2.5.0-13.el10)"
