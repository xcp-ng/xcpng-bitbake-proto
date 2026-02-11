
PN = "libburn"
PE = "0"
PV = "1.5.6"
PR = "6.el10"
PACKAGES = "cdrskin libburn libburn-doc libburn-devel"


URI_cdrskin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cdrskin-1.5.6-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:cdrskin = "/bin/sh ( ) coreutils ( ) /usr/sbin/alternatives ( ) rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libburn.so.4()(64bit) ( ) libburn.so.4(LIBBURN4)(64bit) ( ) libburn(x86-64) ( =  1.5.6-6.el10)"
RPROVIDES:cdrskin = "cdrskin ( =  1.5.6-6.el10) cdrskin(x86-64) ( =  1.5.6-6.el10)"

URI_libburn = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libburn-1.5.6-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libburn = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:libburn = "libburn.so.4()(64bit) ( ) libburn.so.4(LIBBURN4)(64bit) ( ) libburn(x86-64) ( =  1.5.6-6.el10) libburn ( =  1.5.6-6.el10)"

URI_libburn-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libburn-doc-1.5.6-6.el10.noarch.rpm;unpack=0"
RDEPENDS:libburn-doc = ""
RPROVIDES:libburn-doc = "libburn-doc ( =  1.5.6-6.el10)"

URI_libburn-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libburn-devel-1.5.6-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libburn-devel = "/usr/bin/pkg-config ( ) pkgconfig ( ) libburn.so.4()(64bit) ( ) libburn(x86-64) ( =  1.5.6-6.el10)"
RPROVIDES:libburn-devel = "libburn-devel ( =  1.5.6-6.el10) libburn-devel(x86-64) ( =  1.5.6-6.el10) pkgconfig(libburn-1) ( =  1.5.6)"
