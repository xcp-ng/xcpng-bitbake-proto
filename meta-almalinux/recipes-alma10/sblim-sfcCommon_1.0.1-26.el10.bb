
PN = "sblim-sfcCommon"
PE = "0"
PV = "1.0.1"
PR = "26.el10"
PACKAGES = "sblim-sfcCommon sblim-sfcCommon-devel"


URI_sblim-sfcCommon = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sblim-sfcCommon-1.0.1-26.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sblim-sfcCommon = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.14)(64bit) ( )"
RPROVIDES:sblim-sfcCommon = "libsfcUtil.so.0()(64bit) ( ) libsfcUtil.so.0(SFCUTIL_1.0)(64bit) ( ) libsfcUtil.so.0(SFCUTIL_1.1)(64bit) ( ) sblim-sfcCommon ( =  1.0.1-26.el10) sblim-sfcCommon(x86-64) ( =  1.0.1-26.el10)"

URI_sblim-sfcCommon-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sblim-sfcCommon-devel-1.0.1-26.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sblim-sfcCommon-devel = "libsfcUtil.so.0()(64bit) ( ) sblim-sfcCommon(x86-64) ( =  1.0.1-26.el10)"
RPROVIDES:sblim-sfcCommon-devel = "sblim-sfcCommon-devel ( =  1.0.1-26.el10) sblim-sfcCommon-devel(x86-64) ( =  1.0.1-26.el10)"
