
PN = "mksh"
PE = "0"
PV = "59c"
PR = "12.el10"
PACKAGES = "mksh"


URI_mksh = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mksh-59c-12.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mksh = "/bin/sh ( ) grep ( ) /usr/sbin/alternatives ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) sed ( )"
RPROVIDES:mksh = "/bin/ksh ( ) /bin/lksh ( ) /bin/mksh ( ) /bin/rksh ( ) /bin/rlksh ( ) /bin/rmksh ( ) config(mksh) ( =  59c-12.el10) mksh ( =  59c-12.el10) mksh(x86-64) ( =  59c-12.el10)"
