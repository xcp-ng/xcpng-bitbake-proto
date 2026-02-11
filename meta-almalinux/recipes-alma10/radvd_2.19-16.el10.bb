
PN = "radvd"
PE = "0"
PV = "2.19"
PR = "16.el10"
PACKAGES = "radvd"


URI_radvd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/radvd-2.19-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:radvd = "/bin/sh ( ) systemd ( ) shadow-utils ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( )"
RPROVIDES:radvd = "group(radvd) ( ) config(radvd) ( =  2.19-16.el10) group(radvd) ( =  ZyByYWR2ZCA3NQAA) radvd ( =  2.19-16.el10) radvd(x86-64) ( =  2.19-16.el10) user(radvd) ( =  dSByYWR2ZCA3NSAicmFkdmQgdXNlciIgLyAvc2Jpbi9ub2xvZ2lu)"
