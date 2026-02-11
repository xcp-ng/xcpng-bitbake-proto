
PN = "linuxptp"
PE = "0"
PV = "4.4"
PR = "2.el10"
PACKAGES = "linuxptp linuxptp-selinux"


URI_linuxptp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/linuxptp-4.4-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:linuxptp = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_12)(64bit) ( ) linuxptp-selinux ( if  selinux-policy-targeted)"
RPROVIDES:linuxptp = "config(linuxptp) ( =  4.4-2.el10) linuxptp ( =  4.4-2.el10) linuxptp(x86-64) ( =  4.4-2.el10)"

URI_linuxptp-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/linuxptp-selinux-4.4-2.el10.noarch.rpm;unpack=0"
RDEPENDS:linuxptp-selinux = "/bin/sh ( ) selinux-policy-targeted ( ) policycoreutils ( ) policycoreutils-python-utils ( ) libselinux-utils ( ) selinux-policy-base ( >=  40.13.25) selinux-policy ( >=  40.13.25)"
RPROVIDES:linuxptp-selinux = "linuxptp-selinux ( =  4.4-2.el10)"
