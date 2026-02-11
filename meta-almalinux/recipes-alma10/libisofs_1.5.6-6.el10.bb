
PN = "libisofs"
PE = "0"
PV = "1.5.6"
PR = "6.el10"
PACKAGES = "libisofs libisofs-doc libisofs-devel"


URI_libisofs = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libisofs-1.5.6-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libisofs = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libz.so.1()(64bit) ( ) libz.so.1(ZLIB_1.2.0)(64bit) ( ) libacl.so.1()(64bit) ( ) libacl.so.1(ACL_1.0)(64bit) ( )"
RPROVIDES:libisofs = "libisofs.so.6()(64bit) ( ) libisofs.so.6(LIBISOFS6)(64bit) ( ) libisofs ( =  1.5.6-6.el10) libisofs(x86-64) ( =  1.5.6-6.el10)"

URI_libisofs-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libisofs-doc-1.5.6-6.el10.noarch.rpm;unpack=0"
RDEPENDS:libisofs-doc = ""
RPROVIDES:libisofs-doc = "libisofs-doc ( =  1.5.6-6.el10)"

URI_libisofs-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libisofs-devel-1.5.6-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libisofs-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libisofs.so.6()(64bit) ( ) libisofs(x86-64) ( =  1.5.6-6.el10)"
RPROVIDES:libisofs-devel = "libisofs-devel ( =  1.5.6-6.el10) libisofs-devel(x86-64) ( =  1.5.6-6.el10) pkgconfig(libisofs-1) ( =  1.5.6)"
