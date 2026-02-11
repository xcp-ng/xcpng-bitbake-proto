
PN = "libisoburn"
PE = "0"
PV = "1.5.6"
PR = "6.el10"
PACKAGES = "libisoburn libisoburn-doc xorriso libisoburn-devel"


URI_libisoburn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libisoburn-1.5.6-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libisoburn = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libz.so.1()(64bit) ( ) libreadline.so.8()(64bit) ( ) libacl.so.1()(64bit) ( ) libburn.so.4()(64bit) ( ) libburn.so.4(LIBBURN4)(64bit) ( ) libisofs.so.6()(64bit) ( ) libisofs.so.6(LIBISOFS6)(64bit) ( )"
RPROVIDES:libisoburn = "libisoburn.so.1()(64bit) ( ) libisoburn.so.1(LIBISOBURN1)(64bit) ( ) libisoburn(x86-64) ( =  1.5.6-6.el10) libisoburn ( =  1.5.6-6.el10)"

URI_libisoburn-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libisoburn-doc-1.5.6-6.el10.noarch.rpm;unpack=0"
RDEPENDS:libisoburn-doc = ""
RPROVIDES:libisoburn-doc = "libisoburn-doc ( =  1.5.6-6.el10)"

URI_xorriso = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/xorriso-1.5.6-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:xorriso = "/bin/sh ( ) coreutils ( ) /usr/sbin/alternatives ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) /usr/bin/sh ( ) libisoburn.so.1()(64bit) ( ) libisoburn.so.1(LIBISOBURN1)(64bit) ( ) libisoburn(x86-64) ( =  1.5.6-6.el10)"
RPROVIDES:xorriso = "xorriso ( =  1.5.6-6.el10) xorriso(x86-64) ( =  1.5.6-6.el10)"

URI_libisoburn-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libisoburn-devel-1.5.6-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libisoburn-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libisoburn.so.1()(64bit) ( ) libisoburn(x86-64) ( =  1.5.6-6.el10)"
RPROVIDES:libisoburn-devel = "libisoburn-devel ( =  1.5.6-6.el10) libisoburn-devel(x86-64) ( =  1.5.6-6.el10) pkgconfig(libisoburn-1) ( =  1.5.6)"
