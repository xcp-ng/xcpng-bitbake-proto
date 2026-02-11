
PN = "acl"
PE = "0"
PV = "2.3.2"
PR = "4.el10"
PACKAGES = "acl libacl libacl-devel"


URI_acl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/acl-2.3.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:acl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libacl.so.1()(64bit) ( ) libacl.so.1(ACL_1.0)(64bit) ( ) libacl(x86-64) ( =  2.3.2-4.el10)"
RPROVIDES:acl = "acl ( =  2.3.2-4.el10) acl(x86-64) ( =  2.3.2-4.el10)"

URI_libacl = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libacl-2.3.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libacl = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libattr.so.1()(64bit) ( )"
RPROVIDES:libacl = "libacl.so.1()(64bit) ( ) libacl.so.1(ACL_1.0)(64bit) ( ) libacl.so.1(ACL_1.1)(64bit) ( ) libacl.so.1(ACL_1.2)(64bit) ( ) libacl(x86-64) ( =  2.3.2-4.el10) libacl ( =  2.3.2-4.el10)"

URI_libacl-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libacl-devel-2.3.2-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libacl-devel = "/usr/bin/pkg-config ( ) libacl.so.1()(64bit) ( ) libattr-devel ( ) libacl(x86-64) ( =  2.3.2-4.el10)"
RPROVIDES:libacl-devel = "libacl-devel ( =  2.3.2-4.el10) libacl-devel(x86-64) ( =  2.3.2-4.el10) pkgconfig(libacl) ( =  2.3.2)"
