
PN = "attr"
PE = "0"
PV = "2.5.2"
PR = "5.el10"
PACKAGES = "attr libattr libattr-devel"


URI_attr = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/attr-2.5.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:attr = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libattr.so.1()(64bit) ( ) libattr.so.1(ATTR_1.0)(64bit) ( ) libattr.so.1(ATTR_1.2)(64bit) ( ) libattr(x86-64) ( =  2.5.2-5.el10)"
RPROVIDES:attr = "attr ( =  2.5.2-5.el10) attr(x86-64) ( =  2.5.2-5.el10)"

URI_libattr = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libattr-2.5.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libattr = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( )"
RPROVIDES:libattr = "libattr.so.1()(64bit) ( ) libattr.so.1(ATTR_1.1)(64bit) ( ) libattr.so.1(ATTR_1.3)(64bit) ( ) libattr.so.1(ATTR_1.0)(64bit) ( ) libattr.so.1(ATTR_1.2)(64bit) ( ) libattr(x86-64) ( =  2.5.2-5.el10) config(libattr) ( =  2.5.2-5.el10) libattr ( =  2.5.2-5.el10)"

URI_libattr-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libattr-devel-2.5.2-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libattr-devel = "/usr/bin/pkg-config ( ) glibc-headers ( ) libattr.so.1()(64bit) ( ) libattr(x86-64) ( =  2.5.2-5.el10)"
RPROVIDES:libattr-devel = "libattr-devel ( =  2.5.2-5.el10) libattr-devel(x86-64) ( =  2.5.2-5.el10) pkgconfig(libattr) ( =  2.5.2)"
