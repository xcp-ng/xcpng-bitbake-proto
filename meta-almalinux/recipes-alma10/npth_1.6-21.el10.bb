
PN = "npth"
PE = "0"
PV = "1.6"
PR = "21.el10"
PACKAGES = "npth npth-devel"


URI_npth = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/npth-1.6-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:npth = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:npth = "libnpth.so.0()(64bit) ( ) libnpth.so.0(NPTH_1.0)(64bit) ( ) npth ( =  1.6-21.el10) npth(x86-64) ( =  1.6-21.el10)"

URI_npth-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/npth-devel-1.6-21.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:npth-devel = "/usr/bin/sh ( ) libnpth.so.0()(64bit) ( ) npth(x86-64) ( =  1.6-21.el10)"
RPROVIDES:npth-devel = "npth-devel ( =  1.6-21.el10) npth-devel(x86-64) ( =  1.6-21.el10)"
