
PN = "a52dec"
PE = "0"
PV = "0.7.4"
PR = "50.el10"
PACKAGES = "a52dec liba52 liba52-devel"


URI_a52dec = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/a52dec-0.7.4-50.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:a52dec = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) liba52.so.0()(64bit) ( ) liba52(x86-64) ( =  0.7.4-50.el10)"
RPROVIDES:a52dec = "a52dec ( =  0.7.4-50.el10) a52dec(x86-64) ( =  0.7.4-50.el10)"

URI_liba52 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/liba52-0.7.4-50.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liba52 = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libc.so.6(GLIBC_2.4)(64bit) ( )"
RPROVIDES:liba52 = "liba52.so.0()(64bit) ( ) liba52(x86-64) ( =  0.7.4-50.el10) a52dec-libs ( =  0.7.4-50.el10) liba52 ( =  0.7.4-50.el10)"

URI_liba52-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/liba52-devel-0.7.4-50.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:liba52-devel = "liba52.so.0()(64bit) ( ) liba52(x86-64) ( =  0.7.4-50.el10)"
RPROVIDES:liba52-devel = "a52dec-devel ( =  0.7.4-50.el10) liba52-devel ( =  0.7.4-50.el10) liba52-devel(x86-64) ( =  0.7.4-50.el10)"
