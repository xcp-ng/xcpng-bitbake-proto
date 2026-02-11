
PN = "patchutils"
PE = "0"
PV = "0.4.2"
PR = "15.el10"
PACKAGES = "patchutils"


URI_patchutils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/patchutils-0.4.2-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:patchutils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) /usr/bin/python3 ( ) /usr/bin/bash ( ) /usr/bin/perl ( ) perl(Getopt::Std) ( ) patch ( )"
RPROVIDES:patchutils = "interdiff ( =  0.0.11) patchutils ( =  0.4.2-15.el10) patchutils(x86-64) ( =  0.4.2-15.el10)"
