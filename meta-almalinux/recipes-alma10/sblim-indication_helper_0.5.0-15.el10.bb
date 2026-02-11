
PN = "sblim-indication_helper"
PE = "0"
PV = "0.5.0"
PR = "15.el10"
PACKAGES = "sblim-indication_helper sblim-indication_helper-devel"


URI_sblim-indication_helper = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/sblim-indication_helper-0.5.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sblim-indication_helper = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:sblim-indication_helper = "libind_helper.so.0()(64bit) ( ) sblim-indication_helper ( =  0.5.0-15.el10) sblim-indication_helper(x86-64) ( =  0.5.0-15.el10)"

URI_sblim-indication_helper-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sblim-indication_helper-devel-0.5.0-15.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sblim-indication_helper-devel = "glibc-devel ( ) libind_helper.so.0()(64bit) ( ) sblim-cmpi-devel ( ) sblim-indication_helper ( =  0.5.0-15.el10)"
RPROVIDES:sblim-indication_helper-devel = "sblim-indication_helper-devel ( =  0.5.0-15.el10) sblim-indication_helper-devel(x86-64) ( =  0.5.0-15.el10)"
