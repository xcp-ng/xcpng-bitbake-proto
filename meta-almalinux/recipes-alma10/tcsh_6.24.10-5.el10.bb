
PN = "tcsh"
PE = "0"
PV = "6.24.10"
PR = "5.el10"
PACKAGES = "tcsh"


URI_tcsh = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/tcsh-6.24.10-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:tcsh = "/bin/sh ( ) coreutils ( ) grep ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libcrypt.so.2()(64bit) ( ) libtinfo.so.6()(64bit) ( ) libcrypt.so.2(XCRYPT_2.0)(64bit) ( ) sed ( )"
RPROVIDES:tcsh = "/bin/csh ( ) /bin/tcsh ( ) csh ( =  6.24.10) tcsh ( =  6.24.10-5.el10) tcsh(x86-64) ( =  6.24.10-5.el10)"
