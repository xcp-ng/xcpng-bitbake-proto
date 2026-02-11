
PN = "fcoe-utils"
PE = "0"
PV = "1.0.34"
PR = "11.gitb233050.el10"
PACKAGES = "fcoe-utils"


URI_fcoe-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/fcoe-utils-1.0.34-11.gitb233050.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fcoe-utils = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) /usr/bin/bash ( ) iproute ( ) device-mapper-multipath ( ) libpciaccess.so.0()(64bit) ( ) lldpad ( >=  0.9.43)"
RPROVIDES:fcoe-utils = "config(fcoe-utils) ( =  1.0.34-11.gitb233050.el10) fcoe-utils ( =  1.0.34-11.gitb233050.el10) fcoe-utils(x86-64) ( =  1.0.34-11.gitb233050.el10)"
