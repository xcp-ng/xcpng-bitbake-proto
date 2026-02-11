
PN = "munge"
PE = "0"
PV = "0.5.15"
PR = "10.el10"
PACKAGES = "munge munge-libs munge-devel"


URI_munge = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/munge-0.5.15-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:munge = "/bin/sh ( ) systemd ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libz.so.1()(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libbz2.so.1()(64bit) ( ) logrotate ( ) libmunge.so.2()(64bit) ( ) munge-libs ( =  0.5.15-10.el10)"
RPROVIDES:munge = "group(munge) ( ) config(munge) ( =  0.5.15-10.el10) munge ( =  0.5.15-10.el10) munge(x86-64) ( =  0.5.15-10.el10) user(munge) ( =  dSBtdW5nZSAtICJSdW5zIFVpZCAnTicgR2lkIEVtcG9yaXVtIiAvcnVuL211bmdlIC9zYmluL25vbG9naW4A)"

URI_munge-libs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/munge-libs-0.5.15-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:munge-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:munge-libs = "libmunge.so.2()(64bit) ( ) munge-libs ( =  0.5.15-10.el10) munge-libs(x86-64) ( =  0.5.15-10.el10)"

URI_munge-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/munge-devel-0.5.15-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:munge-devel = "/usr/bin/pkg-config ( ) libmunge.so.2()(64bit) ( ) munge-libs(x86-64) ( =  0.5.15-10.el10)"
RPROVIDES:munge-devel = "munge-devel ( =  0.5.15-10.el10) munge-devel(x86-64) ( =  0.5.15-10.el10) pkgconfig(munge) ( =  0.5.15)"
