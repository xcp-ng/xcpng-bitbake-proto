
PN = "sg3_utils"
PE = "0"
PV = "1.48"
PR = "7.el10"
PACKAGES = "sg3_utils sg3_utils-libs sg3_utils-devel"


URI_sg3_utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sg3_utils-1.48-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sg3_utils = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) /usr/bin/bash ( ) libsgutils2-1.48.so.2()(64bit) ( ) sg3_utils-libs(x86-64) ( =  1.48-7.el10)"
RPROVIDES:sg3_utils = "sg3_utils ( =  1.48-7.el10) sg3_utils(x86-64) ( =  1.48-7.el10)"

URI_sg3_utils-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/sg3_utils-libs-1.48-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sg3_utils-libs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.33)(64bit) ( )"
RPROVIDES:sg3_utils-libs = "libsgutils2-1.48.so.2()(64bit) ( ) sg3_utils-libs(x86-64) ( =  1.48-7.el10) sg3_utils-libs ( =  1.48-7.el10)"

URI_sg3_utils-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sg3_utils-devel-1.48-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sg3_utils-devel = "libsgutils2-1.48.so.2()(64bit) ( ) sg3_utils-libs(x86-64) ( =  1.48-7.el10)"
RPROVIDES:sg3_utils-devel = "sg3_utils-devel ( =  1.48-7.el10) sg3_utils-devel(x86-64) ( =  1.48-7.el10)"
