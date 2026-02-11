
PN = "mdadm"
PE = "0"
PV = "4.3"
PR = "5.el10"
PACKAGES = "mdadm"


URI_mdadm = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/mdadm-4.3-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mdadm = "/bin/sh ( ) coreutils ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/sh ( ) /usr/bin/bash ( ) libudev.so.1()(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( )"
RPROVIDES:mdadm = "config(mdadm) ( =  4.3-5.el10) mdadm ( =  4.3-5.el10) mdadm(x86-64) ( =  4.3-5.el10)"
