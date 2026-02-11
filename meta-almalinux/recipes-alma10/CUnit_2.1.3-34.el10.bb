
PN = "CUnit"
PE = "0"
PV = "2.1.3"
PR = "34.el10"
PACKAGES = "CUnit CUnit-devel"


URI_CUnit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/CUnit-2.1.3-34.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:CUnit = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.11)(64bit) ( )"
RPROVIDES:CUnit = "libcunit.so.1()(64bit) ( ) CUnit ( =  2.1.3-34.el10) CUnit(x86-64) ( =  2.1.3-34.el10) cunit ( =  2.1.3-34.el10)"

URI_CUnit-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/CUnit-devel-2.1.3-34.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:CUnit-devel = "/usr/bin/pkg-config ( ) libcunit.so.1()(64bit) ( ) CUnit(x86-64) ( =  2.1.3-34.el10)"
RPROVIDES:CUnit-devel = "CUnit-devel ( =  2.1.3-34.el10) CUnit-devel(x86-64) ( =  2.1.3-34.el10) cunit-devel ( =  2.1.3-34.el10) pkgconfig(cunit) ( =  2.1-3)"
