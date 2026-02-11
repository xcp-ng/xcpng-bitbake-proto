
PN = "chrony"
PE = "0"
PV = "4.6.1"
PR = "1.el10"
PACKAGES = "chrony"


URI_chrony = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/chrony-4.6.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:chrony = "/bin/sh ( ) systemd ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) /usr/bin/sh ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) /usr/bin/bash ( ) libcap.so.2()(64bit) ( ) libgnutls.so.30()(64bit) ( ) libgnutls.so.30(GNUTLS_3_4)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_3)(64bit) ( ) tzdata ( ) libedit.so.0()(64bit) ( ) libseccomp.so.2()(64bit) ( ) libgnutls.so.30(GNUTLS_3_6_12)(64bit) ( ) libgnutls.so.30(GNUTLS_3_7_5)(64bit) ( )"
RPROVIDES:chrony = "group(chrony) ( ) chrony ( =  4.6.1-1.el10) chrony(x86-64) ( =  4.6.1-1.el10) config(chrony) ( =  4.6.1-1.el10) user(chrony) ( =  dSBjaHJvbnkgLSAiY2hyb255IHN5c3RlbSB1c2VyIiAvdmFyL2xpYi9jaHJvbnkgL3NiaW4vbm9sb2dpbgAA)"
