
PN = "flex"
PE = "0"
PV = "2.6.4"
PR = "19.el10"
PACKAGES = "flex libfl-static libfl-devel libfl2"


URI_flex = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/flex-2.6.4-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:flex = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) m4 ( )"
RPROVIDES:flex = "flex ( =  2.6.4-19.el10) flex(x86-64) ( =  2.6.4-19.el10) flex-doc ( =  2.6.4-19.el10)"

URI_libfl-static = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libfl-static-2.6.4-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfl-static = ""
RPROVIDES:libfl-static = "flex-devel ( =  2.6.4-19.el10) flex-static ( =  2.6.4-19.el10) libfl-static ( =  2.6.4-19.el10) libfl-static(x86-64) ( =  2.6.4-19.el10)"

URI_libfl-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libfl-devel-2.6.4-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfl-devel = "libfl.so.2()(64bit) ( ) libfl2 ( =  2.6.4-19.el10)"
RPROVIDES:libfl-devel = "libfl-devel ( =  2.6.4-19.el10) libfl-devel(x86-64) ( =  2.6.4-19.el10)"

URI_libfl2 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libfl2-2.6.4-19.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libfl2 = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.2.5)(64bit) ( )"
RPROVIDES:libfl2 = "libfl.so.2()(64bit) ( ) libfl2 ( =  2.6.4-19.el10) libfl2(x86-64) ( =  2.6.4-19.el10)"
