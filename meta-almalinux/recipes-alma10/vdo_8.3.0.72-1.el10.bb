
PN = "vdo"
PE = "0"
PV = "8.3.0.72"
PR = "1.el10"
PACKAGES = "vdo vdo-support"


URI_vdo = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/vdo-8.3.0.72-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:vdo = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libz.so.1()(64bit) ( ) libuuid.so.1()(64bit) ( ) libuuid.so.1(UUID_1.0)(64bit) ( ) libblkid.so.1()(64bit) ( ) libblkid.so.1(BLKID_2.15)(64bit) ( ) libblkid.so.1(BLKID_2.17)(64bit) ( )"
RPROVIDES:vdo = "vdo ( =  8.3.0.72-1.el10) vdo(x86-64) ( =  8.3.0.72-1.el10)"

URI_vdo-support = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/vdo-support-8.3.0.72-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:vdo-support = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libz.so.1()(64bit) ( ) /usr/bin/bash ( ) libuuid ( >=  2.23)"
RPROVIDES:vdo-support = "vdo-support ( =  8.3.0.72-1.el10) vdo-support(x86-64) ( =  8.3.0.72-1.el10)"
